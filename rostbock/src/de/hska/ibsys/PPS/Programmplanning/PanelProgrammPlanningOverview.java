package de.hska.ibsys.PPS.Programmplanning;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import de.hska.ibsys.ProductionPlan.ArticleAmountPair;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PanelProgrammPlanningOverview extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6991783473956010214L;

	/**
	 * Create the panel.
	 */
	public PanelProgrammPlanningOverview(PanelProgrammPlanning pProgramPlanning) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		ButtonGroup bg = new ButtonGroup();
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Kinderfahrrad");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pProgramPlanning.resetVisibility();
				pProgramPlanning.getChildBike().setVisible(true);
			}
		});
		tglbtnNewToggleButton.setSelected(true);
		add(tglbtnNewToggleButton);
		bg.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Damenfahrrad");
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pProgramPlanning.resetVisibility();
				pProgramPlanning.getWomanBike().setVisible(true);
			}
		});
		add(tglbtnNewToggleButton_1);
		bg.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("Herrenfahrrad");
		tglbtnNewToggleButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pProgramPlanning.resetVisibility();
				pProgramPlanning.getManBike().setVisible(true);
			}
		});
		add(tglbtnNewToggleButton_2);
		bg.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("Uebersicht");
		tglbtnNewToggleButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					ArrayList<ArticleAmountPair> prodOrders = new ArrayList<ArticleAmountPair>();
					prodOrders.addAll(pProgramPlanning.getChildBike().getProductionOrders());
					prodOrders.addAll(pProgramPlanning.getWomanBike().getProductionOrders());
					prodOrders.addAll(pProgramPlanning.getManBike().getProductionOrders());
					pProgramPlanning.getOverview().acutalizeOrders(prodOrders);
					//TODO: Hier die inStock und inWaiting
				}catch(Exception ex){
					//Hier passiert nichts
				}
				pProgramPlanning.resetVisibility();
				pProgramPlanning.getOverview().setVisible(true);
			}
		});
		add(tglbtnNewToggleButton_3);
		bg.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("Produktionsauftraege");
		tglbtnNewToggleButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pProgramPlanning.resetVisibility();
				pProgramPlanning.getProdOrd().initProdOrders(pProgramPlanning.getChildBike().getProductionOrders(), pProgramPlanning.getWomanBike().getProductionOrders(), pProgramPlanning.getManBike().getProductionOrders());
				pProgramPlanning.getProdOrd().setVisible(true);
			}
		});
		add(tglbtnNewToggleButton_4);
		bg.add(tglbtnNewToggleButton_4);
	}

}
