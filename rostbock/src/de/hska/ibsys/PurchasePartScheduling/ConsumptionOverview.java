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
		
		JButton btnAbc = new JButton("Verbrauch");
		btnAbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pc.getContent().changeVisibility();
				pc.getContent().getPc().setVisible(true);
			}
		});
		bg.add(btnAbc);
		add(btnAbc);
		/*JButton btnVerbruche = new JButton("Verbräuche");
		btnVerbruche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(panel);
				panel = new PConsumption();
				add(panel);
				repaint();
				revalidate();
			}
		});
		setLayout(new BorderLayout(0, 0));
		btnPanel.add(btnVerbruche);
		//add(btnVerbruche);
		
		JButton btnBestellungen = new JButton("Bestellungen");
		btnBestellungen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(panel);
				panel = new POrders();
				add(panel);
				repaint();
				revalidate();
			}
		});*/
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
