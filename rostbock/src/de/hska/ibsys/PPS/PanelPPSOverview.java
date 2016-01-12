package de.hska.ibsys.PPS;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelPPSOverview extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2794225891362061195L;
	
	private JToggleButton prognoseButton;
	private JToggleButton programmPlanningButton;
	private JToggleButton capacityButton;
	private JToggleButton orderButton;
	private PanelPPS pPPS;
	/**
	 * Create the panel.
	 */
	public PanelPPSOverview(PanelPPS pPPS) {
		this.pPPS = pPPS;
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		ButtonGroup bg = new ButtonGroup();
		
		prognoseButton = new JToggleButton("Prognose");
		prognoseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pPPS.resetVisibility();
				pPPS.getpPrognose().setVisible(true);
			}
		});
		prognoseButton.setSelected(true);
		add(prognoseButton);
		bg.add(prognoseButton);
		
		programmPlanningButton = new JToggleButton("Programmplanung");
		programmPlanningButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pPPS.resetVisibility();
				createProgrammPlaning();
				pPPS.getpProgrammPlanning().setVisible(true);
			}
		});
		add(programmPlanningButton);
		bg.add(programmPlanningButton);
		
		capacityButton = new JToggleButton("Kapazitaetsplanung");
		capacityButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pPPS.resetVisibility();
				createPCapacity();
				pPPS.getpCapacity().setVisible(true);
			}
		});
		add(capacityButton);
		bg.add(capacityButton);
		
		orderButton = new JToggleButton("Kaufteildisposition");
		add(orderButton);
		bg.add(orderButton);
		orderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pPPS.resetVisibility();
				createPConsumption();
				pPPS.getpConsumption().setVisible(true);
			}
		});
	}
	public void createProgrammPlaning() {
		pPPS.createProgramplaning(this);
	}
	public void createPCapacity() {
		pPPS.createPCapacity(this);
	}
	public void createPConsumption() {
		pPPS.createPConsumption(this);
	}
	public JToggleButton getPrognoseButton() {
		return prognoseButton;
	}
	public JToggleButton getProgrammPlanningButton() {
		return programmPlanningButton;
	}
	public JToggleButton getCapacityButton() {
		return capacityButton;
	}
	public JToggleButton getOrderButton() {
		return orderButton;
	}
}
