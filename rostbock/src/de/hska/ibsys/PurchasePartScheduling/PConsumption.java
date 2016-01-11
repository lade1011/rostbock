package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JLabel;
import javax.swing.JPanel;

import de.hska.ibsys.Components.Articel;
import de.hska.ibsys.Components.Order;
import de.hska.ibsys.MainFrame.MainFrame;
import de.hska.ibsys.help.Definitions;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class PConsumption extends JPanel {

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
	
	public PConsumption(MainFrame mf, ArrayList<Integer> prognose1) {
		initOrders(mf, prognose1);
	}
	
	public void initOrders(MainFrame mf, ArrayList<Integer> prognose1) {
		this.mf = mf;
		this.prognose1 = prognose1;
		
		setLayout(new BorderLayout());

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
		
		setMissingValues();
		fillRowData(orders);
		this.table = new JTable(rowData, Definitions.consumptionColumnNames) {
			public boolean isCellEditable(int row, int column) {
				Object o = getValueAt(row, column - 1);
				if (o.equals(false)) {
					return false;
				}
				else {
					return true;
				}
			}
		};
		
		TableColumn tc = this.table.getColumnModel().getColumn(7);
		tc.setCellEditor(this.table.getDefaultEditor(Boolean.class));
		tc.setCellRenderer(this.table.getDefaultRenderer(Boolean.class));
		tc = this.table.getColumnModel().getColumn(8);
		tc.setCellEditor(this.table.getDefaultEditor(Boolean.class));
		tc.setCellRenderer(this.table.getDefaultRenderer(Boolean.class));
		
		this.table.getModel().addTableModelListener(new TableModelListener() {
			@Override
			public void tableChanged(TableModelEvent e) {
				int row = e.getFirstRow();
		        int column = e.getColumn();
		        TableModel model = (TableModel)e.getSource();
//		        String columnName = model.getColumnName(column);
		        Object data = model.getValueAt(row, column);
		        
		        if(column == 7 && (boolean) data == false) {
		        	model.setValueAt(false, row, column +1);
		        	changeOrderValue((int) model.getValueAt(row, 0), column, data);
		        }
		        else if(column == 8) {
		        	changeOrderValue((int) model.getValueAt(row, 0), column, data);
		        }
		        else if(column == 6) {
		        	updateDiskontMenge((int) model.getValueAt(row, 0), data);
		        }
		        
			}
		});
		this.table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			Color orderColor = Color.WHITE;
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {

				Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				if(column == 0) {
					orderColor = getOrderColor((int) value);
				}
				setForeground(Color.BLACK);
				setBackground(orderColor);
				return this;
			}
        });
		
		
		JScrollPane jsp = new JScrollPane(this.table);
		jsp.setPreferredSize(new Dimension(750, 450));
		add(jsp, BorderLayout.CENTER);
		
		JPanel colorDesc = new JPanel();
		JLabel white = new JLabel("White: ");
		white.setForeground(Color.BLACK);
		colorDesc.add(white);
		JLabel wDesc = new JLabel("Everything is ok");
		colorDesc.add(wDesc);
		JLabel orange = new JLabel("Orange: ");
		orange.setForeground(Color.ORANGE);
		colorDesc.add(orange);
		JLabel oDesc = new JLabel("Normal order is recommended");
		colorDesc.add(oDesc);
		JLabel red = new JLabel("Red: ");
		red.setForeground(Color.RED);
		colorDesc.add(red);
		JLabel rDesc = new JLabel("Rush order is recommended");
		colorDesc.add(rDesc);
		add(colorDesc, BorderLayout.SOUTH);
	}
	
	private Color getOrderColor(int orderId) {
//		for(Order o : this.orders) {
//			if(o.getId() == orderId) {
//				if(o.isOrder() && o.isRushOrder()) {
//					return Color.RED;
//				}
//				else if(o.isOrder() && !o.isRushOrder()) {
//					return Color.ORANGE;
//				}
//				else {
//					return Color.WHITE;
//				}
//			}
//		}
		return Color.WHITE;
	}
	
	private void changeOrderValue(int orderId, int column, Object data) {
		for(Order o : this.orders) {
			if(o.getId() == orderId) {
				if(column == 7) {
					o.setToOrder((boolean) data);
				}
				else if(column == 8) {
					o.setWithRush((boolean) data);
				}
				break;
			}
		}
	}
	
	private void updateDiskontMenge(int orderId, Object value) {
		for(Order o : this.orders) {
			if(o.getId() == orderId) {
				System.out.println("Id:" + o.getId() + "value: " + value);
				o.setDiskontmenge(Integer.valueOf((String) value));
				System.out.println("Id:" + o.getId() + "value: " + o.getDiskontmenge());
				break;
			}
		}
	}
	
	private void fillRowData(List<Order> orders) {
		rowData = new Object[orders.size()][Definitions.consumptionColumnNames.length];
		for(int i = 0; i < orders.size(); i++){
			Order o = orders.get(i);
			rowData[i][0] = o.getId();
			rowData[i][1] = o.getAnfangsbestand();
			rowData[i][2] = o.bestandNachPeriode(1);
			rowData[i][3] = o.bestandNachPeriode(2);
			rowData[i][4] = o.bestandNachPeriode(3);
			rowData[i][5] = o.bestandNachPeriode(4); 
			rowData[i][6] = o.getDiskontmenge();
			rowData[i][7] = o.isToOrder(); //isOrder();
			rowData[i][8] = o.isWithRush(); //o.isRushOrder();
			rowData[i][9] = "0";
			rowData[i][10] = "0";
			rowData[i][11] = "0";
			rowData[i][12] = "0";
			rowData[i][13] = "0";
			rowData[i][14] = "0";
			rowData[i][15] = "0";
			rowData[i][16] = "0";

		}
	}
	
	public void setMissingValues () {
		try{
			this.articels = this.mf.getXp().getArticels();
			for(Order o : this.orders) {
				o.setBedarf(this.prognose1);
				for(Articel a : this.articels) {
					if(o.getId() == a.getId()) {
						o.setAnfangsbestand(a.getAmount());
						break;
					}
				}
			}
		}catch(Exception e){
			
		}
	}

	public ArrayList<Integer> getPrognose1() {
		return prognose1;
	}

	public void setPrognose1(ArrayList<Integer> prognose1) {
		this.prognose1 = prognose1;
	}

}