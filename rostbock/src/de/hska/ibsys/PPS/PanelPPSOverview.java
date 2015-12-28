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

	/**
	 * Create the panel.
	 */
	public PanelPPSOverview(PanelPPS pPPS) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		ButtonGroup bg = new ButtonGroup();
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("XML laden");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pPPS.resetVisibility();
				pPPS.getpPrognose().setVisible(true);
			}
		});
		tglbtnNewToggleButton.setSelected(true);
		add(tglbtnNewToggleButton);
		bg.add(tglbtnNewToggleButton);
		
		JToggleButton tglBtnPurchasePartScheduling = new JToggleButton("Programmplanung");
		tglBtnPurchasePartScheduling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pPPS.resetVisibility();
				pPPS.createProgramplaning();
				pPPS.getpProgrammPlanning().setVisible(true);
			}
		});
		add(tglBtnPurchasePartScheduling);
		bg.add(tglBtnPurchasePartScheduling);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("Kapazit\u00E4tsplanung");
		add(tglbtnNewToggleButton_2);
		bg.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("Kaufteildisposition");
		add(tglbtnNewToggleButton_3);
		bg.add(tglbtnNewToggleButton_3);
		tglbtnNewToggleButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pPPS.resetVisibility();
				pPPS.getpConsumption().setPrognose1(pPPS.getPrognoseValues());
				pPPS.getpConsumption().setVisible(true);
			}
		});
	}
}
