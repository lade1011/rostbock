package de.hska.ibsys.CapacityPlan;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import de.hska.ibsys.Components.Workingtime;
import de.hska.ibsys.MainFrame.ControlButtons;
import de.hska.ibsys.PPS.PanelPPS;
import de.hska.ibsys.PPS.PanelPPSOverview;
import de.hska.ibsys.ProductionPlan.ArticleAmountPair;
import de.hska.ibsys.help.Definitions;
import de.hska.ibsys.help.Workplace;

public class PanelCapacityPlanning extends JPanel {

	private static final long serialVersionUID = 1581101578046120894L;
	private JTable table;
	private Object[][] rowData;
	private HashMap<Integer, Integer> orders;
	private ArrayList<Workingtime> wTimes;
	
	public PanelCapacityPlanning(PanelPPSOverview pOver){
		this.wTimes = new ArrayList<Workingtime>();
		setLayout(new BorderLayout());
		orders = new HashMap<Integer, Integer>();
		fillOrderData();
		fillRowData();
		
		table = new JTable(rowData, Definitions.capacityColumnNames);
		JScrollPane jsp = new JScrollPane(table);
		jsp.setPreferredSize(new Dimension(750, 450));
		add(jsp, BorderLayout.CENTER);
		
		ControlButtons cb = new ControlButtons();
		cb.getBtnBack().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pOver.getProgrammPlanningButton().doClick();
			}
		});
		cb.getBtnNext().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pOver.getOrderButton().doClick();
			}
		});
		add(cb, BorderLayout.SOUTH);
	}
	
	private void fillOrderData(){
		List<ArticleAmountPair> prodOrders = PanelPPS.prodOrders == null ? new ArrayList<ArticleAmountPair>() : PanelPPS.prodOrders;
		for(ArticleAmountPair pair : prodOrders){
			try{
				int amountBefore = orders.getOrDefault(pair.articelNumber, 0);
				orders.put(pair.articelNumber, pair.amount + amountBefore);
			}catch(Exception e){
				continue;
			}
		}
	}
	
	private void fillRowData(){
		rowData = new Object[14][Definitions.capacityColumnNames.length];
		for(int i = 1; i < 16; i++){
			if(i == 5){
				continue;
			}
			int x = i - 1;
			if(i > 5){
				x = i-2;
			}
			
			rowData[x][0] = i;
			int bedarf = calculateBedarf(i);
			int ruestzeit = calcuclateRuestzeit(i);
			rowData[x][1] = bedarf;
			rowData[x][2] = ruestzeit;
			
			rowData[x][3] = 0; //TODO: KapBedarf alt
			rowData[x][4] = 0; //TODO: Ruestzeit alt
			
			int gesBedarf = bedarf + ruestzeit;
			rowData[x][5] = gesBedarf;
			
			int anzahlSchichten = calculateSchichten(gesBedarf);
			rowData[x][6] = anzahlSchichten;
			rowData[x][7] = calculateOvertime(gesBedarf, anzahlSchichten);
			
			Workingtime w = new Workingtime(i, anzahlSchichten, calculateOvertime(gesBedarf, anzahlSchichten));
			this.wTimes.add(w);
		}
	}

	private int calcuclateRuestzeit(int workplaceNumber){
		int ruestzeit = 0;
		
		if(workplaceNumber == 1){
			ruestzeit += orders.getOrDefault(49, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 49) : 0;
			ruestzeit += orders.getOrDefault(54, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 54) : 0;
			ruestzeit += orders.getOrDefault(29, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 29) : 0;
		}else if(workplaceNumber == 2){
			ruestzeit += orders.getOrDefault(50, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 50) : 0;
			ruestzeit += orders.getOrDefault(55, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 55) : 0;
			ruestzeit += orders.getOrDefault(30, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 30) : 0;
		}else if(workplaceNumber == 3){
			ruestzeit += orders.getOrDefault(51, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 51) : 0;
			ruestzeit += orders.getOrDefault(56, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 56) : 0;
			ruestzeit += orders.getOrDefault(31, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 31) : 0;
		}else if(workplaceNumber == 4){
			ruestzeit += orders.getOrDefault(1, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 1) : 0;
			ruestzeit += orders.getOrDefault(2, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 2) : 0;
			ruestzeit += orders.getOrDefault(3, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 3) : 0;
		}else if(workplaceNumber == 6){
			ruestzeit += orders.getOrDefault(16, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 16) : 0;
			ruestzeit += orders.getOrDefault(18, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 18) : 0;
			ruestzeit += orders.getOrDefault(19, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 19) : 0;
			ruestzeit += orders.getOrDefault(20, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 20) : 0;
		}else if(workplaceNumber == 7){
			ruestzeit += orders.getOrDefault(10, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 10) : 0;
			ruestzeit += orders.getOrDefault(11, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 11) : 0;
			ruestzeit += orders.getOrDefault(12, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 12) : 0;
			ruestzeit += orders.getOrDefault(13, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 13) : 0;
			ruestzeit += orders.getOrDefault(14, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 14) : 0;
			ruestzeit += orders.getOrDefault(15, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 15) : 0;
			ruestzeit += orders.getOrDefault(18, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 18) : 0;
			ruestzeit += orders.getOrDefault(19, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 19) : 0;
			ruestzeit += orders.getOrDefault(20, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 20) : 0;
			ruestzeit += orders.getOrDefault(26, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 26) : 0;
		}else if(workplaceNumber == 8){
			ruestzeit += orders.getOrDefault(10, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 10) : 0;
			ruestzeit += orders.getOrDefault(11, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 11) : 0;
			ruestzeit += orders.getOrDefault(12, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 12) : 0;
			ruestzeit += orders.getOrDefault(13, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 13) : 0;
			ruestzeit += orders.getOrDefault(14, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 14) : 0;
			ruestzeit += orders.getOrDefault(15, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 15) : 0;
			ruestzeit += orders.getOrDefault(18, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 18) : 0;
			ruestzeit += orders.getOrDefault(19, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 19) : 0;
			ruestzeit += orders.getOrDefault(20, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 20) : 0;
		}else if(workplaceNumber == 9){
			ruestzeit += orders.getOrDefault(10, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 10) : 0;
			ruestzeit += orders.getOrDefault(11, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 11) : 0;
			ruestzeit += orders.getOrDefault(12, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 12) : 0;
			ruestzeit += orders.getOrDefault(13, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 13) : 0;
			ruestzeit += orders.getOrDefault(14, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 14) : 0;
			ruestzeit += orders.getOrDefault(15, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 15) : 0;
			ruestzeit += orders.getOrDefault(18, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 18) : 0;
			ruestzeit += orders.getOrDefault(19, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 19) : 0;
			ruestzeit += orders.getOrDefault(20, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 20) : 0;
		}else if(workplaceNumber == 10){
			ruestzeit += orders.getOrDefault(4, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 4) : 0;
			ruestzeit += orders.getOrDefault(5, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 5) : 0;
			ruestzeit += orders.getOrDefault(6, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 6) : 0;
			ruestzeit += orders.getOrDefault(7, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 7) : 0;
			ruestzeit += orders.getOrDefault(8, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 8) : 0;
			ruestzeit += orders.getOrDefault(9, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 9) : 0;
		}else if(workplaceNumber == 11){
			ruestzeit += orders.getOrDefault(4, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 4) : 0;
			ruestzeit += orders.getOrDefault(5, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 5) : 0;
			ruestzeit += orders.getOrDefault(6, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 6) : 0;
			ruestzeit += orders.getOrDefault(7, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 7) : 0;
			ruestzeit += orders.getOrDefault(8, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 8) : 0;
			ruestzeit += orders.getOrDefault(9, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 9) : 0;
		}else if(workplaceNumber == 12){
			ruestzeit += orders.getOrDefault(10, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 10) : 0;
			ruestzeit += orders.getOrDefault(11, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 11) : 0;
			ruestzeit += orders.getOrDefault(12, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 12) : 0;
			ruestzeit += orders.getOrDefault(13, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 13) : 0;
			ruestzeit += orders.getOrDefault(14, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 14) : 0;
			ruestzeit += orders.getOrDefault(15, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 15) : 0;
		}else if(workplaceNumber == 13){
			ruestzeit += orders.getOrDefault(10, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 10) : 0;
			ruestzeit += orders.getOrDefault(11, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 11) : 0;
			ruestzeit += orders.getOrDefault(12, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 12) : 0;
			ruestzeit += orders.getOrDefault(13, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 13) : 0;
			ruestzeit += orders.getOrDefault(14, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 14) : 0;
			ruestzeit += orders.getOrDefault(15, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 15) : 0;
		}else if(workplaceNumber == 14){
			ruestzeit += orders.getOrDefault(16, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 16) : 0;
		}else{
			ruestzeit += orders.getOrDefault(17, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 17) : 0;
			ruestzeit += orders.getOrDefault(26, 0) > 0 ? Workplace.getToolingTime(workplaceNumber, 26) : 0;
		}
		
		return ruestzeit;
	}
	
	private int calculateBedarf(int workplaceNumber) {
		int bedarf = 0;
		
		if(workplaceNumber == 1){
			bedarf += orders.getOrDefault(49, 0) * Workplace.getProcessingTime(workplaceNumber, 49);
			bedarf += orders.getOrDefault(54, 0) * Workplace.getProcessingTime(workplaceNumber, 54);
			bedarf += orders.getOrDefault(29, 0) * Workplace.getProcessingTime(workplaceNumber, 29);
		}else if(workplaceNumber == 2){
			bedarf += orders.getOrDefault(50, 0) * Workplace.getProcessingTime(workplaceNumber, 50);
			bedarf += orders.getOrDefault(55, 0) * Workplace.getProcessingTime(workplaceNumber, 55);
			bedarf += orders.getOrDefault(30, 0) * Workplace.getProcessingTime(workplaceNumber, 30);
		}else if(workplaceNumber == 3){
			bedarf += orders.getOrDefault(51, 0) * Workplace.getProcessingTime(workplaceNumber, 51);
			bedarf += orders.getOrDefault(56, 0) * Workplace.getProcessingTime(workplaceNumber, 56);
			bedarf += orders.getOrDefault(31, 0) * Workplace.getProcessingTime(workplaceNumber, 31);
		}else if(workplaceNumber == 4){
			bedarf += orders.getOrDefault(1, 0) * Workplace.getProcessingTime(workplaceNumber, 1);
			bedarf += orders.getOrDefault(2, 0) * Workplace.getProcessingTime(workplaceNumber, 2);
			bedarf += orders.getOrDefault(3, 0) * Workplace.getProcessingTime(workplaceNumber, 3);
		}else if(workplaceNumber == 6){
			bedarf += orders.getOrDefault(16, 0) * Workplace.getProcessingTime(workplaceNumber, 16);
			bedarf += orders.getOrDefault(18, 0) * Workplace.getProcessingTime(workplaceNumber, 18);
			bedarf += orders.getOrDefault(19, 0) * Workplace.getProcessingTime(workplaceNumber, 19);
			bedarf += orders.getOrDefault(20, 0) * Workplace.getProcessingTime(workplaceNumber, 20);
		}else if(workplaceNumber == 7){
			bedarf += orders.getOrDefault(10, 0) * Workplace.getProcessingTime(workplaceNumber, 10);
			bedarf += orders.getOrDefault(11, 0) * Workplace.getProcessingTime(workplaceNumber, 11);
			bedarf += orders.getOrDefault(12, 0) * Workplace.getProcessingTime(workplaceNumber, 12);
			bedarf += orders.getOrDefault(13, 0) * Workplace.getProcessingTime(workplaceNumber, 13);
			bedarf += orders.getOrDefault(14, 0) * Workplace.getProcessingTime(workplaceNumber, 14);
			bedarf += orders.getOrDefault(15, 0) * Workplace.getProcessingTime(workplaceNumber, 15);
			bedarf += orders.getOrDefault(18, 0) * Workplace.getProcessingTime(workplaceNumber, 18);
			bedarf += orders.getOrDefault(19, 0) * Workplace.getProcessingTime(workplaceNumber, 19);
			bedarf += orders.getOrDefault(20, 0) * Workplace.getProcessingTime(workplaceNumber, 20);
			bedarf += orders.getOrDefault(26, 0) * Workplace.getProcessingTime(workplaceNumber, 26);
		}else if(workplaceNumber == 8){
			bedarf += orders.getOrDefault(10, 0) * Workplace.getProcessingTime(workplaceNumber, 10);
			bedarf += orders.getOrDefault(11, 0) * Workplace.getProcessingTime(workplaceNumber, 11);
			bedarf += orders.getOrDefault(12, 0) * Workplace.getProcessingTime(workplaceNumber, 12);
			bedarf += orders.getOrDefault(13, 0) * Workplace.getProcessingTime(workplaceNumber, 13);
			bedarf += orders.getOrDefault(14, 0) * Workplace.getProcessingTime(workplaceNumber, 14);
			bedarf += orders.getOrDefault(15, 0) * Workplace.getProcessingTime(workplaceNumber, 15);
			bedarf += orders.getOrDefault(18, 0) * Workplace.getProcessingTime(workplaceNumber, 18);
			bedarf += orders.getOrDefault(19, 0) * Workplace.getProcessingTime(workplaceNumber, 19);
			bedarf += orders.getOrDefault(20, 0) * Workplace.getProcessingTime(workplaceNumber, 20);
		}else if(workplaceNumber == 9){
			bedarf += orders.getOrDefault(10, 0) * Workplace.getProcessingTime(workplaceNumber, 10);
			bedarf += orders.getOrDefault(11, 0) * Workplace.getProcessingTime(workplaceNumber, 11);
			bedarf += orders.getOrDefault(12, 0) * Workplace.getProcessingTime(workplaceNumber, 12);
			bedarf += orders.getOrDefault(13, 0) * Workplace.getProcessingTime(workplaceNumber, 13);
			bedarf += orders.getOrDefault(14, 0) * Workplace.getProcessingTime(workplaceNumber, 14);
			bedarf += orders.getOrDefault(15, 0) * Workplace.getProcessingTime(workplaceNumber, 15);
			bedarf += orders.getOrDefault(18, 0) * Workplace.getProcessingTime(workplaceNumber, 18);
			bedarf += orders.getOrDefault(19, 0) * Workplace.getProcessingTime(workplaceNumber, 19);
			bedarf += orders.getOrDefault(20, 0) * Workplace.getProcessingTime(workplaceNumber, 20);
		}else if(workplaceNumber == 10){
			bedarf += orders.getOrDefault(4, 0) * Workplace.getProcessingTime(workplaceNumber, 4);
			bedarf += orders.getOrDefault(5, 0) * Workplace.getProcessingTime(workplaceNumber, 5);
			bedarf += orders.getOrDefault(6, 0) * Workplace.getProcessingTime(workplaceNumber, 6);
			bedarf += orders.getOrDefault(7, 0) * Workplace.getProcessingTime(workplaceNumber, 7);
			bedarf += orders.getOrDefault(8, 0) * Workplace.getProcessingTime(workplaceNumber, 8);
			bedarf += orders.getOrDefault(9, 0) * Workplace.getProcessingTime(workplaceNumber, 9);
		}else if(workplaceNumber == 11){
			bedarf += orders.getOrDefault(4, 0) * Workplace.getProcessingTime(workplaceNumber, 4);
			bedarf += orders.getOrDefault(5, 0) * Workplace.getProcessingTime(workplaceNumber, 5);
			bedarf += orders.getOrDefault(6, 0) * Workplace.getProcessingTime(workplaceNumber, 6);
			bedarf += orders.getOrDefault(7, 0) * Workplace.getProcessingTime(workplaceNumber, 7);
			bedarf += orders.getOrDefault(8, 0) * Workplace.getProcessingTime(workplaceNumber, 8);
			bedarf += orders.getOrDefault(9, 0) * Workplace.getProcessingTime(workplaceNumber, 9);
		}else if(workplaceNumber == 12){
			bedarf += orders.getOrDefault(10, 0) * Workplace.getProcessingTime(workplaceNumber, 10);
			bedarf += orders.getOrDefault(11, 0) * Workplace.getProcessingTime(workplaceNumber, 11);
			bedarf += orders.getOrDefault(12, 0) * Workplace.getProcessingTime(workplaceNumber, 12);
			bedarf += orders.getOrDefault(13, 0) * Workplace.getProcessingTime(workplaceNumber, 13);
			bedarf += orders.getOrDefault(14, 0) * Workplace.getProcessingTime(workplaceNumber, 14);
			bedarf += orders.getOrDefault(15, 0) * Workplace.getProcessingTime(workplaceNumber, 15);
		}else if(workplaceNumber == 13){
			bedarf += orders.getOrDefault(10, 0) * Workplace.getProcessingTime(workplaceNumber, 10);
			bedarf += orders.getOrDefault(11, 0) * Workplace.getProcessingTime(workplaceNumber, 11);
			bedarf += orders.getOrDefault(12, 0) * Workplace.getProcessingTime(workplaceNumber, 12);
			bedarf += orders.getOrDefault(13, 0) * Workplace.getProcessingTime(workplaceNumber, 13);
			bedarf += orders.getOrDefault(14, 0) * Workplace.getProcessingTime(workplaceNumber, 14);
			bedarf += orders.getOrDefault(15, 0) * Workplace.getProcessingTime(workplaceNumber, 15);
		}else if(workplaceNumber == 14){
			bedarf += orders.getOrDefault(16, 0) * Workplace.getProcessingTime(workplaceNumber, 16);
		}else{
			bedarf += orders.getOrDefault(17, 0) * Workplace.getProcessingTime(workplaceNumber, 17);
			bedarf += orders.getOrDefault(26, 0) * Workplace.getProcessingTime(workplaceNumber, 26);
		}
		
		return bedarf;
	}
	
	private int calculateSchichten(int gesBedarf) {
		if(gesBedarf == 0){
			return 0;
		}
		else if(gesBedarf < 3600){
			return 1;
		}else if(gesBedarf < 6000){
			return 2;
		}else{
			return 3;
		}
	}
	
	private int calculateOvertime(int gesBedarf, int anzahlSchichten) {
		if(gesBedarf == 0){
			return 0;
		}
		else if(anzahlSchichten == 1){
			if(gesBedarf < 2400){
				return 0;
			}
			return gesBedarf - 2400 < 0 ? 0 : gesBedarf - 2400;
		}else if(anzahlSchichten == 2){
			return gesBedarf - 4800 < 0 ? 0 : gesBedarf - 4800;
		}else{
			return gesBedarf - 7200 < 0 ? 0 : gesBedarf - 7200;
		}
	}

	public ArrayList<Workingtime> getwTimes() {
		return wTimes;
	}
}
