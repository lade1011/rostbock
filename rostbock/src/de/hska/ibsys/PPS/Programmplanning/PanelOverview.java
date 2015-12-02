package de.hska.ibsys.PPS.Programmplanning;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import de.hska.ibsys.help.*;

import de.hska.ibsys.ProductionPlan.ProductionOrder;

public class PanelOverview extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8830114700019097995L;
	private JTable table;
	private Object[][] rowData;
	
	
	public PanelOverview(List<ProductionOrder> orders){
		rowData = fillRowData(orders);
		
		JTable table = new JTable(rowData, Definitions.overviewColumnNames);
		add(new JScrollPane(table));
	}

	private Object[][] fillRowData(List<ProductionOrder> orders) {
		Object[][] rD = new Object[59][Definitions.overviewColumnNames.length];
		
		//Muss angepasst werden
		int actStock = 0;
		int inQueue = 0;
		int inWork = 0;
		
		for(int i = 0; i < 59; i++){
			rD[i][0] = i+1;
			rD[i][1] = Definitions.descriptions[i];
			rD[i][2] = Definitions.usage[i];
			rD[i][3] = actStock;
			rD[i][4] = actStock / Definitions.startStockValues[i]; 
			rD[i][5] = inQueue;
			rD[i][6] = inWork;
			rD[i][7] = orders.indexOf(i) == -1 ? 0 : orders.get(orders.indexOf(i)).amount;
		}
		return rD;
	}
}
