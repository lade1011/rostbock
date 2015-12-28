package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;

import de.hska.ibsys.Components.Articel;
import de.hska.ibsys.MainFrame.MainFrame;

import java.awt.CardLayout;
import java.util.ArrayList;

public class Content extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private POrders po;
	private PConsumption pc;
	private ArrayList<Integer> prognose1;
	
	public Content(MainFrame mf) {
		this.prognose1 = new ArrayList<Integer>();
		po = new POrders(mf);
		po.setVisible(false);
		setLayout(new CardLayout(0, 0));
		add(po, "name_15517043973275");
		pc = new PConsumption();
		add(pc, "name_15517075683305");
	}
	
	public void changeVisibility() {
		/*if(this.po.isVisible()){
			this.po.setVisible(false);
			this.pc.setVisible(true);
		}
		else{
			this.po.setVisible(true);
			this.po.setVisible(false);
		}*/
		
		this.po.setVisible(false);
		this.pc.setVisible(false);
	}

	public POrders getPo() {
		return po;
	}

	public void setPo(POrders po) {
		this.po = po;
	}

	public PConsumption getPc() {
		return pc;
	}

	public void setPc(PConsumption pc) {
		this.pc = pc;
	}

	public ArrayList<Integer> getPrognose1() {
		return prognose1;
	}

	public void setPrognose1(ArrayList<Integer> prognose1) {
		this.prognose1 = prognose1;
		this.po.setPrognose1(prognose1);
	}

}
