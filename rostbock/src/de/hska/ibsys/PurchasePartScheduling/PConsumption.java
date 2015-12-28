package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import de.hska.ibsys.Components.Articel;
import de.hska.ibsys.ProductionPlan.ArticleAmountPair;
import de.hska.ibsys.help.Definitions;

public class PConsumption extends JPanel {

	/**
	 * Create the panel.
	 */
	private JTable table;
	private Object[][] rowData;
	
	public PConsumption() {
		fillRowData();
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(750, 450));
		
		table = new JTable(rowData, Definitions.overviewColumnNames);
		
		add(scrollPane);

	}
	private void fillRowData() {
		rowData = new Object[59][Definitions.overviewColumnNames.length];
		for(int i = 0; i < 59; i++){
			rowData[i][0] = i+1;
			rowData[i][1] = Definitions.descriptions[i];
			rowData[i][2] = Definitions.usage[i];
			rowData[i][3] = 0;
			rowData[i][4] = 0; 
			rowData[i][5] = 0;
			rowData[i][6] = 0;
			rowData[i][7] = 0;
		}
	}
}
