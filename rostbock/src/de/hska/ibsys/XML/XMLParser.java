package de.hska.ibsys.XML;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

import de.hska.ibsys.Components.Articel;

public class XMLParser implements ContentHandler {
	private ArrayList<Articel> articels;

	public XMLParser() {
		this.articels = new ArrayList<Articel>();
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
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void endElement(String arg0, String arg1, String arg2) throws SAXException {
		// TODO Auto-generated method stub

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