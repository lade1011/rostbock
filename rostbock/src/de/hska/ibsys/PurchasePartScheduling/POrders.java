package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;

import de.hska.ibsys.Components.Order;
import de.hska.ibsys.help.Definitions;

import java.util.ArrayList;

import javax.swing.JLabel;

public class POrders extends JPanel {

	/**
	 * Create the panel.
	 */
	public POrders() {
		
		JLabel lblBestellungen = new JLabel("Bestellungen");
		add(lblBestellungen);

		ArrayList<Order> orders = new ArrayList<Order>();
		orders.add(new Order(21, 1.8, 0.4, 1, 0, 0, 300));
		orders.add(new Order(22, 1.7, 0.4, 0, 1, 0, 300));
		orders.add(new Order(23, 1.2, 0.2, 0, 0, 1, 300));
		orders.add(new Order(24, 3.2, 0.3, 7, 7, 7, 6100));
		orders.add(new Order(25, 0.9, 0.2, 4, 4, 4, 3600));
		orders.add(new Order(27, 0.9, 0.2, 2, 2, 2, 1800));
		orders.add(new Order(28, 1.7, 0.4, 4, 5, 6, 4500));
		orders.add(new Order(32, 2.1, 0.5, 3, 3, 3, 2700));
		orders.add(new Order(33, 1.9, 0.5, 0, 0, 2, 900));
		orders.add(new Order(34, 1.6, 0.3, 0, 0, 72, 22000));
		orders.add(new Order(35, 2.2, 0.4, 4, 4, 4, 3600));
		orders.add(new Order(36, 1.2, 0.1, 1, 1, 1, 900));
		orders.add(new Order(37, 1.5, 0.3, 1, 1, 1, 900));
		orders.add(new Order(38, 1.7, 0.4, 1, 1, 1, 300));
		orders.add(new Order(39, 1.5, 0.3, 2, 2, 2, 1800));
		orders.add(new Order(40, 1.7, 0.2, 1, 1, 1, 900));
		orders.add(new Order(41, 0.9, 0.2, 1, 1, 1, 900));
		orders.add(new Order(42, 1.2, 0.3, 2, 2, 2, 1800));
		orders.add(new Order(43, 2.0, 0.5, 1, 1, 1, 2700));
		orders.add(new Order(44, 1.0, 0.2, 3, 3, 3, 900));
		orders.add(new Order(45, 1.7, 0.3, 1, 1, 1, 900));
		orders.add(new Order(46, 0.9, 0.3, 1, 1, 1, 900));
		orders.add(new Order(47, 1.7, 0.1, 1, 1, 1, 900));
		orders.add(new Order(48, 1.0, 0.2, 2, 2, 2, 1800));
		orders.add(new Order(52, 1.6, 0.4, 2, 0, 0, 600));
		orders.add(new Order(53, 1.6, 0.2, 72, 0, 0, 22000));
		orders.add(new Order(57, 1.7, 0.3, 0, 2, 0, 600));
		orders.add(new Order(58, 1.6, 0.5, 0, 72, 0, 22000));
		orders.add(new Order(59, 0.7, 0.2, 2, 2, 2, 1800));
		
	}

}
