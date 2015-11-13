package de.hska.ibsys.PPS;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;

public class PanelPPSOverview extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2794225891362061195L;

	/**
	 * Create the panel.
	 */
	public PanelPPSOverview() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		ButtonGroup bg = new ButtonGroup();
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("XML laden");
		tglbtnNewToggleButton.setSelected(true);
		add(tglbtnNewToggleButton);
		bg.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Programmplanung");
		add(tglbtnNewToggleButton_1);
		bg.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("Kapazit\u00E4tsplanung");
		add(tglbtnNewToggleButton_2);
		bg.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("Kaufteildisposition");
		add(tglbtnNewToggleButton_3);
		bg.add(tglbtnNewToggleButton_3);

	}

}
