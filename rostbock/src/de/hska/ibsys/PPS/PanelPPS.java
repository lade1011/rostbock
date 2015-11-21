package de.hska.ibsys.PPS;

import javax.swing.JPanel;

import de.hska.ibsys.PPS.Programmplanning.PanelProgrammPlanning;

import java.awt.CardLayout;

public class PanelPPS extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1494634615296682412L;
	private PanelPPSOverview ppsOverview;
	private PanelPrognose pPrognose;
	private PanelProgrammPlanning pProgrammPlanning;
	private JPanel panelContent;
	/**
	 * Create the panel.
	 */
	public PanelPPS() {
		ppsOverview = new PanelPPSOverview(this);
		add(ppsOverview);
		
		panelContent = new JPanel();
		add(panelContent);
		panelContent.setLayout(new CardLayout(0, 0));
		
		pPrognose = new PanelPrognose();
		pPrognose.setVisible(true);
		panelContent.add(pPrognose);
	}
	public PanelPrognose getpPrognose() {
		return pPrognose;
	}
	public void setpPrognose(PanelPrognose pPrognose) {
		this.pPrognose = pPrognose;
	}
	public PanelProgrammPlanning getpProgrammPlanning() {
		return pProgrammPlanning;
	}
	public void setpProgrammPlanning(PanelProgrammPlanning pProgrammPlanning) {
		this.pProgrammPlanning = pProgrammPlanning;
	}
	
	public void createProgramplaning() {
		pProgrammPlanning = new PanelProgrammPlanning(this);
		pProgrammPlanning.setVisible(false);
		this.panelContent.add(pProgrammPlanning);
	}
	
	/**
	 * reset the visibility of every panel but not of the overview panel
	 * please add more panels if you create one
	 */
	public void resetVisibility() {
		if(pPrognose != null) {
			pPrognose.setVisible(false);
		}
		if(pProgrammPlanning != null) {
			pProgrammPlanning.setVisible(false);
		}
	}
}
