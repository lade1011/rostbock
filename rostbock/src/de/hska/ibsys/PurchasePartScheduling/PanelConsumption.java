package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import de.hska.ibsys.help.Definitions;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

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
		DefaultTableModel dtm = new DefaultTableModel(0, 0);
		table.setModel(dtm);
		
		JScrollPane jsp = new JScrollPane(table);
		jsp.setPreferredSize(new Dimension(750, 450));
		add(jsp);
		TableColumn column = null;
		for (int i = 0; i < table.getColumnCount(); i++) {
			column = table.getColumnModel().getColumn(i);
			column.sizeWidthToFit();
		}

		for (int count = 1; count <= 30; count++) {
//			dtm.addRow(new Object[] { "data", "data", "data", "data", "data", "data" });
		}
	}
}
