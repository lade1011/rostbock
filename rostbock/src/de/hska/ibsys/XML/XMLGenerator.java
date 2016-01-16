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
			
			Element childSellwish = doc.createElement("item");
			childSellwish.setAttribute("article", "1");
			childSellwish.setAttribute("quantity", this.sellwish.get(0));
			sellwish.appendChild(childSellwish);
			Element womanSellwish = doc.createElement("item");
			womanSellwish.setAttribute("article", "2");
			womanSellwish.setAttribute("quantity", this.sellwish.get(1));
			sellwish.appendChild(womanSellwish);
			Element manSellwish = doc.createElement("item");
			manSellwish.setAttribute("article", "3");
			manSellwish.setAttribute("quantity", this.sellwish.get(2));
			sellwish.appendChild(manSellwish);
			
			
			//sellwish
			Element selldirect = doc.createElement("selldirect");
			rootElement.appendChild(selldirect);
			
			//TODO woman attributes
			Element childSelldirect = doc.createElement("item");
			childSelldirect.setAttribute("article", "1");
			childSelldirect.setAttribute("quantity", "0");
			childSelldirect.setAttribute("price", "0.0");
			childSelldirect.setAttribute("penalty", "0.0");
			selldirect.appendChild(childSelldirect);
			Element womanSelldirect = doc.createElement("item");
			womanSelldirect.setAttribute("article", "2");
			womanSelldirect.setAttribute("quantity", "0");
			womanSelldirect.setAttribute("price", "0.0");
			womanSelldirect.setAttribute("penalty", "0.0");
			selldirect.appendChild(womanSelldirect);
			Element manSelldirect = doc.createElement("item");
			manSelldirect.setAttribute("article", "3");
			manSelldirect.setAttribute("quantity", "0");
			manSelldirect.setAttribute("price", "0.0");
			manSelldirect.setAttribute("penalty", "0.0");
			selldirect.appendChild(manSelldirect);
			
			
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
				if(w.getShift() == 3) {
					workingtime.setAttribute("overtime", "0");
				}
				else {
					workingtime.setAttribute("overtime", String.valueOf((int)Math.ceil(w.getOvertime()/5)));
				}
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