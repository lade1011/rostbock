package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;

import de.hska.ibsys.MainFrame.ControlButtons;
import de.hska.ibsys.MainFrame.MainFrame;
import de.hska.ibsys.PPS.PanelPPSOverview;
import de.hska.ibsys.XML.XMLGenerator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private ControlButtons cb;
	
	public PanelConsumption(MainFrame mf, ArrayList<Integer> prognose1, PanelPPSOverview pOver) {
		this.pOver = pOver;
		setLayout(new BorderLayout());
		
		cw = new ConsumptionOverview(this);
		add(cw, BorderLayout.NORTH);
		
		c = new Content(mf, prognose1);
		add(c, BorderLayout.CENTER);
		
		cb = new ControlButtons();
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
			this.cb.getBtnNext().setText("Next");
		}
	}
	public void goForwards() {
		if(cw.getBtnAbc().isSelected()) {
			cw.getBtnDef().doClick();
			this.cb.getBtnNext().setText("Export");
		}
		else if (cw.getBtnDef().isSelected() && this.cb.getBtnNext().getText().equals("Export")) {
			XMLGenerator xmlgen = new XMLGenerator(this.c.getOrders());
			xmlgen.generate();
		}
	}
	
	public Content getContent() {
		return c;
	}

	public void setC(Content c) {
		this.c = c;
	}

}
