package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;

import de.hska.ibsys.MainFrame.MainFrame;
import de.hska.ibsys.PPS.PanelPPSOverview;
import de.hska.ibsys.PPS.PanelPrognose;
import de.hska.ibsys.PPS.Programmplanning.PanelProgrammPlanning;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class PanelConsumption extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1494634615296682412L;
	private PanelPPSOverview ppsOverview;
	private PanelProgrammPlanning pProgrammPlanning;
	private JPanel panelContent;
	private MainFrame mf;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelConsumption(MainFrame mf) {
		this.mf = mf;
		setLayout(new BorderLayout());
		add(ppsOverview, BorderLayout.NORTH);

		panelContent = new JPanel();
		add(panelContent, BorderLayout.CENTER);
		panelContent.setLayout(new CardLayout(0, 0));

		String[] columnNames = { "Artikel", "Bezeichnung", "aktueller Lagerbestand", "Lagerzugang",
				"Lieferdauer Abweichung", "Diskontmenge", "Preis", "Bestellkosten", "Bruttobedarf P1",
				"Bruttobedarf P2", "Bruttobedarf P3", "Bruttobedarf P4", "Anfangsbestand P1", "Anfangsbestand P2",
				"Anfangsbestand P3", "Anfangsbestand P4", "Anfangsbestand P5" };

		Object[][] data = {};
		table = new JTable(data, columnNames);
		table.setRowSelectionAllowed(false);
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		table.setShowGrid(false);

		TableColumn column = null;
		for (int i = 0; i < 5; i++) {
			column = table.getColumnModel().getColumn(i);
			if (i == 2) {
				column.setPreferredWidth(100); // third column is bigger
			} else {
				column.setPreferredWidth(50);
			}
		}
		panelContent.add(table, "name_1916221735059");
	}
}
