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
import de.hska.ibsys.ProductionPlan.ArticleAmountPair;

public class XMLGenerator {
	
	private String destination;
	private ArrayList<Order> orders;
	private ArrayList<ArticleAmountPair> prodorders;
	
	public XMLGenerator(String destination, ArrayList<Order> orders, ArrayList<ArticleAmountPair> prodorders) {
		System.out.println(destination);
		this.destination = destination;
		this.orders = orders;
		this.prodorders = prodorders;
	}

	public void generate() {

		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("input");
			doc.appendChild(rootElement);
			
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

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(this.destination));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(source, result);

			//TODO make a popup ! :)
			System.out.println("File saved!");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}
}