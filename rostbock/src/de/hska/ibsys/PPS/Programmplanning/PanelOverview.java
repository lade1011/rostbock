package de.hska.ibsys.PPS.Programmplanning;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import de.hska.ibsys.help.*;
import de.hska.ibsys.Components.Articel;
import de.hska.ibsys.ProductionPlan.ArticleAmountPair;

public class PanelOverview extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8830114700019097995L;
	private JTable table;
	private Object[][] rowData;
	
	
	public PanelOverview(List<ArticleAmountPair> orders, List<Articel> articels){
		fillRowData(orders, articels);
		
		table = new JTable(rowData, Definitions.overviewColumnNames);
		JScrollPane jsp = new JScrollPane(table);
		jsp.setPreferredSize(new Dimension(750, 450));
		add(jsp);
	}

	private void fillRowData(List<ArticleAmountPair> orders, List<Articel> articels) {
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
		acutalizeOthers(articels);
	}
	
	public void acutalizeOrders(List<ArticleAmountPair> orders){
		for(ArticleAmountPair po : orders){
			rowData[po.articelNumber - 1][7] = 0;
		}
		for(ArticleAmountPair po : orders){
			int amount = (int)rowData[po.articelNumber - 1][7];
			amount += po.amount;
			rowData[po.articelNumber - 1][7] = amount;
		}
	}
	
	public void acutalizeOthers(List<Articel> articels){
		for(Articel a : articels){
			rowData[(int) (a.getId() - 1)][6] = a.getOrdersInWork() * 3;
			rowData[(int) (a.getId() - 1)][3] = a.getStartamount();
			double startStock = (double)Definitions.startStockValues[(int) (a.getId() - 1)];
			double amount = (double)a.getAmount();
			rowData[(int) (a.getId() - 1)][4] = Math.round(((amount - startStock) / startStock) * 100);
			rowData[(int) (a.getId() - 1)][5] = a.getWaitingAmount();
		}
	}
}
