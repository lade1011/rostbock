package de.hska.ibsys.PPS.Programmplanning;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelProgrammPlanningOverview extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6991783473956010214L;

	/**
	 * Create the panel.
	 */
	public PanelProgrammPlanningOverview(PanelProgrammPlanning pProgramPlannign) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		ButtonGroup bg = new ButtonGroup();
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Kinderfahrrad");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pProgramPlannign.resetVisibility();
				pProgramPlannign.getChildBike().setVisible(true);
			}
		});
		tglbtnNewToggleButton.setSelected(true);
		add(tglbtnNewToggleButton);
		bg.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Damenfahrrad");
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pProgramPlannign.resetVisibility();
				pProgramPlannign.getWomanBike().setVisible(true);
			}
		});
		add(tglbtnNewToggleButton_1);
		bg.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("Herrenfahrrad");
		tglbtnNewToggleButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pProgramPlannign.resetVisibility();
				pProgramPlannign.getManBike().setVisible(true);
			}
		});
		add(tglbtnNewToggleButton_2);
		bg.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("\u00DCbersicht");
		add(tglbtnNewToggleButton_3);
		bg.add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("Produktionsauftr\u00E4ge");
		add(tglbtnNewToggleButton_4);
	}

}
