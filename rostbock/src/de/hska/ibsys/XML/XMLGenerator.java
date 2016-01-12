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

public class XMLGenerator {
	
	private ArrayList<Order> orders;
	
	public XMLGenerator(ArrayList<Order> orders) {
		this.orders = orders;
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

			// firstname elements
			Element production = doc.createElement("production");
			production.setAttribute("article", "456");
			production.setAttribute("quantity", "123");
			productionlist.appendChild(production);

			// lastname elements
//			Element lastname = doc.createElement("lastname");
//			lastname.appendChild(doc.createTextNode("mook kim"));
//			staff.appendChild(lastname);

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("C:\\Users\\Denis\\Desktop\\myresults.xml"));

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