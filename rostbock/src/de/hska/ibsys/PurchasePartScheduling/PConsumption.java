package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JLabel;
import javax.swing.JPanel;

import de.hska.ibsys.Components.Articel;
import de.hska.ibsys.Components.Consumption;
import de.hska.ibsys.Components.Consumption;
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
	private ArrayList<Consumption> consumptions;

	//Tabelle
	private JTable table;
	private Object[][] rowData;
	
	public PConsumption(MainFrame mf, ArrayList<Integer> prognose1) {
		initconsumptions(mf, prognose1);
	}
	
	public void initconsumptions(MainFrame mf, ArrayList<Integer> prognose1) {
		this.mf = mf;
		this.prognose1 = prognose1;
		
		setLayout(new BorderLayout());

		consumptions = new ArrayList<Consumption>();
		consumptions.add(new Consumption(21, "KetteK", 0.4, 1, 0, 0, 300));
		consumptions.add(new Consumption(22, "KetteD", 0.4, 0, 1, 0, 300));
		consumptions.add(new Consumption(23, "KetteH", 0.2, 0, 0, 1, 300));
		consumptions.add(new Consumption(24, "Mutter", 0.3, 7, 7, 7, 6100));
		consumptions.add(new Consumption(25, "Scheibe", 0.2, 4, 4, 4, 3600));
		consumptions.add(new Consumption(27, "Schraube", 0.2, 2, 2, 2, 1800));
		consumptions.add(new Consumption(28, "Rohr", 0.4, 4, 5, 6, 4500));
		consumptions.add(new Consumption(32, "Farbe", 0.5, 3, 3, 3, 2700));
		consumptions.add(new Consumption(33, "FelgeH", 0.5, 0, 0, 2, 900));
		consumptions.add(new Consumption(34, "SpeicheH", 0.3, 0, 0, 72, 22000));
		consumptions.add(new Consumption(35, "Nabe", 0.4, 4, 4, 4, 3600));
		consumptions.add(new Consumption(36, "Freilauf", 0.1, 1, 1, 1, 900));
		consumptions.add(new Consumption(37, "Gabel", 0.3, 1, 1, 1, 900));
		consumptions.add(new Consumption(38, "Welle", 0.4, 1, 1, 1, 300));
		consumptions.add(new Consumption(39, "Blech", 0.3, 2, 2, 2, 1800));
		consumptions.add(new Consumption(40, "Lenker", 0.2, 1, 1, 1, 900));
		consumptions.add(new Consumption(41, "Mutter", 0.2, 1, 1, 1, 900));
		consumptions.add(new Consumption(42, "Griff", 0.3, 2, 2, 2, 1800));
		consumptions.add(new Consumption(43, "Sattel", 0.5, 1, 1, 1, 2700));
		consumptions.add(new Consumption(44, "Stange", 0.2, 3, 3, 3, 900));
		consumptions.add(new Consumption(45, "Mutter", 0.3, 1, 1, 1, 900));
		consumptions.add(new Consumption(46, "Schraube", 0.3, 1, 1, 1, 900));
		consumptions.add(new Consumption(47, "Zahnkranz", 0.1, 1, 1, 1, 900));
		consumptions.add(new Consumption(48, "Pedal", 0.2, 2, 2, 2, 1800));
		consumptions.add(new Consumption(52, "FelgeK", 0.4, 2, 0, 0, 600));
		consumptions.add(new Consumption(53, "SpeicheK", 0.2, 72, 0, 0, 22000));
		consumptions.add(new Consumption(57, "FelgeD", 0.3, 0, 2, 0, 600));
		consumptions.add(new Consumption(58, "SpeicheD", 0.5, 0, 72, 0, 22000));
		consumptions.add(new Consumption(59, "Schweissdraht", 0.2, 2, 2, 2, 1800));
		
		setMissingValues();
		fillRowData(consumptions);
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
		        	changeConsumptionValue((int) model.getValueAt(row, 0), column, data);
		        }
		        else if(column == 8) {
		        	changeConsumptionValue((int) model.getValueAt(row, 0), column, data);
		        }
		        else if(column == 6) {
		        	updateDiskontMenge((int) model.getValueAt(row, 0), data);
		        }
		        
			}
		});
		this.table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			Color ConsumptionColor = Color.WHITE;
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {

				Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				if(column == 0) {
					ConsumptionColor = getConsumptionColor((int) value);
				}
				setForeground(Color.BLACK);
				setBackground(ConsumptionColor);
				return this;
			}
        });
		
		
		JScrollPane jsp = new JScrollPane(this.table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			    JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setPreferredSize(new Dimension(750, 750));
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
		JLabel oDesc = new JLabel("Normal Consumption is recommended");
		colorDesc.add(oDesc);
		JLabel red = new JLabel("Red: ");
		red.setForeground(Color.RED);
		colorDesc.add(red);
		JLabel rDesc = new JLabel("Rush Consumption is recommended");
		colorDesc.add(rDesc);
		add(colorDesc, BorderLayout.SOUTH);
	}
	
	private Color getConsumptionColor(int ConsumptionId) {
//		for(Consumption o : this.consumptions) {
//			if(o.getId() == ConsumptionId) {
//				if(o.isConsumption() && o.isRushConsumption()) {
//					return Color.RED;
//				}
//				else if(o.isConsumption() && !o.isRushConsumption()) {
//					return Color.ORANGE;
//				}
//				else {
//					return Color.WHITE;
//				}
//			}
//		}
		return Color.WHITE;
	}
	
	private void changeConsumptionValue(int ConsumptionId, int column, Object data) {
		for(Consumption c : this.consumptions) {
			if(c.getId() == ConsumptionId) {
				if(column == 7) {
					//c.setToConsumption((boolean) data);
				}
				else if(column == 8) {
					c.setWithRush((boolean) data);
				}
				break;
			}
		}
	}
	
	private void updateDiskontMenge(int ConsumptionId, Object value) {
		for(Consumption o : this.consumptions) {
			if(o.getId() == ConsumptionId) {
				System.out.println("Id:" + o.getId() + "value: " + value);
				o.setDiskontmenge(Integer.valueOf((String) value));
				System.out.println("Id:" + o.getId() + "value: " + o.getDiskontmenge());
				break;
			}
		}
	}
	
	private void fillRowData(List<Consumption> consumptions) {
		rowData = new Object[consumptions.size()][Definitions.consumptionColumnNames.length];
		for(int i = 0; i < consumptions.size(); i++){
			Consumption c = consumptions.get(i);
			rowData[i][0] = c.getId();
			rowData[i][1] = c.getBezeichnung();
			rowData[i][2] = "";
			rowData[i][3] = "";
			rowData[i][4] = "";
			rowData[i][5] = ""; 
			rowData[i][6] = c.getDiskontmenge();
			rowData[i][7] = c.isToOrder(); //isConsumption();
			rowData[i][8] = c.isWithRush(); //o.isRushConsumption();
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
		this.articels = this.mf.getXp().getArticels();
		for(Consumption c : this.consumptions) {
			c.setBedarf(this.prognose1);
			for(Articel a : this.articels) {
				if(c.getId() == a.getId()) {
//					c.setAnfangsbestand(a.getAmount());
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