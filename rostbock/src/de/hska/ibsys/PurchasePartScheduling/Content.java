package de.hska.ibsys.PurchasePartScheduling;

import javax.swing.JPanel;
import java.awt.CardLayout;

public class Content extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private POrders po;
	private PConsumption pc;
	
	public Content() {
		po = new POrders();
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

}
