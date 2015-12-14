package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import de.hska.ibsys.help.Definitions;

import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class PanelConsumption extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1494634615296682412L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelConsumption() {
		
		Object[][] data = {};
		table = new JTable(data, Definitions.consumptionColumnNames);
		JScrollPane jsp = new JScrollPane(table);
		jsp.setPreferredSize(new Dimension(750, 450));
		add(jsp);

		TableColumn column = null;
		for (int i = 0; i < 5; i++) {
			column = table.getColumnModel().getColumn(i);
			if (i == 2) {
				column.setPreferredWidth(100); // third column is bigger
			} else {
				column.setPreferredWidth(50);
			}
		}
	}
}
