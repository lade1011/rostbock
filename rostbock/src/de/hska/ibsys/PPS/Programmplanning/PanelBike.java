package de.hska.ibsys.PPS.Programmplanning;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class PanelBike extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4743633803502188641L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;

	/**
	 * Create the panel.
	 */
	public PanelBike(String p, String e1, String e2, String e3, String e4, 
			String e5, String e6, String e7, String e8, String e9, 
			String e10, String e11) {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblVertriebswunsch = new JLabel("Vertriebswunsch");
		GridBagConstraints gbc_lblVertriebswunsch = new GridBagConstraints();
		gbc_lblVertriebswunsch.insets = new Insets(0, 0, 5, 5);
		gbc_lblVertriebswunsch.gridx = 3;
		gbc_lblVertriebswunsch.gridy = 1;
		add(lblVertriebswunsch, gbc_lblVertriebswunsch);
		
		JLabel lblReserve = new JLabel("Reserve");
		GridBagConstraints gbc_lblReserve = new GridBagConstraints();
		gbc_lblReserve.insets = new Insets(0, 0, 5, 5);
		gbc_lblReserve.gridx = 7;
		gbc_lblReserve.gridy = 1;
		add(lblReserve, gbc_lblReserve);
		
		JLabel lblLagerbestand = new JLabel("Lagerbestand");
		GridBagConstraints gbc_lblLagerbestand = new GridBagConstraints();
		gbc_lblLagerbestand.insets = new Insets(0, 0, 5, 5);
		gbc_lblLagerbestand.gridx = 9;
		gbc_lblLagerbestand.gridy = 1;
		add(lblLagerbestand, gbc_lblLagerbestand);
		
		JLabel lblInWarteschlange = new JLabel("in Warteschlange");
		GridBagConstraints gbc_lblInWarteschlange = new GridBagConstraints();
		gbc_lblInWarteschlange.insets = new Insets(0, 0, 5, 5);
		gbc_lblInWarteschlange.gridx = 11;
		gbc_lblInWarteschlange.gridy = 1;
		add(lblInWarteschlange, gbc_lblInWarteschlange);
		
		JLabel lblInBearbeitung = new JLabel("in Bearbeitung");
		GridBagConstraints gbc_lblInBearbeitung = new GridBagConstraints();
		gbc_lblInBearbeitung.insets = new Insets(0, 0, 5, 5);
		gbc_lblInBearbeitung.gridx = 13;
		gbc_lblInBearbeitung.gridy = 1;
		add(lblInBearbeitung, gbc_lblInBearbeitung);
		
		JLabel lblProduktionsauftrge = new JLabel("Produktionsauftr\u00E4ge");
		GridBagConstraints gbc_lblProduktionsauftrge = new GridBagConstraints();
		gbc_lblProduktionsauftrge.insets = new Insets(0, 0, 5, 0);
		gbc_lblProduktionsauftrge.gridx = 15;
		gbc_lblProduktionsauftrge.gridy = 1;
		add(lblProduktionsauftrge, gbc_lblProduktionsauftrge);
		
		JLabel lblP = new JLabel(p);
		GridBagConstraints gbc_lblP = new GridBagConstraints();
		gbc_lblP.insets = new Insets(0, 0, 5, 5);
		gbc_lblP.gridx = 1;
		gbc_lblP.gridy = 2;
		add(lblP, gbc_lblP);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 2;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("    +    ");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 5;
		gbc_label.gridy = 2;
		add(label, gbc_label);
		
		textField_23 = new JTextField();
		GridBagConstraints gbc_textField_23 = new GridBagConstraints();
		gbc_textField_23.insets = new Insets(0, 0, 5, 5);
		gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_23.gridx = 7;
		gbc_textField_23.gridy = 2;
		add(textField_23, gbc_textField_23);
		textField_23.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 8;
		gbc_lblNewLabel_17.gridy = 2;
		add(lblNewLabel_17, gbc_lblNewLabel_17);
		
		textField_35 = new JTextField();
		GridBagConstraints gbc_textField_35 = new GridBagConstraints();
		gbc_textField_35.insets = new Insets(0, 0, 5, 5);
		gbc_textField_35.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_35.gridx = 9;
		gbc_textField_35.gridy = 2;
		add(textField_35, gbc_textField_35);
		textField_35.setColumns(10);
		
		JLabel lblNewLabel_29 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_29 = new GridBagConstraints();
		gbc_lblNewLabel_29.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_29.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_29.gridx = 10;
		gbc_lblNewLabel_29.gridy = 2;
		add(lblNewLabel_29, gbc_lblNewLabel_29);
		
		textField_47 = new JTextField();
		GridBagConstraints gbc_textField_47 = new GridBagConstraints();
		gbc_textField_47.insets = new Insets(0, 0, 5, 5);
		gbc_textField_47.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_47.gridx = 11;
		gbc_textField_47.gridy = 2;
		add(textField_47, gbc_textField_47);
		textField_47.setColumns(10);
		
		JLabel lblNewLabel_41 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_41 = new GridBagConstraints();
		gbc_lblNewLabel_41.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_41.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_41.gridx = 12;
		gbc_lblNewLabel_41.gridy = 2;
		add(lblNewLabel_41, gbc_lblNewLabel_41);
		
		textField_59 = new JTextField();
		GridBagConstraints gbc_textField_59 = new GridBagConstraints();
		gbc_textField_59.insets = new Insets(0, 0, 5, 5);
		gbc_textField_59.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_59.gridx = 13;
		gbc_textField_59.gridy = 2;
		add(textField_59, gbc_textField_59);
		textField_59.setColumns(10);
		
		JLabel lblNewLabel_53 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_53 = new GridBagConstraints();
		gbc_lblNewLabel_53.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_53.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_53.gridx = 14;
		gbc_lblNewLabel_53.gridy = 2;
		add(lblNewLabel_53, gbc_lblNewLabel_53);
		
		textField_71 = new JTextField();
		GridBagConstraints gbc_textField_71 = new GridBagConstraints();
		gbc_textField_71.insets = new Insets(0, 0, 5, 0);
		gbc_textField_71.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_71.gridx = 15;
		gbc_textField_71.gridy = 2;
		add(textField_71, gbc_textField_71);
		textField_71.setColumns(10);
		
		JLabel lblE = new JLabel(e1);
		GridBagConstraints gbc_lblE = new GridBagConstraints();
		gbc_lblE.insets = new Insets(0, 0, 5, 5);
		gbc_lblE.gridx = 1;
		gbc_lblE.gridy = 4;
		add(lblE, gbc_lblE);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 4;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		
		textField_12 = new JTextField();
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 5;
		gbc_textField_12.gridy = 4;
		add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 6;
		gbc_lblNewLabel_10.gridy = 4;
		add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		textField_24 = new JTextField();
		GridBagConstraints gbc_textField_24 = new GridBagConstraints();
		gbc_textField_24.insets = new Insets(0, 0, 5, 5);
		gbc_textField_24.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_24.gridx = 7;
		gbc_textField_24.gridy = 4;
		add(textField_24, gbc_textField_24);
		textField_24.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 8;
		gbc_lblNewLabel_18.gridy = 4;
		add(lblNewLabel_18, gbc_lblNewLabel_18);
		
		textField_36 = new JTextField();
		textField_36.setText("");
		GridBagConstraints gbc_textField_36 = new GridBagConstraints();
		gbc_textField_36.insets = new Insets(0, 0, 5, 5);
		gbc_textField_36.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_36.gridx = 9;
		gbc_textField_36.gridy = 4;
		add(textField_36, gbc_textField_36);
		textField_36.setColumns(10);
		
		JLabel lblNewLabel_30 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_30 = new GridBagConstraints();
		gbc_lblNewLabel_30.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_30.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_30.gridx = 10;
		gbc_lblNewLabel_30.gridy = 4;
		add(lblNewLabel_30, gbc_lblNewLabel_30);
		
		textField_48 = new JTextField();
		textField_48.setText("");
		GridBagConstraints gbc_textField_48 = new GridBagConstraints();
		gbc_textField_48.insets = new Insets(0, 0, 5, 5);
		gbc_textField_48.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_48.gridx = 11;
		gbc_textField_48.gridy = 4;
		add(textField_48, gbc_textField_48);
		textField_48.setColumns(10);
		
		JLabel lblNewLabel_42 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_42 = new GridBagConstraints();
		gbc_lblNewLabel_42.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_42.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_42.gridx = 12;
		gbc_lblNewLabel_42.gridy = 4;
		add(lblNewLabel_42, gbc_lblNewLabel_42);
		
		textField_60 = new JTextField();
		textField_60.setText("");
		GridBagConstraints gbc_textField_60 = new GridBagConstraints();
		gbc_textField_60.insets = new Insets(0, 0, 5, 5);
		gbc_textField_60.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_60.gridx = 13;
		gbc_textField_60.gridy = 4;
		add(textField_60, gbc_textField_60);
		textField_60.setColumns(10);
		
		JLabel lblNewLabel_54 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_54 = new GridBagConstraints();
		gbc_lblNewLabel_54.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_54.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_54.gridx = 14;
		gbc_lblNewLabel_54.gridy = 4;
		add(lblNewLabel_54, gbc_lblNewLabel_54);
		
		textField_72 = new JTextField();
		textField_72.setText("");
		GridBagConstraints gbc_textField_72 = new GridBagConstraints();
		gbc_textField_72.insets = new Insets(0, 0, 5, 0);
		gbc_textField_72.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_72.gridx = 15;
		gbc_textField_72.gridy = 4;
		add(textField_72, gbc_textField_72);
		textField_72.setColumns(10);
		
		JLabel lblE_1 = new JLabel(e2);
		GridBagConstraints gbc_lblE_1 = new GridBagConstraints();
		gbc_lblE_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_1.gridx = 1;
		gbc_lblE_1.gridy = 5;
		add(lblE_1, gbc_lblE_1);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 5;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 5;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_13 = new JTextField();
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 5;
		gbc_textField_13.gridy = 5;
		add(textField_13, gbc_textField_13);
		textField_13.setColumns(10);
		
		JLabel label_3 = new JLabel("+");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 6;
		gbc_label_3.gridy = 5;
		add(label_3, gbc_label_3);
		
		textField_25 = new JTextField();
		textField_25.setText("");
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.insets = new Insets(0, 0, 5, 5);
		gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_25.gridx = 7;
		gbc_textField_25.gridy = 5;
		add(textField_25, gbc_textField_25);
		textField_25.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 8;
		gbc_lblNewLabel_19.gridy = 5;
		add(lblNewLabel_19, gbc_lblNewLabel_19);
		
		textField_37 = new JTextField();
		textField_37.setText("");
		GridBagConstraints gbc_textField_37 = new GridBagConstraints();
		gbc_textField_37.insets = new Insets(0, 0, 5, 5);
		gbc_textField_37.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_37.gridx = 9;
		gbc_textField_37.gridy = 5;
		add(textField_37, gbc_textField_37);
		textField_37.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_31 = new GridBagConstraints();
		gbc_lblNewLabel_31.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_31.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_31.gridx = 10;
		gbc_lblNewLabel_31.gridy = 5;
		add(lblNewLabel_31, gbc_lblNewLabel_31);
		
		textField_49 = new JTextField();
		textField_49.setText("");
		GridBagConstraints gbc_textField_49 = new GridBagConstraints();
		gbc_textField_49.insets = new Insets(0, 0, 5, 5);
		gbc_textField_49.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_49.gridx = 11;
		gbc_textField_49.gridy = 5;
		add(textField_49, gbc_textField_49);
		textField_49.setColumns(10);
		
		JLabel lblNewLabel_43 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_43 = new GridBagConstraints();
		gbc_lblNewLabel_43.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_43.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_43.gridx = 12;
		gbc_lblNewLabel_43.gridy = 5;
		add(lblNewLabel_43, gbc_lblNewLabel_43);
		
		textField_61 = new JTextField();
		textField_61.setText("");
		GridBagConstraints gbc_textField_61 = new GridBagConstraints();
		gbc_textField_61.insets = new Insets(0, 0, 5, 5);
		gbc_textField_61.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_61.gridx = 13;
		gbc_textField_61.gridy = 5;
		add(textField_61, gbc_textField_61);
		textField_61.setColumns(10);
		
		JLabel lblNewLabel_55 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_55 = new GridBagConstraints();
		gbc_lblNewLabel_55.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_55.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_55.gridx = 14;
		gbc_lblNewLabel_55.gridy = 5;
		add(lblNewLabel_55, gbc_lblNewLabel_55);
		
		textField_73 = new JTextField();
		textField_73.setText("");
		GridBagConstraints gbc_textField_73 = new GridBagConstraints();
		gbc_textField_73.insets = new Insets(0, 0, 5, 0);
		gbc_textField_73.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_73.gridx = 15;
		gbc_textField_73.gridy = 5;
		add(textField_73, gbc_textField_73);
		textField_73.setColumns(10);
		
		JLabel lblE_2 = new JLabel(e3);
		GridBagConstraints gbc_lblE_2 = new GridBagConstraints();
		gbc_lblE_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_2.gridx = 1;
		gbc_lblE_2.gridy = 7;
		add(lblE_2, gbc_lblE_2);
		
		textField_3 = new JTextField();
		textField_3.setText("");
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 7;
		add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 7;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_14 = new JTextField();
		textField_14.setText("");
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 5;
		gbc_textField_14.gridy = 7;
		add(textField_14, gbc_textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 6;
		gbc_lblNewLabel_11.gridy = 7;
		add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		textField_26 = new JTextField();
		textField_26.setText("");
		GridBagConstraints gbc_textField_26 = new GridBagConstraints();
		gbc_textField_26.insets = new Insets(0, 0, 5, 5);
		gbc_textField_26.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_26.gridx = 7;
		gbc_textField_26.gridy = 7;
		add(textField_26, gbc_textField_26);
		textField_26.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
		gbc_lblNewLabel_20.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_20.gridx = 8;
		gbc_lblNewLabel_20.gridy = 7;
		add(lblNewLabel_20, gbc_lblNewLabel_20);
		
		textField_38 = new JTextField();
		textField_38.setText("");
		GridBagConstraints gbc_textField_38 = new GridBagConstraints();
		gbc_textField_38.insets = new Insets(0, 0, 5, 5);
		gbc_textField_38.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_38.gridx = 9;
		gbc_textField_38.gridy = 7;
		add(textField_38, gbc_textField_38);
		textField_38.setColumns(10);
		
		JLabel lblNewLabel_32 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_32 = new GridBagConstraints();
		gbc_lblNewLabel_32.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_32.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_32.gridx = 10;
		gbc_lblNewLabel_32.gridy = 7;
		add(lblNewLabel_32, gbc_lblNewLabel_32);
		
		textField_50 = new JTextField();
		textField_50.setText("");
		GridBagConstraints gbc_textField_50 = new GridBagConstraints();
		gbc_textField_50.insets = new Insets(0, 0, 5, 5);
		gbc_textField_50.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_50.gridx = 11;
		gbc_textField_50.gridy = 7;
		add(textField_50, gbc_textField_50);
		textField_50.setColumns(10);
		
		JLabel lblNewLabel_44 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_44 = new GridBagConstraints();
		gbc_lblNewLabel_44.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_44.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_44.gridx = 12;
		gbc_lblNewLabel_44.gridy = 7;
		add(lblNewLabel_44, gbc_lblNewLabel_44);
		
		textField_62 = new JTextField();
		textField_62.setText("");
		GridBagConstraints gbc_textField_62 = new GridBagConstraints();
		gbc_textField_62.insets = new Insets(0, 0, 5, 5);
		gbc_textField_62.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_62.gridx = 13;
		gbc_textField_62.gridy = 7;
		add(textField_62, gbc_textField_62);
		textField_62.setColumns(10);
		
		JLabel lblNewLabel_56 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_56 = new GridBagConstraints();
		gbc_lblNewLabel_56.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_56.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_56.gridx = 14;
		gbc_lblNewLabel_56.gridy = 7;
		add(lblNewLabel_56, gbc_lblNewLabel_56);
		
		textField_74 = new JTextField();
		textField_74.setText("");
		GridBagConstraints gbc_textField_74 = new GridBagConstraints();
		gbc_textField_74.insets = new Insets(0, 0, 5, 0);
		gbc_textField_74.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_74.gridx = 15;
		gbc_textField_74.gridy = 7;
		add(textField_74, gbc_textField_74);
		textField_74.setColumns(10);
		
		JLabel lblE_3 = new JLabel(e4);
		GridBagConstraints gbc_lblE_3 = new GridBagConstraints();
		gbc_lblE_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_3.gridx = 1;
		gbc_lblE_3.gridy = 8;
		add(lblE_3, gbc_lblE_3);
		
		textField_4 = new JTextField();
		textField_4.setText("");
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 8;
		add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 4;
		gbc_lblNewLabel_3.gridy = 8;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_15 = new JTextField();
		textField_15.setText("");
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.insets = new Insets(0, 0, 5, 5);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 5;
		gbc_textField_15.gridy = 8;
		add(textField_15, gbc_textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 6;
		gbc_lblNewLabel_12.gridy = 8;
		add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		textField_27 = new JTextField();
		textField_27.setText("");
		GridBagConstraints gbc_textField_27 = new GridBagConstraints();
		gbc_textField_27.insets = new Insets(0, 0, 5, 5);
		gbc_textField_27.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_27.gridx = 7;
		gbc_textField_27.gridy = 8;
		add(textField_27, gbc_textField_27);
		textField_27.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_21.gridx = 8;
		gbc_lblNewLabel_21.gridy = 8;
		add(lblNewLabel_21, gbc_lblNewLabel_21);
		
		textField_39 = new JTextField();
		GridBagConstraints gbc_textField_39 = new GridBagConstraints();
		gbc_textField_39.insets = new Insets(0, 0, 5, 5);
		gbc_textField_39.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_39.gridx = 9;
		gbc_textField_39.gridy = 8;
		add(textField_39, gbc_textField_39);
		textField_39.setColumns(10);
		
		JLabel lblNewLabel_33 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_33 = new GridBagConstraints();
		gbc_lblNewLabel_33.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_33.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_33.gridx = 10;
		gbc_lblNewLabel_33.gridy = 8;
		add(lblNewLabel_33, gbc_lblNewLabel_33);
		
		textField_51 = new JTextField();
		textField_51.setText("");
		GridBagConstraints gbc_textField_51 = new GridBagConstraints();
		gbc_textField_51.insets = new Insets(0, 0, 5, 5);
		gbc_textField_51.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_51.gridx = 11;
		gbc_textField_51.gridy = 8;
		add(textField_51, gbc_textField_51);
		textField_51.setColumns(10);
		
		JLabel lblNewLabel_45 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_45 = new GridBagConstraints();
		gbc_lblNewLabel_45.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_45.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_45.gridx = 12;
		gbc_lblNewLabel_45.gridy = 8;
		add(lblNewLabel_45, gbc_lblNewLabel_45);
		
		textField_63 = new JTextField();
		textField_63.setText("");
		GridBagConstraints gbc_textField_63 = new GridBagConstraints();
		gbc_textField_63.insets = new Insets(0, 0, 5, 5);
		gbc_textField_63.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_63.gridx = 13;
		gbc_textField_63.gridy = 8;
		add(textField_63, gbc_textField_63);
		textField_63.setColumns(10);
		
		JLabel lblNewLabel_57 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_57 = new GridBagConstraints();
		gbc_lblNewLabel_57.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_57.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_57.gridx = 14;
		gbc_lblNewLabel_57.gridy = 8;
		add(lblNewLabel_57, gbc_lblNewLabel_57);
		
		textField_75 = new JTextField();
		textField_75.setText("");
		GridBagConstraints gbc_textField_75 = new GridBagConstraints();
		gbc_textField_75.insets = new Insets(0, 0, 5, 0);
		gbc_textField_75.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_75.gridx = 15;
		gbc_textField_75.gridy = 8;
		add(textField_75, gbc_textField_75);
		textField_75.setColumns(10);
		
		JLabel lblE_4 = new JLabel(e5);
		GridBagConstraints gbc_lblE_4 = new GridBagConstraints();
		gbc_lblE_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_4.gridx = 1;
		gbc_lblE_4.gridy = 9;
		add(lblE_4, gbc_lblE_4);
		
		textField_5 = new JTextField();
		textField_5.setText("");
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 3;
		gbc_textField_5.gridy = 9;
		add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 4;
		gbc_lblNewLabel_4.gridy = 9;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_16 = new JTextField();
		textField_16.setText("");
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 5;
		gbc_textField_16.gridy = 9;
		add(textField_16, gbc_textField_16);
		textField_16.setColumns(10);
		
		JLabel label_2 = new JLabel("+");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 6;
		gbc_label_2.gridy = 9;
		add(label_2, gbc_label_2);
		
		textField_28 = new JTextField();
		textField_28.setText("");
		GridBagConstraints gbc_textField_28 = new GridBagConstraints();
		gbc_textField_28.insets = new Insets(0, 0, 5, 5);
		gbc_textField_28.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_28.gridx = 7;
		gbc_textField_28.gridy = 9;
		add(textField_28, gbc_textField_28);
		textField_28.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_22.gridx = 8;
		gbc_lblNewLabel_22.gridy = 9;
		add(lblNewLabel_22, gbc_lblNewLabel_22);
		
		textField_40 = new JTextField();
		textField_40.setText("");
		GridBagConstraints gbc_textField_40 = new GridBagConstraints();
		gbc_textField_40.insets = new Insets(0, 0, 5, 5);
		gbc_textField_40.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_40.gridx = 9;
		gbc_textField_40.gridy = 9;
		add(textField_40, gbc_textField_40);
		textField_40.setColumns(10);
		
		JLabel lblNewLabel_34 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_34 = new GridBagConstraints();
		gbc_lblNewLabel_34.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_34.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_34.gridx = 10;
		gbc_lblNewLabel_34.gridy = 9;
		add(lblNewLabel_34, gbc_lblNewLabel_34);
		
		textField_52 = new JTextField();
		textField_52.setText("");
		GridBagConstraints gbc_textField_52 = new GridBagConstraints();
		gbc_textField_52.insets = new Insets(0, 0, 5, 5);
		gbc_textField_52.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_52.gridx = 11;
		gbc_textField_52.gridy = 9;
		add(textField_52, gbc_textField_52);
		textField_52.setColumns(10);
		
		JLabel lblNewLabel_46 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_46 = new GridBagConstraints();
		gbc_lblNewLabel_46.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_46.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_46.gridx = 12;
		gbc_lblNewLabel_46.gridy = 9;
		add(lblNewLabel_46, gbc_lblNewLabel_46);
		
		textField_64 = new JTextField();
		textField_64.setText("");
		GridBagConstraints gbc_textField_64 = new GridBagConstraints();
		gbc_textField_64.insets = new Insets(0, 0, 5, 5);
		gbc_textField_64.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_64.gridx = 13;
		gbc_textField_64.gridy = 9;
		add(textField_64, gbc_textField_64);
		textField_64.setColumns(10);
		
		JLabel lblNewLabel_58 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_58 = new GridBagConstraints();
		gbc_lblNewLabel_58.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_58.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_58.gridx = 14;
		gbc_lblNewLabel_58.gridy = 9;
		add(lblNewLabel_58, gbc_lblNewLabel_58);
		
		textField_76 = new JTextField();
		textField_76.setText("");
		GridBagConstraints gbc_textField_76 = new GridBagConstraints();
		gbc_textField_76.insets = new Insets(0, 0, 5, 0);
		gbc_textField_76.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_76.gridx = 15;
		gbc_textField_76.gridy = 9;
		add(textField_76, gbc_textField_76);
		textField_76.setColumns(10);
		
		JLabel lblE_5 = new JLabel(e6);
		GridBagConstraints gbc_lblE_5 = new GridBagConstraints();
		gbc_lblE_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_5.gridx = 1;
		gbc_lblE_5.gridy = 11;
		add(lblE_5, gbc_lblE_5);
		
		textField_6 = new JTextField();
		textField_6.setText("");
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 3;
		gbc_textField_6.gridy = 11;
		add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 4;
		gbc_lblNewLabel_5.gridy = 11;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_17 = new JTextField();
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.insets = new Insets(0, 0, 5, 5);
		gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_17.gridx = 5;
		gbc_textField_17.gridy = 11;
		add(textField_17, gbc_textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 6;
		gbc_lblNewLabel_13.gridy = 11;
		add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		textField_29 = new JTextField();
		GridBagConstraints gbc_textField_29 = new GridBagConstraints();
		gbc_textField_29.insets = new Insets(0, 0, 5, 5);
		gbc_textField_29.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_29.gridx = 7;
		gbc_textField_29.gridy = 11;
		add(textField_29, gbc_textField_29);
		textField_29.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_23 = new GridBagConstraints();
		gbc_lblNewLabel_23.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_23.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_23.gridx = 8;
		gbc_lblNewLabel_23.gridy = 11;
		add(lblNewLabel_23, gbc_lblNewLabel_23);
		
		textField_41 = new JTextField();
		textField_41.setText("");
		GridBagConstraints gbc_textField_41 = new GridBagConstraints();
		gbc_textField_41.insets = new Insets(0, 0, 5, 5);
		gbc_textField_41.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_41.gridx = 9;
		gbc_textField_41.gridy = 11;
		add(textField_41, gbc_textField_41);
		textField_41.setColumns(10);
		
		JLabel lblNewLabel_35 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_35 = new GridBagConstraints();
		gbc_lblNewLabel_35.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_35.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_35.gridx = 10;
		gbc_lblNewLabel_35.gridy = 11;
		add(lblNewLabel_35, gbc_lblNewLabel_35);
		
		textField_53 = new JTextField();
		textField_53.setText("");
		GridBagConstraints gbc_textField_53 = new GridBagConstraints();
		gbc_textField_53.insets = new Insets(0, 0, 5, 5);
		gbc_textField_53.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_53.gridx = 11;
		gbc_textField_53.gridy = 11;
		add(textField_53, gbc_textField_53);
		textField_53.setColumns(10);
		
		JLabel lblNewLabel_47 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_47 = new GridBagConstraints();
		gbc_lblNewLabel_47.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_47.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_47.gridx = 12;
		gbc_lblNewLabel_47.gridy = 11;
		add(lblNewLabel_47, gbc_lblNewLabel_47);
		
		textField_65 = new JTextField();
		textField_65.setText("");
		GridBagConstraints gbc_textField_65 = new GridBagConstraints();
		gbc_textField_65.insets = new Insets(0, 0, 5, 5);
		gbc_textField_65.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_65.gridx = 13;
		gbc_textField_65.gridy = 11;
		add(textField_65, gbc_textField_65);
		textField_65.setColumns(10);
		
		JLabel lblNewLabel_59 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_59 = new GridBagConstraints();
		gbc_lblNewLabel_59.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_59.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_59.gridx = 14;
		gbc_lblNewLabel_59.gridy = 11;
		add(lblNewLabel_59, gbc_lblNewLabel_59);
		
		textField_77 = new JTextField();
		textField_77.setText("");
		GridBagConstraints gbc_textField_77 = new GridBagConstraints();
		gbc_textField_77.insets = new Insets(0, 0, 5, 0);
		gbc_textField_77.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_77.gridx = 15;
		gbc_textField_77.gridy = 11;
		add(textField_77, gbc_textField_77);
		textField_77.setColumns(10);
		
		JLabel lblE_6 = new JLabel(e7);
		GridBagConstraints gbc_lblE_6 = new GridBagConstraints();
		gbc_lblE_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_6.gridx = 1;
		gbc_lblE_6.gridy = 12;
		add(lblE_6, gbc_lblE_6);
		
		textField_7 = new JTextField();
		textField_7.setText("");
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 3;
		gbc_textField_7.gridy = 12;
		add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 4;
		gbc_lblNewLabel_6.gridy = 12;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_18 = new JTextField();
		textField_18.setText("");
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 5;
		gbc_textField_18.gridy = 12;
		add(textField_18, gbc_textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 6;
		gbc_lblNewLabel_14.gridy = 12;
		add(lblNewLabel_14, gbc_lblNewLabel_14);
		
		textField_30 = new JTextField();
		GridBagConstraints gbc_textField_30 = new GridBagConstraints();
		gbc_textField_30.insets = new Insets(0, 0, 5, 5);
		gbc_textField_30.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_30.gridx = 7;
		gbc_textField_30.gridy = 12;
		add(textField_30, gbc_textField_30);
		textField_30.setColumns(10);
		
		JLabel lblNewLabel_24 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_24 = new GridBagConstraints();
		gbc_lblNewLabel_24.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_24.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_24.gridx = 8;
		gbc_lblNewLabel_24.gridy = 12;
		add(lblNewLabel_24, gbc_lblNewLabel_24);
		
		textField_42 = new JTextField();
		textField_42.setText("");
		GridBagConstraints gbc_textField_42 = new GridBagConstraints();
		gbc_textField_42.insets = new Insets(0, 0, 5, 5);
		gbc_textField_42.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_42.gridx = 9;
		gbc_textField_42.gridy = 12;
		add(textField_42, gbc_textField_42);
		textField_42.setColumns(10);
		
		JLabel lblNewLabel_36 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_36 = new GridBagConstraints();
		gbc_lblNewLabel_36.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_36.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_36.gridx = 10;
		gbc_lblNewLabel_36.gridy = 12;
		add(lblNewLabel_36, gbc_lblNewLabel_36);
		
		textField_54 = new JTextField();
		textField_54.setText("");
		GridBagConstraints gbc_textField_54 = new GridBagConstraints();
		gbc_textField_54.insets = new Insets(0, 0, 5, 5);
		gbc_textField_54.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_54.gridx = 11;
		gbc_textField_54.gridy = 12;
		add(textField_54, gbc_textField_54);
		textField_54.setColumns(10);
		
		JLabel lblNewLabel_48 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_48 = new GridBagConstraints();
		gbc_lblNewLabel_48.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_48.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_48.gridx = 12;
		gbc_lblNewLabel_48.gridy = 12;
		add(lblNewLabel_48, gbc_lblNewLabel_48);
		
		textField_66 = new JTextField();
		GridBagConstraints gbc_textField_66 = new GridBagConstraints();
		gbc_textField_66.insets = new Insets(0, 0, 5, 5);
		gbc_textField_66.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_66.gridx = 13;
		gbc_textField_66.gridy = 12;
		add(textField_66, gbc_textField_66);
		textField_66.setColumns(10);
		
		JLabel lblNewLabel_60 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_60 = new GridBagConstraints();
		gbc_lblNewLabel_60.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_60.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_60.gridx = 14;
		gbc_lblNewLabel_60.gridy = 12;
		add(lblNewLabel_60, gbc_lblNewLabel_60);
		
		textField_78 = new JTextField();
		textField_78.setText("");
		GridBagConstraints gbc_textField_78 = new GridBagConstraints();
		gbc_textField_78.insets = new Insets(0, 0, 5, 0);
		gbc_textField_78.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_78.gridx = 15;
		gbc_textField_78.gridy = 12;
		add(textField_78, gbc_textField_78);
		textField_78.setColumns(10);
		
		JLabel lblE_7 = new JLabel(e8);
		GridBagConstraints gbc_lblE_7 = new GridBagConstraints();
		gbc_lblE_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_7.gridx = 1;
		gbc_lblE_7.gridy = 13;
		add(lblE_7, gbc_lblE_7);
		
		textField_8 = new JTextField();
		textField_8.setText("");
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 3;
		gbc_textField_8.gridy = 13;
		add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 4;
		gbc_lblNewLabel_7.gridy = 13;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_19 = new JTextField();
		textField_19.setText("");
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 5;
		gbc_textField_19.gridy = 13;
		add(textField_19, gbc_textField_19);
		textField_19.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15.gridx = 6;
		gbc_lblNewLabel_15.gridy = 13;
		add(lblNewLabel_15, gbc_lblNewLabel_15);
		
		textField_31 = new JTextField();
		textField_31.setText("");
		GridBagConstraints gbc_textField_31 = new GridBagConstraints();
		gbc_textField_31.insets = new Insets(0, 0, 5, 5);
		gbc_textField_31.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_31.gridx = 7;
		gbc_textField_31.gridy = 13;
		add(textField_31, gbc_textField_31);
		textField_31.setColumns(10);
		
		JLabel lblNewLabel_25 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_25 = new GridBagConstraints();
		gbc_lblNewLabel_25.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_25.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_25.gridx = 8;
		gbc_lblNewLabel_25.gridy = 13;
		add(lblNewLabel_25, gbc_lblNewLabel_25);
		
		textField_43 = new JTextField();
		textField_43.setText("");
		GridBagConstraints gbc_textField_43 = new GridBagConstraints();
		gbc_textField_43.insets = new Insets(0, 0, 5, 5);
		gbc_textField_43.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_43.gridx = 9;
		gbc_textField_43.gridy = 13;
		add(textField_43, gbc_textField_43);
		textField_43.setColumns(10);
		
		JLabel lblNewLabel_37 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_37 = new GridBagConstraints();
		gbc_lblNewLabel_37.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_37.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_37.gridx = 10;
		gbc_lblNewLabel_37.gridy = 13;
		add(lblNewLabel_37, gbc_lblNewLabel_37);
		
		textField_55 = new JTextField();
		GridBagConstraints gbc_textField_55 = new GridBagConstraints();
		gbc_textField_55.insets = new Insets(0, 0, 5, 5);
		gbc_textField_55.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_55.gridx = 11;
		gbc_textField_55.gridy = 13;
		add(textField_55, gbc_textField_55);
		textField_55.setColumns(10);
		
		JLabel lblNewLabel_50 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_50 = new GridBagConstraints();
		gbc_lblNewLabel_50.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_50.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_50.gridx = 12;
		gbc_lblNewLabel_50.gridy = 13;
		add(lblNewLabel_50, gbc_lblNewLabel_50);
		
		textField_67 = new JTextField();
		textField_67.setText("");
		GridBagConstraints gbc_textField_67 = new GridBagConstraints();
		gbc_textField_67.insets = new Insets(0, 0, 5, 5);
		gbc_textField_67.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_67.gridx = 13;
		gbc_textField_67.gridy = 13;
		add(textField_67, gbc_textField_67);
		textField_67.setColumns(10);
		
		JLabel lblNewLabel_61 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_61 = new GridBagConstraints();
		gbc_lblNewLabel_61.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_61.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_61.gridx = 14;
		gbc_lblNewLabel_61.gridy = 13;
		add(lblNewLabel_61, gbc_lblNewLabel_61);
		
		textField_79 = new JTextField();
		textField_79.setText("");
		GridBagConstraints gbc_textField_79 = new GridBagConstraints();
		gbc_textField_79.insets = new Insets(0, 0, 5, 0);
		gbc_textField_79.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_79.gridx = 15;
		gbc_textField_79.gridy = 13;
		add(textField_79, gbc_textField_79);
		textField_79.setColumns(10);
		
		JLabel lblE_8 = new JLabel(e9);
		GridBagConstraints gbc_lblE_8 = new GridBagConstraints();
		gbc_lblE_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_8.gridx = 1;
		gbc_lblE_8.gridy = 15;
		add(lblE_8, gbc_lblE_8);
		
		textField_9 = new JTextField();
		textField_9.setText("");
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 3;
		gbc_textField_9.gridy = 15;
		add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_161 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_161 = new GridBagConstraints();
		gbc_lblNewLabel_161.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_161.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_161.gridx = 4;
		gbc_lblNewLabel_161.gridy = 15;
		add(lblNewLabel_161, gbc_lblNewLabel_161);
		
		textField_20 = new JTextField();
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.gridx = 5;
		gbc_textField_20.gridy = 15;
		add(textField_20, gbc_textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 6;
		gbc_lblNewLabel_16.gridy = 15;
		add(lblNewLabel_16, gbc_lblNewLabel_16);
		
		textField_32 = new JTextField();
		textField_32.setText("");
		GridBagConstraints gbc_textField_32 = new GridBagConstraints();
		gbc_textField_32.insets = new Insets(0, 0, 5, 5);
		gbc_textField_32.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_32.gridx = 7;
		gbc_textField_32.gridy = 15;
		add(textField_32, gbc_textField_32);
		textField_32.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_26 = new GridBagConstraints();
		gbc_lblNewLabel_26.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_26.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_26.gridx = 8;
		gbc_lblNewLabel_26.gridy = 15;
		add(lblNewLabel_26, gbc_lblNewLabel_26);
		
		textField_44 = new JTextField();
		textField_44.setText("");
		GridBagConstraints gbc_textField_44 = new GridBagConstraints();
		gbc_textField_44.insets = new Insets(0, 0, 5, 5);
		gbc_textField_44.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_44.gridx = 9;
		gbc_textField_44.gridy = 15;
		add(textField_44, gbc_textField_44);
		textField_44.setColumns(10);
		
		JLabel lblNewLabel_38 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_38 = new GridBagConstraints();
		gbc_lblNewLabel_38.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_38.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_38.gridx = 10;
		gbc_lblNewLabel_38.gridy = 15;
		add(lblNewLabel_38, gbc_lblNewLabel_38);
		
		textField_56 = new JTextField();
		textField_56.setText("");
		GridBagConstraints gbc_textField_56 = new GridBagConstraints();
		gbc_textField_56.insets = new Insets(0, 0, 5, 5);
		gbc_textField_56.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_56.gridx = 11;
		gbc_textField_56.gridy = 15;
		add(textField_56, gbc_textField_56);
		textField_56.setColumns(10);
		
		JLabel lblNewLabel_49 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_49 = new GridBagConstraints();
		gbc_lblNewLabel_49.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_49.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_49.gridx = 12;
		gbc_lblNewLabel_49.gridy = 15;
		add(lblNewLabel_49, gbc_lblNewLabel_49);
		
		textField_68 = new JTextField();
		textField_68.setText("");
		GridBagConstraints gbc_textField_68 = new GridBagConstraints();
		gbc_textField_68.insets = new Insets(0, 0, 5, 5);
		gbc_textField_68.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_68.gridx = 13;
		gbc_textField_68.gridy = 15;
		add(textField_68, gbc_textField_68);
		textField_68.setColumns(10);
		
		JLabel lblNewLabel_62 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_62 = new GridBagConstraints();
		gbc_lblNewLabel_62.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_62.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_62.gridx = 14;
		gbc_lblNewLabel_62.gridy = 15;
		add(lblNewLabel_62, gbc_lblNewLabel_62);
		
		textField_80 = new JTextField();
		textField_80.setText("");
		GridBagConstraints gbc_textField_80 = new GridBagConstraints();
		gbc_textField_80.insets = new Insets(0, 0, 5, 0);
		gbc_textField_80.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_80.gridx = 15;
		gbc_textField_80.gridy = 15;
		add(textField_80, gbc_textField_80);
		textField_80.setColumns(10);
		
		JLabel lblE_9 = new JLabel(e10);
		GridBagConstraints gbc_lblE_9 = new GridBagConstraints();
		gbc_lblE_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_9.gridx = 1;
		gbc_lblE_9.gridy = 16;
		add(lblE_9, gbc_lblE_9);
		
		textField_10 = new JTextField();
		textField_10.setText("");
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 3;
		gbc_textField_10.gridy = 16;
		add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 4;
		gbc_lblNewLabel_8.gridy = 16;
		add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_21 = new JTextField();
		textField_21.setText("");
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.insets = new Insets(0, 0, 5, 5);
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.gridx = 5;
		gbc_textField_21.gridy = 16;
		add(textField_21, gbc_textField_21);
		textField_21.setColumns(10);
		
		JLabel label_4 = new JLabel("+");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 6;
		gbc_label_4.gridy = 16;
		add(label_4, gbc_label_4);
		
		textField_33 = new JTextField();
		textField_33.setText("");
		GridBagConstraints gbc_textField_33 = new GridBagConstraints();
		gbc_textField_33.insets = new Insets(0, 0, 5, 5);
		gbc_textField_33.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_33.gridx = 7;
		gbc_textField_33.gridy = 16;
		add(textField_33, gbc_textField_33);
		textField_33.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_27 = new GridBagConstraints();
		gbc_lblNewLabel_27.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_27.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_27.gridx = 8;
		gbc_lblNewLabel_27.gridy = 16;
		add(lblNewLabel_27, gbc_lblNewLabel_27);
		
		textField_45 = new JTextField();
		textField_45.setText("");
		GridBagConstraints gbc_textField_45 = new GridBagConstraints();
		gbc_textField_45.insets = new Insets(0, 0, 5, 5);
		gbc_textField_45.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_45.gridx = 9;
		gbc_textField_45.gridy = 16;
		add(textField_45, gbc_textField_45);
		textField_45.setColumns(10);
		
		JLabel lblNewLabel_39 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_39 = new GridBagConstraints();
		gbc_lblNewLabel_39.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_39.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_39.gridx = 10;
		gbc_lblNewLabel_39.gridy = 16;
		add(lblNewLabel_39, gbc_lblNewLabel_39);
		
		textField_57 = new JTextField();
		textField_57.setText("");
		GridBagConstraints gbc_textField_57 = new GridBagConstraints();
		gbc_textField_57.insets = new Insets(0, 0, 5, 5);
		gbc_textField_57.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_57.gridx = 11;
		gbc_textField_57.gridy = 16;
		add(textField_57, gbc_textField_57);
		textField_57.setColumns(10);
		
		JLabel lblNewLabel_51 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_51 = new GridBagConstraints();
		gbc_lblNewLabel_51.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_51.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_51.gridx = 12;
		gbc_lblNewLabel_51.gridy = 16;
		add(lblNewLabel_51, gbc_lblNewLabel_51);
		
		textField_69 = new JTextField();
		textField_69.setText("");
		GridBagConstraints gbc_textField_69 = new GridBagConstraints();
		gbc_textField_69.insets = new Insets(0, 0, 5, 5);
		gbc_textField_69.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_69.gridx = 13;
		gbc_textField_69.gridy = 16;
		add(textField_69, gbc_textField_69);
		textField_69.setColumns(10);
		
		JLabel lblNewLabel_63 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_63 = new GridBagConstraints();
		gbc_lblNewLabel_63.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_63.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_63.gridx = 14;
		gbc_lblNewLabel_63.gridy = 16;
		add(lblNewLabel_63, gbc_lblNewLabel_63);
		
		textField_81 = new JTextField();
		textField_81.setText("");
		GridBagConstraints gbc_textField_81 = new GridBagConstraints();
		gbc_textField_81.insets = new Insets(0, 0, 5, 0);
		gbc_textField_81.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_81.gridx = 15;
		gbc_textField_81.gridy = 16;
		add(textField_81, gbc_textField_81);
		textField_81.setColumns(10);
		
		JLabel lblE_10 = new JLabel(e11);
		GridBagConstraints gbc_lblE_10 = new GridBagConstraints();
		gbc_lblE_10.insets = new Insets(0, 0, 0, 5);
		gbc_lblE_10.gridx = 1;
		gbc_lblE_10.gridy = 17;
		add(lblE_10, gbc_lblE_10);
		
		textField_11 = new JTextField();
		textField_11.setText("");
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 0, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 3;
		gbc_textField_11.gridy = 17;
		add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9.gridx = 4;
		gbc_lblNewLabel_9.gridy = 17;
		add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		textField_22 = new JTextField();
		textField_22.setText("");
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.insets = new Insets(0, 0, 0, 5);
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.gridx = 5;
		gbc_textField_22.gridy = 17;
		add(textField_22, gbc_textField_22);
		textField_22.setColumns(10);
		
		JLabel label_1 = new JLabel("+");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 6;
		gbc_label_1.gridy = 17;
		add(label_1, gbc_label_1);
		
		textField_34 = new JTextField();
		textField_34.setText("");
		GridBagConstraints gbc_textField_34 = new GridBagConstraints();
		gbc_textField_34.insets = new Insets(0, 0, 0, 5);
		gbc_textField_34.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_34.gridx = 7;
		gbc_textField_34.gridy = 17;
		add(textField_34, gbc_textField_34);
		textField_34.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_28 = new GridBagConstraints();
		gbc_lblNewLabel_28.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_28.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_28.gridx = 8;
		gbc_lblNewLabel_28.gridy = 17;
		add(lblNewLabel_28, gbc_lblNewLabel_28);
		
		textField_46 = new JTextField();
		textField_46.setText("");
		GridBagConstraints gbc_textField_46 = new GridBagConstraints();
		gbc_textField_46.insets = new Insets(0, 0, 0, 5);
		gbc_textField_46.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_46.gridx = 9;
		gbc_textField_46.gridy = 17;
		add(textField_46, gbc_textField_46);
		textField_46.setColumns(10);
		
		JLabel lblNewLabel_40 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_40 = new GridBagConstraints();
		gbc_lblNewLabel_40.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_40.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_40.gridx = 10;
		gbc_lblNewLabel_40.gridy = 17;
		add(lblNewLabel_40, gbc_lblNewLabel_40);
		
		textField_58 = new JTextField();
		textField_58.setText("");
		GridBagConstraints gbc_textField_58 = new GridBagConstraints();
		gbc_textField_58.insets = new Insets(0, 0, 0, 5);
		gbc_textField_58.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_58.gridx = 11;
		gbc_textField_58.gridy = 17;
		add(textField_58, gbc_textField_58);
		textField_58.setColumns(10);
		
		JLabel lblNewLabel_52 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_52 = new GridBagConstraints();
		gbc_lblNewLabel_52.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_52.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_52.gridx = 12;
		gbc_lblNewLabel_52.gridy = 17;
		add(lblNewLabel_52, gbc_lblNewLabel_52);
		
		textField_70 = new JTextField();
		textField_70.setText("");
		GridBagConstraints gbc_textField_70 = new GridBagConstraints();
		gbc_textField_70.insets = new Insets(0, 0, 0, 5);
		gbc_textField_70.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_70.gridx = 13;
		gbc_textField_70.gridy = 17;
		add(textField_70, gbc_textField_70);
		textField_70.setColumns(10);
		
		JLabel lblNewLabel_64 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_64 = new GridBagConstraints();
		gbc_lblNewLabel_64.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_64.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_64.gridx = 14;
		gbc_lblNewLabel_64.gridy = 17;
		add(lblNewLabel_64, gbc_lblNewLabel_64);
		
		textField_82 = new JTextField();
		textField_82.setText("");
		GridBagConstraints gbc_textField_82 = new GridBagConstraints();
		gbc_textField_82.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_82.gridx = 15;
		gbc_textField_82.gridy = 17;
		add(textField_82, gbc_textField_82);
		textField_82.setColumns(10);

	}

}
