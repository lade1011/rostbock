package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;

import de.hska.ibsys.MainFrame.MainFrame;

import java.awt.CardLayout;
import java.util.ArrayList;

public class Content extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2688336293021394573L;
	/**
	 * Create the panel.
	 */
	
	private POrders po;
	private PConsumption pc;
	
	public Content(MainFrame mf, ArrayList<Integer> prognose1) {
		po = new POrders(mf, prognose1);
		po.setVisible(false);
		setLayout(new CardLayout(0, 0));
		add(po, "name_15517043973275");
		pc = new PConsumption();
		add(pc, "name_15517075683305");
	}
	
	public void changeVisibility() {
		
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

}
