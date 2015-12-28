package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class PanelConsumption extends JPanel {

	/**
	 * Create the panel.
	 */
	JPanel panel;
	
	public PanelConsumption() {
		panel = new JPanel();
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JButton btnVerbruche = new JButton("Verbräuche");
		btnVerbruche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(panel);
				panel = new PConsumption();
				add(panel);
				repaint();
				revalidate();
			}
		});
		add(btnVerbruche);
		
		JButton btnBestellungen = new JButton("Bestellungen");
		btnBestellungen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(panel);
				panel = new POrders();
				add(panel);
				repaint();
				revalidate();
			}
		});
		add(btnBestellungen);
		
		add(panel);
		
		JLabel lblTest = new JLabel("test");
		panel.add(lblTest);

	}

}
