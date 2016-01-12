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
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JSeparator;
import java.awt.Color;

public class PanelStart extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7623033603784038130L;
	
	private JLabel lblNewLabel;
	private JButton btnStart;
	private JFileChooser fc;

	/**
	 * Create the panel.
	 */
	public PanelStart(MainFrame mainFrame) {
		setLayout(null);
		
		lblNewLabel = new JLabel();
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel.setText("<html>Bitte Datei w\u00E4hlen</html>");
		lblNewLabel.setBounds(10, 110, 378, 29);
		add(lblNewLabel);
		
		 btnStart = new JButton("PPS starten");
		btnStart.setBounds(261, 183, 110, 29);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				mainFrame.setSize(800,600);
				if(!lblNewLabel.getText().isEmpty()) {
					mainFrame.parseXML(fc.getSelectedFile().getAbsolutePath());
				}
				mainFrame.getpPPS().setVisible(true);
			}
		});
		btnStart.setEnabled(false);
		add(btnStart);
		
		JLabel lblRostbockPps = new JLabel("Produktionsplanung");
		lblRostbockPps.setBounds(10, 10, 166, 23);
		lblRostbockPps.setFont(new Font("Tahoma", Font.PLAIN, 19));
		add(lblRostbockPps);
		
		JButton btnNewButton = new JButton("Datei ausw\u00E4hlen");
		btnNewButton.setBounds(6, 144, 147, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openFileBrowser();
			}
		});
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("<html>\n<br/>\nDamit Sie mit der Produktionsplanung fortfahren k\u00F6nnen, m\u00FCssen Sie zuerst eine g\u00FCltige XML-Datei importieren.\n</html>");
		lblNewLabel_1.setBounds(10, 57, 374, 56);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html>&copy; Rostbock - WS15/16</html>");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(10, 227, 268, 16);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 220, 378, 6);
		add(separator);
	}
	
	private void openFileBrowser() {
		fc = new JFileChooser();
		fc.setFileFilter(new FileNameExtensionFilter("XML-Datei", "xml"));
		int returnValue = fc.showOpenDialog(this);
		if(returnValue == JFileChooser.FILES_ONLY) {
            this.lblNewLabel.setText("<html>Ausgewählte Datei:<br> " + fc.getSelectedFile().getAbsolutePath()+"</html>");
            this.lblNewLabel.setForeground(Color.BLUE);
            this.btnStart.setEnabled(true);
        }
	}
}
