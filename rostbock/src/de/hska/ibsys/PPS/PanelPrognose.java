package de.hska.ibsys.PPS;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import de.hska.ibsys.Bike.Bike;
import de.hska.ibsys.XML.XMLParser;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class PanelPrognose extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8073292895763390292L;
	
	private JSpinner spChildP2;
	private JSpinner spWomanP2;
	private JSpinner spManP2;
	private JSpinner spChildQuantityReserve;
	private JSpinner spWomanQuantityReserve;
	private JSpinner spManQuantityReserve;
	private XMLParser xp;

	/**
	 * Create the panel.
	 */
	public PanelPrognose(XMLParser xp) {
		this.xp = xp;
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Prognose");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblPeriode = new JLabel("Periode 2");
		GridBagConstraints gbc_lblPeriode = new GridBagConstraints();
		gbc_lblPeriode.insets = new Insets(0, 0, 5, 5);
		gbc_lblPeriode.gridx = 4;
		gbc_lblPeriode.gridy = 1;
		panel.add(lblPeriode, gbc_lblPeriode);
		
		JLabel lblMengenreserve = new JLabel("Mengenreserve");
		GridBagConstraints gbc_lblMengenreserve = new GridBagConstraints();
		gbc_lblMengenreserve.insets = new Insets(0, 0, 5, 5);
		gbc_lblMengenreserve.gridx = 6;
		gbc_lblMengenreserve.gridy = 1;
		panel.add(lblMengenreserve, gbc_lblMengenreserve);
		
		JLabel lblPeriode_1 = new JLabel("Periode 3");
		GridBagConstraints gbc_lblPeriode_1 = new GridBagConstraints();
		gbc_lblPeriode_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPeriode_1.gridx = 8;
		gbc_lblPeriode_1.gridy = 1;
		panel.add(lblPeriode_1, gbc_lblPeriode_1);
		
		JLabel lblPeriode_2 = new JLabel("Periode 4");
		GridBagConstraints gbc_lblPeriode_2 = new GridBagConstraints();
		gbc_lblPeriode_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblPeriode_2.gridx = 10;
		gbc_lblPeriode_2.gridy = 1;
		panel.add(lblPeriode_2, gbc_lblPeriode_2);
		
		JLabel lblPeriode_3 = new JLabel("Periode 5");
		GridBagConstraints gbc_lblPeriode_3 = new GridBagConstraints();
		gbc_lblPeriode_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblPeriode_3.gridx = 12;
		gbc_lblPeriode_3.gridy = 1;
		panel.add(lblPeriode_3, gbc_lblPeriode_3);
		
		JLabel lblKinderfahrrad = new JLabel("Kinderfahrrad");
		GridBagConstraints gbc_lblKinderfahrrad = new GridBagConstraints();
		gbc_lblKinderfahrrad.insets = new Insets(0, 0, 5, 5);
		gbc_lblKinderfahrrad.gridx = 1;
		gbc_lblKinderfahrrad.gridy = 3;
		panel.add(lblKinderfahrrad, gbc_lblKinderfahrrad);
		
		spChildP2  = new JSpinner();
		spChildP2.setModel(new SpinnerNumberModel(new Integer(100), null, null, new Integer(1)));
		GridBagConstraints gbc_spChildP2 = new GridBagConstraints();
		gbc_spChildP2.insets = new Insets(0, 0, 5, 5);
		gbc_spChildP2.gridx = 4;
		gbc_spChildP2.gridy = 3;
		panel.add(spChildP2, gbc_spChildP2);
		
		spChildQuantityReserve = new JSpinner();
		spChildQuantityReserve.setModel(new SpinnerNumberModel(new Integer(50), null, null, new Integer(1)));
		GridBagConstraints gbc_spChildQuantityReserve = new GridBagConstraints();
		gbc_spChildQuantityReserve.insets = new Insets(0, 0, 5, 5);
		gbc_spChildQuantityReserve.gridx = 6;
		gbc_spChildQuantityReserve.gridy = 3;
		panel.add(spChildQuantityReserve, gbc_spChildQuantityReserve);
		
		JSpinner spChildP3 = new JSpinner();
		spChildP3.setModel(new SpinnerNumberModel(new Integer(100), null, null, new Integer(1)));
		GridBagConstraints gbc_spChildP3 = new GridBagConstraints();
		gbc_spChildP3.insets = new Insets(0, 0, 5, 5);
		gbc_spChildP3.gridx = 8;
		gbc_spChildP3.gridy = 3;
		panel.add(spChildP3, gbc_spChildP3);
		
		JSpinner spChildP4 = new JSpinner();
		spChildP4.setModel(new SpinnerNumberModel(new Integer(100), null, null, new Integer(1)));
		GridBagConstraints gbc_spChildP4 = new GridBagConstraints();
		gbc_spChildP4.insets = new Insets(0, 0, 5, 5);
		gbc_spChildP4.gridx = 10;
		gbc_spChildP4.gridy = 3;
		panel.add(spChildP4, gbc_spChildP4);
		
		JSpinner spChildP5 = new JSpinner();
		GridBagConstraints gbc_spChildP5 = new GridBagConstraints();
		gbc_spChildP5.insets = new Insets(0, 0, 5, 0);
		gbc_spChildP5.gridx = 12;
		gbc_spChildP5.gridy = 3;
		panel.add(spChildP5, gbc_spChildP5);
		
		JLabel lblDamenfahrrad = new JLabel("Damenfahrrad");
		GridBagConstraints gbc_lblDamenfahrrad = new GridBagConstraints();
		gbc_lblDamenfahrrad.insets = new Insets(0, 0, 5, 5);
		gbc_lblDamenfahrrad.gridx = 1;
		gbc_lblDamenfahrrad.gridy = 5;
		panel.add(lblDamenfahrrad, gbc_lblDamenfahrrad);
		
		spWomanP2 = new JSpinner();
		spWomanP2.setModel(new SpinnerNumberModel(new Integer(100), null, null, new Integer(1)));
		GridBagConstraints gbc_spWomanP2 = new GridBagConstraints();
		gbc_spWomanP2.insets = new Insets(0, 0, 5, 5);
		gbc_spWomanP2.gridx = 4;
		gbc_spWomanP2.gridy = 5;
		panel.add(spWomanP2, gbc_spWomanP2);
		
		spWomanQuantityReserve = new JSpinner();
		spWomanQuantityReserve.setModel(new SpinnerNumberModel(new Integer(50), null, null, new Integer(1)));
		GridBagConstraints gbc_spWomanQuantityReserve = new GridBagConstraints();
		gbc_spWomanQuantityReserve.insets = new Insets(0, 0, 5, 5);
		gbc_spWomanQuantityReserve.gridx = 6;
		gbc_spWomanQuantityReserve.gridy = 5;
		panel.add(spWomanQuantityReserve, gbc_spWomanQuantityReserve);
		
		JSpinner spWomanP3 = new JSpinner();
		spWomanP3.setModel(new SpinnerNumberModel(new Integer(100), null, null, new Integer(1)));
		GridBagConstraints gbc_spWomanP3 = new GridBagConstraints();
		gbc_spWomanP3.insets = new Insets(0, 0, 5, 5);
		gbc_spWomanP3.gridx = 8;
		gbc_spWomanP3.gridy = 5;
		panel.add(spWomanP3, gbc_spWomanP3);
		
		JSpinner spWomanP4 = new JSpinner();
		spWomanP4.setModel(new SpinnerNumberModel(new Integer(100), null, null, new Integer(1)));
		GridBagConstraints gbc_spWomanP4 = new GridBagConstraints();
		gbc_spWomanP4.insets = new Insets(0, 0, 5, 5);
		gbc_spWomanP4.gridx = 10;
		gbc_spWomanP4.gridy = 5;
		panel.add(spWomanP4, gbc_spWomanP4);
		
		JSpinner spWomanP5 = new JSpinner();
		GridBagConstraints gbc_spWomanP5 = new GridBagConstraints();
		gbc_spWomanP5.insets = new Insets(0, 0, 5, 0);
		gbc_spWomanP5.gridx = 12;
		gbc_spWomanP5.gridy = 5;
		panel.add(spWomanP5, gbc_spWomanP5);
		
		JLabel lblHerrenfahrrad = new JLabel("Herrenfahrrad");
		GridBagConstraints gbc_lblHerrenfahrrad = new GridBagConstraints();
		gbc_lblHerrenfahrrad.insets = new Insets(0, 0, 0, 5);
		gbc_lblHerrenfahrrad.gridx = 1;
		gbc_lblHerrenfahrrad.gridy = 7;
		panel.add(lblHerrenfahrrad, gbc_lblHerrenfahrrad);
		
		spManP2 = new JSpinner();
		spManP2.setModel(new SpinnerNumberModel(new Integer(100), null, null, new Integer(1)));
		GridBagConstraints gbc_spManP2 = new GridBagConstraints();
		gbc_spManP2.insets = new Insets(0, 0, 0, 5);
		gbc_spManP2.gridx = 4;
		gbc_spManP2.gridy = 7;
		panel.add(spManP2, gbc_spManP2);
		
		spManQuantityReserve = new JSpinner();
		spManQuantityReserve.setModel(new SpinnerNumberModel(new Integer(50), null, null, new Integer(1)));
		GridBagConstraints gbc_spManQuantityReserve = new GridBagConstraints();
		gbc_spManQuantityReserve.insets = new Insets(0, 0, 0, 5);
		gbc_spManQuantityReserve.gridx = 6;
		gbc_spManQuantityReserve.gridy = 7;
		panel.add(spManQuantityReserve, gbc_spManQuantityReserve);
		
		JSpinner spManP3 = new JSpinner();
		spManP3.setModel(new SpinnerNumberModel(new Integer(100), null, null, new Integer(1)));
		GridBagConstraints gbc_spManP3 = new GridBagConstraints();
		gbc_spManP3.insets = new Insets(0, 0, 0, 5);
		gbc_spManP3.gridx = 8;
		gbc_spManP3.gridy = 7;
		panel.add(spManP3, gbc_spManP3);
		
		JSpinner spManP4 = new JSpinner();
		spManP4.setModel(new SpinnerNumberModel(new Integer(100), null, null, new Integer(1)));
		GridBagConstraints gbc_spManP4 = new GridBagConstraints();
		gbc_spManP4.insets = new Insets(0, 0, 0, 5);
		gbc_spManP4.gridx = 10;
		gbc_spManP4.gridy = 7;
		panel.add(spManP4, gbc_spManP4);
		
		JSpinner spManP5 = new JSpinner();
		GridBagConstraints gbc_spManP5 = new GridBagConstraints();
		gbc_spManP5.gridx = 12;
		gbc_spManP5.gridy = 7;
		panel.add(spManP5, gbc_spManP5);
	}
	
	public ArrayList<Bike> getBikeValues() {
		ArrayList<Bike> bikes = new ArrayList<Bike>();
		
		Bike child = new Bike((Integer) this.spChildP2.getValue(),(Integer) this.spChildQuantityReserve.getValue());
		Bike woman = new Bike((Integer) this.spWomanP2.getValue(), (Integer) this.spWomanQuantityReserve.getValue());
		Bike man = new Bike((Integer) this.spManP2.getValue(), (Integer) this.spManQuantityReserve.getValue());
		
		bikes.add(child);
		bikes.add(woman);
		bikes.add(man);
		
		return bikes;
	}

}
