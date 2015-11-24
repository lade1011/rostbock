package de.hska.ibsys.PPS;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import de.hska.ibsys.MainFrame.MainFrame;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelStart extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7623033603784038130L;
	
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public PanelStart(MainFrame mainFrame) {
		
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		lblNewLabel = new JLabel();
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 141, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 79, SpringLayout.WEST, this);
		add(lblNewLabel);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(!lblNewLabel.getText().isEmpty()) {
					mainFrame.parseXML(lblNewLabel.getText());
				}
				mainFrame.getpPPS().setVisible(true);
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnStart, 165, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnStart, -46, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnStart, 277, SpringLayout.WEST, this);
		add(btnStart);
		
		JLabel lblRostbockPps = new JLabel("Rostbock PPS");
		lblRostbockPps.setFont(new Font("Tahoma", Font.PLAIN, 19));
		springLayout.putConstraint(SpringLayout.NORTH, lblRostbockPps, 50, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblRostbockPps, 162, SpringLayout.WEST, this);
		add(lblRostbockPps);
		
		JButton btnNewButton = new JButton("XML");
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -95, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -10, SpringLayout.EAST, this);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openFileBrowser();
			}
		});
		add(btnNewButton);
	}
	
	private void openFileBrowser() {
		JFileChooser fc = new JFileChooser();
		
		int returnValue = fc.showOpenDialog(null);
		if(returnValue == JFileChooser.FILES_ONLY) {
            this.lblNewLabel.setText(fc.getSelectedFile().getAbsolutePath());
        }
	}
}
