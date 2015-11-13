package de.hska.ibsys.PPS;

import javax.swing.JPanel;
import java.awt.CardLayout;

public class PanelPPS extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1494634615296682412L;
	private PanelPPSOverview ppsOverview;
	private PanelPrognose pPrognose;
	/**
	 * Create the panel.
	 */
	public PanelPPS() {
		ppsOverview = new PanelPPSOverview();
		add(ppsOverview);
		
		JPanel panelContent = new JPanel();
		add(panelContent);
		panelContent.setLayout(new CardLayout(0, 0));
		
		pPrognose = new PanelPrognose();
		panelContent.add(pPrognose);
	}
	public PanelPrognose getpPrognose() {
		return pPrognose;
	}
	public void setpPrognose(PanelPrognose pPrognose) {
		this.pPrognose = pPrognose;
	}

}
