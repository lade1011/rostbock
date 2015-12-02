package de.hska.ibsys.PPS.Programmplanning;

import java.util.List;
import de.hska.ibsys.help.*;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import de.hska.ibsys.ProductionPlan.ProductionOrder;

public class PanelProductionOrders extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6344101431118872777L;
	private JTable table;
	private List<ProductionOrder> prodOrders;
	
	public PanelProductionOrders(List<ProductionOrder> orders) {
		this.prodOrders = orders;
		
		Integer[][] rowData = changeToRowData(orders); 
		
		table = new JTable(rowData, Definitions.prodOrdersColumnNames);
		add(new JScrollPane(table));
	}	
	
	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public List<ProductionOrder> getProdOrders() {
		return prodOrders;
	}

	public void setProdOrders(List<ProductionOrder> prodOrders) {
		this.prodOrders = prodOrders;
	}
	
	private Integer[][] changeToRowData(List<ProductionOrder> orders) {
		int orderAmount = orders.size();
		Integer[][] rowData = new Integer[orderAmount][2];
		for(int i = 0; i < orderAmount; i++){
			ProductionOrder order = orders.get(i);
			rowData[i][0] = order.articelNumber;
			rowData[i][1] = order.amount;
		}
		return rowData;
	}
	
}
