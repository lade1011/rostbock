package de.hska.ibsys.PPS.Programmplanning;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import de.hska.ibsys.PPS.PanelPPS;
import de.hska.ibsys.ProductionPlan.ArticleAmountPair;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PanelProgrammPlanningOverview extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6991783473956010214L;
	private JToggleButton childbikeButton;
	private JToggleButton womanbikeButton;
	private JToggleButton manButton;
	private JToggleButton overviewButton;
	private JToggleButton prodOrderButton;
	/**
	 * Create the panel.
	 */
	public PanelProgrammPlanningOverview(PanelProgrammPlanning pProgramPlanning) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		ButtonGroup bg = new ButtonGroup();
		
		childbikeButton = new JToggleButton("Kinderfahrrad");
		childbikeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pProgramPlanning.resetVisibility();
				pProgramPlanning.getChildBike().setVisible(true);
			}
		});
		childbikeButton.setSelected(true);
		add(childbikeButton);
		bg.add(childbikeButton);
		
		womanbikeButton = new JToggleButton("Damenfahrrad");
		womanbikeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pProgramPlanning.resetVisibility();
				pProgramPlanning.getWomanBike().setVisible(true);
			}
		});
		add(womanbikeButton);
		bg.add(womanbikeButton);
		
		manButton = new JToggleButton("Herrenfahrrad");
		manButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pProgramPlanning.resetVisibility();
				pProgramPlanning.getManBike().setVisible(true);
			}
		});
		add(manButton);
		bg.add(manButton);
		
		overviewButton = new JToggleButton("Uebersicht");
		overviewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					ArrayList<ArticleAmountPair> prodOrders = new ArrayList<ArticleAmountPair>();
					prodOrders.addAll(pProgramPlanning.getChildBike().getProductionOrders());
					prodOrders.addAll(pProgramPlanning.getWomanBike().getProductionOrders());
					prodOrders.addAll(pProgramPlanning.getManBike().getProductionOrders());
					pProgramPlanning.getOverview().acutalizeOrders(prodOrders);
					pProgramPlanning.getProdOrd().setProdOrders(prodOrders);
					PanelPPS.prodOrders = prodOrders;
					//TODO: Hier die inStock und inWaiting
				}catch(Exception ex){
					//Hier passiert nichts
				}
				pProgramPlanning.resetVisibility();
				pProgramPlanning.getOverview().setVisible(true);
			}
		});
		add(overviewButton);
		bg.add(overviewButton);
		
		prodOrderButton = new JToggleButton("Produktionsauftraege");
		prodOrderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pProgramPlanning.resetVisibility();
				pProgramPlanning.getProdOrd().initProdOrders(pProgramPlanning.getChildBike().getProductionOrders(), pProgramPlanning.getWomanBike().getProductionOrders(), pProgramPlanning.getManBike().getProductionOrders());
				pProgramPlanning.getProdOrd().setVisible(true);
			}
		});
		add(prodOrderButton);
		bg.add(prodOrderButton);
	}
	public JToggleButton getChildbikeButton() {
		return childbikeButton;
	}
	public JToggleButton getWomanbikeButton() {
		return womanbikeButton;
	}
	public JToggleButton getManButton() {
		return manButton;
	}
	public JToggleButton getOverviewButton() {
		return overviewButton;
	}
	public JToggleButton getProdOrderButton() {
		return prodOrderButton;
	}

}
