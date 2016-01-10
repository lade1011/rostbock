package de.hska.ibsys.CapacityPlan;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import de.hska.ibsys.ProductionPlan.ArticleAmountPair;
import de.hska.ibsys.help.Definitions;

public class PanelCapacityPlaning extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1581101578046120894L;
	private Object[][] rowData;
	private JTable table;
	
	
	public PanelCapacityPlaning(List<ArticleAmountPair> orders){
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setPreferredSize(new Dimension(750, 450));
		scrollPane.setBounds(0, 38, 750, 412);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Arbeitsplatz", "Leerzeit", "Kapazit\u00E4tsbedarf (R\u00FCckst\u00E4nde)", "Kapazit\u00E4tsbedarf (neu)", "R\u00FCstzeit (R\u00FCckst\u00E4nde)", "R\u00FCstzeit (neu)", "2. Schicht", "3. Schicht"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 2427796496946254064L;
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Boolean.class, Boolean.class
			};
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Kapazit\u00E4tsplanung");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(0, 0, 178, 34);
		add(lblNewLabel);
		fillRowData(orders);
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
