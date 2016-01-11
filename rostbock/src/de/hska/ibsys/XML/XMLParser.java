package de.hska.ibsys.XML;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

import de.hska.ibsys.Components.Articel;
import de.hska.ibsys.Components.Order;

public class XMLParser implements ContentHandler {
	private ArrayList<Articel> articels;
	private ArrayList<Order> supplies;
	
	private boolean listOfOrdersinwork;
	private boolean waitinglist;

	public XMLParser() {
		this.articels = new ArrayList<Articel>();
		this.supplies = new ArrayList<Order>();
		this.listOfOrdersinwork = false;
		this.waitinglist = false;
	}

	@Override
	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void startElement(String uri, String tag, String qName, Attributes atts) throws SAXException {
		if (tag.equals("article")) {
			Articel a = new Articel(Long.valueOf(atts.getValue("id")), Integer.parseInt(atts.getValue("amount")),
					Integer.parseInt(atts.getValue("startamount")), Double.parseDouble(atts.getValue("pct")),
					Double.parseDouble(atts.getValue("price")), Double.parseDouble(atts.getValue("stockvalue")));
			this.articels.add(a);
		}
		else if(tag.equals("order")){
//			Order o = new Order(Long.valueOf(atts.getValue("id")), atts.getValue("lieferfrist"), 0, 
			
		}
		else if(tag.equals("ordersinwork")) {
			this.listOfOrdersinwork = true;
		}
		else if(tag.equals("workplace") && this.listOfOrdersinwork) {
			for(Articel a : this.articels) {
				if(a.getId() == Long.valueOf(atts.getValue("item"))) {
					a.setOrdersInWork(Integer.valueOf(atts.getValue("amount")));
				}
			}
		}
		else if(tag.equals("waitinglistworkstations")) {
			this.waitinglist = true;
		}
		else if(tag.equals("waitinglist") && this.waitinglist) {
			for(Articel a : this.articels) {
				if(a.getId() == Long.valueOf(atts.getValue("item"))) {
					a.setWaitingAmount(Integer.valueOf(atts.getValue("amount")));
				}
			}
		}
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void endElement(String uri, String tag, String qName) throws SAXException {
		if(tag.equals("ordersinwork")) {
			this.listOfOrdersinwork = false;
		}
		else if(tag.equals("waitinglistworkstations")) {
			this.waitinglist = false;
		}
	}

	@Override
	public void endPrefixMapping(String arg0) throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void ignorableWhitespace(char[] arg0, int arg1, int arg2) throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void processingInstruction(String arg0, String arg1) throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDocumentLocator(Locator arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void skippedEntity(String arg0) throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void startPrefixMapping(String arg0, String arg1) throws SAXException {
		// TODO Auto-generated method stub

	}

	public ArrayList<Articel> getArticels() {
		return articels;
	}

	public void setArticels(ArrayList<Articel> articels) {
		this.articels = articels;
	}
}
