package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;

import de.hska.ibsys.MainFrame.MainFrame;

import java.awt.BorderLayout;
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
	
	public PanelConsumption(MainFrame mf, ArrayList<Integer> prognose1) {
		setLayout(new BorderLayout());
		//panel = new JPanel();
		
		cw = new ConsumptionOverview(this);
		add(cw, BorderLayout.NORTH);
		
		c = new Content(mf, prognose1);
		add(c, BorderLayout.CENTER);
	}

	public Content getContent() {
		return c;
	}

	public void setC(Content c) {
		this.c = c;
	}

}
