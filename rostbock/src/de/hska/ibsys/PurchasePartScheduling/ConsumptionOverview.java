package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class ConsumptionOverview extends JPanel {

	/**
	 * Create the panel.
	 */
	
	public ConsumptionOverview(PanelConsumption pc) {
		
		ButtonGroup bg = new ButtonGroup();
		
		JButton btnAbc = new JButton("Bruttobedarf + Verbrauch");
		btnAbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pc.getContent().changeVisibility();
				pc.getContent().getPc().setVisible(true);
			}
		});
		btnAbc.setSelected(true);
		bg.add(btnAbc);
		add(btnAbc);
		
		JButton btnDef = new JButton("Bestellungen");
		btnDef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pc.getContent().changeVisibility();
				pc.getContent().getPo().setVisible(true);
			}
		});
		
		bg.add(btnDef);
		add(btnDef);

	}

}
