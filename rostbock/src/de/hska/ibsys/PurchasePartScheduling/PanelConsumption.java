package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;

import de.hska.ibsys.Components.Articel;
import de.hska.ibsys.MainFrame.MainFrame;
import de.hska.ibsys.XML.XMLParser;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class PanelConsumption extends JPanel {

	/**
	 * Create the panel.
	 */
	private ConsumptionOverview cw;
	private Content c;
	
	private ArrayList<Integer> prognose1;
	
	public PanelConsumption(MainFrame mf) {
		setLayout(new BorderLayout());
		//panel = new JPanel();
		
		cw = new ConsumptionOverview(this);
		add(cw, BorderLayout.NORTH);
		
		c = new Content(mf);
		add(c, BorderLayout.CENTER);
		
		this.prognose1 = new ArrayList<Integer>();
		
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

	public ArrayList<Integer> getPrognose1() {
		return prognose1;
	}

	public void setPrognose1(ArrayList<Integer> prognose1) {
		this.prognose1 = prognose1;
		this.c.setPrognose1(prognose1);
	}

}
