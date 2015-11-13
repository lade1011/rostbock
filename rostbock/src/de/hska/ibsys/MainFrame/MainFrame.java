package de.hska.ibsys.MainFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import de.hska.ibsys.PPS.PanelPPS;
import de.hska.ibsys.PPS.PanelStart;

import java.awt.CardLayout;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6884543290355465972L;
	private JPanel contentPane;
	private PanelStart pStart;
	
	private PanelPPS pPPS;
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		pStart = new PanelStart(this);
		pStart.setVisible(true);
		contentPane.add(pStart);
		
		pPPS = new PanelPPS();
		pPPS.setVisible(false);
		contentPane.add(pPPS);
	}

	public PanelPPS getpPPS() {
		return pPPS;
	}

	public void setpPPS(PanelPPS pPPS) {
		this.pPPS = pPPS;
	}
}
