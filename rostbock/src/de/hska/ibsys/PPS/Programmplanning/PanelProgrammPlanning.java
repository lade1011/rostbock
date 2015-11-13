package de.hska.ibsys.PPS.Programmplanning;

import java.awt.CardLayout;

import javax.swing.JPanel;


public class PanelProgrammPlanning extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5447820277627332818L;
	private PanelProgrammPlanningOverview pppOverview;
	private PanelBike childBike;
	private PanelBike womanBike;
	private PanelBike manBike;
	
	/**
	 * Create the panel.
	 */
	public PanelProgrammPlanning() {
		pppOverview = new PanelProgrammPlanningOverview(this);
		add(pppOverview);
		
		JPanel panelContent = new JPanel();
		add(panelContent);
		panelContent.setLayout(new CardLayout(0, 0));
		
		childBike = new PanelBike("P1", "E26", "E51", "E16", "E17", "E50", "E4", "E10", "E49", "E7", "E13", "E18");
		childBike.setVisible(true);
		panelContent.add(childBike);
		
		womanBike = new PanelBike("P2", "E26", "E56", "E16", "E17", "E55", "E5", "E11", "E54", "E8", "E14", "E19");
		womanBike.setVisible(false);
		panelContent.add(womanBike);
		
		manBike = new PanelBike("P3", "E26", "E31", "E16", "E17", "E30", "E6", "E12", "E29", "E9", "E15", "E20");
		manBike.setVisible(false);
		panelContent.add(manBike);
	}
	
	/**
	 * reset the visibility of every panel but not of the overview panel
	 * please add more panels if you create one
	 */
	public void resetVisibility() {
		childBike.setVisible(false);
		womanBike.setVisible(false);
		manBike.setVisible(false);
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
