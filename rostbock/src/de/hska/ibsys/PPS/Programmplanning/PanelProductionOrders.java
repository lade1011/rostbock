package de.hska.ibsys.PPS.Programmplanning;

import java.util.ArrayList;
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
//	private JTable table;
	private ArrayList<ProductionOrder> prodOrders;
	
	public PanelProductionOrders() {
		super();
	}	
	
//	public JTable getTable() {
//		return table;
//	}
//
//	public void setTable(JTable table) {
//		this.table = table;
//	}

	public ArrayList<ProductionOrder> getProdOrders() {
		return prodOrders;
	}

	public void setProdOrders(ArrayList<ProductionOrder> prodOrders) {
		this.prodOrders = prodOrders;
	}
	
	private Integer[][] changeToRowData(ArrayList<ProductionOrder> orders) {
		int orderAmount = orders.size();
		Integer[][] rowData = new Integer[orderAmount][2];
		for(int i = 0; i < orderAmount; i++){
			ProductionOrder order = orders.get(i);
			rowData[i][0] = order.articelNumber;
			rowData[i][1] = order.amount;
		}
		return rowData;
	}
	
	public void initProdOrders(ArrayList<ProductionOrder> childOrders, ArrayList<ProductionOrder> womanOrders, ArrayList<ProductionOrder> manOrders) {
		System.out.println(childOrders.size());
		System.out.println(womanOrders.size());
		System.out.println(manOrders.size());
		this.prodOrders = new ArrayList<ProductionOrder>();
		
		ProductionOrder p26 = new ProductionOrder(26, childOrders.get(1).getAmount() + womanOrders.get(1).getAmount() + manOrders.get(1).getAmount());
		ProductionOrder p16 = new ProductionOrder(16, childOrders.get(3).getAmount() + womanOrders.get(3).getAmount() + manOrders.get(3).getAmount());
		ProductionOrder p17 = new ProductionOrder(17, childOrders.get(4).getAmount() + womanOrders.get(4).getAmount() + manOrders.get(4).getAmount());
		
		this.removeAll();
		this.revalidate();
		this.repaint();
		
		if(p26.getAmount() > 0) {
			this.prodOrders.add(p26);
		}
		if(p16.getAmount() > 0) {
			this.prodOrders.add(p16);
		}
		if(p17.getAmount() > 0) {
			this.prodOrders.add(p17);
		}
		
		for(int p=0; p<childOrders.size(); p++) {
			if(childOrders.get(p).getAmount() > 0 && p != 1 && p != 3 && p != 4) {
				this.prodOrders.add(childOrders.get(p));
			}
		}
		for(int p=0; p<womanOrders.size(); p++) {
			if(womanOrders.get(p).getAmount() > 0 && p != 1 && p != 3 && p != 4) {
				this.prodOrders.add(womanOrders.get(p));
			}
		}
		for(int p=0; p<manOrders.size(); p++) {
			if(manOrders.get(p).getAmount() > 0 && p != 1 && p != 3 && p != 4) {
				this.prodOrders.add(manOrders.get(p));
			}
		}
		
		Integer[][] rowData = changeToRowData(this.prodOrders); 
		JTable table = new JTable(rowData, Definitions.prodOrdersColumnNames);
		add(new JScrollPane(table));
		
		this.revalidate();
		this.repaint();
	}
	
}
