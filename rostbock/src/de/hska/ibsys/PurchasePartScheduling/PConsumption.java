package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;

import de.hska.ibsys.Components.Articel;
import de.hska.ibsys.Components.Consumption;
import de.hska.ibsys.Components.Supply;
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
	private ArrayList<Supply> supplies;
	
	public PConsumption(MainFrame mf, ArrayList<Integer> prognose1) {
		initconsumptions(mf, prognose1);
	}
	
	@SuppressWarnings("serial")
	public void initconsumptions(MainFrame mf, ArrayList<Integer> prognose1) {
		this.mf = mf;
		this.prognose1 = prognose1;
		
		setLayout(new BorderLayout());

		consumptions = new ArrayList<Consumption>();
		consumptions.add(new Consumption(21, "KetteK", 1.8, 0.4, 1, 0, 0, 300, 5, 50, 1, 0, 0));
		consumptions.add(new Consumption(22, "KetteD", 1.7, 0.4, 0, 1, 0, 300, 6.5, 50, 0, 1, 0));
		consumptions.add(new Consumption(23, "KetteH", 1.2, 0.2, 0, 0, 1, 300, 6.5, 50, 0, 0, 1));
		consumptions.add(new Consumption(24, "Mutter", 3.2, 0.3, 7, 7, 7, 6100, 0.06, 100, 7, 7, 7));
		consumptions.add(new Consumption(25, "Scheibe", 0.9, 0.2, 4, 4, 4, 3600, 0.06, 50, 4, 4, 4));
		consumptions.add(new Consumption(27, "Schraube", 0.9, 0.2, 2, 2, 2, 1800, 0.1, 75, 2, 2, 2));
		consumptions.add(new Consumption(28, "Rohr", 1.7, 0.4, 4, 5, 6, 4500, 1.2, 50, 4, 5, 6));
		consumptions.add(new Consumption(32, "Farbe", 2.1, 0.5, 3, 3, 3, 2700, 0.75, 50, 3, 3, 3));
		consumptions.add(new Consumption(33, "FelgeH", 1.9, 0.5, 0, 0, 2, 900, 22, 75, 0, 0, 2));
		consumptions.add(new Consumption(34, "SpeicheH", 1.6, 0.3, 0, 0, 72, 22000, 0.1, 50, 0, 0, 72));
		consumptions.add(new Consumption(35, "Nabe", 2.2, 0.4, 4, 4, 4, 3600, 1.2, 50, 4, 4, 4));
		consumptions.add(new Consumption(36, "Freilauf", 1.2, 0.1, 1, 1, 1, 900, 0.75, 50, 1, 1, 1));
		consumptions.add(new Consumption(37, "Gabel", 1.5, 0.3, 1, 1, 1, 900, 22, 75, 1, 1, 1));
		consumptions.add(new Consumption(38, "Welle", 1.7, 0.4, 1, 1, 1, 300, 1.5, 50, 1, 1, 1));
		consumptions.add(new Consumption(39, "Blech", 1.5, 0.3, 2, 2, 2, 1800, 1.5, 75, 2, 2, 2));
		consumptions.add(new Consumption(40, "Lenker", 1.7, 0.2, 1, 1, 1, 900, 2.5, 50, 1, 1, 1));
		consumptions.add(new Consumption(41, "Mutter", 0.9, 0.2, 1, 1, 1, 900, 0.06, 50, 1, 1, 1));
		consumptions.add(new Consumption(42, "Griff", 1.2, 0.3, 2, 2, 2, 1800, 0.1, 50, 2, 2, 2));
		consumptions.add(new Consumption(43, "Sattel", 2, 0.5, 1, 1, 1, 2700, 5, 75, 1, 1, 1));
		consumptions.add(new Consumption(44, "Stange", 1, 0.2, 3, 3, 3, 900, 0.5, 50, 3, 3, 3));
		consumptions.add(new Consumption(45, "Mutter", 1.7, 0.3, 1, 1, 1, 900, 0.06, 50, 1, 1, 1));
		consumptions.add(new Consumption(46, "Schraube", 0.9, 0.3, 1, 1, 1, 900, 0.1, 50, 1, 1, 1));
		consumptions.add(new Consumption(47, "Zahnkranz", 1.4, 0.1, 1, 1, 1, 900, 3.5, 50, 1, 1, 1));
		consumptions.add(new Consumption(48, "Pedal", 1, 0.2, 2, 2, 2, 1800, 1.5, 75, 2, 2, 2));
		consumptions.add(new Consumption(52, "FelgeK", 1.6, 0.4, 2, 0, 0, 600, 22, 50, 2, 0, 0));
		consumptions.add(new Consumption(53, "SpeicheK", 1.6, 0.2, 72, 0, 0, 22000, 0.1, 50, 72, 0, 0));
		consumptions.add(new Consumption(57, "FelgeD", 1.7, 0.3, 0, 2, 0, 600, 22, 50, 0, 2, 0));
		consumptions.add(new Consumption(58, "SpeicheD", 1.6, 0.5, 0, 72, 0, 22000, 0.1, 50, 0, 72,0));
		consumptions.add(new Consumption(59, "Schweissdraht", 0.7, 0.2, 2, 2, 2, 1800, 0.15, 50,2, 2, 2));
		
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
		this.table.setGridColor(Color.LIGHT_GRAY);
		
		this.table.getModel().addTableModelListener(new TableModelListener() {
			@Override
			public void tableChanged(TableModelEvent e) {
				int row = e.getFirstRow();
		        int column = e.getColumn();
		        TableModel model = (TableModel)e.getSource();
		        Object data = model.getValueAt(row, column);
		        
			}
		});
		this.table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			Color ConsumptionColor = Color.WHITE;
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {

				Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				if(column == 0) {
					ConsumptionColor = Color.WHITE;
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
	}
	


	private void fillRowData(List<Consumption> consumptions) {
		rowData = new Object[consumptions.size()][Definitions.consumptionColumnNames.length];
		for(int i = 0; i < consumptions.size(); i++){
			Consumption c = consumptions.get(i);
			rowData[i][0] = c.getId();
			rowData[i][1] = c.getBezeichnung();
			rowData[i][2] = c.getLagerbestand();
			rowData[i][3] = c.getArrivedSupplyAmount();
			rowData[i][4] = c.getLieferdauerAbw();
			rowData[i][5] = c.getDiskontmenge(); 
			rowData[i][6] = c.getPreis();
			rowData[i][7] = c.getBestellkosten();
			rowData[i][8] = c.getBedarfper1();
			rowData[i][9] = c.getBedarfper2();
			rowData[i][10] = c.getBedarfper3();
			rowData[i][11] = c.getBedarfper4();

		}
	}
	
	public void setMissingValues () {
		try{
			this.articels = this.mf.getXp().getArticels();
			for(Consumption c : this.consumptions) {
				c.setBedarf(this.prognose1);
				for(Articel a : this.articels) {
					if(c.getId() == a.getId()) {
						c.setLagerbestand(a.getAmount());
						break;
					}
				}
			}
			this.supplies = this.mf.getXp().getSupplies();
			for(Supply s : this.supplies) {
				for(Consumption c : this.consumptions) {
					if(s.getArticleId() == c.getId()) {
						c.setArrivedSupply(s);
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