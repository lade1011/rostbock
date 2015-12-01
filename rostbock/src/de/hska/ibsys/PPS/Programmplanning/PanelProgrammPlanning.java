package de.hska.ibsys.PPS.Programmplanning;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import de.hska.ibsys.Bike.Bike;
import de.hska.ibsys.Components.Articel;
import de.hska.ibsys.PPS.PanelPPS;
import de.hska.ibsys.XML.XMLParser;


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
	private XMLParser xp;
	private ArrayList<Articel> childComponents;
	private ArrayList<Articel> womanComponents;
	private ArrayList<Articel> manComponents;
	
	/**
	 * Create the panel.
	 * @param xp 
	 */
	public PanelProgrammPlanning(PanelPPS pps, XMLParser xp) {
		this.xp = xp;
		childComponents = new ArrayList<Articel>();
		womanComponents = new ArrayList<Articel>();
		manComponents = new ArrayList<Articel>();
		initComponentLists();
		setLayout(new BorderLayout());
		
		pppOverview = new PanelProgrammPlanningOverview(this);
		add(pppOverview, BorderLayout.NORTH);
		
		JPanel panelContent = new JPanel();
		add(panelContent, BorderLayout.CENTER);
		panelContent.setLayout(new CardLayout(0, 0));
		
		//0:child, 1:woman, 2: man
		ArrayList<Bike> bikes = pps.getpPrognose().getBikeValues();
		
		childBike = new PanelBike(bikes.get(0), this.childComponents ,"P1", "E26", "E51", "E16", "E17", "E50", "E4", "E10", "E49", "E7", "E13", "E18");
		childBike.setVisible(true);
		panelContent.add(childBike);
		
		womanBike = new PanelBike(bikes.get(1), this.womanComponents, "P2", "E26", "E56", "E16", "E17", "E55", "E5", "E11", "E54", "E8", "E14", "E19");
		womanBike.setVisible(false);
		panelContent.add(womanBike);
		
		manBike = new PanelBike(bikes.get(2), this.manComponents ,"P3", "E26", "E31", "E16", "E17", "E30", "E6", "E12", "E29", "E9", "E15", "E20");
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
	
	private void initComponentLists(){
		try {
			for(Articel a : this.xp.getArticels()) {
				System.out.println(a.getId());
				if(a.getId() == 26 || a.getId() == 16 || a.getId() == 17) {
					a.setAmount(a.getAmount()/3);
					this.childComponents.add(a);
					this.womanComponents.add(a);
					this.manComponents.add(a);
				}
				else if(a.getId() == 1 || a.getId() == 51 || a.getId() == 50 || a.getId() == 4 || a.getId() == 10 || a.getId() == 49 || a.getId() == 7 || a.getId() == 13 || a.getId() == 18) {
					this.childComponents.add(a);
				}
				else if (a.getId() == 2 || a.getId() == 56 || a.getId() == 55 || a.getId() == 5 || a.getId() == 11 || a.getId() == 54 || a.getId() == 8 || a.getId() == 14 || a.getId() == 19) {
					this.womanComponents.add(a);
				}
				else if (a.getId() == 3 || a.getId() == 31 || a.getId() == 30 || a.getId() == 6 || a.getId() == 12 || a.getId() == 29 || a.getId() == 9 || a.getId() == 15 || a.getId() == 20) {
					this.manComponents.add(a);
				}
			}
		}
		catch(Exception e) {
			//do nothing
		}
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
