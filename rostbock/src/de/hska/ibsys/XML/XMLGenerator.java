package de.hska.ibsys.XML;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

//import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import de.hska.ibsys.Components.Order;
import de.hska.ibsys.Components.Workingtime;
import de.hska.ibsys.ProductionPlan.ArticleAmountPair;

public class XMLGenerator {
	
	private String destination;
	private ArrayList<Order> orders;
	private ArrayList<ArticleAmountPair> prodorders;
	private ArrayList<Workingtime> wtimes;
	private ArrayList<String> sellwish;
	
	public XMLGenerator(String destination, ArrayList<Order> orders, ArrayList<ArticleAmountPair> prodorders, ArrayList<Workingtime> wtimes, ArrayList<String> sellwish) {
		this.destination = destination;
		this.orders = orders;
		this.prodorders = prodorders;
		System.out.println(wtimes.size());
		this.wtimes = wtimes;
		this.sellwish = sellwish;
	}

	public void generate() {

		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("input");
			doc.appendChild(rootElement);
			
			//qualitycontrol
			Element qualitycontrol = doc.createElement("qualitycontrol");
			qualitycontrol.setAttribute("type", "no");
			qualitycontrol.setAttribute("losequantity", "0");
			qualitycontrol.setAttribute("delay", "0");
			rootElement.appendChild(qualitycontrol);
			
			//sellwish
			Element sellwish = doc.createElement("sellwish");
			rootElement.appendChild(sellwish);
			
			Element childSellwish = doc.createElement("sellwish");
			childSellwish.setAttribute("articel", "1");
			childSellwish.setAttribute("quantity", this.sellwish.get(0));
			sellwish.appendChild(childSellwish);
			Element womanSellwish = doc.createElement("sellwish");
			womanSellwish.setAttribute("articel", "2");
			womanSellwish.setAttribute("quantity", this.sellwish.get(1));
			sellwish.appendChild(womanSellwish);
			Element manSellwish = doc.createElement("sellwish");
			manSellwish.setAttribute("articel", "3");
			manSellwish.setAttribute("quantity", this.sellwish.get(2));
			sellwish.appendChild(manSellwish);
			
			//orders
			Element orderlist = doc.createElement("orderlist");
			rootElement.appendChild(orderlist);
			for(Order o : this.orders) {
				if(o.isToOrder()) {
					Element order = doc.createElement("order");
					order.setAttribute("article", String.valueOf(o.getId()));
					order.setAttribute("quantity", String.valueOf(o.getDiskontmenge()));
					int orderModus = 5;
					if(o.isWithRush()) {
						orderModus = 4;
					}
					order.setAttribute("modus", String.valueOf(orderModus));
					orderlist.appendChild(order);
				}
			}
			
			//productions
			Element productionlist = doc.createElement("productionlist");
			rootElement.appendChild(productionlist);
			for(ArticleAmountPair po : this.prodorders) {
				if(po.getAmount() > 0) {
					Element production = doc.createElement("production");
					production.setAttribute("article", String.valueOf(po.getArticelNumber()));
					production.setAttribute("quantity", String.valueOf(po.getAmount()));
					productionlist.appendChild(production);
				}
			}
			
			//working times
			Element workingtimelist = doc.createElement("workingtimelist");
			rootElement.appendChild(workingtimelist);
			for(Workingtime w : this.wtimes) {
				Element workingtime = doc.createElement("workingtime");
				workingtime.setAttribute("station", String.valueOf(w.getStation()));
				workingtime.setAttribute("shift", String.valueOf(w.getShift()));
				workingtime.setAttribute("overtime", String.valueOf(w.getOvertime()));
				workingtimelist.appendChild(workingtime);
			}

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(this.destination));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(source, result);

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}
}