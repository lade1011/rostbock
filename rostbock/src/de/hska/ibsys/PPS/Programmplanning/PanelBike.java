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
	private JTextField tf_p_wish;
	private JTextField tf_e1_wish;
	private JTextField tf_e2_wish;
	private JTextField tf_e3_wish;
	private JTextField tf_e4_wish;
	private JTextField tf_e5_wish;
	private JTextField tf_e6_wish;
	private JTextField tf_e7_wish;
	private JTextField tf_e8_wish;
	private JTextField tf_e9_wish;
	private JTextField tf_e10_wish;
	private JTextField tf_e11_wish;
	private JTextField tf_e1_previousWaiting;
	private JTextField tf_e2_previousWaiting;
	private JTextField tf_e3_previousWaiting;
	private JTextField tf_e4_previousWaiting;
	private JTextField tf_e5_previousWaiting;
	private JTextField tf_e6_previousWaiting;
	private JTextField tf_e7_previousWaiting;
	private JTextField tf_e8_previousWaiting;
	private JTextField tf_e9_previousWaiting;
	private JTextField tf_e10_previousWaiting;
	private JTextField tf_e11_previousWaiting;
	private JTextField tf_p_reserve;
	private JTextField tf_e1_reserve;
	private JTextField tf_e2_reserve;
	private JTextField tf_e3_reserve;
	private JTextField tf_e4_reserve;
	private JTextField tf_e5_reserve;
	private JTextField tf_e6_reserve;
	private JTextField tf_e7_reserve;
	private JTextField tf_e8_reserve;
	private JTextField tf_e9_reserve;
	private JTextField tf_e10_reserve;
	private JTextField tf_e11_reserve;
	private JTextField tf_p_stock;
	private JTextField tf_e1_stock;
	private JTextField tf_e2_stock;
	private JTextField tf_e3_stock;
	private JTextField tf_e4_stock;
	private JTextField tf_e5_stock;
	private JTextField tf_e6_stock;
	private JTextField tf_e7_stock;
	private JTextField tf_e8_stock;
	private JTextField tf_e9_stock;
	private JTextField tf_e10_stock;
	private JTextField tf_e11_stock;
	private JTextField tf_p_queue;
	private JTextField tf_e1_queue;
	private JTextField tf_e2_queue;
	private JTextField tf_e3_queue;
	private JTextField tf_e4_queue;
	private JTextField tf_e5_queue;
	private JTextField tf_e6_queue;
	private JTextField tf_e7_queue;
	private JTextField tf_e8_queue;
	private JTextField tf_e9_queue;
	private JTextField tf_e10_queue;
	private JTextField tf_e11_queue;
	private JTextField tf_p_progress;
	private JTextField tf_e1_progress;
	private JTextField tf_e2_progress;
	private JTextField tf_e3_progress;
	private JTextField tf_e4_progress;
	private JTextField tf_e5_progress;
	private JTextField tf_e6_progress;
	private JTextField tf_e7_progress;
	private JTextField tf_e8_progress;
	private JTextField tf_e9_progress;
	private JTextField tf_e10_progress;
	private JTextField tf_e11_progress;
	private JTextField tf_p_order;
	private JTextField tf_e1_order;
	private JTextField tf_e2_order;
	private JTextField tf_e3_order;
	private JTextField tf_e4_order;
	private JTextField tf_e5_order;
	private JTextField tf_e6_order;
	private JTextField tf_e7_order;
	private JTextField tf_e8_order;
	private JTextField tf_e9_order;
	private JTextField tf_e10_order;
	private JTextField tf_e11_order;

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
		
		tf_p_wish = new JTextField();
		GridBagConstraints gbc_tf_p_wish = new GridBagConstraints();
		gbc_tf_p_wish.insets = new Insets(0, 0, 5, 5);
		gbc_tf_p_wish.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_p_wish.gridx = 3;
		gbc_tf_p_wish.gridy = 2;
		add(tf_p_wish, gbc_tf_p_wish);
		tf_p_wish.setColumns(10);
		
		JLabel label = new JLabel("    +    ");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 5;
		gbc_label.gridy = 2;
		add(label, gbc_label);
		
		tf_p_reserve = new JTextField();
		GridBagConstraints gbc_tf_p_reserve = new GridBagConstraints();
		gbc_tf_p_reserve.insets = new Insets(0, 0, 5, 5);
		gbc_tf_p_reserve.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_p_reserve.gridx = 7;
		gbc_tf_p_reserve.gridy = 2;
		add(tf_p_reserve, gbc_tf_p_reserve);
		tf_p_reserve.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 8;
		gbc_lblNewLabel_17.gridy = 2;
		add(lblNewLabel_17, gbc_lblNewLabel_17);
		
		tf_p_stock = new JTextField();
		GridBagConstraints gbc_tf_p_stock = new GridBagConstraints();
		gbc_tf_p_stock.insets = new Insets(0, 0, 5, 5);
		gbc_tf_p_stock.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_p_stock.gridx = 9;
		gbc_tf_p_stock.gridy = 2;
		add(tf_p_stock, gbc_tf_p_stock);
		tf_p_stock.setColumns(10);
		
		JLabel lblNewLabel_29 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_29 = new GridBagConstraints();
		gbc_lblNewLabel_29.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_29.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_29.gridx = 10;
		gbc_lblNewLabel_29.gridy = 2;
		add(lblNewLabel_29, gbc_lblNewLabel_29);
		
		tf_p_queue = new JTextField();
		GridBagConstraints gbc_tf_p_queue = new GridBagConstraints();
		gbc_tf_p_queue.insets = new Insets(0, 0, 5, 5);
		gbc_tf_p_queue.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_p_queue.gridx = 11;
		gbc_tf_p_queue.gridy = 2;
		add(tf_p_queue, gbc_tf_p_queue);
		tf_p_queue.setColumns(10);
		
		JLabel lblNewLabel_41 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_41 = new GridBagConstraints();
		gbc_lblNewLabel_41.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_41.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_41.gridx = 12;
		gbc_lblNewLabel_41.gridy = 2;
		add(lblNewLabel_41, gbc_lblNewLabel_41);
		
		tf_p_progress = new JTextField();
		GridBagConstraints gbc_tf_p_progress = new GridBagConstraints();
		gbc_tf_p_progress.insets = new Insets(0, 0, 5, 5);
		gbc_tf_p_progress.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_p_progress.gridx = 13;
		gbc_tf_p_progress.gridy = 2;
		add(tf_p_progress, gbc_tf_p_progress);
		tf_p_progress.setColumns(10);
		
		JLabel lblNewLabel_53 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_53 = new GridBagConstraints();
		gbc_lblNewLabel_53.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_53.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_53.gridx = 14;
		gbc_lblNewLabel_53.gridy = 2;
		add(lblNewLabel_53, gbc_lblNewLabel_53);
		
		tf_p_order = new JTextField();
		GridBagConstraints gbc_tf_p_order = new GridBagConstraints();
		gbc_tf_p_order.insets = new Insets(0, 0, 5, 0);
		gbc_tf_p_order.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_p_order.gridx = 15;
		gbc_tf_p_order.gridy = 2;
		add(tf_p_order, gbc_tf_p_order);
		tf_p_order.setColumns(10);
		
		JLabel lblE = new JLabel(e1);
		GridBagConstraints gbc_lblE = new GridBagConstraints();
		gbc_lblE.insets = new Insets(0, 0, 5, 5);
		gbc_lblE.gridx = 1;
		gbc_lblE.gridy = 4;
		add(lblE, gbc_lblE);
		
		tf_e1_wish = new JTextField();
		tf_e1_wish.setText("");
		GridBagConstraints gbc_tf_e1_wish = new GridBagConstraints();
		gbc_tf_e1_wish.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e1_wish.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e1_wish.gridx = 3;
		gbc_tf_e1_wish.gridy = 4;
		add(tf_e1_wish, gbc_tf_e1_wish);
		tf_e1_wish.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		
		tf_e1_previousWaiting = new JTextField();
		GridBagConstraints gbc_tf_e1_previousWaiting = new GridBagConstraints();
		gbc_tf_e1_previousWaiting.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e1_previousWaiting.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e1_previousWaiting.gridx = 5;
		gbc_tf_e1_previousWaiting.gridy = 4;
		add(tf_e1_previousWaiting, gbc_tf_e1_previousWaiting);
		tf_e1_previousWaiting.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 6;
		gbc_lblNewLabel_10.gridy = 4;
		add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		tf_e1_reserve = new JTextField();
		GridBagConstraints gbc_tf_e1_reserve = new GridBagConstraints();
		gbc_tf_e1_reserve.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e1_reserve.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e1_reserve.gridx = 7;
		gbc_tf_e1_reserve.gridy = 4;
		add(tf_e1_reserve, gbc_tf_e1_reserve);
		tf_e1_reserve.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 8;
		gbc_lblNewLabel_18.gridy = 4;
		add(lblNewLabel_18, gbc_lblNewLabel_18);
		
		tf_e1_stock = new JTextField();
		tf_e1_stock.setText("");
		GridBagConstraints gbc_tf_e1_stock = new GridBagConstraints();
		gbc_tf_e1_stock.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e1_stock.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e1_stock.gridx = 9;
		gbc_tf_e1_stock.gridy = 4;
		add(tf_e1_stock, gbc_tf_e1_stock);
		tf_e1_stock.setColumns(10);
		
		JLabel lblNewLabel_30 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_30 = new GridBagConstraints();
		gbc_lblNewLabel_30.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_30.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_30.gridx = 10;
		gbc_lblNewLabel_30.gridy = 4;
		add(lblNewLabel_30, gbc_lblNewLabel_30);
		
		tf_e1_queue = new JTextField();
		tf_e1_queue.setText("");
		GridBagConstraints gbc_tf_e1_queue = new GridBagConstraints();
		gbc_tf_e1_queue.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e1_queue.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e1_queue.gridx = 11;
		gbc_tf_e1_queue.gridy = 4;
		add(tf_e1_queue, gbc_tf_e1_queue);
		tf_e1_queue.setColumns(10);
		
		JLabel lblNewLabel_42 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_42 = new GridBagConstraints();
		gbc_lblNewLabel_42.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_42.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_42.gridx = 12;
		gbc_lblNewLabel_42.gridy = 4;
		add(lblNewLabel_42, gbc_lblNewLabel_42);
		
		tf_e1_progress = new JTextField();
		tf_e1_progress.setText("");
		GridBagConstraints gbc_tf_e1_progress = new GridBagConstraints();
		gbc_tf_e1_progress.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e1_progress.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e1_progress.gridx = 13;
		gbc_tf_e1_progress.gridy = 4;
		add(tf_e1_progress, gbc_tf_e1_progress);
		tf_e1_progress.setColumns(10);
		
		JLabel lblNewLabel_54 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_54 = new GridBagConstraints();
		gbc_lblNewLabel_54.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_54.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_54.gridx = 14;
		gbc_lblNewLabel_54.gridy = 4;
		add(lblNewLabel_54, gbc_lblNewLabel_54);
		
		tf_e1_order = new JTextField();
		tf_e1_order.setText("");
		GridBagConstraints gbc_tf_e1_order = new GridBagConstraints();
		gbc_tf_e1_order.insets = new Insets(0, 0, 5, 0);
		gbc_tf_e1_order.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e1_order.gridx = 15;
		gbc_tf_e1_order.gridy = 4;
		add(tf_e1_order, gbc_tf_e1_order);
		tf_e1_order.setColumns(10);
		
		JLabel lblE_1 = new JLabel(e2);
		GridBagConstraints gbc_lblE_1 = new GridBagConstraints();
		gbc_lblE_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_1.gridx = 1;
		gbc_lblE_1.gridy = 5;
		add(lblE_1, gbc_lblE_1);
		
		tf_e2_wish = new JTextField();
		tf_e2_wish.setText("");
		GridBagConstraints gbc_tf_e2_wish = new GridBagConstraints();
		gbc_tf_e2_wish.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e2_wish.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e2_wish.gridx = 3;
		gbc_tf_e2_wish.gridy = 5;
		add(tf_e2_wish, gbc_tf_e2_wish);
		tf_e2_wish.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 5;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		tf_e2_previousWaiting = new JTextField();
		GridBagConstraints gbc_tf_e2_previousWaiting = new GridBagConstraints();
		gbc_tf_e2_previousWaiting.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e2_previousWaiting.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e2_previousWaiting.gridx = 5;
		gbc_tf_e2_previousWaiting.gridy = 5;
		add(tf_e2_previousWaiting, gbc_tf_e2_previousWaiting);
		tf_e2_previousWaiting.setColumns(10);
		
		JLabel label_3 = new JLabel("+");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 6;
		gbc_label_3.gridy = 5;
		add(label_3, gbc_label_3);
		
		tf_e2_reserve = new JTextField();
		tf_e2_reserve.setText("");
		GridBagConstraints gbc_tf_e2_reserve = new GridBagConstraints();
		gbc_tf_e2_reserve.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e2_reserve.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e2_reserve.gridx = 7;
		gbc_tf_e2_reserve.gridy = 5;
		add(tf_e2_reserve, gbc_tf_e2_reserve);
		tf_e2_reserve.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 8;
		gbc_lblNewLabel_19.gridy = 5;
		add(lblNewLabel_19, gbc_lblNewLabel_19);
		
		tf_e2_stock = new JTextField();
		tf_e2_stock.setText("");
		GridBagConstraints gbc_tf_e2_stock = new GridBagConstraints();
		gbc_tf_e2_stock.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e2_stock.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e2_stock.gridx = 9;
		gbc_tf_e2_stock.gridy = 5;
		add(tf_e2_stock, gbc_tf_e2_stock);
		tf_e2_stock.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_31 = new GridBagConstraints();
		gbc_lblNewLabel_31.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_31.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_31.gridx = 10;
		gbc_lblNewLabel_31.gridy = 5;
		add(lblNewLabel_31, gbc_lblNewLabel_31);
		
		tf_e2_queue = new JTextField();
		tf_e2_queue.setText("");
		GridBagConstraints gbc_tf_e2_queue = new GridBagConstraints();
		gbc_tf_e2_queue.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e2_queue.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e2_queue.gridx = 11;
		gbc_tf_e2_queue.gridy = 5;
		add(tf_e2_queue, gbc_tf_e2_queue);
		tf_e2_queue.setColumns(10);
		
		JLabel lblNewLabel_43 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_43 = new GridBagConstraints();
		gbc_lblNewLabel_43.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_43.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_43.gridx = 12;
		gbc_lblNewLabel_43.gridy = 5;
		add(lblNewLabel_43, gbc_lblNewLabel_43);
		
		tf_e2_progress = new JTextField();
		tf_e2_progress.setText("");
		GridBagConstraints gbc_tf_e2_progress = new GridBagConstraints();
		gbc_tf_e2_progress.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e2_progress.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e2_progress.gridx = 13;
		gbc_tf_e2_progress.gridy = 5;
		add(tf_e2_progress, gbc_tf_e2_progress);
		tf_e2_progress.setColumns(10);
		
		JLabel lblNewLabel_55 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_55 = new GridBagConstraints();
		gbc_lblNewLabel_55.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_55.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_55.gridx = 14;
		gbc_lblNewLabel_55.gridy = 5;
		add(lblNewLabel_55, gbc_lblNewLabel_55);
		
		tf_e2_order = new JTextField();
		tf_e2_order.setText("");
		GridBagConstraints gbc_tf_e2_order = new GridBagConstraints();
		gbc_tf_e2_order.insets = new Insets(0, 0, 5, 0);
		gbc_tf_e2_order.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e2_order.gridx = 15;
		gbc_tf_e2_order.gridy = 5;
		add(tf_e2_order, gbc_tf_e2_order);
		tf_e2_order.setColumns(10);
		
		JLabel lblE_2 = new JLabel(e3);
		GridBagConstraints gbc_lblE_2 = new GridBagConstraints();
		gbc_lblE_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_2.gridx = 1;
		gbc_lblE_2.gridy = 7;
		add(lblE_2, gbc_lblE_2);
		
		tf_e3_wish = new JTextField();
		tf_e3_wish.setText("");
		GridBagConstraints gbc_tf_e3_wish = new GridBagConstraints();
		gbc_tf_e3_wish.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e3_wish.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e3_wish.gridx = 3;
		gbc_tf_e3_wish.gridy = 7;
		add(tf_e3_wish, gbc_tf_e3_wish);
		tf_e3_wish.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 7;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		tf_e3_previousWaiting = new JTextField();
		tf_e3_previousWaiting.setText("");
		GridBagConstraints gbc_tf_e3_previousWaiting = new GridBagConstraints();
		gbc_tf_e3_previousWaiting.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e3_previousWaiting.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e3_previousWaiting.gridx = 5;
		gbc_tf_e3_previousWaiting.gridy = 7;
		add(tf_e3_previousWaiting, gbc_tf_e3_previousWaiting);
		tf_e3_previousWaiting.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 6;
		gbc_lblNewLabel_11.gridy = 7;
		add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		tf_e3_reserve = new JTextField();
		tf_e3_reserve.setText("");
		GridBagConstraints gbc_tf_e3_reserve = new GridBagConstraints();
		gbc_tf_e3_reserve.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e3_reserve.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e3_reserve.gridx = 7;
		gbc_tf_e3_reserve.gridy = 7;
		add(tf_e3_reserve, gbc_tf_e3_reserve);
		tf_e3_reserve.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
		gbc_lblNewLabel_20.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_20.gridx = 8;
		gbc_lblNewLabel_20.gridy = 7;
		add(lblNewLabel_20, gbc_lblNewLabel_20);
		
		tf_e3_stock = new JTextField();
		tf_e3_stock.setText("");
		GridBagConstraints gbc_tf_e3_stock = new GridBagConstraints();
		gbc_tf_e3_stock.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e3_stock.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e3_stock.gridx = 9;
		gbc_tf_e3_stock.gridy = 7;
		add(tf_e3_stock, gbc_tf_e3_stock);
		tf_e3_stock.setColumns(10);
		
		JLabel lblNewLabel_32 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_32 = new GridBagConstraints();
		gbc_lblNewLabel_32.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_32.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_32.gridx = 10;
		gbc_lblNewLabel_32.gridy = 7;
		add(lblNewLabel_32, gbc_lblNewLabel_32);
		
		tf_e3_queue = new JTextField();
		tf_e3_queue.setText("");
		GridBagConstraints gbc_tf_e3_queue = new GridBagConstraints();
		gbc_tf_e3_queue.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e3_queue.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e3_queue.gridx = 11;
		gbc_tf_e3_queue.gridy = 7;
		add(tf_e3_queue, gbc_tf_e3_queue);
		tf_e3_queue.setColumns(10);
		
		JLabel lblNewLabel_44 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_44 = new GridBagConstraints();
		gbc_lblNewLabel_44.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_44.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_44.gridx = 12;
		gbc_lblNewLabel_44.gridy = 7;
		add(lblNewLabel_44, gbc_lblNewLabel_44);
		
		tf_e3_progress = new JTextField();
		tf_e3_progress.setText("");
		GridBagConstraints gbc_tf_e3_progress = new GridBagConstraints();
		gbc_tf_e3_progress.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e3_progress.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e3_progress.gridx = 13;
		gbc_tf_e3_progress.gridy = 7;
		add(tf_e3_progress, gbc_tf_e3_progress);
		tf_e3_progress.setColumns(10);
		
		JLabel lblNewLabel_56 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_56 = new GridBagConstraints();
		gbc_lblNewLabel_56.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_56.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_56.gridx = 14;
		gbc_lblNewLabel_56.gridy = 7;
		add(lblNewLabel_56, gbc_lblNewLabel_56);
		
		tf_e3_order = new JTextField();
		tf_e3_order.setText("");
		GridBagConstraints gbc_tf_e3_order = new GridBagConstraints();
		gbc_tf_e3_order.insets = new Insets(0, 0, 5, 0);
		gbc_tf_e3_order.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e3_order.gridx = 15;
		gbc_tf_e3_order.gridy = 7;
		add(tf_e3_order, gbc_tf_e3_order);
		tf_e3_order.setColumns(10);
		
		JLabel lblE_3 = new JLabel(e4);
		GridBagConstraints gbc_lblE_3 = new GridBagConstraints();
		gbc_lblE_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_3.gridx = 1;
		gbc_lblE_3.gridy = 8;
		add(lblE_3, gbc_lblE_3);
		
		tf_e4_wish = new JTextField();
		tf_e4_wish.setText("");
		GridBagConstraints gbc_tf_e4_wish = new GridBagConstraints();
		gbc_tf_e4_wish.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e4_wish.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e4_wish.gridx = 3;
		gbc_tf_e4_wish.gridy = 8;
		add(tf_e4_wish, gbc_tf_e4_wish);
		tf_e4_wish.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 4;
		gbc_lblNewLabel_3.gridy = 8;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		tf_e4_previousWaiting = new JTextField();
		tf_e4_previousWaiting.setText("");
		GridBagConstraints gbc_tf_e4_previousWaiting = new GridBagConstraints();
		gbc_tf_e4_previousWaiting.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e4_previousWaiting.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e4_previousWaiting.gridx = 5;
		gbc_tf_e4_previousWaiting.gridy = 8;
		add(tf_e4_previousWaiting, gbc_tf_e4_previousWaiting);
		tf_e4_previousWaiting.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 6;
		gbc_lblNewLabel_12.gridy = 8;
		add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		tf_e4_reserve = new JTextField();
		tf_e4_reserve.setText("");
		GridBagConstraints gbc_tf_e4_reserve = new GridBagConstraints();
		gbc_tf_e4_reserve.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e4_reserve.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e4_reserve.gridx = 7;
		gbc_tf_e4_reserve.gridy = 8;
		add(tf_e4_reserve, gbc_tf_e4_reserve);
		tf_e4_reserve.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_21.gridx = 8;
		gbc_lblNewLabel_21.gridy = 8;
		add(lblNewLabel_21, gbc_lblNewLabel_21);
		
		tf_e4_stock = new JTextField();
		GridBagConstraints gbc_tf_e4_stock = new GridBagConstraints();
		gbc_tf_e4_stock.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e4_stock.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e4_stock.gridx = 9;
		gbc_tf_e4_stock.gridy = 8;
		add(tf_e4_stock, gbc_tf_e4_stock);
		tf_e4_stock.setColumns(10);
		
		JLabel lblNewLabel_33 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_33 = new GridBagConstraints();
		gbc_lblNewLabel_33.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_33.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_33.gridx = 10;
		gbc_lblNewLabel_33.gridy = 8;
		add(lblNewLabel_33, gbc_lblNewLabel_33);
		
		tf_e4_queue = new JTextField();
		tf_e4_queue.setText("");
		GridBagConstraints gbc_tf_e4_queue = new GridBagConstraints();
		gbc_tf_e4_queue.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e4_queue.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e4_queue.gridx = 11;
		gbc_tf_e4_queue.gridy = 8;
		add(tf_e4_queue, gbc_tf_e4_queue);
		tf_e4_queue.setColumns(10);
		
		JLabel lblNewLabel_45 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_45 = new GridBagConstraints();
		gbc_lblNewLabel_45.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_45.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_45.gridx = 12;
		gbc_lblNewLabel_45.gridy = 8;
		add(lblNewLabel_45, gbc_lblNewLabel_45);
		
		tf_e4_progress = new JTextField();
		tf_e4_progress.setText("");
		GridBagConstraints gbc_tf_e4_progress = new GridBagConstraints();
		gbc_tf_e4_progress.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e4_progress.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e4_progress.gridx = 13;
		gbc_tf_e4_progress.gridy = 8;
		add(tf_e4_progress, gbc_tf_e4_progress);
		tf_e4_progress.setColumns(10);
		
		JLabel lblNewLabel_57 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_57 = new GridBagConstraints();
		gbc_lblNewLabel_57.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_57.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_57.gridx = 14;
		gbc_lblNewLabel_57.gridy = 8;
		add(lblNewLabel_57, gbc_lblNewLabel_57);
		
		tf_e4_order = new JTextField();
		tf_e4_order.setText("");
		GridBagConstraints gbc_tf_e4_order = new GridBagConstraints();
		gbc_tf_e4_order.insets = new Insets(0, 0, 5, 0);
		gbc_tf_e4_order.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e4_order.gridx = 15;
		gbc_tf_e4_order.gridy = 8;
		add(tf_e4_order, gbc_tf_e4_order);
		tf_e4_order.setColumns(10);
		
		JLabel lblE_4 = new JLabel(e5);
		GridBagConstraints gbc_lblE_4 = new GridBagConstraints();
		gbc_lblE_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_4.gridx = 1;
		gbc_lblE_4.gridy = 9;
		add(lblE_4, gbc_lblE_4);
		
		tf_e5_wish = new JTextField();
		tf_e5_wish.setText("");
		GridBagConstraints gbc_tf_e5_wish = new GridBagConstraints();
		gbc_tf_e5_wish.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e5_wish.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e5_wish.gridx = 3;
		gbc_tf_e5_wish.gridy = 9;
		add(tf_e5_wish, gbc_tf_e5_wish);
		tf_e5_wish.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 4;
		gbc_lblNewLabel_4.gridy = 9;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		tf_e5_previousWaiting = new JTextField();
		tf_e5_previousWaiting.setText("");
		GridBagConstraints gbc_tf_e5_previousWaiting = new GridBagConstraints();
		gbc_tf_e5_previousWaiting.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e5_previousWaiting.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e5_previousWaiting.gridx = 5;
		gbc_tf_e5_previousWaiting.gridy = 9;
		add(tf_e5_previousWaiting, gbc_tf_e5_previousWaiting);
		tf_e5_previousWaiting.setColumns(10);
		
		JLabel label_2 = new JLabel("+");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 6;
		gbc_label_2.gridy = 9;
		add(label_2, gbc_label_2);
		
		tf_e5_reserve = new JTextField();
		tf_e5_reserve.setText("");
		GridBagConstraints gbc_tf_e5_reserve = new GridBagConstraints();
		gbc_tf_e5_reserve.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e5_reserve.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e5_reserve.gridx = 7;
		gbc_tf_e5_reserve.gridy = 9;
		add(tf_e5_reserve, gbc_tf_e5_reserve);
		tf_e5_reserve.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_22.gridx = 8;
		gbc_lblNewLabel_22.gridy = 9;
		add(lblNewLabel_22, gbc_lblNewLabel_22);
		
		tf_e5_stock = new JTextField();
		tf_e5_stock.setText("");
		GridBagConstraints gbc_tf_e5_stock = new GridBagConstraints();
		gbc_tf_e5_stock.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e5_stock.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e5_stock.gridx = 9;
		gbc_tf_e5_stock.gridy = 9;
		add(tf_e5_stock, gbc_tf_e5_stock);
		tf_e5_stock.setColumns(10);
		
		JLabel lblNewLabel_34 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_34 = new GridBagConstraints();
		gbc_lblNewLabel_34.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_34.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_34.gridx = 10;
		gbc_lblNewLabel_34.gridy = 9;
		add(lblNewLabel_34, gbc_lblNewLabel_34);
		
		tf_e5_queue = new JTextField();
		tf_e5_queue.setText("");
		GridBagConstraints gbc_tf_e5_queue = new GridBagConstraints();
		gbc_tf_e5_queue.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e5_queue.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e5_queue.gridx = 11;
		gbc_tf_e5_queue.gridy = 9;
		add(tf_e5_queue, gbc_tf_e5_queue);
		tf_e5_queue.setColumns(10);
		
		JLabel lblNewLabel_46 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_46 = new GridBagConstraints();
		gbc_lblNewLabel_46.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_46.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_46.gridx = 12;
		gbc_lblNewLabel_46.gridy = 9;
		add(lblNewLabel_46, gbc_lblNewLabel_46);
		
		tf_e5_progress = new JTextField();
		tf_e5_progress.setText("");
		GridBagConstraints gbc_tf_e5_progress = new GridBagConstraints();
		gbc_tf_e5_progress.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e5_progress.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e5_progress.gridx = 13;
		gbc_tf_e5_progress.gridy = 9;
		add(tf_e5_progress, gbc_tf_e5_progress);
		tf_e5_progress.setColumns(10);
		
		JLabel lblNewLabel_58 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_58 = new GridBagConstraints();
		gbc_lblNewLabel_58.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_58.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_58.gridx = 14;
		gbc_lblNewLabel_58.gridy = 9;
		add(lblNewLabel_58, gbc_lblNewLabel_58);
		
		tf_e5_order = new JTextField();
		tf_e5_order.setText("");
		GridBagConstraints gbc_tf_e5_order = new GridBagConstraints();
		gbc_tf_e5_order.insets = new Insets(0, 0, 5, 0);
		gbc_tf_e5_order.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e5_order.gridx = 15;
		gbc_tf_e5_order.gridy = 9;
		add(tf_e5_order, gbc_tf_e5_order);
		tf_e5_order.setColumns(10);
		
		JLabel lblE_5 = new JLabel(e6);
		GridBagConstraints gbc_lblE_5 = new GridBagConstraints();
		gbc_lblE_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_5.gridx = 1;
		gbc_lblE_5.gridy = 11;
		add(lblE_5, gbc_lblE_5);
		
		tf_e6_wish = new JTextField();
		tf_e6_wish.setText("");
		GridBagConstraints gbc_tf_e6_wish = new GridBagConstraints();
		gbc_tf_e6_wish.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e6_wish.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e6_wish.gridx = 3;
		gbc_tf_e6_wish.gridy = 11;
		add(tf_e6_wish, gbc_tf_e6_wish);
		tf_e6_wish.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 4;
		gbc_lblNewLabel_5.gridy = 11;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		tf_e6_previousWaiting = new JTextField();
		GridBagConstraints gbc_tf_e6_previousWaiting = new GridBagConstraints();
		gbc_tf_e6_previousWaiting.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e6_previousWaiting.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e6_previousWaiting.gridx = 5;
		gbc_tf_e6_previousWaiting.gridy = 11;
		add(tf_e6_previousWaiting, gbc_tf_e6_previousWaiting);
		tf_e6_previousWaiting.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 6;
		gbc_lblNewLabel_13.gridy = 11;
		add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		tf_e6_reserve = new JTextField();
		GridBagConstraints gbc_tf_e6_reserve = new GridBagConstraints();
		gbc_tf_e6_reserve.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e6_reserve.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e6_reserve.gridx = 7;
		gbc_tf_e6_reserve.gridy = 11;
		add(tf_e6_reserve, gbc_tf_e6_reserve);
		tf_e6_reserve.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_23 = new GridBagConstraints();
		gbc_lblNewLabel_23.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_23.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_23.gridx = 8;
		gbc_lblNewLabel_23.gridy = 11;
		add(lblNewLabel_23, gbc_lblNewLabel_23);
		
		tf_e6_stock = new JTextField();
		tf_e6_stock.setText("");
		GridBagConstraints gbc_tf_e6_stock = new GridBagConstraints();
		gbc_tf_e6_stock.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e6_stock.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e6_stock.gridx = 9;
		gbc_tf_e6_stock.gridy = 11;
		add(tf_e6_stock, gbc_tf_e6_stock);
		tf_e6_stock.setColumns(10);
		
		JLabel lblNewLabel_35 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_35 = new GridBagConstraints();
		gbc_lblNewLabel_35.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_35.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_35.gridx = 10;
		gbc_lblNewLabel_35.gridy = 11;
		add(lblNewLabel_35, gbc_lblNewLabel_35);
		
		tf_e6_queue = new JTextField();
		tf_e6_queue.setText("");
		GridBagConstraints gbc_tf_e6_queue = new GridBagConstraints();
		gbc_tf_e6_queue.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e6_queue.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e6_queue.gridx = 11;
		gbc_tf_e6_queue.gridy = 11;
		add(tf_e6_queue, gbc_tf_e6_queue);
		tf_e6_queue.setColumns(10);
		
		JLabel lblNewLabel_47 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_47 = new GridBagConstraints();
		gbc_lblNewLabel_47.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_47.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_47.gridx = 12;
		gbc_lblNewLabel_47.gridy = 11;
		add(lblNewLabel_47, gbc_lblNewLabel_47);
		
		tf_e6_progress = new JTextField();
		tf_e6_progress.setText("");
		GridBagConstraints gbc_tf_e6_progress = new GridBagConstraints();
		gbc_tf_e6_progress.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e6_progress.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e6_progress.gridx = 13;
		gbc_tf_e6_progress.gridy = 11;
		add(tf_e6_progress, gbc_tf_e6_progress);
		tf_e6_progress.setColumns(10);
		
		JLabel lblNewLabel_59 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_59 = new GridBagConstraints();
		gbc_lblNewLabel_59.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_59.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_59.gridx = 14;
		gbc_lblNewLabel_59.gridy = 11;
		add(lblNewLabel_59, gbc_lblNewLabel_59);
		
		tf_e6_order = new JTextField();
		tf_e6_order.setText("");
		GridBagConstraints gbc_tf_e6_order = new GridBagConstraints();
		gbc_tf_e6_order.insets = new Insets(0, 0, 5, 0);
		gbc_tf_e6_order.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e6_order.gridx = 15;
		gbc_tf_e6_order.gridy = 11;
		add(tf_e6_order, gbc_tf_e6_order);
		tf_e6_order.setColumns(10);
		
		JLabel lblE_6 = new JLabel(e7);
		GridBagConstraints gbc_lblE_6 = new GridBagConstraints();
		gbc_lblE_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_6.gridx = 1;
		gbc_lblE_6.gridy = 12;
		add(lblE_6, gbc_lblE_6);
		
		tf_e7_wish = new JTextField();
		tf_e7_wish.setText("");
		GridBagConstraints gbc_tf_e7_wish = new GridBagConstraints();
		gbc_tf_e7_wish.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e7_wish.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e7_wish.gridx = 3;
		gbc_tf_e7_wish.gridy = 12;
		add(tf_e7_wish, gbc_tf_e7_wish);
		tf_e7_wish.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 4;
		gbc_lblNewLabel_6.gridy = 12;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		tf_e7_previousWaiting = new JTextField();
		tf_e7_previousWaiting.setText("");
		GridBagConstraints gbc_tf_e7_previousWaiting = new GridBagConstraints();
		gbc_tf_e7_previousWaiting.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e7_previousWaiting.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e7_previousWaiting.gridx = 5;
		gbc_tf_e7_previousWaiting.gridy = 12;
		add(tf_e7_previousWaiting, gbc_tf_e7_previousWaiting);
		tf_e7_previousWaiting.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 6;
		gbc_lblNewLabel_14.gridy = 12;
		add(lblNewLabel_14, gbc_lblNewLabel_14);
		
		tf_e7_reserve = new JTextField();
		GridBagConstraints gbc_tf_e7_reserve = new GridBagConstraints();
		gbc_tf_e7_reserve.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e7_reserve.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e7_reserve.gridx = 7;
		gbc_tf_e7_reserve.gridy = 12;
		add(tf_e7_reserve, gbc_tf_e7_reserve);
		tf_e7_reserve.setColumns(10);
		
		JLabel lblNewLabel_24 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_24 = new GridBagConstraints();
		gbc_lblNewLabel_24.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_24.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_24.gridx = 8;
		gbc_lblNewLabel_24.gridy = 12;
		add(lblNewLabel_24, gbc_lblNewLabel_24);
		
		tf_e7_stock = new JTextField();
		tf_e7_stock.setText("");
		GridBagConstraints gbc_tf_e7_stock = new GridBagConstraints();
		gbc_tf_e7_stock.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e7_stock.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e7_stock.gridx = 9;
		gbc_tf_e7_stock.gridy = 12;
		add(tf_e7_stock, gbc_tf_e7_stock);
		tf_e7_stock.setColumns(10);
		
		JLabel lblNewLabel_36 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_36 = new GridBagConstraints();
		gbc_lblNewLabel_36.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_36.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_36.gridx = 10;
		gbc_lblNewLabel_36.gridy = 12;
		add(lblNewLabel_36, gbc_lblNewLabel_36);
		
		tf_e7_queue = new JTextField();
		tf_e7_queue.setText("");
		GridBagConstraints gbc_tf_e7_queue = new GridBagConstraints();
		gbc_tf_e7_queue.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e7_queue.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e7_queue.gridx = 11;
		gbc_tf_e7_queue.gridy = 12;
		add(tf_e7_queue, gbc_tf_e7_queue);
		tf_e7_queue.setColumns(10);
		
		JLabel lblNewLabel_48 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_48 = new GridBagConstraints();
		gbc_lblNewLabel_48.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_48.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_48.gridx = 12;
		gbc_lblNewLabel_48.gridy = 12;
		add(lblNewLabel_48, gbc_lblNewLabel_48);
		
		tf_e7_progress = new JTextField();
		GridBagConstraints gbc_tf_e7_progress = new GridBagConstraints();
		gbc_tf_e7_progress.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e7_progress.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e7_progress.gridx = 13;
		gbc_tf_e7_progress.gridy = 12;
		add(tf_e7_progress, gbc_tf_e7_progress);
		tf_e7_progress.setColumns(10);
		
		JLabel lblNewLabel_60 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_60 = new GridBagConstraints();
		gbc_lblNewLabel_60.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_60.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_60.gridx = 14;
		gbc_lblNewLabel_60.gridy = 12;
		add(lblNewLabel_60, gbc_lblNewLabel_60);
		
		tf_e7_order = new JTextField();
		tf_e7_order.setText("");
		GridBagConstraints gbc_tf_e7_order = new GridBagConstraints();
		gbc_tf_e7_order.insets = new Insets(0, 0, 5, 0);
		gbc_tf_e7_order.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e7_order.gridx = 15;
		gbc_tf_e7_order.gridy = 12;
		add(tf_e7_order, gbc_tf_e7_order);
		tf_e7_order.setColumns(10);
		
		JLabel lblE_7 = new JLabel(e8);
		GridBagConstraints gbc_lblE_7 = new GridBagConstraints();
		gbc_lblE_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_7.gridx = 1;
		gbc_lblE_7.gridy = 13;
		add(lblE_7, gbc_lblE_7);
		
		tf_e8_wish = new JTextField();
		tf_e8_wish.setText("");
		GridBagConstraints gbc_tf_e8_wish = new GridBagConstraints();
		gbc_tf_e8_wish.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e8_wish.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e8_wish.gridx = 3;
		gbc_tf_e8_wish.gridy = 13;
		add(tf_e8_wish, gbc_tf_e8_wish);
		tf_e8_wish.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 4;
		gbc_lblNewLabel_7.gridy = 13;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		tf_e8_previousWaiting = new JTextField();
		tf_e8_previousWaiting.setText("");
		GridBagConstraints gbc_tf_e8_previousWaiting = new GridBagConstraints();
		gbc_tf_e8_previousWaiting.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e8_previousWaiting.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e8_previousWaiting.gridx = 5;
		gbc_tf_e8_previousWaiting.gridy = 13;
		add(tf_e8_previousWaiting, gbc_tf_e8_previousWaiting);
		tf_e8_previousWaiting.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15.gridx = 6;
		gbc_lblNewLabel_15.gridy = 13;
		add(lblNewLabel_15, gbc_lblNewLabel_15);
		
		tf_e8_reserve = new JTextField();
		tf_e8_reserve.setText("");
		GridBagConstraints gbc_tf_e8_reserve = new GridBagConstraints();
		gbc_tf_e8_reserve.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e8_reserve.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e8_reserve.gridx = 7;
		gbc_tf_e8_reserve.gridy = 13;
		add(tf_e8_reserve, gbc_tf_e8_reserve);
		tf_e8_reserve.setColumns(10);
		
		JLabel lblNewLabel_25 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_25 = new GridBagConstraints();
		gbc_lblNewLabel_25.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_25.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_25.gridx = 8;
		gbc_lblNewLabel_25.gridy = 13;
		add(lblNewLabel_25, gbc_lblNewLabel_25);
		
		tf_e8_stock = new JTextField();
		tf_e8_stock.setText("");
		GridBagConstraints gbc_tf_e8_stock = new GridBagConstraints();
		gbc_tf_e8_stock.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e8_stock.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e8_stock.gridx = 9;
		gbc_tf_e8_stock.gridy = 13;
		add(tf_e8_stock, gbc_tf_e8_stock);
		tf_e8_stock.setColumns(10);
		
		JLabel lblNewLabel_37 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_37 = new GridBagConstraints();
		gbc_lblNewLabel_37.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_37.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_37.gridx = 10;
		gbc_lblNewLabel_37.gridy = 13;
		add(lblNewLabel_37, gbc_lblNewLabel_37);
		
		tf_e8_queue = new JTextField();
		GridBagConstraints gbc_tf_e8_queue = new GridBagConstraints();
		gbc_tf_e8_queue.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e8_queue.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e8_queue.gridx = 11;
		gbc_tf_e8_queue.gridy = 13;
		add(tf_e8_queue, gbc_tf_e8_queue);
		tf_e8_queue.setColumns(10);
		
		JLabel lblNewLabel_50 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_50 = new GridBagConstraints();
		gbc_lblNewLabel_50.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_50.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_50.gridx = 12;
		gbc_lblNewLabel_50.gridy = 13;
		add(lblNewLabel_50, gbc_lblNewLabel_50);
		
		tf_e8_progress = new JTextField();
		tf_e8_progress.setText("");
		GridBagConstraints gbc_tf_e8_progress = new GridBagConstraints();
		gbc_tf_e8_progress.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e8_progress.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e8_progress.gridx = 13;
		gbc_tf_e8_progress.gridy = 13;
		add(tf_e8_progress, gbc_tf_e8_progress);
		tf_e8_progress.setColumns(10);
		
		JLabel lblNewLabel_61 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_61 = new GridBagConstraints();
		gbc_lblNewLabel_61.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_61.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_61.gridx = 14;
		gbc_lblNewLabel_61.gridy = 13;
		add(lblNewLabel_61, gbc_lblNewLabel_61);
		
		tf_e8_order = new JTextField();
		tf_e8_order.setText("");
		GridBagConstraints gbc_tf_e8_order = new GridBagConstraints();
		gbc_tf_e8_order.insets = new Insets(0, 0, 5, 0);
		gbc_tf_e8_order.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e8_order.gridx = 15;
		gbc_tf_e8_order.gridy = 13;
		add(tf_e8_order, gbc_tf_e8_order);
		tf_e8_order.setColumns(10);
		
		JLabel lblE_8 = new JLabel(e9);
		GridBagConstraints gbc_lblE_8 = new GridBagConstraints();
		gbc_lblE_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_8.gridx = 1;
		gbc_lblE_8.gridy = 15;
		add(lblE_8, gbc_lblE_8);
		
		tf_e9_wish = new JTextField();
		tf_e9_wish.setText("");
		GridBagConstraints gbc_tf_e9_wish = new GridBagConstraints();
		gbc_tf_e9_wish.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e9_wish.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e9_wish.gridx = 3;
		gbc_tf_e9_wish.gridy = 15;
		add(tf_e9_wish, gbc_tf_e9_wish);
		tf_e9_wish.setColumns(10);
		
		JLabel lblNewLabel_161 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_161 = new GridBagConstraints();
		gbc_lblNewLabel_161.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_161.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_161.gridx = 4;
		gbc_lblNewLabel_161.gridy = 15;
		add(lblNewLabel_161, gbc_lblNewLabel_161);
		
		tf_e9_previousWaiting = new JTextField();
		GridBagConstraints gbc_tf_e9_previousWaiting = new GridBagConstraints();
		gbc_tf_e9_previousWaiting.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e9_previousWaiting.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e9_previousWaiting.gridx = 5;
		gbc_tf_e9_previousWaiting.gridy = 15;
		add(tf_e9_previousWaiting, gbc_tf_e9_previousWaiting);
		tf_e9_previousWaiting.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 6;
		gbc_lblNewLabel_16.gridy = 15;
		add(lblNewLabel_16, gbc_lblNewLabel_16);
		
		tf_e9_reserve = new JTextField();
		tf_e9_reserve.setText("");
		GridBagConstraints gbc_tf_e9_reserve = new GridBagConstraints();
		gbc_tf_e9_reserve.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e9_reserve.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e9_reserve.gridx = 7;
		gbc_tf_e9_reserve.gridy = 15;
		add(tf_e9_reserve, gbc_tf_e9_reserve);
		tf_e9_reserve.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_26 = new GridBagConstraints();
		gbc_lblNewLabel_26.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_26.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_26.gridx = 8;
		gbc_lblNewLabel_26.gridy = 15;
		add(lblNewLabel_26, gbc_lblNewLabel_26);
		
		tf_e9_stock = new JTextField();
		tf_e9_stock.setText("");
		GridBagConstraints gbc_tf_e9_stock = new GridBagConstraints();
		gbc_tf_e9_stock.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e9_stock.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e9_stock.gridx = 9;
		gbc_tf_e9_stock.gridy = 15;
		add(tf_e9_stock, gbc_tf_e9_stock);
		tf_e9_stock.setColumns(10);
		
		JLabel lblNewLabel_38 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_38 = new GridBagConstraints();
		gbc_lblNewLabel_38.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_38.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_38.gridx = 10;
		gbc_lblNewLabel_38.gridy = 15;
		add(lblNewLabel_38, gbc_lblNewLabel_38);
		
		tf_e9_queue = new JTextField();
		tf_e9_queue.setText("");
		GridBagConstraints gbc_tf_e9_queue = new GridBagConstraints();
		gbc_tf_e9_queue.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e9_queue.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e9_queue.gridx = 11;
		gbc_tf_e9_queue.gridy = 15;
		add(tf_e9_queue, gbc_tf_e9_queue);
		tf_e9_queue.setColumns(10);
		
		JLabel lblNewLabel_49 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_49 = new GridBagConstraints();
		gbc_lblNewLabel_49.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_49.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_49.gridx = 12;
		gbc_lblNewLabel_49.gridy = 15;
		add(lblNewLabel_49, gbc_lblNewLabel_49);
		
		tf_e9_progress = new JTextField();
		tf_e9_progress.setText("");
		GridBagConstraints gbc_tf_e9_progress = new GridBagConstraints();
		gbc_tf_e9_progress.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e9_progress.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e9_progress.gridx = 13;
		gbc_tf_e9_progress.gridy = 15;
		add(tf_e9_progress, gbc_tf_e9_progress);
		tf_e9_progress.setColumns(10);
		
		JLabel lblNewLabel_62 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_62 = new GridBagConstraints();
		gbc_lblNewLabel_62.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_62.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_62.gridx = 14;
		gbc_lblNewLabel_62.gridy = 15;
		add(lblNewLabel_62, gbc_lblNewLabel_62);
		
		tf_e9_order = new JTextField();
		tf_e9_order.setText("");
		GridBagConstraints gbc_tf_e9_order = new GridBagConstraints();
		gbc_tf_e9_order.insets = new Insets(0, 0, 5, 0);
		gbc_tf_e9_order.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e9_order.gridx = 15;
		gbc_tf_e9_order.gridy = 15;
		add(tf_e9_order, gbc_tf_e9_order);
		tf_e9_order.setColumns(10);
		
		JLabel lblE_9 = new JLabel(e10);
		GridBagConstraints gbc_lblE_9 = new GridBagConstraints();
		gbc_lblE_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblE_9.gridx = 1;
		gbc_lblE_9.gridy = 16;
		add(lblE_9, gbc_lblE_9);
		
		tf_e10_wish = new JTextField();
		tf_e10_wish.setText("");
		GridBagConstraints gbc_tf_e10_wish = new GridBagConstraints();
		gbc_tf_e10_wish.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e10_wish.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e10_wish.gridx = 3;
		gbc_tf_e10_wish.gridy = 16;
		add(tf_e10_wish, gbc_tf_e10_wish);
		tf_e10_wish.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 4;
		gbc_lblNewLabel_8.gridy = 16;
		add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		tf_e10_previousWaiting = new JTextField();
		tf_e10_previousWaiting.setText("");
		GridBagConstraints gbc_tf_e10_previousWaiting = new GridBagConstraints();
		gbc_tf_e10_previousWaiting.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e10_previousWaiting.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e10_previousWaiting.gridx = 5;
		gbc_tf_e10_previousWaiting.gridy = 16;
		add(tf_e10_previousWaiting, gbc_tf_e10_previousWaiting);
		tf_e10_previousWaiting.setColumns(10);
		
		JLabel label_4 = new JLabel("+");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 6;
		gbc_label_4.gridy = 16;
		add(label_4, gbc_label_4);
		
		tf_e10_reserve = new JTextField();
		tf_e10_reserve.setText("");
		GridBagConstraints gbc_tf_e10_reserve = new GridBagConstraints();
		gbc_tf_e10_reserve.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e10_reserve.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e10_reserve.gridx = 7;
		gbc_tf_e10_reserve.gridy = 16;
		add(tf_e10_reserve, gbc_tf_e10_reserve);
		tf_e10_reserve.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_27 = new GridBagConstraints();
		gbc_lblNewLabel_27.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_27.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_27.gridx = 8;
		gbc_lblNewLabel_27.gridy = 16;
		add(lblNewLabel_27, gbc_lblNewLabel_27);
		
		tf_e10_stock = new JTextField();
		tf_e10_stock.setText("");
		GridBagConstraints gbc_tf_e10_stock = new GridBagConstraints();
		gbc_tf_e10_stock.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e10_stock.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e10_stock.gridx = 9;
		gbc_tf_e10_stock.gridy = 16;
		add(tf_e10_stock, gbc_tf_e10_stock);
		tf_e10_stock.setColumns(10);
		
		JLabel lblNewLabel_39 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_39 = new GridBagConstraints();
		gbc_lblNewLabel_39.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_39.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_39.gridx = 10;
		gbc_lblNewLabel_39.gridy = 16;
		add(lblNewLabel_39, gbc_lblNewLabel_39);
		
		tf_e10_queue = new JTextField();
		tf_e10_queue.setText("");
		GridBagConstraints gbc_tf_e10_queue = new GridBagConstraints();
		gbc_tf_e10_queue.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e10_queue.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e10_queue.gridx = 11;
		gbc_tf_e10_queue.gridy = 16;
		add(tf_e10_queue, gbc_tf_e10_queue);
		tf_e10_queue.setColumns(10);
		
		JLabel lblNewLabel_51 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_51 = new GridBagConstraints();
		gbc_lblNewLabel_51.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_51.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_51.gridx = 12;
		gbc_lblNewLabel_51.gridy = 16;
		add(lblNewLabel_51, gbc_lblNewLabel_51);
		
		tf_e10_progress = new JTextField();
		tf_e10_progress.setText("");
		GridBagConstraints gbc_tf_e10_progress = new GridBagConstraints();
		gbc_tf_e10_progress.insets = new Insets(0, 0, 5, 5);
		gbc_tf_e10_progress.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e10_progress.gridx = 13;
		gbc_tf_e10_progress.gridy = 16;
		add(tf_e10_progress, gbc_tf_e10_progress);
		tf_e10_progress.setColumns(10);
		
		JLabel lblNewLabel_63 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_63 = new GridBagConstraints();
		gbc_lblNewLabel_63.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_63.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_63.gridx = 14;
		gbc_lblNewLabel_63.gridy = 16;
		add(lblNewLabel_63, gbc_lblNewLabel_63);
		
		tf_e10_order = new JTextField();
		tf_e10_order.setText("");
		GridBagConstraints gbc_tf_e10_order = new GridBagConstraints();
		gbc_tf_e10_order.insets = new Insets(0, 0, 5, 0);
		gbc_tf_e10_order.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e10_order.gridx = 15;
		gbc_tf_e10_order.gridy = 16;
		add(tf_e10_order, gbc_tf_e10_order);
		tf_e10_order.setColumns(10);
		
		JLabel lblE_10 = new JLabel(e11);
		GridBagConstraints gbc_lblE_10 = new GridBagConstraints();
		gbc_lblE_10.insets = new Insets(0, 0, 0, 5);
		gbc_lblE_10.gridx = 1;
		gbc_lblE_10.gridy = 17;
		add(lblE_10, gbc_lblE_10);
		
		tf_e11_wish = new JTextField();
		tf_e11_wish.setText("");
		GridBagConstraints gbc_tf_e11_wish = new GridBagConstraints();
		gbc_tf_e11_wish.insets = new Insets(0, 0, 0, 5);
		gbc_tf_e11_wish.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e11_wish.gridx = 3;
		gbc_tf_e11_wish.gridy = 17;
		add(tf_e11_wish, gbc_tf_e11_wish);
		tf_e11_wish.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("+");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9.gridx = 4;
		gbc_lblNewLabel_9.gridy = 17;
		add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		tf_e11_previousWaiting = new JTextField();
		tf_e11_previousWaiting.setText("");
		GridBagConstraints gbc_tf_e11_previousWaiting = new GridBagConstraints();
		gbc_tf_e11_previousWaiting.insets = new Insets(0, 0, 0, 5);
		gbc_tf_e11_previousWaiting.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e11_previousWaiting.gridx = 5;
		gbc_tf_e11_previousWaiting.gridy = 17;
		add(tf_e11_previousWaiting, gbc_tf_e11_previousWaiting);
		tf_e11_previousWaiting.setColumns(10);
		
		JLabel label_1 = new JLabel("+");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 6;
		gbc_label_1.gridy = 17;
		add(label_1, gbc_label_1);
		
		tf_e11_reserve = new JTextField();
		tf_e11_reserve.setText("");
		GridBagConstraints gbc_tf_e11_reserve = new GridBagConstraints();
		gbc_tf_e11_reserve.insets = new Insets(0, 0, 0, 5);
		gbc_tf_e11_reserve.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e11_reserve.gridx = 7;
		gbc_tf_e11_reserve.gridy = 17;
		add(tf_e11_reserve, gbc_tf_e11_reserve);
		tf_e11_reserve.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_28 = new GridBagConstraints();
		gbc_lblNewLabel_28.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_28.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_28.gridx = 8;
		gbc_lblNewLabel_28.gridy = 17;
		add(lblNewLabel_28, gbc_lblNewLabel_28);
		
		tf_e11_stock = new JTextField();
		tf_e11_stock.setText("");
		GridBagConstraints gbc_tf_e11_stock = new GridBagConstraints();
		gbc_tf_e11_stock.insets = new Insets(0, 0, 0, 5);
		gbc_tf_e11_stock.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e11_stock.gridx = 9;
		gbc_tf_e11_stock.gridy = 17;
		add(tf_e11_stock, gbc_tf_e11_stock);
		tf_e11_stock.setColumns(10);
		
		JLabel lblNewLabel_40 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_40 = new GridBagConstraints();
		gbc_lblNewLabel_40.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_40.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_40.gridx = 10;
		gbc_lblNewLabel_40.gridy = 17;
		add(lblNewLabel_40, gbc_lblNewLabel_40);
		
		tf_e11_queue = new JTextField();
		tf_e11_queue.setText("");
		GridBagConstraints gbc_tf_e11_queue = new GridBagConstraints();
		gbc_tf_e11_queue.insets = new Insets(0, 0, 0, 5);
		gbc_tf_e11_queue.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e11_queue.gridx = 11;
		gbc_tf_e11_queue.gridy = 17;
		add(tf_e11_queue, gbc_tf_e11_queue);
		tf_e11_queue.setColumns(10);
		
		JLabel lblNewLabel_52 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_52 = new GridBagConstraints();
		gbc_lblNewLabel_52.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_52.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_52.gridx = 12;
		gbc_lblNewLabel_52.gridy = 17;
		add(lblNewLabel_52, gbc_lblNewLabel_52);
		
		tf_e11_progress = new JTextField();
		tf_e11_progress.setText("");
		GridBagConstraints gbc_tf_e11_progress = new GridBagConstraints();
		gbc_tf_e11_progress.insets = new Insets(0, 0, 0, 5);
		gbc_tf_e11_progress.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e11_progress.gridx = 13;
		gbc_tf_e11_progress.gridy = 17;
		add(tf_e11_progress, gbc_tf_e11_progress);
		tf_e11_progress.setColumns(10);
		
		JLabel lblNewLabel_64 = new JLabel("=");
		GridBagConstraints gbc_lblNewLabel_64 = new GridBagConstraints();
		gbc_lblNewLabel_64.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_64.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_64.gridx = 14;
		gbc_lblNewLabel_64.gridy = 17;
		add(lblNewLabel_64, gbc_lblNewLabel_64);
		
		tf_e11_order = new JTextField();
		tf_e11_order.setText("");
		GridBagConstraints gbc_tf_e11_order = new GridBagConstraints();
		gbc_tf_e11_order.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_e11_order.gridx = 15;
		gbc_tf_e11_order.gridy = 17;
		add(tf_e11_order, gbc_tf_e11_order);
		tf_e11_order.setColumns(10);
		
		/*
		 * calculation
		 */
		calculateValues();
	}
	
	private void calculateValues() {
		int result;
		//calculate p
		result = Integer.parseInt(this.tf_p_wish.getText()) + Integer.parseInt(this.tf_p_reserve.getText())
				- Integer.parseInt(this.tf_p_stock.getText()) - Integer.parseInt(this.tf_p_queue.getText())
				- Integer.parseInt(this.tf_p_progress.getText());
		this.tf_p_order.setText(String.valueOf(result));
		
		//calculate e1
		result = Integer.parseInt(this.tf_e1_wish.getText()) + Integer.parseInt(this.tf_e1_previousWaiting.getText())
				+ Integer.parseInt(this.tf_e1_reserve.getText()) - Integer.parseInt(this.tf_e1_stock.getText())
				- Integer.parseInt(this.tf_e1_queue.getText()) - Integer.parseInt(this.tf_e1_progress.getText());
		this.tf_p_order.setText(String.valueOf(result));
		
		// calculate e2
		result = Integer.parseInt(this.tf_e2_wish.getText()) + Integer.parseInt(this.tf_e2_previousWaiting.getText())
				+ Integer.parseInt(this.tf_e2_reserve.getText()) - Integer.parseInt(this.tf_e2_stock.getText())
				- Integer.parseInt(this.tf_e2_queue.getText()) - Integer.parseInt(this.tf_e2_progress.getText());
		this.tf_p_order.setText(String.valueOf(result));

		// calculate e3
		result = Integer.parseInt(this.tf_e3_wish.getText()) + Integer.parseInt(this.tf_e3_previousWaiting.getText())
				+ Integer.parseInt(this.tf_e3_reserve.getText()) - Integer.parseInt(this.tf_e3_stock.getText())
				- Integer.parseInt(this.tf_e3_queue.getText()) - Integer.parseInt(this.tf_e3_progress.getText());
		this.tf_p_order.setText(String.valueOf(result));

		// calculate e4
		result = Integer.parseInt(this.tf_e4_wish.getText()) + Integer.parseInt(this.tf_e4_previousWaiting.getText())
				+ Integer.parseInt(this.tf_e4_reserve.getText()) - Integer.parseInt(this.tf_e4_stock.getText())
				- Integer.parseInt(this.tf_e4_queue.getText()) - Integer.parseInt(this.tf_e4_progress.getText());
		this.tf_p_order.setText(String.valueOf(result));

		// calculate e5
		result = Integer.parseInt(this.tf_e5_wish.getText()) + Integer.parseInt(this.tf_e5_previousWaiting.getText())
				+ Integer.parseInt(this.tf_e5_reserve.getText()) - Integer.parseInt(this.tf_e5_stock.getText())
				- Integer.parseInt(this.tf_e5_queue.getText()) - Integer.parseInt(this.tf_e5_progress.getText());
		this.tf_p_order.setText(String.valueOf(result));

		// calculate e6
		result = Integer.parseInt(this.tf_e6_wish.getText()) + Integer.parseInt(this.tf_e6_previousWaiting.getText())
				+ Integer.parseInt(this.tf_e6_reserve.getText()) - Integer.parseInt(this.tf_e6_stock.getText())
				- Integer.parseInt(this.tf_e6_queue.getText()) - Integer.parseInt(this.tf_e6_progress.getText());
		this.tf_p_order.setText(String.valueOf(result));

		// calculate e7
		result = Integer.parseInt(this.tf_e7_wish.getText()) + Integer.parseInt(this.tf_e7_previousWaiting.getText())
				+ Integer.parseInt(this.tf_e7_reserve.getText()) - Integer.parseInt(this.tf_e7_stock.getText())
				- Integer.parseInt(this.tf_e7_queue.getText()) - Integer.parseInt(this.tf_e7_progress.getText());
		this.tf_p_order.setText(String.valueOf(result));

		// calculate e8
		result = Integer.parseInt(this.tf_e8_wish.getText()) + Integer.parseInt(this.tf_e8_previousWaiting.getText())
				+ Integer.parseInt(this.tf_e8_reserve.getText()) - Integer.parseInt(this.tf_e8_stock.getText())
				- Integer.parseInt(this.tf_e8_queue.getText()) - Integer.parseInt(this.tf_e8_progress.getText());
		this.tf_p_order.setText(String.valueOf(result));

		// calculate e9
		result = Integer.parseInt(this.tf_e9_wish.getText()) + Integer.parseInt(this.tf_e9_previousWaiting.getText())
				+ Integer.parseInt(this.tf_e9_reserve.getText()) - Integer.parseInt(this.tf_e9_stock.getText())
				- Integer.parseInt(this.tf_e9_queue.getText()) - Integer.parseInt(this.tf_e9_progress.getText());
		this.tf_p_order.setText(String.valueOf(result));

		// calculate e10
		result = Integer.parseInt(this.tf_e10_wish.getText()) + Integer.parseInt(this.tf_e10_previousWaiting.getText())
				+ Integer.parseInt(this.tf_e10_reserve.getText()) - Integer.parseInt(this.tf_e10_stock.getText())
				- Integer.parseInt(this.tf_e10_queue.getText()) - Integer.parseInt(this.tf_e10_progress.getText());
		this.tf_p_order.setText(String.valueOf(result));

		// calculate e11
		result = Integer.parseInt(this.tf_e11_wish.getText()) + Integer.parseInt(this.tf_e11_previousWaiting.getText())
				+ Integer.parseInt(this.tf_e11_reserve.getText()) - Integer.parseInt(this.tf_e11_stock.getText())
				- Integer.parseInt(this.tf_e11_queue.getText()) - Integer.parseInt(this.tf_e11_progress.getText());
		this.tf_p_order.setText(String.valueOf(result));
	}

}
