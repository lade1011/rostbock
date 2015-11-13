package de.hska.ibsys.MainFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JToggleButton;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panelStart = new JPanel();
		contentPane.add(panelStart, "name_131830600070342");
		SpringLayout sl_panelStart = new SpringLayout();
		panelStart.setLayout(sl_panelStart);
		panelStart.setVisible(true);
		
		JPanel panelEntryForms = new JPanel();
		contentPane.add(panelEntryForms, "name_131833222462793");
		SpringLayout sl_panelEntryForms = new SpringLayout();
		panelEntryForms.setLayout(sl_panelEntryForms);
		panelEntryForms.setVisible(false);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelStart.setVisible(false);
				panelEntryForms.setVisible(true);
			}
		});
		
		sl_panelStart.putConstraint(SpringLayout.NORTH, btnStart, -132, SpringLayout.SOUTH, panelStart);
		sl_panelStart.putConstraint(SpringLayout.WEST, btnStart, 239, SpringLayout.WEST, panelStart);
		sl_panelStart.putConstraint(SpringLayout.SOUTH, btnStart, -78, SpringLayout.SOUTH, panelStart);
		sl_panelStart.putConstraint(SpringLayout.EAST, btnStart, -237, SpringLayout.EAST, panelStart);
		panelStart.add(btnStart);
		
		JLabel lblRostbockPps = new JLabel("Rostbock PPS");
		sl_panelStart.putConstraint(SpringLayout.NORTH, lblRostbockPps, 70, SpringLayout.NORTH, panelStart);
		sl_panelStart.putConstraint(SpringLayout.WEST, lblRostbockPps, 176, SpringLayout.WEST, panelStart);
		sl_panelStart.putConstraint(SpringLayout.SOUTH, lblRostbockPps, 118, SpringLayout.NORTH, panelStart);
		sl_panelStart.putConstraint(SpringLayout.EAST, lblRostbockPps, -147, SpringLayout.EAST, panelStart);
		lblRostbockPps.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panelStart.add(lblRostbockPps);
		
		JPanel panel = new JPanel();
		sl_panelEntryForms.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, panelEntryForms);
		sl_panelEntryForms.putConstraint(SpringLayout.WEST, panel, 22, SpringLayout.WEST, panelEntryForms);
		sl_panelEntryForms.putConstraint(SpringLayout.SOUTH, panel, 63, SpringLayout.NORTH, panelEntryForms);
		sl_panelEntryForms.putConstraint(SpringLayout.EAST, panel, -11, SpringLayout.EAST, panelEntryForms);
		panelEntryForms.add(panel);
		panel.setLayout(null);
		
		ButtonGroup progOverview = new ButtonGroup();
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Programmplanung");
		tglbtnNewToggleButton.setBounds(10, 11, 119, 23);
		panel.add(tglbtnNewToggleButton);
		progOverview.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnKapazi = new JToggleButton("Kapazit\u00E4tsplanung");
		tglbtnKapazi.setBounds(139, 11, 150, 23);
		panel.add(tglbtnKapazi);
		progOverview.add(tglbtnKapazi);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Kaufteildisposition");
		tglbtnNewToggleButton_1.setBounds(299, 11, 121, 23);
		panel.add(tglbtnNewToggleButton_1);
		progOverview.add(tglbtnNewToggleButton_1);
	}
}
