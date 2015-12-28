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
	private ConsumptionOverview cw;
	private Content c;
	
	public PanelConsumption() {
		setLayout(new BorderLayout());
		//panel = new JPanel();
		
		cw = new ConsumptionOverview(this);
		add(cw, BorderLayout.NORTH);
		
		c = new Content();
		add(c, BorderLayout.CENTER);
		
		
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
		});
		btnPanel.add(btnBestellungen);
		//add(btnBestellungen);
		
		add(btnPanel, BorderLayout.CENTER);
		
		JLabel lblTest = new JLabel("test");
		panel.add(lblTest);*/

	}

	public Content getContent() {
		return c;
	}

	public void setC(Content c) {
		this.c = c;
	}

}
