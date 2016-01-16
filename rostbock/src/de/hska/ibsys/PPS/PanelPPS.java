package de.hska.ibsys.PPS;

import javax.swing.JPanel;

import de.hska.ibsys.CapacityPlan.PanelCapacityPlanning;
import de.hska.ibsys.MainFrame.MainFrame;
import de.hska.ibsys.PPS.Programmplanning.PanelProgrammPlanning;
import de.hska.ibsys.ProductionPlan.ArticleAmountPair;
import de.hska.ibsys.PurchasePartScheduling.PanelConsumption;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;

public class PanelPPS extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1494634615296682412L;
	public static List<ArticleAmountPair> prodOrders;
	private PanelPPSOverview ppsOverview;
	private PanelPrognose pPrognose;
	private PanelProgrammPlanning pProgrammPlanning;
	private JPanel panelContent;
	private PanelConsumption pConsumption;
	private PanelCapacityPlanning pCapacity;
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
		
		pPrognose = new PanelPrognose(this.mf.getXp(), ppsOverview);
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
	public PanelConsumption getpConsumption() {
		return pConsumption;
	}
	public void setpConsumption(PanelConsumption pConsumption) {
		this.pConsumption = pConsumption;
	}
	public PanelCapacityPlanning getpCapacity() {
		return pCapacity;
	}
	public void setpCapacity(PanelCapacityPlanning pCapacity) {
		this.pCapacity = pCapacity;
	}
	
	public void createProgramplaning(PanelPPSOverview pOver) {
		if(this.pProgrammPlanning == null || !this.getpPrognose().getBikeValues().equals(this.pProgrammPlanning.getBikes())) {
			this.pProgrammPlanning = new PanelProgrammPlanning(this.getpPrognose().getBikeValues(), this.mf.getXp(), pOver);
			this.pProgrammPlanning.setVisible(false);
			this.panelContent.add(this.pProgrammPlanning);
		}
	}
	
	public void createPConsumption(PanelPPSOverview pOver) {
		pConsumption = new PanelConsumption(this.mf, getPrognoseValues(), pOver);
		pConsumption.setVisible(false);
		this.panelContent.add(pConsumption);
	}
	
	public void createPCapacity(PanelPPSOverview pOver) {
		pCapacity = new PanelCapacityPlanning(pOver);
		pCapacity.setVisible(false);
		this.panelContent.add(pCapacity);
	}
	
	public ArrayList<String> getSellWish() {
		return this.pPrognose.getPrognose3();
	}
	
	public ArrayList<Integer> getPrognoseValues() {
		ArrayList<Integer> values = new ArrayList<Integer>();
		int child;
		int woman;
		int man;
		try {
			child = this.getpProgrammPlanning().getChildBike().getBikeOrder();
			woman = this.getpProgrammPlanning().getWomanBike().getBikeOrder();
			man = this.getpProgrammPlanning().getManBike().getBikeOrder();
		}
		catch(Exception e) {
			child = (int) this.pPrognose.getSpChildP2().getValue();
			woman = (int) this.pPrognose.getSpWomanP2().getValue();
			man = (int) this.pPrognose.getSpManP2().getValue();
		}
		
		values.add(child);
		values.add(woman);
		values.add(man);
		
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
		if(pCapacity != null) {
			pCapacity.setVisible(false);
		}
	}
}
