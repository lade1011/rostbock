package de.hska.ibsys.PPS.Programmplanning;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import de.hska.ibsys.Bike.Bike;
import de.hska.ibsys.PPS.PanelPPS;


public class PanelProgrammPlanning extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5447820277627332818L;
	private PanelProgrammPlanningOverview pppOverview;
	private PanelBike childBike;
	private PanelBike womanBike;
	private PanelBike manBike;
	private PanelProductionOrders prodOrd;
	private PanelOverview overview;
	
	/**
	 * Create the panel.
	 */
	public PanelProgrammPlanning(PanelPPS pps) {
		setLayout(new BorderLayout());
		
		pppOverview = new PanelProgrammPlanningOverview(this);
		add(pppOverview, BorderLayout.NORTH);
		
		JPanel panelContent = new JPanel();
		add(panelContent, BorderLayout.CENTER);
		panelContent.setLayout(new CardLayout(0, 0));
		
		//0:child, 1:woman, 2: man
		ArrayList<Bike> bikes = pps.getpPrognose().getBikeValues();
		
		childBike = new PanelBike(bikes.get(0) ,"P1", "E26", "E51", "E16", "E17", "E50", "E4", "E10", "E49", "E7", "E13", "E18");
		childBike.setVisible(true);
		panelContent.add(childBike);
		
		womanBike = new PanelBike(bikes.get(1), "P2", "E26", "E56", "E16", "E17", "E55", "E5", "E11", "E54", "E8", "E14", "E19");
		womanBike.setVisible(false);
		panelContent.add(womanBike);
		
		manBike = new PanelBike(bikes.get(2), "P3", "E26", "E31", "E16", "E17", "E30", "E6", "E12", "E29", "E9", "E15", "E20");
		manBike.setVisible(false);
		panelContent.add(manBike);
		
		prodOrd = new PanelProductionOrders();
		prodOrd.setVisible(false);
		panelContent.add(prodOrd);
		
		overview = new PanelOverview();
		overview.setVisible(false);
		panelContent.add(overview);
	}
	
	public PanelProductionOrders getProdOrd() {
		return prodOrd;
	}

	public void setProdOrd(PanelProductionOrders prodOrd) {
		this.prodOrd = prodOrd;
	}

	/**
	 * reset the visibility of every panel but not of the overview panel
	 * please add more panels if you create one
	 */
	public void resetVisibility() {
		childBike.setVisible(false);
		womanBike.setVisible(false);
		manBike.setVisible(false);
		prodOrd.setVisible(false);
		overview.setVisible(false);
	}

	public PanelOverview getOverview() {
		return overview;
	}

	public void setOverview(PanelOverview overview) {
		this.overview = overview;
	}

	public PanelBike getChildBike() {
		return childBike;
	}

	public void setChildBike(PanelBike childBike) {
		this.childBike = childBike;
	}

	public PanelBike getWomanBike() {
		return womanBike;
	}

	public void setWomanBike(PanelBike womanBike) {
		this.womanBike = womanBike;
	}

	public PanelBike getManBike() {
		return manBike;
	}

	public void setManBike(PanelBike manBike) {
		this.manBike = manBike;
	}
}
