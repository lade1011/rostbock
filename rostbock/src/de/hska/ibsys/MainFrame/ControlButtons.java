package de.hska.ibsys.MainFrame;

import javax.swing.JPanel;
import javax.swing.JButton;
public class ControlButtons extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1561250360165975036L;
	
	private JButton btnBack;
	private JButton btnNext;
	/**
	 * Create the panel.
	 */
	public ControlButtons() {
		setSize(800,50);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(26, 5, 67, 23);
		add(btnBack);
		
		btnNext = new JButton("Next");
		btnNext.setBounds(723, 5, 55, 23);
		add(btnNext);
	}
	public JButton getBtnBack() {
		return btnBack;
	}
	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}
	public JButton getBtnNext() {
		return btnNext;
	}
	public void setBtnNext(JButton btnNext) {
		this.btnNext = btnNext;
	}
}
