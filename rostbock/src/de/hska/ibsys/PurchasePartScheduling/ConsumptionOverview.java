package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class ConsumptionOverview extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1401802783245532153L;
	/**
	 * Create the panel.
	 */
	private JButton btnAbc;
	private JButton btnDef;
	
	public ConsumptionOverview(PanelConsumption pc) {
		
		ButtonGroup bg = new ButtonGroup();
		
		btnAbc = new JButton("Bruttobedarf + Verbrauch");
		btnAbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pc.getContent().changeVisibility();
				pc.getContent().getPc().setVisible(true);
				btnAbc.setSelected(true);
				btnDef.setSelected(false);
				//BTN next = "Weiter"
				pc.cb.getBtnNext().setText("Weiter");
			}
		});
		btnAbc.setSelected(true);
		add(btnAbc);
		bg.add(btnAbc);
		
		btnDef = new JButton("Bestellungen");
		btnDef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pc.getContent().changeVisibility();
				pc.getContent().getPo().setVisible(true);
				btnAbc.setSelected(false);
				btnDef.setSelected(true);
				pc.cb.getBtnNext().setText("Exportieren");
			}
		});
		add(btnDef);
		bg.add(btnDef);
	}

	public JButton getBtnAbc() {
		return btnAbc;
	}

	public JButton getBtnDef() {
		return btnDef;
	}

}
