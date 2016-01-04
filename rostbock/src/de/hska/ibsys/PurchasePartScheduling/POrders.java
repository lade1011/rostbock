package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;

import de.hska.ibsys.Components.Articel;
import de.hska.ibsys.Components.Order;
import de.hska.ibsys.MainFrame.MainFrame;
import de.hska.ibsys.help.Definitions;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class POrders extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4143755668817809840L;
	/**
	 * Create the panel.
	 */
	private MainFrame mf;
	private ArrayList<Integer> prognose1;
	private ArrayList<Articel> articels;
	private ArrayList<Order> orders;

	//Tabelle
	private JTable table;
	private Object[][] rowData;
	
	public POrders(MainFrame mf) {
		this.mf = mf;
		this.prognose1 = new ArrayList<Integer>();

		orders = new ArrayList<Order>();
		orders.add(new Order(21, 1.8, 0.4, 1, 0, 0, 300));
		orders.add(new Order(22, 1.7, 0.4, 0, 1, 0, 300));
		orders.add(new Order(23, 1.2, 0.2, 0, 0, 1, 300));
		orders.add(new Order(24, 3.2, 0.3, 7, 7, 7, 6100));
		orders.add(new Order(25, 0.9, 0.2, 4, 4, 4, 3600));
		orders.add(new Order(27, 0.9, 0.2, 2, 2, 2, 1800));
		orders.add(new Order(28, 1.7, 0.4, 4, 5, 6, 4500));
		orders.add(new Order(32, 2.1, 0.5, 3, 3, 3, 2700));
		orders.add(new Order(33, 1.9, 0.5, 0, 0, 2, 900));
		orders.add(new Order(34, 1.6, 0.3, 0, 0, 72, 22000));
		orders.add(new Order(35, 2.2, 0.4, 4, 4, 4, 3600));
		orders.add(new Order(36, 1.2, 0.1, 1, 1, 1, 900));
		orders.add(new Order(37, 1.5, 0.3, 1, 1, 1, 900));
		orders.add(new Order(38, 1.7, 0.4, 1, 1, 1, 300));
		orders.add(new Order(39, 1.5, 0.3, 2, 2, 2, 1800));
		orders.add(new Order(40, 1.7, 0.2, 1, 1, 1, 900));
		orders.add(new Order(41, 0.9, 0.2, 1, 1, 1, 900));
		orders.add(new Order(42, 1.2, 0.3, 2, 2, 2, 1800));
		orders.add(new Order(43, 2.0, 0.5, 1, 1, 1, 2700));
		orders.add(new Order(44, 1.0, 0.2, 3, 3, 3, 900));
		orders.add(new Order(45, 1.7, 0.3, 1, 1, 1, 900));
		orders.add(new Order(46, 0.9, 0.3, 1, 1, 1, 900));
		orders.add(new Order(47, 1.7, 0.1, 1, 1, 1, 900));
		orders.add(new Order(48, 1.0, 0.2, 2, 2, 2, 1800));
		orders.add(new Order(52, 1.6, 0.4, 2, 0, 0, 600));
		orders.add(new Order(53, 1.6, 0.2, 72, 0, 0, 22000));
		orders.add(new Order(57, 1.7, 0.3, 0, 2, 0, 600));
		orders.add(new Order(58, 1.6, 0.5, 0, 72, 0, 22000));
		orders.add(new Order(59, 0.7, 0.2, 2, 2, 2, 1800));
		
		setAmounts();
		fillRowData(orders);
		this.table = new JTable(rowData, Definitions.orderColumnNames);
		JScrollPane jsp = new JScrollPane(this.table);
		jsp.setPreferredSize(new Dimension(750, 450));
		add(jsp);
		
		
	}
	private void fillRowData(List<Order> orders) {
		rowData = new Object[59][Definitions.orderColumnNames.length];
		for(int i = 0; i < orders.size(); i++){
			Order o = orders.get(i);
			rowData[i][0] = o.getId();
			rowData[i][1] = o.getAnfangsbestand();
			rowData[i][2] = o.bestandNachPeriode(1);
			rowData[i][3] = o.bestandNachPeriode(2);
			rowData[i][4] = o.bestandNachPeriode(3);
			rowData[i][5] = o.bestandNachPeriode(4); 
			rowData[i][6] = 0;
			rowData[i][7] = 0;
			rowData[i][8] = o.isRushOrder() ? "Ja" : "Nein";
		}
	}
	
	public void setAmounts () {
		this.articels = this.mf.getXp().getArticels();
		for(Order o : this.orders) {
			for(Articel a : this.articels) {
				if(o.getId() == a.getId()) {
					o.setAnfangsbestand(a.getAmount());
					//Nur wenn XML eingelesen wurde
					break;
				}
			}
		}
	}

	public ArrayList<Integer> getPrognose1() {
		return prognose1;
	}

	public void setPrognose1(ArrayList<Integer> prognose1) {
		this.prognose1 = prognose1;
	}

}
