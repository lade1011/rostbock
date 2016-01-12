package de.hska.ibsys.MainFrame;

import java.awt.EventQueue;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import de.hska.ibsys.PPS.PanelPPS;
import de.hska.ibsys.PPS.PanelStart;
import de.hska.ibsys.XML.XMLParser;
import libraries.LookAndFeel;

import java.awt.CardLayout;
import java.awt.Desktop;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6884543290355465972L;
	
	private static final String SCSIM_HOMEPAGE = "http://scsimulator.de/";
	
	private JPanel contentPane;
	private PanelStart pStart;
	
	private PanelPPS pPPS;
	private JMenuBar menuBar;
	private JMenu mnDatei;
	private JMenu mnSprache;
	private JMenu mnScsim;
	private JMenu menu;
	private JMenuItem mntmXml;
	private JMenuItem mntmBeenden;
	private JCheckBoxMenuItem chckbxmntmDeutsch;
	private JCheckBoxMenuItem chckbxmntmEnglisch;
	private JMenuItem mntmStartseite;
	private JMenuItem mntmHandbuch;
	private XMLParser xp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//
		new LookAndFeel();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("Rostbock PPS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800,600);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnDatei = new JMenu("Datei");
		menuBar.add(mnDatei);
		
		mntmXml = new JMenuItem("XML export");
		mnDatei.add(mntmXml);
		
		mntmBeenden = new JMenuItem("Beenden");
		mnDatei.add(mntmBeenden);
		
		mnSprache = new JMenu("Sprache");
		menuBar.add(mnSprache);
		
		chckbxmntmDeutsch = new JCheckBoxMenuItem("Deutsch");
		chckbxmntmDeutsch.setSelected(true);
		mnSprache.add(chckbxmntmDeutsch);
		
		chckbxmntmEnglisch = new JCheckBoxMenuItem("Englisch");
		mnSprache.add(chckbxmntmEnglisch);
		
		mnScsim = new JMenu("Scsim");
		menuBar.add(mnScsim);
		
		mntmStartseite = new JMenuItem("Startseite");
		mntmStartseite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openWebpage();
			}
		});
		mnScsim.add(mntmStartseite);
		
		menu = new JMenu("?");
		menuBar.add(menu);
		
		mntmHandbuch = new JMenuItem("Handbuch");
		menu.add(mntmHandbuch);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		pStart = new PanelStart(this);
		pStart.setVisible(true);
		contentPane.add(pStart);
		
		pPPS = new PanelPPS(this);
		pPPS.setVisible(false);
		contentPane.add(pPPS);
	}

	public PanelPPS getpPPS() {
		return pPPS;
	}

	public void setpPPS(PanelPPS pPPS) {
		this.pPPS = pPPS;
	}
	
	/**
	 * open the homepage of scsimulator
	 */
	private static void openWebpage() {
		URL url;
		try {
			url = new URL(SCSIM_HOMEPAGE);
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
			return;
		}
		URI uri;
		try {
			uri = url.toURI();
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
			return;
		}
		Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
	    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
	        try {
	            desktop.browse(uri);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	
	public void parseXML(String fileUri) {
		try {
			XMLReader xmlReader = XMLReaderFactory.createXMLReader();
			FileReader reader = new FileReader(fileUri);
			InputSource input = new InputSource(reader);
			this.xp = new XMLParser();
			xmlReader.setContentHandler(xp);
			xmlReader.parse(input);
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		}
	}

	public XMLParser getXp() {
		return xp;
	}
}
