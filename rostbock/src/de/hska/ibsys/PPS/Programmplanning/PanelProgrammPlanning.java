package de.hska.ibsys.PPS.Programmplanning;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import de.hska.ibsys.Bike.Bike;
import de.hska.ibsys.Components.Articel;
import de.hska.ibsys.MainFrame.ControlButtons;
import de.hska.ibsys.PPS.PanelPPSOverview;
import de.hska.ibsys.ProductionPlan.ArticleAmountPair;
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
	private List<ArticleAmountPair> prodOrders;
	private ArrayList<Bike> bikes;
	private PanelPPSOverview pOver;
	
	/**
	 * Create the panel.
	 * @param xp 
	 */
	public PanelProgrammPlanning(ArrayList<Bike> newBikes, XMLParser xp, PanelPPSOverview pOver) {
		this.xp = xp;
		this.pOver = pOver;
		childComponents = new ArrayList<Articel>();
		womanComponents = new ArrayList<Articel>();
		manComponents = new ArrayList<Articel>();
		prodOrders = new ArrayList<ArticleAmountPair>();
		initComponentLists();
		setLayout(new BorderLayout());
		
		pppOverview = new PanelProgrammPlanningOverview(this);
		add(pppOverview, BorderLayout.NORTH);
		
		JPanel panelContent = new JPanel();
		add(panelContent, BorderLayout.CENTER);
		panelContent.setLayout(new CardLayout(0, 0));
		
		//0:child, 1:woman, 2: man
		bikes = newBikes;
		
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
		List<Articel> arts;
		try
		{
			arts = this.xp.getArticels();
		}catch(Exception e){
			arts = new ArrayList<Articel>();
		}
		
		overview = new PanelOverview(prodOrders, arts);
		overview.setVisible(false);
		panelContent.add(overview);
		
		ControlButtons cb = new ControlButtons();
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
	
	public PanelProductionOrders getProdOrd() {
		return prodOrd;
	}

	public void setProdOrd(PanelProductionOrders prodOrd) {
		this.prodOrd = prodOrd;
	}
	
	public void goBackwards() {
		switch (getVisible()) {
			case "childBike":
				//TODO get back to prognose
				this.pOver.getPrognoseButton().doClick();
				break;
			case "womanBike":
				pppOverview.getChildbikeButton().doClick();
				break;
			case "manBike":
				pppOverview.getWomanbikeButton().doClick();
				break;
			case "overview":
				pppOverview.getManButton().doClick();
				break;
			case "prodOrd":
				pppOverview.getOverviewButton().doClick();
				break;
			case "nothing":
				break;
		}
	}
	public void goForwards() {
		switch (getVisible()) {
			case "childBike":
				pppOverview.getWomanbikeButton().doClick();
				break;
			case "womanBike":
				pppOverview.getManButton().doClick();
				break;
			case "manBike":
				pppOverview.getOverviewButton().doClick();
				break;
			case "overview":
				pppOverview.getProdOrderButton().doClick();
				break;
			case "prodOrd":
				this.pOver.getCapacityButton().doClick();
				break;
			case "nothing":
				break;
		}
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
	
	public String getVisible() {
		if (childBike.isVisible()) {
			return "childBike";
		}
		else if (womanBike.isVisible()) {
			return "womanBike";
		}
		else if (manBike.isVisible()) {
			return "manBike";
		}
		else if (prodOrd.isVisible()) {
			return "prodOrd";
		}
		else if (overview.isVisible()) {
			return "overview";
		}
		return "nothing";
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
				if(a.getId() == 26 || a.getId() == 16 || a.getId() == 17) {
					a.setAmount(a.getAmount()/3);
					a.overwriteOrdersInWork(a.getOrdersInWork()/3);
					a.overwriteWaitingAmount(a.getWaitingAmount()/3);
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
	
	public ArrayList<ArticleAmountPair> getAllProdOrders() {
		ArrayList<ArticleAmountPair> prodorders = new ArrayList<ArticleAmountPair>();
		prodorders.addAll(this.childBike.getProductionOrders());
		for(ArticleAmountPair po1 : this.womanBike.getProductionOrders()) {
			boolean exist = false;
			for(ArticleAmountPair po2 : prodorders) {
				if(po1.getArticelNumber() == po2.getArticelNumber()) {
					exist = true;
					po2.setAmount(po2.getAmount() + po1.getAmount());
				}
			}
			if(!exist) {
				prodorders.add(po1);
			}
		}
		for(ArticleAmountPair po1 : this.manBike.getProductionOrders()) {
			boolean exist = false;
			for(ArticleAmountPair po2 : prodorders) {
				if(po1.getArticelNumber() == po2.getArticelNumber()) {
					exist = true;
					po2.setAmount(po2.getAmount() + po1.getAmount());
					break;
				}
			}
			if(!exist) {
				prodorders.add(po1);
			}
		}
		return prodorders;
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

	public ArrayList<Bike> getBikes() {
		return bikes;
	}
	public void setBikes(ArrayList<Bike> bikes) {
		this.bikes = bikes;
	}
}
