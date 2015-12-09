package de.hska.ibsys.PPS.Programmplanning;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import de.hska.ibsys.help.*;

import de.hska.ibsys.ProductionPlan.ArticleAmountPair;

public class PanelOverview extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8830114700019097995L;
	private JTable table;
	private Object[][] rowData;
	
	
	public PanelOverview(List<ArticleAmountPair> orders){
		fillRowData(orders);
		
		table = new JTable(rowData, Definitions.overviewColumnNames);
		JScrollPane jsp = new JScrollPane(table);
		jsp.setPreferredSize(new Dimension(750, 450));
		add(jsp);
	}

	private void fillRowData(List<ArticleAmountPair> orders) {
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
		acutalizeOrders(orders);
	}
	
	public void acutalizeOrders(List<ArticleAmountPair> orders){
		for(ArticleAmountPair po : orders){
			rowData[po.articelNumber - 1][7] = po.amount;
		}
	}
	
	public void acutalizeInQueue(List<ArticleAmountPair> orders){
		for(ArticleAmountPair po : orders){
			rowData[po.articelNumber - 1][5] = po.amount;
		}
	}
	
	public void acutalizeInStock(List<ArticleAmountPair> orders){
		for(ArticleAmountPair po : orders){
			rowData[po.articelNumber - 1][3] = po.amount;
			rowData[po.articelNumber - 1][4] = po.amount / Definitions.startStockValues[po.articelNumber - 1];
		}
	}
	
	public void acutalizeInWork(List<ArticleAmountPair> orders){
		for(ArticleAmountPair po : orders){
			rowData[po.articelNumber - 1][6] = po.amount;
		}
	}
}
