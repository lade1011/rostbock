package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import de.hska.ibsys.MainFrame.ControlButtons;
import de.hska.ibsys.MainFrame.MainFrame;
import de.hska.ibsys.PPS.PanelPPSOverview;
import de.hska.ibsys.XML.XMLGenerator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class PanelConsumption extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 335808407822913570L;
	/**
	 * Create the panel.
	 */
	private ConsumptionOverview cw;
	private Content c;
	private PanelPPSOverview pOver;
	public ControlButtons cb;
	private MainFrame mf;
	
	public PanelConsumption(MainFrame mf, ArrayList<Integer> prognose1, PanelPPSOverview pOver) {
		this.mf = mf;
		this.pOver = pOver;
		setLayout(new BorderLayout());
		
		cw = new ConsumptionOverview(this);
		add(cw, BorderLayout.NORTH);
		
		c = new Content(mf, prognose1);
		add(c, BorderLayout.CENTER);
		
		cb = new ControlButtons();
		cb.getBtnNext().setText("Weiter");
		cb.getBtnBack().setText("Zur\u00FCck");
		cb.getBtnBack().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				goBackwards();
			}
		});
		cb.getBtnNext().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				goForwards();
			}
		});
		add(cb, BorderLayout.SOUTH);
	}
	
	public void goBackwards() {
		if(cw.getBtnAbc().isSelected()) {
			this.pOver.getCapacityButton().doClick();
		}
		else if(cw.getBtnDef().isSelected()) {
			cw.getBtnAbc().doClick();
			this.cb.getBtnNext().setText("Weiter");
		}
	}
	public void goForwards() {
		if(cw.getBtnAbc().isSelected()) {
			cw.getBtnDef().doClick();
			this.cb.getBtnNext().setText("Exportieren");
		}
		else if (cw.getBtnDef().isSelected() && this.cb.getBtnNext().getText().equals("Exportieren")) {
			String destination = getDestination();
			if(destination != null) {
				
				XMLGenerator xmlgen = new XMLGenerator(destination, this.c.getOrders(), this.mf.getpPPS().getpProgrammPlanning().getAllProdOrders(), this.mf.getpPPS().getpCapacity().getwTimes());
				xmlgen.generate();
				JOptionPane.showMessageDialog(this, "Ergebnis-XML wurde erstellt !");
			}
		}
	}
	
	private String getDestination() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Datei zum speichern auswählen");
		int userSelection = fileChooser.showSaveDialog(this);
		if (userSelection == JFileChooser.APPROVE_OPTION) {
		    File fileToSave = fileChooser.getSelectedFile();
		    String f2s = fileToSave.getAbsolutePath();
		    if(!f2s.endsWith(".xml")){
		    	f2s += ".xml";
		    }
		    return f2s;
		}
		else {
			return null;
		}
	}

	public Content getContent() {
		return c;
	}

	public void setC(Content c) {
		this.c = c;
	}

}
