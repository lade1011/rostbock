package de.hska.ibsys.PPS;

import javax.swing.JPanel;

import de.hska.ibsys.MainFrame.MainFrame;
import de.hska.ibsys.PPS.Programmplanning.PanelProgrammPlanning;
import de.hska.ibsys.PurchasePartScheduling.PanelConsumption;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.ArrayList;

public class PanelPPS extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1494634615296682412L;
	private PanelPPSOverview ppsOverview;
	private PanelPrognose pPrognose;
	private PanelProgrammPlanning pProgrammPlanning;
	private JPanel panelContent;
	private PanelConsumption pConsumption;
	private MainFrame mf;
	
	/**
	 * Create the panel.
	 */
	public PanelPPS(MainFrame mf) {
		this.mf = mf;
		setLayout(new BorderLayout());
		ppsOverview = new PanelPPSOverview(this);
		add(ppsOverview, BorderLayout.NORTH);
		
		panelContent = new JPanel();
		add(panelContent, BorderLayout.CENTER);
		panelContent.setLayout(new CardLayout(0, 0));
		
		pPrognose = new PanelPrognose(this.mf.getXp());
		pPrognose.setVisible(true);
		panelContent.add(pPrognose);
		
		pConsumption = new PanelConsumption(this.mf);
		pConsumption.setVisible(false);
		panelContent.add(pConsumption);
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
	public PanelConsumption getpConsumption() {
		return pConsumption;
	}
	public void setpConsumption(PanelConsumption pConsumption) {
		this.pConsumption = pConsumption;
	}
	
	public void createProgramplaning() {
		pProgrammPlanning = new PanelProgrammPlanning(this, this.mf.getXp());
		pProgrammPlanning.setVisible(false);
		this.panelContent.add(pProgrammPlanning);
	}
	
	public ArrayList<Integer> getPrognoseValues() {
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add((int)this.pPrognose.getSpChildP3().getValue());
		values.add((int)this.pPrognose.getSpWomanP3().getValue());
		values.add((int)this.pPrognose.getSpManP3().getValue());
		
		values.add((int)this.pPrognose.getSpChildP4().getValue());
		values.add((int)this.pPrognose.getSpWomanP4().getValue());
		values.add((int)this.pPrognose.getSpManP4().getValue());
		
		values.add((int)this.pPrognose.getSpChildP5().getValue());
		values.add((int)this.pPrognose.getSpWomanP5().getValue());
		values.add((int)this.pPrognose.getSpManP5().getValue());
		
		return values;
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
		if(pConsumption != null) {
			pConsumption.setVisible(false);
		}
	}
}
