package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;

public class PanelConsumption extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelConsumption() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JButton btnVerbruche = new JButton("Verbräuche");
		add(btnVerbruche);
		
		JButton btnBestellungen = new JButton("Bestellungen");
		add(btnBestellungen);

	}

}
