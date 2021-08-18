package RestaurantManagemkent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class MoneyReceipt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoneyReceipt frame = new MoneyReceipt();
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
	public MoneyReceipt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 5, 600, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 0, 565, 742);
		contentPane.add(panel);
		
		JLabel label = new JLabel("");
		label.setText("Name:"+Main.name);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 10, 355, 25);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setText("Phone number: "+Main.phone);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(10, 35, 355, 25);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setText("Table: "+Main.table);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(10, 60, 355, 25);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("================================================================================");
		label_3.setBounds(0, 82, 565, 14);
		panel.add(label_3);
		
		JLabel label_name = new JLabel("Name");
		label_name.setBounds(10, 95, 125, 30);
		panel.add(label_name);
		
		JLabel lable_rate = new JLabel("Rate");
		lable_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		lable_rate.setBounds(280, 95, 85, 25);
		panel.add(lable_rate);
		
		JLabel label_qty = new JLabel("Qty");
		label_qty.setHorizontalAlignment(SwingConstants.CENTER);
		label_qty.setBounds(385, 95, 70, 25);
		panel.add(label_qty);
		
		JLabel lable_price = new JLabel("Price");
		lable_price.setBounds(485, 95, 70, 25);
		panel.add(lable_price);
		
		JLabel row_1_name = new JLabel("");
		row_1_name.setBounds(10, 130, 155, 25);
		panel.add(row_1_name);
		
		JLabel row_1_rate = new JLabel("");
		row_1_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		
		row_1_rate.setBounds(280, 130, 85, 25);
		panel.add(row_1_rate);
		
		JLabel row_1_qty = new JLabel("");
		row_1_qty.setHorizontalAlignment(SwingConstants.CENTER);
		
		row_1_qty.setBounds(395, 130, 70, 25);
		panel.add(row_1_qty);
		
		JLabel row_1_price = new JLabel("");
		row_1_price.setBounds(485, 130, 70, 25);
		panel.add(row_1_price);
		
		JLabel row_1_type = new JLabel("");
		
		row_1_type.setBounds(175, 130, 60, 25);
		panel.add(row_1_type);
		
		JLabel row_2_name = new JLabel("");
		row_2_name.setBounds(10, 160, 155, 25);
		panel.add(row_2_name);
		
		JLabel row_2_type = new JLabel("");
		row_2_type.setBounds(175, 160, 60, 25);
		panel.add(row_2_type);
		
		JLabel row_2_rate = new JLabel("");
		row_2_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_2_rate.setBounds(280, 160, 85, 25);
		panel.add(row_2_rate);
		
		JLabel row_2_qty = new JLabel("");
		row_2_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_2_qty.setBounds(395, 160, 70, 25);
		panel.add(row_2_qty);
		
		JLabel row_2_price = new JLabel("");
		row_2_price.setBounds(485, 160, 70, 25);
		panel.add(row_2_price);
		
		JLabel row_3_name = new JLabel("");
		row_3_name.setBounds(10, 190, 155, 25);
		panel.add(row_3_name);
		
		JLabel row_3_type = new JLabel("");
		row_3_type.setBounds(175, 190, 60, 25);
		panel.add(row_3_type);
		
		JLabel row_3_rate = new JLabel("");
		row_3_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_3_rate.setBounds(280, 190, 85, 25);
		panel.add(row_3_rate);
		
		JLabel row_3_qty = new JLabel("");
		row_3_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_3_qty.setBounds(395, 190, 70, 25);
		panel.add(row_3_qty);
		
		JLabel row_3_price = new JLabel("");
		row_3_price.setBounds(485, 190, 70, 25);
		panel.add(row_3_price);
		
		JLabel row_4_name = new JLabel("");
		row_4_name.setBounds(10, 220, 155, 25);
		panel.add(row_4_name);
		
		JLabel row_4_type = new JLabel("");
		row_4_type.setBounds(175, 220, 60, 25);
		panel.add(row_4_type);
		
		JLabel row_4_rate = new JLabel("");
		row_4_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_4_rate.setBounds(280, 220, 85, 25);
		panel.add(row_4_rate);
		
		JLabel row_4_qty = new JLabel("");
		row_4_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_4_qty.setBounds(395, 220, 70, 25);
		panel.add(row_4_qty);
		
		JLabel row_4_price = new JLabel("");
		row_4_price.setBounds(485, 220, 70, 25);
		panel.add(row_4_price);
		
		JLabel row_5_price = new JLabel("");
		row_5_price.setBounds(485, 250, 70, 25);
		panel.add(row_5_price);
		
		JLabel row_5_name = new JLabel("");
		row_5_name.setBounds(10, 250, 155, 25);
		panel.add(row_5_name);
		
		JLabel row_5_type = new JLabel("");
		row_5_type.setBounds(175, 250, 60, 25);
		panel.add(row_5_type);
		
		JLabel row_5_rate = new JLabel("");
		row_5_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_5_rate.setBounds(280, 250, 85, 25);
		panel.add(row_5_rate);
		
		JLabel row_5_qty = new JLabel("");
		row_5_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_5_qty.setBounds(395, 250, 70, 25);
		panel.add(row_5_qty);
		
		JLabel row_6_price = new JLabel("");
		row_6_price.setBounds(485, 280, 70, 25);
		panel.add(row_6_price);
		
		JLabel row_6_name = new JLabel("");
		row_6_name.setBounds(10, 280, 155, 25);
		panel.add(row_6_name);
		
		JLabel row_6_type = new JLabel("");
		row_6_type.setBounds(175, 280, 60, 25);
		panel.add(row_6_type);
		
		JLabel row_6_rate = new JLabel("");
		row_6_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_6_rate.setBounds(280, 280, 85, 25);
		panel.add(row_6_rate);
		
		JLabel row_6_qty = new JLabel("");
		row_6_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_6_qty.setBounds(395, 280, 70, 25);
		panel.add(row_6_qty);
		
		JLabel row_7_price = new JLabel("");
		row_7_price.setBounds(485, 310, 70, 25);
		panel.add(row_7_price);
		
		JLabel row_7_name = new JLabel("");
		row_7_name.setBounds(10, 310, 155, 25);
		panel.add(row_7_name);
		
		JLabel row_7_type = new JLabel("");
		row_7_type.setBounds(175, 310, 60, 25);
		panel.add(row_7_type);
		
		JLabel row_7_rate = new JLabel("");
		row_7_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_7_rate.setBounds(280, 310, 85, 25);
		panel.add(row_7_rate);
		
		JLabel row_7_qty = new JLabel("");
		row_7_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_7_qty.setBounds(395, 310, 70, 25);
		panel.add(row_7_qty);
		
		JLabel row_8_price = new JLabel("");
		row_8_price.setBounds(485, 340, 70, 25);
		panel.add(row_8_price);
		
		JLabel row_8_name = new JLabel("");
		row_8_name.setBounds(10, 340, 155, 25);
		panel.add(row_8_name);
		
		JLabel row_8_type = new JLabel("");
		row_8_type.setBounds(175, 340, 60, 25);
		panel.add(row_8_type);
		
		JLabel row_8_rate = new JLabel("");
		row_8_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_8_rate.setBounds(280, 340, 85, 25);
		panel.add(row_8_rate);
		
		JLabel row_8_qty = new JLabel("");
		row_8_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_8_qty.setBounds(395, 340, 70, 25);
		panel.add(row_8_qty);
		
		JLabel row_9_price = new JLabel("");
		row_9_price.setBounds(485, 370, 70, 25);
		panel.add(row_9_price);
		
		JLabel row_9_name = new JLabel("");
		row_9_name.setBounds(10, 370, 155, 25);
		panel.add(row_9_name);
		
		JLabel row_9_type = new JLabel("");
		row_9_type.setBounds(175, 370, 60, 25);
		panel.add(row_9_type);
		
		JLabel row_9_rate = new JLabel("");
		row_9_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_9_rate.setBounds(280, 370, 85, 25);
		panel.add(row_9_rate);
		
		JLabel row_9_qty = new JLabel("");
		row_9_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_9_qty.setBounds(395, 370, 70, 25);
		panel.add(row_9_qty);
		
		JLabel row_10_price = new JLabel("");
		row_10_price.setBounds(485, 400, 70, 25);
		panel.add(row_10_price);
		
		JLabel row_10_name = new JLabel("");
		row_10_name.setBounds(10, 400, 155, 25);
		panel.add(row_10_name);
		
		JLabel row_10_type = new JLabel("");
		row_10_type.setBounds(175, 400, 60, 25);
		panel.add(row_10_type);
		
		JLabel row_10_rate = new JLabel("");
		row_10_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_10_rate.setBounds(280, 400, 85, 25);
		panel.add(row_10_rate);
		
		JLabel row_10_qty = new JLabel("");
		row_10_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_10_qty.setBounds(395, 400, 70, 25);
		panel.add(row_10_qty);
		
		JLabel row_11_price = new JLabel("");
		row_11_price.setBounds(485, 430, 70, 25);
		panel.add(row_11_price);
		
		JLabel row_11_name = new JLabel("");
		row_11_name.setBounds(10, 430, 155, 25);
		panel.add(row_11_name);
		
		JLabel row_11_type = new JLabel("");
		row_11_type.setBounds(175, 430, 60, 25);
		panel.add(row_11_type);
		
		JLabel row_11_rate = new JLabel("");
		row_11_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_11_rate.setBounds(280, 430, 85, 25);
		panel.add(row_11_rate);
		
		JLabel row_11_qty = new JLabel("");
		row_11_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_11_qty.setBounds(395, 430, 70, 25);
		panel.add(row_11_qty);
		
		JLabel row_12_price = new JLabel("");
		row_12_price.setBounds(485, 460, 70, 25);
		panel.add(row_12_price);
		
		JLabel row_12_name = new JLabel("");
		row_12_name.setBounds(10, 460, 155, 25);
		panel.add(row_12_name);
		
		JLabel row_12_type = new JLabel("");
		row_12_type.setBounds(175, 460, 60, 25);
		panel.add(row_12_type);
		
		JLabel row_12_rate = new JLabel("");
		row_12_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_12_rate.setBounds(280, 460, 85, 25);
		panel.add(row_12_rate);
		
		JLabel row_12_qty = new JLabel("");
		row_12_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_12_qty.setBounds(395, 460, 70, 25);
		panel.add(row_12_qty);
		
		JLabel row_13_price = new JLabel("");
		row_13_price.setBounds(485, 490, 70, 25);
		panel.add(row_13_price);
		
		JLabel row_13_name = new JLabel("");
		row_13_name.setBounds(10, 490, 155, 25);
		panel.add(row_13_name);
		
		JLabel row_13_type = new JLabel("");
		row_13_type.setBounds(175, 490, 60, 25);
		panel.add(row_13_type);
		
		JLabel row_13_rate = new JLabel("");
		row_13_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_13_rate.setBounds(280, 490, 85, 25);
		panel.add(row_13_rate);
		
		JLabel row_13_qty = new JLabel("");
		row_13_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_13_qty.setBounds(395, 490, 70, 25);
		panel.add(row_13_qty);
		
		JLabel row_15_price = new JLabel("");
		row_15_price.setBounds(485, 550, 70, 25);
		panel.add(row_15_price);
		
		JLabel row_14_name = new JLabel("");
		row_14_name.setBounds(10, 520, 155, 25);
		panel.add(row_14_name);
		
		JLabel row_15_type = new JLabel("");
		row_15_type.setBounds(175, 550, 60, 25);
		panel.add(row_15_type);
		
		JLabel row_15_rate = new JLabel("");
		row_15_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_15_rate.setBounds(280, 550, 85, 25);
		panel.add(row_15_rate);
		
		JLabel row_15_qty = new JLabel("");
		row_15_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_15_qty.setBounds(395, 550, 70, 25);
		panel.add(row_15_qty);
		
		JLabel row_16_price = new JLabel("");
		row_16_price.setBounds(485, 580, 70, 25);
		panel.add(row_16_price);
		
		JLabel row_15_name = new JLabel("");
		row_15_name.setBounds(10, 550, 155, 25);
		panel.add(row_15_name);
		
		JLabel row_16_type = new JLabel("");
		row_16_type.setBounds(175, 580, 60, 25);
		panel.add(row_16_type);
		
		JLabel row_16_rate = new JLabel("");
		row_16_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_16_rate.setBounds(280, 580, 85, 25);
		panel.add(row_16_rate);
		
		JLabel row_16_qty = new JLabel("");
		row_16_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_16_qty.setBounds(395, 580, 70, 25);
		panel.add(row_16_qty);
		
		JLabel row_17_price = new JLabel("");
		row_17_price.setBounds(485, 610, 70, 25);
		panel.add(row_17_price);
		
		JLabel row_16_name = new JLabel("");
		row_16_name.setBounds(10, 580, 155, 25);
		panel.add(row_16_name);
		
		JLabel row_17_type = new JLabel("");
		row_17_type.setBounds(175, 610, 60, 25);
		panel.add(row_17_type);
		
		JLabel row_17_rate = new JLabel("");
		row_17_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_17_rate.setBounds(280, 610, 85, 25);
		panel.add(row_17_rate);
		
		JLabel row_17_qty = new JLabel("");
		row_17_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_17_qty.setBounds(395, 610, 70, 25);
		panel.add(row_17_qty);
		
		JLabel row_18_price = new JLabel("");
		row_18_price.setBounds(485, 640, 70, 25);
		panel.add(row_18_price);
		
		JLabel row_17_name = new JLabel("");
		row_17_name.setBounds(10, 610, 155, 25);
		panel.add(row_17_name);
		
		JLabel row_18_type = new JLabel("");
		row_18_type.setBounds(175, 640, 60, 25);
		panel.add(row_18_type);
		
		JLabel row_18_rate = new JLabel("");
		row_18_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_18_rate.setBounds(280, 640, 85, 25);
		panel.add(row_18_rate);
		
		JLabel row_18_qty = new JLabel("");
		row_18_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_18_qty.setBounds(395, 640, 70, 25);
		panel.add(row_18_qty);
		
		JLabel row_19_price = new JLabel("");
		row_19_price.setBounds(485, 670, 70, 25);
		panel.add(row_19_price);
		
		JLabel row_18_name = new JLabel("");
		row_18_name.setBounds(10, 640, 155, 25);
		panel.add(row_18_name);
		
		JLabel row_14_type = new JLabel("");
		row_14_type.setBounds(175, 520, 60, 25);
		panel.add(row_14_type);
		
		JLabel row_19_rate = new JLabel("");
		row_19_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_19_rate.setBounds(280, 670, 85, 25);
		panel.add(row_19_rate);
		
		JLabel row_19_qty = new JLabel("");
		row_19_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_19_qty.setBounds(395, 670, 70, 25);
		panel.add(row_19_qty);
		
		JLabel row_20_price = new JLabel("");
		row_20_price.setBounds(485, 700, 70, 25);
		panel.add(row_20_price);
		
		JLabel row_19_name = new JLabel("");
		row_19_name.setBounds(10, 670, 155, 25);
		panel.add(row_19_name);
		
		JLabel row_20_type = new JLabel("");
		row_20_type.setBounds(175, 700, 60, 25);
		panel.add(row_20_type);
		
		JLabel row_20_rate = new JLabel("");
		row_20_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_20_rate.setBounds(280, 700, 85, 25);
		panel.add(row_20_rate);
		
		JLabel row_20_qty = new JLabel("");
		row_20_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_20_qty.setBounds(395, 700, 70, 25);
		panel.add(row_20_qty);
		
		JLabel row_14_price = new JLabel("");
		row_14_price.setBounds(485, 520, 70, 25);
		panel.add(row_14_price);
		
		JLabel row_20_name = new JLabel("");
		row_20_name.setBounds(10, 700, 155, 25);
		panel.add(row_20_name);
		
		JLabel row_19_type = new JLabel("");
		row_19_type.setBounds(175, 670, 60, 25);
		panel.add(row_19_type);
		
		JLabel row_14_rate = new JLabel("");
		row_14_rate.setHorizontalAlignment(SwingConstants.RIGHT);
		row_14_rate.setBounds(280, 520, 85, 25);
		panel.add(row_14_rate);
		
		JLabel row_14_qty = new JLabel("");
		row_14_qty.setHorizontalAlignment(SwingConstants.CENTER);
		row_14_qty.setBounds(395, 520, 70, 25);
		panel.add(row_14_qty);
		
		JButton btnSr = new JButton("Show Receipt");
		btnSr.setBounds(219, 753, 110, 23);
		contentPane.add(btnSr);
		btnSr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSr.setEnabled(false);
				if(Menu.flag_bb==1) {
					if(Menu.flag_bb_m==1) {
						if(Menu.bb_qty_mint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Beef Burger");
							row_1_type.setText("*regular");
							row_1_rate.setText("300");
							row_1_qty.setText(Menu.bb_qty_m_ins);
							row_1_price.setText(Menu.bb_price_m);
						}
						}
					}
					if(Menu.flag_bb_h==1) {
						if(Menu.bb_qty_hint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Beef Burger");
							row_1_type.setText("*hot");
							row_1_rate.setText("300");
							row_1_qty.setText(Menu.bb_qty_h_ins);
							row_1_price.setText(Menu.bb_price_h);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Beef Burger");
							row_2_type.setText("*hot");
							row_2_rate.setText("300");
							row_2_qty.setText(Menu.bb_qty_h_ins);
							row_2_price.setText(Menu.bb_price_h);
						}
					}}
					if(Menu.flag_bb_s==1) {
						if(Menu.bb_qty_sint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Beef Burger");
							row_1_type.setText("*spicy");
							row_1_rate.setText("300");
							row_1_qty.setText(Menu.bb_qty_s_ins);
							row_1_price.setText(Menu.bb_price_s);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Beef Burger");
							row_2_type.setText("*spicy");
							row_2_rate.setText("300");
							row_2_qty.setText(Menu.bb_qty_s_ins);
							row_2_price.setText(Menu.bb_price_s);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Beef Burger");
							row_3_type.setText("*spicy");
							row_3_rate.setText("300");
							row_3_qty.setText(Menu.bb_qty_s_ins);
							row_3_price.setText(Menu.bb_price_s);
						}
				}
				}}
				//-------------------------------------------------
				if(Menu.flag_bbc==1) {
					if(Menu.flag_bbc_m==1) {
						if(Menu.bbc_qty_mint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Beef Burger Cheese");
							row_1_type.setText("*regular");
							row_1_rate.setText("325");
							row_1_qty.setText(Menu.bbc_qty_m_ins);
							row_1_price.setText(Menu.bbc_price_m);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Beef Burger Cheese");
							row_2_type.setText("*regular");
							row_2_rate.setText("325");
							row_2_qty.setText(Menu.bbc_qty_m_ins);
							row_2_price.setText(Menu.bbc_price_m);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Beef Burger Cheese");
							row_3_type.setText("*regular");
							row_3_rate.setText("325");
							row_3_qty.setText(Menu.bbc_qty_m_ins);
							row_3_price.setText(Menu.bbc_price_m);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Beef Burger Cheese");
							row_4_type.setText("*regular");
							row_4_rate.setText("325");
							row_4_qty.setText(Menu.bbc_qty_m_ins);
							row_4_price.setText(Menu.bbc_price_m);
						}
						
						}
					}
					if(Menu.flag_bbc_h==1) {
						if(Menu.bbc_qty_hint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Beef Burger Cheese");
							row_1_type.setText("*hot");
							row_1_rate.setText("325");
							row_1_qty.setText(Menu.bbc_qty_h_ins);
							row_1_price.setText(Menu.bbc_price_h);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Beef Burger Cheese");
							row_2_type.setText("*hot");
							row_2_rate.setText("325");
							row_2_qty.setText(Menu.bbc_qty_h_ins);
							row_2_price.setText(Menu.bbc_price_h);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Beef Burger Cheese");
							row_3_type.setText("*hot");
							row_3_rate.setText("325");
							row_3_qty.setText(Menu.bbc_qty_h_ins);
							row_3_price.setText(Menu.bbc_price_h);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Beef Burger Cheese");
							row_4_type.setText("*hot");
							row_4_rate.setText("325");
							row_4_qty.setText(Menu.bbc_qty_h_ins);
							row_4_price.setText(Menu.bbc_price_h);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Beef Burger Cheese");
							row_5_type.setText("*hot");
							row_5_rate.setText("325");
							row_5_qty.setText(Menu.bbc_qty_h_ins);
							row_5_price.setText(Menu.bbc_price_h);
						}
					
					}}
					if(Menu.flag_bbc_s==1) {
						if(Menu.bbc_qty_sint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Beef Burger Cheese");
							row_1_type.setText("*spicy");
							row_1_rate.setText("325");
							row_1_qty.setText(Menu.bbc_qty_s_ins);
							row_1_price.setText(Menu.bbc_price_s);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Beef Burger Cheese");
							row_2_type.setText("*spicy");
							row_2_rate.setText("325");
							row_2_qty.setText(Menu.bbc_qty_s_ins);
							row_2_price.setText(Menu.bbc_price_s);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Beef Burger Cheese");
							row_3_type.setText("*spicy");
							row_3_rate.setText("325");
							row_3_qty.setText(Menu.bbc_qty_s_ins);
							row_3_price.setText(Menu.bbc_price_s);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Beef Burger Cheese");
							row_4_type.setText("*spicy");
							row_4_rate.setText("325");
							row_4_qty.setText(Menu.bbc_qty_s_ins);
							row_4_price.setText(Menu.bbc_price_s);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Beef Burger Cheese");
							row_5_type.setText("*spicy");
							row_5_rate.setText("325");
							row_5_qty.setText(Menu.bbc_qty_s_ins);
							row_5_price.setText(Menu.bbc_price_s);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Beef Burger Cheese");
							row_6_type.setText("*spicy");
							row_6_rate.setText("325");
							row_6_qty.setText(Menu.bbc_qty_s_ins);
							row_6_price.setText(Menu.bbc_price_s);
						}
				}
				}}
				//--------------------------------------------------
				if(Menu.flag_cb==1) {
					if(Menu.flag_cb_m==1) {
						if(Menu.cb_qty_mint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Chicken Burger");
							row_1_type.setText("*regular");
							row_1_rate.setText("250");
							row_1_qty.setText(Menu.cb_qty_m_ins);
							row_1_price.setText(Menu.cb_price_m);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Chicken Burger");
							row_2_type.setText("*regular");
							row_2_rate.setText("250");
							row_2_qty.setText(Menu.cb_qty_m_ins);
							row_2_price.setText(Menu.cb_price_m);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Chicken Burger");
							row_3_type.setText("*regular");
							row_3_rate.setText("250");
							row_3_qty.setText(Menu.cb_qty_m_ins);
							row_3_price.setText(Menu.cb_price_m);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Chicken Burger");
							row_4_type.setText("*regular");
							row_4_rate.setText("250");
							row_4_qty.setText(Menu.cb_qty_m_ins);
							row_4_price.setText(Menu.cb_price_m);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Chicken Burger");
							row_5_type.setText("*regular");
							row_5_rate.setText("250");
							row_5_qty.setText(Menu.cb_qty_m_ins);
							row_5_price.setText(Menu.cb_price_m);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Chicken Burger");
							row_6_type.setText("*regular");
							row_6_rate.setText("250");
							row_6_qty.setText(Menu.cb_qty_m_ins);
							row_6_price.setText(Menu.cb_price_m);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Chicken Burger");
							row_7_type.setText("*regular");
							row_7_rate.setText("250");
							row_7_qty.setText(Menu.cb_qty_m_ins);
							row_7_price.setText(Menu.cb_price_m);
						}
						
						}
					}
					if(Menu.flag_cb_h==1) {
						if(Menu.cb_qty_hint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Chicken Burger");
							row_1_type.setText("*hot");
							row_1_rate.setText("250");
							row_1_qty.setText(Menu.cb_qty_h_ins);
							row_1_price.setText(Menu.cb_price_h);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Chicken Burger");
							row_2_type.setText("*hot");
							row_2_rate.setText("250");
							row_2_qty.setText(Menu.cb_qty_h_ins);
							row_2_price.setText(Menu.cb_price_h);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Chicken Burger");
							row_3_type.setText("*hot");
							row_3_rate.setText("250");
							row_3_qty.setText(Menu.cb_qty_h_ins);
							row_3_price.setText(Menu.cb_price_h);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Chicken Burger");
							row_4_type.setText("*hot");
							row_4_rate.setText("250");
							row_4_qty.setText(Menu.cb_qty_h_ins);
							row_4_price.setText(Menu.cb_price_h);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Chicken Burger");
							row_5_type.setText("*hot");
							row_5_rate.setText("250");
							row_5_qty.setText(Menu.cb_qty_h_ins);
							row_5_price.setText(Menu.cb_price_h);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Chicken Burger");
							row_6_type.setText("*hot");
							row_6_rate.setText("250");
							row_6_qty.setText(Menu.cb_qty_h_ins);
							row_6_price.setText(Menu.cb_price_h);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Chicken Burger");
							row_7_type.setText("*hot");
							row_7_rate.setText("250");
							row_7_qty.setText(Menu.cb_qty_h_ins);
							row_7_price.setText(Menu.cb_price_h);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Chicken Burger");
							row_8_type.setText("*hot");
							row_8_rate.setText("250");
							row_8_qty.setText(Menu.cb_qty_h_ins);
							row_8_price.setText(Menu.cb_price_h);
						}
					
					}}
					if(Menu.flag_cb_s==1) {
						if(Menu.cb_qty_sint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Chicken Burger");
							row_1_type.setText("*spicy");
							row_1_rate.setText("250");
							row_1_qty.setText(Menu.cb_qty_s_ins);
							row_1_price.setText(Menu.cb_price_s);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Chicken Burger");
							row_2_type.setText("*spicy");
							row_2_rate.setText("250");
							row_2_qty.setText(Menu.cb_qty_s_ins);
							row_2_price.setText(Menu.cb_price_s);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Chicken Burger");
							row_3_type.setText("*spicy");
							row_3_rate.setText("250");
							row_3_qty.setText(Menu.cb_qty_s_ins);
							row_3_price.setText(Menu.cb_price_s);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Chicken Burger");
							row_4_type.setText("*spicy");
							row_4_rate.setText("250");
							row_4_qty.setText(Menu.cb_qty_s_ins);
							row_4_price.setText(Menu.cb_price_s);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Chicken Burger");
							row_5_type.setText("*spicy");
							row_5_rate.setText("250");
							row_5_qty.setText(Menu.cb_qty_s_ins);
							row_5_price.setText(Menu.cb_price_s);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Chicken Burger");
							row_6_type.setText("*spicy");
							row_6_rate.setText("250");
							row_6_qty.setText(Menu.cb_qty_s_ins);
							row_6_price.setText(Menu.cb_price_s);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Chicken Burger");
							row_7_type.setText("*spicy");
							row_7_rate.setText("250");
							row_7_qty.setText(Menu.cb_qty_s_ins);
							row_7_price.setText(Menu.cb_price_s);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Chicken Burger");
							row_8_type.setText("*spicy");
							row_8_rate.setText("250");
							row_8_qty.setText(Menu.cb_qty_s_ins);
							row_8_price.setText(Menu.cb_price_s);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Chicken Burger");
							row_9_type.setText("*spicy");
							row_9_rate.setText("250");
							row_9_qty.setText(Menu.cb_qty_s_ins);
							row_9_price.setText(Menu.cb_price_s);
						}
				}
				}
					
					    }
				//---------------------------------------------
				if(Menu.flag_cbc==1) {
					if(Menu.flag_cbc_m==1) {
						if(Menu.cbc_qty_mint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Chicken Burger Cheese");
							row_1_type.setText("*regular");
							row_1_rate.setText("275");
							row_1_qty.setText(Menu.cbc_qty_m_ins);
							row_1_price.setText(Menu.cbc_price_m);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Chicken Burger Cheese");
							row_2_type.setText("*regular");
							row_2_rate.setText("275");
							row_2_qty.setText(Menu.cbc_qty_m_ins);
							row_2_price.setText(Menu.cbc_price_m);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Chicken Burger Cheese");
							row_3_type.setText("*regular");
							row_3_rate.setText("275");
							row_3_qty.setText(Menu.cbc_qty_m_ins);
							row_3_price.setText(Menu.cbc_price_m);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Chicken Burger Cheese");
							row_4_type.setText("*regular");
							row_4_rate.setText("275");
							row_4_qty.setText(Menu.cbc_qty_m_ins);
							row_4_price.setText(Menu.cbc_price_m);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Chicken Burger Cheese");
							row_5_type.setText("*regular");
							row_5_rate.setText("275");
							row_5_qty.setText(Menu.cbc_qty_m_ins);
							row_5_price.setText(Menu.cbc_price_m);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Chicken Burger Cheese");
							row_6_type.setText("*regular");
							row_6_rate.setText("275");
							row_6_qty.setText(Menu.cbc_qty_m_ins);
							row_6_price.setText(Menu.cbc_price_m);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Chicken Burger Cheese");
							row_7_type.setText("*regular");
							row_7_rate.setText("275");
							row_7_qty.setText(Menu.cbc_qty_m_ins);
							row_7_price.setText(Menu.cbc_price_m);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Chicken Burger Cheese");
							row_8_type.setText("*regular");
							row_8_rate.setText("275");
							row_8_qty.setText(Menu.cbc_qty_m_ins);
							row_8_price.setText(Menu.cbc_price_m);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Chicken Burger Cheese");
							row_9_type.setText("*regular");
							row_9_rate.setText("275");
							row_9_qty.setText(Menu.cbc_qty_m_ins);
							row_9_price.setText(Menu.cbc_price_m);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Chicken Burger Cheese");
							row_10_type.setText("*regular");
							row_10_rate.setText("275");
							row_10_qty.setText(Menu.cbc_qty_m_ins);
							row_10_price.setText(Menu.cbc_price_m);
						}
						
						}
					}
					if(Menu.flag_cbc_h==1) {
						if(Menu.cbc_qty_hint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Chicken Burger Cheese");
							row_1_type.setText("*hot");
							row_1_rate.setText("275");
							row_1_qty.setText(Menu.cbc_qty_h_ins);
							row_1_price.setText(Menu.cbc_price_h);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Chicken Burger Cheese");
							row_2_type.setText("*hot");
							row_2_rate.setText("275");
							row_2_qty.setText(Menu.cbc_qty_h_ins);
							row_2_price.setText(Menu.cbc_price_h);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Chicken Burger Cheese");
							row_3_type.setText("*hot");
							row_3_rate.setText("275");
							row_3_qty.setText(Menu.cbc_qty_h_ins);
							row_3_price.setText(Menu.cbc_price_h);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Chicken Burger Cheese");
							row_4_type.setText("*hot");
							row_4_rate.setText("275");
							row_4_qty.setText(Menu.cbc_qty_h_ins);
							row_4_price.setText(Menu.cbc_price_h);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Chicken Burger Cheese");
							row_5_type.setText("*hot");
							row_5_rate.setText("275");
							row_5_qty.setText(Menu.cbc_qty_h_ins);
							row_5_price.setText(Menu.cbc_price_h);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Chicken Burger Cheese");
							row_6_type.setText("*hot");
							row_6_rate.setText("275");
							row_6_qty.setText(Menu.cbc_qty_h_ins);
							row_6_price.setText(Menu.cbc_price_h);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Chicken Burger Cheese");
							row_7_type.setText("*hot");
							row_7_rate.setText("275");
							row_7_qty.setText(Menu.cbc_qty_h_ins);
							row_7_price.setText(Menu.cbc_price_h);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Chicken Burger Cheese");
							row_8_type.setText("*hot");
							row_8_rate.setText("275");
							row_8_qty.setText(Menu.cbc_qty_h_ins);
							row_8_price.setText(Menu.cbc_price_h);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Chicken Burger Cheese");
							row_9_type.setText("*hot");
							row_9_rate.setText("275");
							row_9_qty.setText(Menu.cbc_qty_h_ins);
							row_9_price.setText(Menu.cbc_price_h);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Chicken Burger Cheese");
							row_10_type.setText("*hot");
							row_10_rate.setText("275");
							row_10_qty.setText(Menu.cbc_qty_h_ins);
							row_10_price.setText(Menu.cbc_price_h);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Chicken Burger Cheese");
							row_11_type.setText("*hot");
							row_11_rate.setText("275");
							row_11_qty.setText(Menu.cbc_qty_h_ins);
							row_11_price.setText(Menu.cbc_price_h);
						}
					
					}}
					if(Menu.flag_cbc_s==1) {
						if(Menu.cbc_qty_sint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Chicken Burger Cheese");
							row_1_type.setText("*spicy");
							row_1_rate.setText("275");
							row_1_qty.setText(Menu.cbc_qty_s_ins);
							row_1_price.setText(Menu.cbc_price_s);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Chicken Burger Cheese");
							row_2_type.setText("*spicy");
							row_2_rate.setText("275");
							row_2_qty.setText(Menu.cbc_qty_s_ins);
							row_2_price.setText(Menu.cbc_price_s);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Chicken Burger Cheese");
							row_3_type.setText("*spicy");
							row_3_rate.setText("275");
							row_3_qty.setText(Menu.cbc_qty_s_ins);
							row_3_price.setText(Menu.cbc_price_s);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Chicken Burger Cheese");
							row_4_type.setText("*spicy");
							row_4_rate.setText("275");
							row_4_qty.setText(Menu.cbc_qty_s_ins);
							row_4_price.setText(Menu.cbc_price_s);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Chicken Burger Cheese");
							row_5_type.setText("*spicy");
							row_5_rate.setText("275");
							row_5_qty.setText(Menu.cbc_qty_s_ins);
							row_5_price.setText(Menu.cbc_price_s);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Chicken Burger Cheese");
							row_6_type.setText("*spicy");
							row_6_rate.setText("275");
							row_6_qty.setText(Menu.cbc_qty_s_ins);
							row_6_price.setText(Menu.cbc_price_s);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Chicken Burger Cheese");
							row_7_type.setText("*spicy");
							row_7_rate.setText("275");
							row_7_qty.setText(Menu.cbc_qty_s_ins);
							row_7_price.setText(Menu.cbc_price_s);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Chicken Burger Cheese");
							row_8_type.setText("*spicy");
							row_8_rate.setText("275");
							row_8_qty.setText(Menu.cbc_qty_s_ins);
							row_8_price.setText(Menu.cbc_price_s);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Chicken Burger Cheese");
							row_9_type.setText("*spicy");
							row_9_rate.setText("275");
							row_9_qty.setText(Menu.cbc_qty_s_ins);
							row_9_price.setText(Menu.cbc_price_s);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Chicken Burger Cheese");
							row_10_type.setText("*spicy");
							row_10_rate.setText("275");
							row_10_qty.setText(Menu.cbc_qty_s_ins);
							row_10_price.setText(Menu.cbc_price_s);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Chicken Burger Cheese");
							row_11_type.setText("*spicy");
							row_11_rate.setText("275");
							row_11_qty.setText(Menu.cbc_qty_s_ins);
							row_11_price.setText(Menu.cbc_price_s);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Chicken Burger Cheese");
							row_12_type.setText("*spicy");
							row_12_rate.setText("275");
							row_12_qty.setText(Menu.cbc_qty_s_ins);
							row_12_price.setText(Menu.cbc_price_s);
						}
						
				}
				}
					
					    }
				//-------------------------------------------
				if(Menu.flag_bbqbb==1) {
					if(Menu.flag_bbqbb_m==1) {
						if(Menu.bbqbb_qty_mint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("BBQ Beef Burger");
							row_1_type.setText("*regular");
							row_1_rate.setText("350");
							row_1_qty.setText(Menu.bbqbb_qty_m_ins);
							row_1_price.setText(Menu.bbqbb_price_m);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("BBQ Beef Burger");
							row_2_type.setText("*regular");
							row_2_rate.setText("350");
							row_2_qty.setText(Menu.bbqbb_qty_m_ins);
							row_2_price.setText(Menu.bbqbb_price_m);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("BBQ Beef Burger");
							row_3_type.setText("*regular");
							row_3_rate.setText("350");
							row_3_qty.setText(Menu.bbqbb_qty_m_ins);
							row_3_price.setText(Menu.bbqbb_price_m);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("BBQ Beef Burger");
							row_4_type.setText("*regular");
							row_4_rate.setText("350");
							row_4_qty.setText(Menu.bbqbb_qty_m_ins);
							row_4_price.setText(Menu.bbqbb_price_m);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("BBQ Beef Burger");
							row_5_type.setText("*regular");
							row_5_rate.setText("350");
							row_5_qty.setText(Menu.bbqbb_qty_m_ins);
							row_5_price.setText(Menu.bbqbb_price_m);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("BBQ Beef Burger");
							row_6_type.setText("*regular");
							row_6_rate.setText("350");
							row_6_qty.setText(Menu.bbqbb_qty_m_ins);
							row_6_price.setText(Menu.bbqbb_price_m);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("BBQ Beef Burger");
							row_7_type.setText("*regular");
							row_7_rate.setText("350");
							row_7_qty.setText(Menu.bbqbb_qty_m_ins);
							row_7_price.setText(Menu.bbqbb_price_m);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("BBQ Beef Burger");
							row_8_type.setText("*regular");
							row_8_rate.setText("350");
							row_8_qty.setText(Menu.bbqbb_qty_m_ins);
							row_8_price.setText(Menu.bbqbb_price_m);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("BBQ Beef Burger");
							row_9_type.setText("*regular");
							row_9_rate.setText("350");
							row_9_qty.setText(Menu.bbqbb_qty_m_ins);
							row_9_price.setText(Menu.bbqbb_price_m);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("BBQ Beef Burger");
							row_10_type.setText("*regular");
							row_10_rate.setText("350");
							row_10_qty.setText(Menu.bbqbb_qty_m_ins);
							row_10_price.setText(Menu.bbqbb_price_m);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("BBQ Beef Burger");
							row_11_type.setText("*regular");
							row_11_rate.setText("350");
							row_11_qty.setText(Menu.bbqbb_qty_m_ins);
							row_11_price.setText(Menu.bbqbb_price_m);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("BBQ Beef Burger");
							row_12_type.setText("*regular");
							row_12_rate.setText("350");
							row_12_qty.setText(Menu.bbqbb_qty_m_ins);
							row_12_price.setText(Menu.bbqbb_price_m);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("BBQ Beef Burger");
							row_13_type.setText("*regular");
							row_13_rate.setText("350");
							row_13_qty.setText(Menu.bbqbb_qty_m_ins);
							row_13_price.setText(Menu.bbqbb_price_m);
						}
						
						}
					}
					if(Menu.flag_bbqbb_h==1) {
						if(Menu.bbqbb_qty_hint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("BBQ Beef Burger");
							row_1_type.setText("*hot");
							row_1_rate.setText("350");
							row_1_qty.setText(Menu.bbqbb_qty_h_ins);
							row_1_price.setText(Menu.bbqbb_price_h);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("BBQ Beef Burger");
							row_3_type.setText("*hot");
							row_3_rate.setText("350");
							row_3_qty.setText(Menu.bbqbb_qty_h_ins);
							row_3_price.setText(Menu.bbqbb_price_h);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("BBQ Beef Burger");
							row_4_type.setText("*hot");
							row_4_rate.setText("350");
							row_4_qty.setText(Menu.bbqbb_qty_h_ins);
							row_4_price.setText(Menu.bbqbb_price_h);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("BBQ Beef Burger");
							row_5_type.setText("*hot");
							row_5_rate.setText("350");
							row_5_qty.setText(Menu.bbqbb_qty_h_ins);
							row_5_price.setText(Menu.bbqbb_price_h);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("BBQ Beef Burger");
							row_6_type.setText("*hot");
							row_6_rate.setText("350");
							row_6_qty.setText(Menu.bbqbb_qty_h_ins);
							row_6_price.setText(Menu.bbqbb_price_h);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("BBQ Beef Burger");
							row_7_type.setText("*hot");
							row_7_rate.setText("350");
							row_7_qty.setText(Menu.bbqbb_qty_h_ins);
							row_7_price.setText(Menu.bbqbb_price_h);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("BBQ Beef Burger");
							row_8_type.setText("*hot");
							row_8_rate.setText("350");
							row_8_qty.setText(Menu.bbqbb_qty_h_ins);
							row_8_price.setText(Menu.bbqbb_price_h);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("BBQ Beef Burger");
							row_9_type.setText("*hot");
							row_9_rate.setText("350");
							row_9_qty.setText(Menu.bbqbb_qty_h_ins);
							row_9_price.setText(Menu.bbqbb_price_h);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("BBQ Beef Burger");
							row_10_type.setText("*hot");
							row_10_rate.setText("350");
							row_10_qty.setText(Menu.bbqbb_qty_h_ins);
							row_10_price.setText(Menu.bbqbb_price_h);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("BBQ Beef Burger");
							row_11_type.setText("*hot");
							row_11_rate.setText("350");
							row_11_qty.setText(Menu.bbqbb_qty_h_ins);
							row_11_price.setText(Menu.bbqbb_price_h);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("BBQ Beef Burger");
							row_12_type.setText("*hot");
							row_12_rate.setText("350");
							row_12_qty.setText(Menu.bbqbb_qty_h_ins);
							row_12_price.setText(Menu.bbqbb_price_h);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("BBQ Beef Burger");
							row_13_type.setText("*hot");
							row_13_rate.setText("350");
							row_13_qty.setText(Menu.bbqbb_qty_h_ins);
							row_13_price.setText(Menu.bbqbb_price_h);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("BBQ Beef Burger");
							row_14_type.setText("*hot");
							row_14_rate.setText("350");
							row_14_qty.setText(Menu.bbqbb_qty_h_ins);
							row_14_price.setText(Menu.bbqbb_price_h);
						}
					}}
					if(Menu.flag_bbqbb_s==1) {
						if(Menu.bbqbb_qty_sint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("BBQ Beef Burger");
							row_1_type.setText("*spicy");
							row_1_rate.setText("350");
							row_1_qty.setText(Menu.bbqbb_qty_s_ins);
							row_1_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("BBQ Beef Burger");
							row_2_type.setText("*spicy");
							row_2_rate.setText("350");
							row_2_qty.setText(Menu.bbqbb_qty_s_ins);
							row_2_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("BBQ Beef Burger");
							row_3_type.setText("*spicy");
							row_3_rate.setText("350");
							row_3_qty.setText(Menu.bbqbb_qty_s_ins);
							row_3_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("BBQ Beef Burger");
							row_4_type.setText("*spicy");
							row_4_rate.setText("350");
							row_4_qty.setText(Menu.bbqbb_qty_s_ins);
							row_4_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("BBQ Beef Burger");
							row_4_type.setText("*spicy");
							row_4_rate.setText("350");
							row_4_qty.setText(Menu.bbqbb_qty_s_ins);
							row_4_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("BBQ Beef Burger");
							row_5_type.setText("*spicy");
							row_5_rate.setText("350");
							row_5_qty.setText(Menu.bbqbb_qty_s_ins);
							row_5_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("BBQ Beef Burger");
							row_6_type.setText("*spicy");
							row_6_rate.setText("350");
							row_6_qty.setText(Menu.bbqbb_qty_s_ins);
							row_6_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("BBQ Beef Burger");
							row_7_type.setText("*spicy");
							row_7_rate.setText("350");
							row_7_qty.setText(Menu.bbqbb_qty_s_ins);
							row_7_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("BBQ Beef Burger");
							row_8_type.setText("*spicy");
							row_8_rate.setText("350");
							row_8_qty.setText(Menu.bbqbb_qty_s_ins);
							row_8_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("BBQ Beef Burger");
							row_9_type.setText("*spicy");
							row_9_rate.setText("350");
							row_9_qty.setText(Menu.bbqbb_qty_s_ins);
							row_9_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("BBQ Beef Burger");
							row_10_type.setText("*spicy");
							row_10_rate.setText("350");
							row_10_qty.setText(Menu.bbqbb_qty_s_ins);
							row_10_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_1_name.getText().equals("")) {
							row_11_name.setText("BBQ Beef Burger");
							row_11_type.setText("*spicy");
							row_11_rate.setText("350");
							row_11_qty.setText(Menu.bbqbb_qty_s_ins);
							row_11_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("BBQ Beef Burger");
							row_12_type.setText("*spicy");
							row_12_rate.setText("350");
							row_12_qty.setText(Menu.bbqbb_qty_s_ins);
							row_12_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("BBQ Beef Burger");
							row_13_type.setText("*spicy");
							row_13_rate.setText("350");
							row_13_qty.setText(Menu.bbqbb_qty_s_ins);
							row_13_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("BBQ Beef Burger");
							row_14_type.setText("*spicy");
							row_14_rate.setText("350");
							row_14_qty.setText(Menu.bbqbb_qty_s_ins);
							row_14_price.setText(Menu.bbqbb_price_s);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("BBQ Beef Burger");
							row_15_type.setText("*spicy");
							row_15_rate.setText("350");
							row_15_qty.setText(Menu.bbqbb_qty_s_ins);
							row_15_price.setText(Menu.bbqbb_price_s);
						}
				}
				}}
				//------------------------------------------------------------
				if(Menu.flag_bbqcb==1) {
					if(Menu.flag_bbqcb_m==1) {
						if(Menu.bbqcb_qty_mint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("BBQ Chicken Burger");
							row_1_type.setText("*regular");
							row_1_rate.setText("325");
							row_1_qty.setText(Menu.bbqcb_qty_m_ins);
							row_1_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("BBQ Chicken Burger");
							row_2_type.setText("*regular");
							row_2_rate.setText("325");
							row_2_qty.setText(Menu.bbqcb_qty_m_ins);
							row_2_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("BBQ Chicken Burger");
							row_3_type.setText("*regular");
							row_3_rate.setText("325");
							row_3_qty.setText(Menu.bbqcb_qty_m_ins);
							row_3_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("BBQ Chicken Burger");
							row_4_type.setText("*regular");
							row_4_rate.setText("325");
							row_4_qty.setText(Menu.bbqcb_qty_m_ins);
							row_4_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("BBQ Chicken Burger");
							row_5_type.setText("*regular");
							row_5_rate.setText("325");
							row_5_qty.setText(Menu.bbqcb_qty_m_ins);
							row_5_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("BBQ Chicken Burger");
							row_6_type.setText("*regular");
							row_6_rate.setText("325");
							row_6_qty.setText(Menu.bbqcb_qty_m_ins);
							row_6_price.setText(Menu.bbqbb_price_m);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("BBQ Chicken Burger");
							row_7_type.setText("*regular");
							row_7_rate.setText("325");
							row_7_qty.setText(Menu.bbqcb_qty_m_ins);
							row_7_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("BBQ Chicken Burger");
							row_8_type.setText("*regular");
							row_8_rate.setText("325");
							row_8_qty.setText(Menu.bbqcb_qty_m_ins);
							row_8_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("BBQ Chicken Burger");
							row_9_type.setText("*regular");
							row_9_rate.setText("325");
							row_9_qty.setText(Menu.bbqcb_qty_m_ins);
							row_9_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("BBQ Chicken Burger");
							row_10_type.setText("*regular");
							row_10_rate.setText("325");
							row_10_qty.setText(Menu.bbqcb_qty_m_ins);
							row_10_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("BBQ Chicken Burger");
							row_11_type.setText("*regular");
							row_11_rate.setText("325");
							row_11_qty.setText(Menu.bbqcb_qty_m_ins);
							row_11_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("BBQ Chicken Burger");
							row_12_type.setText("*regular");
							row_12_rate.setText("325");
							row_12_qty.setText(Menu.bbqcb_qty_m_ins);
							row_12_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("BBQ Chicken Burger");
							row_13_type.setText("*regular");
							row_13_rate.setText("325");
							row_13_qty.setText(Menu.bbqcb_qty_m_ins);
							row_13_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("BBQ Chicken Burger");
							row_14_type.setText("*regular");
							row_14_rate.setText("325");
							row_14_qty.setText(Menu.bbqcb_qty_m_ins);
							row_14_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("BBQ Chicken Burger");
							row_15_type.setText("*regular");
							row_15_rate.setText("325");
							row_15_qty.setText(Menu.bbqcb_qty_m_ins);
							row_15_price.setText(Menu.bbqcb_price_m);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("BBQ Chicken Burger");
							row_16_type.setText("*regular");
							row_16_rate.setText("325");
							row_16_qty.setText(Menu.bbqcb_qty_m_ins);
							row_16_price.setText(Menu.bbqcb_price_m);
						}
						
						}
					}
					if(Menu.flag_bbqcb_h==1) {
						if(Menu.bbqcb_qty_hint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("BBQ Chicken Burger");
							row_1_type.setText("*hot");
							row_1_rate.setText("325");
							row_1_qty.setText(Menu.bbqcb_qty_h_ins);
							row_1_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("BBQ Chicken Burger");
							row_3_type.setText("*hot");
							row_3_rate.setText("325");
							row_3_qty.setText(Menu.bbqcb_qty_h_ins);
							row_3_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("BBQ Chicken Burger");
							row_4_type.setText("*hot");
							row_4_rate.setText("325");
							row_4_qty.setText(Menu.bbqcb_qty_h_ins);
							row_4_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("BBQ Chicken Burger");
							row_5_type.setText("*hot");
							row_5_rate.setText("325");
							row_5_qty.setText(Menu.bbqcb_qty_h_ins);
							row_5_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("BBQ Chicken Burger");
							row_6_type.setText("*hot");
							row_6_rate.setText("325");
							row_6_qty.setText(Menu.bbqcb_qty_h_ins);
							row_6_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("BBQ Chicken Burger");
							row_7_type.setText("*hot");
							row_7_rate.setText("325");
							row_7_qty.setText(Menu.bbqcb_qty_h_ins);
							row_7_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("BBQ Chicken Burger");
							row_8_type.setText("*hot");
							row_8_rate.setText("325");
							row_8_qty.setText(Menu.bbqcb_qty_h_ins);
							row_8_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("BBQ Chicken Burger");
							row_9_type.setText("*hot");
							row_9_rate.setText("325");
							row_9_qty.setText(Menu.bbqcb_qty_h_ins);
							row_9_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("BBQ Chicken Burger");
							row_10_type.setText("*hot");
							row_10_rate.setText("325");
							row_10_qty.setText(Menu.bbqcb_qty_h_ins);
							row_10_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("BBQ Chicken Burger");
							row_11_type.setText("*hot");
							row_11_rate.setText("325");
							row_11_qty.setText(Menu.bbqcb_qty_h_ins);
							row_11_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("BBQ Chicken Burger");
							row_12_type.setText("*hot");
							row_12_rate.setText("325");
							row_12_qty.setText(Menu.bbqcb_qty_h_ins);
							row_12_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("BBQ Chicken Burger");
							row_13_type.setText("*hot");
							row_13_rate.setText("325");
							row_13_qty.setText(Menu.bbqcb_qty_h_ins);
							row_13_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("BBQ Chicken Burger");
							row_14_type.setText("*hot");
							row_14_rate.setText("325");
							row_14_qty.setText(Menu.bbqcb_qty_h_ins);
							row_14_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("BBQ Chicken Burger");
							row_15_type.setText("*hot");
							row_15_rate.setText("325");
							row_15_qty.setText(Menu.bbqcb_qty_h_ins);
							row_15_price.setText(Menu.bbqcb_price_h);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("BBQ Chicken Burger");
							row_16_type.setText("*hot");
							row_16_rate.setText("325");
							row_16_qty.setText(Menu.bbqcb_qty_h_ins);
							row_16_price.setText(Menu.bbqcb_price_h);
						}
					}}
					if(Menu.flag_bbqcb_s==1) {
						if(Menu.bbqcb_qty_sint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("BBQ Chicken Burger");
							row_1_type.setText("*spicy");
							row_1_rate.setText("325");
							row_1_qty.setText(Menu.bbqcb_qty_s_ins);
							row_1_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("BBQ Chicken Burger");
							row_2_type.setText("*spicy");
							row_2_rate.setText("325");
							row_2_qty.setText(Menu.bbqcb_qty_s_ins);
							row_2_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("BBQ Chicken Burger");
							row_3_type.setText("*spicy");
							row_3_rate.setText("325");
							row_3_qty.setText(Menu.bbqcb_qty_s_ins);
							row_3_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("BBQ Chicken Burger");
							row_4_type.setText("*spicy");
							row_4_rate.setText("325");
							row_4_qty.setText(Menu.bbqcb_qty_s_ins);
							row_4_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("BBQ Chicken Burger");
							row_4_type.setText("*spicy");
							row_4_rate.setText("325");
							row_4_qty.setText(Menu.bbqcb_qty_s_ins);
							row_4_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("BBQ Chicken Burger");
							row_5_type.setText("*spicy");
							row_5_rate.setText("325");
							row_5_qty.setText(Menu.bbqcb_qty_s_ins);
							row_5_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("BBQ Chicken Burger");
							row_6_type.setText("*spicy");
							row_6_rate.setText("325");
							row_6_qty.setText(Menu.bbqcb_qty_s_ins);
							row_6_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("BBQ Chicken Burger");
							row_7_type.setText("*spicy");
							row_7_rate.setText("325");
							row_7_qty.setText(Menu.bbqcb_qty_s_ins);
							row_7_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("BBQ Chicken Burger");
							row_8_type.setText("*spicy");
							row_8_rate.setText("325");
							row_8_qty.setText(Menu.bbqcb_qty_s_ins);
							row_8_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("BBQ Chicken Burger");
							row_9_type.setText("*spicy");
							row_9_rate.setText("325");
							row_9_qty.setText(Menu.bbqcb_qty_s_ins);
							row_9_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("BBQ Chicken Burger");
							row_10_type.setText("*spicy");
							row_10_rate.setText("325");
							row_10_qty.setText(Menu.bbqcb_qty_s_ins);
							row_10_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_1_name.getText().equals("")) {
							row_11_name.setText("BBQ Chicken Burger");
							row_11_type.setText("*spicy");
							row_11_rate.setText("325");
							row_11_qty.setText(Menu.bbqcb_qty_s_ins);
							row_11_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("BBQ Chicken Burger");
							row_12_type.setText("*spicy");
							row_12_rate.setText("325");
							row_12_qty.setText(Menu.bbqcb_qty_s_ins);
							row_12_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("BBQ Chicken Burger");
							row_13_type.setText("*spicy");
							row_13_rate.setText("325");
							row_13_qty.setText(Menu.bbqcb_qty_s_ins);
							row_13_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("BBQ Chicken Burger");
							row_14_type.setText("*spicy");
							row_14_rate.setText("325");
							row_14_qty.setText(Menu.bbqcb_qty_s_ins);
							row_14_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("BBQ Chicken Burger");
							row_15_type.setText("*spicy");
							row_15_rate.setText("325");
							row_15_qty.setText(Menu.bbqcb_qty_s_ins);
							row_15_price.setText(Menu.bbqcb_price_s);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("BBQ Chicken Burger");
							row_16_type.setText("*spicy");
							row_16_rate.setText("325");
							row_16_qty.setText(Menu.bbqcb_qty_s_ins);
							row_16_price.setText(Menu.bbqcb_price_s);
						}
						
				}
				}}
				//------------------------------------------------------
				if(Menu.flag_f==1) {
					if(Menu.flag_f_m==1) {
						if(Menu.fri_qty_rint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Fries");
							row_1_type.setText("*regular");
							row_1_rate.setText("100");
							row_1_qty.setText(Menu.fri_qty_r_ins);
							row_1_price.setText(Menu.fri_price_r);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Fries");
							row_2_type.setText("*regular");
							row_2_rate.setText("100");
							row_2_qty.setText(Menu.fri_qty_r_ins);
							row_2_price.setText(Menu.fri_price_r);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Fries");
							row_3_type.setText("*regular");
							row_3_rate.setText("100");
							row_3_qty.setText(Menu.fri_qty_r_ins);
							row_3_price.setText(Menu.fri_price_r);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Fries");
							row_4_type.setText("*regular");
							row_4_rate.setText("100");
							row_4_qty.setText(Menu.fri_qty_r_ins);
							row_4_price.setText(Menu.fri_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Fries");
							row_5_type.setText("*regular");
							row_5_rate.setText("100");
							row_5_qty.setText(Menu.fri_qty_r_ins);
							row_5_price.setText(Menu.fri_price_r);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Fries");
							row_6_type.setText("*regular");
							row_6_rate.setText("100");
							row_6_qty.setText(Menu.fri_qty_r_ins);
							row_6_price.setText(Menu.fri_price_r);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Fries");
							row_7_type.setText("*regular");
							row_7_rate.setText("100");
							row_7_qty.setText(Menu.fri_qty_r_ins);
							row_7_price.setText(Menu.fri_price_r);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Fries");
							row_8_type.setText("*regular");
							row_8_rate.setText("100");
							row_8_qty.setText(Menu.fri_qty_r_ins);
							row_8_price.setText(Menu.fri_price_r);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Fries");
							row_9_type.setText("*regular");
							row_9_rate.setText("100");
							row_9_qty.setText(Menu.fri_qty_r_ins);
							row_9_price.setText(Menu.fri_price_r);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Fries");
							row_10_type.setText("*regular");
							row_10_rate.setText("100");
							row_10_qty.setText(Menu.fri_qty_r_ins);
							row_10_price.setText(Menu.fri_price_r);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Fries");
							row_11_type.setText("*regular");
							row_11_rate.setText("100");
							row_11_qty.setText(Menu.fri_qty_r_ins);
							row_11_price.setText(Menu.fri_price_r);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Fries");
							row_12_type.setText("*regular");
							row_12_rate.setText("100");
							row_12_qty.setText(Menu.fri_qty_r_ins);
							row_12_price.setText(Menu.fri_price_r);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Fries");
							row_13_type.setText("*regular");
							row_13_rate.setText("100");
							row_13_qty.setText(Menu.fri_qty_r_ins);
							row_13_price.setText(Menu.fri_price_r);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Fries");
							row_14_type.setText("*regular");
							row_14_rate.setText("100");
							row_14_qty.setText(Menu.fri_qty_r_ins);
							row_14_price.setText(Menu.fri_price_r);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Fries");
							row_15_type.setText("*regular");
							row_15_rate.setText("100");
							row_15_qty.setText(Menu.fri_qty_r_ins);
							row_15_price.setText(Menu.fri_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Fries");
							row_16_type.setText("*regular");
							row_16_rate.setText("100");
							row_16_qty.setText(Menu.fri_qty_r_ins);
							row_16_price.setText(Menu.fri_price_r);
						}
						
						}
					}
					if(Menu.flag_f_h==1) {
						if(Menu.fri_qty_lint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Fries");
							row_1_type.setText("*large");
							row_1_rate.setText("140");
							row_1_qty.setText(Menu.fri_qty_l_ins);
							row_1_price.setText(Menu.fri_price_l);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Fries");
							row_2_type.setText("*large");
							row_2_rate.setText("140");
							row_2_qty.setText(Menu.fri_qty_l_ins);
							row_2_price.setText(Menu.fri_price_l);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Fries");
							row_3_type.setText("*large");
							row_3_rate.setText("140");
							row_3_qty.setText(Menu.fri_qty_l_ins);
							row_3_price.setText(Menu.fri_price_l);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Fries");
							row_4_type.setText("*large");
							row_4_rate.setText("140");
							row_4_qty.setText(Menu.fri_qty_l_ins);
							row_4_price.setText(Menu.fri_price_l);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Fries");
							row_5_type.setText("*large");
							row_5_rate.setText("140");
							row_5_qty.setText(Menu.fri_qty_l_ins);
							row_5_price.setText(Menu.fri_price_l);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Fries");
							row_6_type.setText("*large");
							row_6_rate.setText("140");
							row_6_qty.setText(Menu.fri_qty_l_ins);
							row_6_price.setText(Menu.fri_price_l);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Fries");
							row_7_type.setText("*large");
							row_7_rate.setText("140");
							row_7_qty.setText(Menu.fri_qty_l_ins);
							row_7_price.setText(Menu.fri_price_l);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Fries");
							row_8_type.setText("*large");
							row_8_rate.setText("140");
							row_8_qty.setText(Menu.fri_qty_l_ins);
							row_8_price.setText(Menu.fri_price_l);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Fries");
							row_9_type.setText("*large");
							row_9_rate.setText("140");
							row_9_qty.setText(Menu.fri_qty_l_ins);
							row_9_price.setText(Menu.fri_price_l);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Fries");
							row_10_type.setText("*large");
							row_10_rate.setText("140");
							row_10_qty.setText(Menu.fri_qty_l_ins);
							row_10_price.setText(Menu.fri_price_l);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Fries");
							row_11_type.setText("*large");
							row_11_rate.setText("140");
							row_11_qty.setText(Menu.fri_qty_l_ins);
							row_11_price.setText(Menu.fri_price_l);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Fries");
							row_12_type.setText("*large");
							row_12_rate.setText("140");
							row_12_qty.setText(Menu.fri_qty_l_ins);
							row_12_price.setText(Menu.fri_price_l);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Fries");
							row_13_type.setText("*large");
							row_13_rate.setText("140");
							row_13_qty.setText(Menu.fri_qty_l_ins);
							row_13_price.setText(Menu.fri_price_l);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Fries");
							row_14_type.setText("*large");
							row_14_rate.setText("140");
							row_14_qty.setText(Menu.fri_qty_l_ins);
							row_14_price.setText(Menu.fri_price_l);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Fries");
							row_15_type.setText("*large");
							row_15_rate.setText("140");
							row_15_qty.setText(Menu.fri_qty_l_ins);
							row_15_price.setText(Menu.fri_price_l);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Fries");
							row_16_type.setText("*large");
							row_16_rate.setText("140");
							row_16_qty.setText(Menu.fri_qty_l_ins);
							row_16_price.setText(Menu.fri_price_l);
						}
				}
				}}
				//------------------------------------------------------
				if(Menu.flag_cf==1) {
					if(Menu.flag_cf_m==1) {
						if(Menu.cfri_qty_rint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Curly Fries");
							row_1_type.setText("*regular");
							row_1_rate.setText("120");
							row_1_qty.setText(Menu.cfri_qty_r_ins);
							row_1_price.setText(Menu.cfri_price_r);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Curly Fries");
							row_2_type.setText("*regular");
							row_2_rate.setText("120");
							row_2_qty.setText(Menu.cfri_qty_r_ins);
							row_2_price.setText(Menu.cfri_price_r);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Curly Fries");
							row_3_type.setText("*regular");
							row_3_rate.setText("120");
							row_3_qty.setText(Menu.cfri_qty_r_ins);
							row_3_price.setText(Menu.cfri_price_r);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Curly Fries");
							row_4_type.setText("*regular");
							row_4_rate.setText("120");
							row_4_qty.setText(Menu.cfri_qty_r_ins);
							row_4_price.setText(Menu.cfri_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Curly Fries");
							row_5_type.setText("*regular");
							row_5_rate.setText("120");
							row_5_qty.setText(Menu.cfri_qty_r_ins);
							row_5_price.setText(Menu.cfri_price_r);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Curly Fries");
							row_6_type.setText("*regular");
							row_6_rate.setText("120");
							row_6_qty.setText(Menu.cfri_qty_r_ins);
							row_6_price.setText(Menu.cfri_price_r);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Curly Fries");
							row_7_type.setText("*regular");
							row_7_rate.setText("120");
							row_7_qty.setText(Menu.cfri_qty_r_ins);
							row_7_price.setText(Menu.cfri_price_r);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Curly Fries");
							row_8_type.setText("*regular");
							row_8_rate.setText("120");
							row_8_qty.setText(Menu.cfri_qty_r_ins);
							row_8_price.setText(Menu.cfri_price_r);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Curly Fries");
							row_9_type.setText("*regular");
							row_9_rate.setText("120");
							row_9_qty.setText(Menu.cfri_qty_r_ins);
							row_9_price.setText(Menu.cfri_price_r);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Curly Fries");
							row_10_type.setText("*regular");
							row_10_rate.setText("120");
							row_10_qty.setText(Menu.cfri_qty_r_ins);
							row_10_price.setText(Menu.cfri_price_r);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Curly Fries");
							row_11_type.setText("*regular");
							row_11_rate.setText("120");
							row_11_qty.setText(Menu.cfri_qty_r_ins);
							row_11_price.setText(Menu.cfri_price_r);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Curly Fries");
							row_12_type.setText("*regular");
							row_12_rate.setText("120");
							row_12_qty.setText(Menu.cfri_qty_r_ins);
							row_12_price.setText(Menu.cfri_price_r);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Curly Fries");
							row_13_type.setText("*regular");
							row_13_rate.setText("120");
							row_13_qty.setText(Menu.cfri_qty_r_ins);
							row_13_price.setText(Menu.cfri_price_r);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Curly Fries");
							row_14_type.setText("*regular");
							row_14_rate.setText("120");
							row_14_qty.setText(Menu.cfri_qty_r_ins);
							row_14_price.setText(Menu.cfri_price_r);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Curly Fries");
							row_15_type.setText("*regular");
							row_15_rate.setText("120");
							row_15_qty.setText(Menu.cfri_qty_r_ins);
							row_15_price.setText(Menu.cfri_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Curly Fries");
							row_16_type.setText("*regular");
							row_16_rate.setText("120");
							row_16_qty.setText(Menu.cfri_qty_r_ins);
							row_16_price.setText(Menu.cfri_price_r);
						}
						}
					}
					if(Menu.flag_cf_h==1) {
						if(Menu.cfri_qty_lint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Curly Fries");
							row_1_type.setText("*large");
							row_1_rate.setText("160");
							row_1_qty.setText(Menu.cfri_qty_l_ins);
							row_1_price.setText(Menu.cfri_price_l);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Curly Fries");
							row_2_type.setText("*large");
							row_2_rate.setText("160");
							row_2_qty.setText(Menu.cfri_qty_l_ins);
							row_2_price.setText(Menu.cfri_price_l);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Curly Fries");
							row_3_type.setText("*large");
							row_3_rate.setText("160");
							row_3_qty.setText(Menu.cfri_qty_l_ins);
							row_3_price.setText(Menu.cfri_price_l);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Curly Fries");
							row_4_type.setText("*large");
							row_4_rate.setText("160");
							row_4_qty.setText(Menu.cfri_qty_l_ins);
							row_4_price.setText(Menu.cfri_price_l);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Curly Fries");
							row_5_type.setText("*large");
							row_5_rate.setText("160");
							row_5_qty.setText(Menu.cfri_qty_l_ins);
							row_5_price.setText(Menu.cfri_price_l);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Curly Fries");
							row_6_type.setText("*large");
							row_6_rate.setText("160");
							row_6_qty.setText(Menu.cfri_qty_l_ins);
							row_6_price.setText(Menu.cfri_price_l);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Curly Fries");
							row_7_type.setText("*large");
							row_7_rate.setText("160");
							row_7_qty.setText(Menu.cfri_qty_l_ins);
							row_7_price.setText(Menu.cfri_price_l);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Curly Fries");
							row_8_type.setText("*large");
							row_8_rate.setText("160");
							row_8_qty.setText(Menu.cfri_qty_l_ins);
							row_8_price.setText(Menu.cfri_price_l);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Curly Fries");
							row_9_type.setText("*large");
							row_9_rate.setText("160");
							row_9_qty.setText(Menu.cfri_qty_l_ins);
							row_9_price.setText(Menu.cfri_price_l);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Curly Fries");
							row_10_type.setText("*large");
							row_10_rate.setText("160");
							row_10_qty.setText(Menu.cfri_qty_l_ins);
							row_10_price.setText(Menu.cfri_price_l);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Curly Fries");
							row_11_type.setText("*large");
							row_11_rate.setText("160");
							row_11_qty.setText(Menu.cfri_qty_l_ins);
							row_11_price.setText(Menu.cfri_price_l);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Curly Fries");
							row_12_type.setText("*large");
							row_12_rate.setText("160");
							row_12_qty.setText(Menu.cfri_qty_l_ins);
							row_12_price.setText(Menu.cfri_price_l);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Curly Fries");
							row_13_type.setText("*large");
							row_13_rate.setText("160");
							row_13_qty.setText(Menu.cfri_qty_l_ins);
							row_13_price.setText(Menu.cfri_price_l);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Curly Fries");
							row_14_type.setText("*large");
							row_14_rate.setText("160");
							row_14_qty.setText(Menu.cfri_qty_l_ins);
							row_14_price.setText(Menu.cfri_price_l);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Curly Fries");
							row_15_type.setText("*large");
							row_15_rate.setText("160");
							row_15_qty.setText(Menu.cfri_qty_l_ins);
							row_15_price.setText(Menu.cfri_price_l);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Curly Fries");
							row_16_type.setText("*large");
							row_16_rate.setText("160");
							row_16_qty.setText(Menu.cfri_qty_l_ins);
							row_16_price.setText(Menu.cfri_price_l);
						}
					}}
					}
				//------------------------------------------------------
				if(Menu.flag_pw==1) {
					if(Menu.flag_pw_m==1) {
						if(Menu.pw_qty_rint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Potato Wedges");
							row_1_type.setText("*regular");
							row_1_rate.setText("100");
							row_1_qty.setText(Menu.pw_qty_r_ins);
							row_1_price.setText(Menu.pw_price_r);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Potato Wedges");
							row_2_type.setText("*regular");
							row_2_rate.setText("100");
							row_2_qty.setText(Menu.pw_qty_r_ins);
							row_2_price.setText(Menu.pw_price_r);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Potato Wedges");
							row_3_type.setText("*regular");
							row_3_rate.setText("100");
							row_3_qty.setText(Menu.pw_qty_r_ins);
							row_3_price.setText(Menu.pw_price_r);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Potato Wedges");
							row_4_type.setText("*regular");
							row_4_rate.setText("100");
							row_4_qty.setText(Menu.pw_qty_r_ins);
							row_4_price.setText(Menu.pw_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Potato Wedges");
							row_5_type.setText("*regular");
							row_5_rate.setText("100");
							row_5_qty.setText(Menu.pw_qty_r_ins);
							row_5_price.setText(Menu.pw_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Potato Wedges");
							row_5_type.setText("*regular");
							row_5_rate.setText("100");
							row_5_qty.setText(Menu.pw_qty_r_ins);
							row_5_price.setText(Menu.pw_price_r);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Potato Wedges");
							row_6_type.setText("*regular");
							row_6_rate.setText("100");
							row_6_qty.setText(Menu.pw_qty_r_ins);
							row_6_price.setText(Menu.pw_price_r);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Potato Wedges");
							row_7_type.setText("*regular");
							row_7_rate.setText("100");
							row_7_qty.setText(Menu.pw_qty_r_ins);
							row_7_price.setText(Menu.pw_price_r);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Potato Wedges");
							row_8_type.setText("*regular");
							row_8_rate.setText("100");
							row_8_qty.setText(Menu.pw_qty_r_ins);
							row_8_price.setText(Menu.pw_price_r);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Potato Wedges");
							row_9_type.setText("*regular");
							row_9_rate.setText("100");
							row_9_qty.setText(Menu.pw_qty_r_ins);
							row_9_price.setText(Menu.pw_price_r);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Potato Wedges");
							row_10_type.setText("*regular");
							row_10_rate.setText("100");
							row_10_qty.setText(Menu.pw_qty_r_ins);
							row_10_price.setText(Menu.pw_price_r);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Potato Wedges");
							row_11_type.setText("*regular");
							row_11_rate.setText("100");
							row_11_qty.setText(Menu.pw_qty_r_ins);
							row_11_price.setText(Menu.pw_price_r);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Potato Wedges");
							row_12_type.setText("*regular");
							row_12_rate.setText("100");
							row_12_qty.setText(Menu.pw_qty_r_ins);
							row_12_price.setText(Menu.pw_price_r);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Potato Wedges");
							row_13_type.setText("*regular");
							row_13_rate.setText("100");
							row_13_qty.setText(Menu.pw_qty_r_ins);
							row_13_price.setText(Menu.pw_price_r);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Potato Wedges");
							row_14_type.setText("*regular");
							row_14_rate.setText("100");
							row_14_qty.setText(Menu.pw_qty_r_ins);
							row_14_price.setText(Menu.pw_price_r);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Potato Wedges");
							row_15_type.setText("*regular");
							row_15_rate.setText("100");
							row_15_qty.setText(Menu.pw_qty_r_ins);
							row_15_price.setText(Menu.pw_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Potato Wedges");
							row_16_type.setText("*regular");
							row_16_rate.setText("100");
							row_16_qty.setText(Menu.pw_qty_r_ins);
							row_16_price.setText(Menu.pw_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Potato Wedges");
							row_16_type.setText("*regular");
							row_16_rate.setText("100");
							row_16_qty.setText(Menu.pw_qty_r_ins);
							row_16_price.setText(Menu.pw_price_r);
						}
						}
					}
					if(Menu.flag_pw_h==1) {
						if(Menu.pw_qty_lint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Potato Wedges");
							row_1_type.setText("*large");
							row_1_rate.setText("140");
							row_1_qty.setText(Menu.pw_qty_l_ins);
							row_1_price.setText(Menu.pw_price_l);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Potato Wedges");
							row_2_type.setText("*large");
							row_2_rate.setText("140");
							row_2_qty.setText(Menu.pw_qty_l_ins);
							row_2_price.setText(Menu.pw_price_l);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Potato Wedges");
							row_3_type.setText("*large");
							row_3_rate.setText("140");
							row_3_qty.setText(Menu.pw_qty_l_ins);
							row_3_price.setText(Menu.pw_price_l);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Potato Wedges");
							row_4_type.setText("*large");
							row_4_rate.setText("140");
							row_4_qty.setText(Menu.pw_qty_l_ins);
							row_4_price.setText(Menu.pw_price_l);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Potato Wedges");
							row_5_type.setText("*large");
							row_5_rate.setText("140");
							row_5_qty.setText(Menu.pw_qty_l_ins);
							row_5_price.setText(Menu.pw_price_l);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Potato Wedges");
							row_6_type.setText("*large");
							row_6_rate.setText("140");
							row_6_qty.setText(Menu.pw_qty_l_ins);
							row_6_price.setText(Menu.pw_price_l);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Potato Wedges");
							row_7_type.setText("*large");
							row_7_rate.setText("140");
							row_7_qty.setText(Menu.pw_qty_l_ins);
							row_7_price.setText(Menu.pw_price_l);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Potato Wedges");
							row_8_type.setText("*large");
							row_8_rate.setText("140");
							row_8_qty.setText(Menu.pw_qty_l_ins);
							row_8_price.setText(Menu.pw_price_l);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Potato Wedges");
							row_9_type.setText("*large");
							row_9_rate.setText("140");
							row_9_qty.setText(Menu.pw_qty_l_ins);
							row_9_price.setText(Menu.pw_price_l);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Potato Wedges");
							row_10_type.setText("*large");
							row_10_rate.setText("140");
							row_10_qty.setText(Menu.pw_qty_l_ins);
							row_10_price.setText(Menu.pw_price_l);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Potato Wedges");
							row_11_type.setText("*large");
							row_11_rate.setText("140");
							row_11_qty.setText(Menu.pw_qty_l_ins);
							row_11_price.setText(Menu.pw_price_l);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Potato Wedges");
							row_12_type.setText("*large");
							row_12_rate.setText("140");
							row_12_qty.setText(Menu.pw_qty_l_ins);
							row_12_price.setText(Menu.pw_price_l);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Potato Wedges");
							row_13_type.setText("*large");
							row_13_rate.setText("140");
							row_13_qty.setText(Menu.pw_qty_l_ins);
							row_13_price.setText(Menu.pw_price_l);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Potato Wedges");
							row_14_type.setText("*large");
							row_14_rate.setText("140");
							row_14_qty.setText(Menu.pw_qty_l_ins);
							row_14_price.setText(Menu.pw_price_l);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Potato Wedges");
							row_15_type.setText("*large");
							row_15_rate.setText("140");
							row_15_qty.setText(Menu.pw_qty_l_ins);
							row_15_price.setText(Menu.pw_price_l);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Potato Wedges");
							row_16_type.setText("*large");
							row_16_rate.setText("140");
							row_16_qty.setText(Menu.pw_qty_l_ins);
							row_16_price.setText(Menu.pw_price_l);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Potato Wedges");
							row_16_type.setText("*large");
							row_16_rate.setText("140");
							row_16_qty.setText(Menu.pw_qty_l_ins);
							row_16_price.setText(Menu.pw_price_l);
						}
					}}
					}
				//------------------------------------------------------
				if(Menu.flag_ccb==1) {
					if(Menu.flag_ccb_m==1) {
						if(Menu.ccb_qty_rint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Chicken Cheesy Bites");
							row_1_type.setText("*regular");
							row_1_rate.setText("120");
							row_1_qty.setText(Menu.ccb_qty_r_ins);
							row_1_price.setText(Menu.ccb_price_r);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Chicken Cheesy Bites");
							row_2_type.setText("*regular");
							row_2_rate.setText("120");
							row_2_qty.setText(Menu.ccb_qty_r_ins);
							row_2_price.setText(Menu.ccb_price_r);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Chicken Cheesy Bites");
							row_3_type.setText("*regular");
							row_3_rate.setText("120");
							row_3_qty.setText(Menu.ccb_qty_r_ins);
							row_3_price.setText(Menu.ccb_price_r);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Chicken Cheesy Bites");
							row_4_type.setText("*regular");
							row_4_rate.setText("120");
							row_4_qty.setText(Menu.ccb_qty_r_ins);
							row_4_price.setText(Menu.ccb_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Chicken Cheesy Bites");
							row_5_type.setText("*regular");
							row_5_rate.setText("120");
							row_5_qty.setText(Menu.ccb_qty_r_ins);
							row_5_price.setText(Menu.ccb_price_r);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Chicken Cheesy Bites");
							row_6_type.setText("*regular");
							row_6_rate.setText("120");
							row_6_qty.setText(Menu.ccb_qty_r_ins);
							row_6_price.setText(Menu.ccb_price_r);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Chicken Cheesy Bites");
							row_7_type.setText("*regular");
							row_7_rate.setText("120");
							row_7_qty.setText(Menu.ccb_qty_r_ins);
							row_7_price.setText(Menu.ccb_price_r);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Chicken Cheesy Bites");
							row_8_type.setText("*regular");
							row_8_rate.setText("120");
							row_8_qty.setText(Menu.ccb_qty_r_ins);
							row_8_price.setText(Menu.ccb_price_r);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Chicken Cheesy Bites");
							row_9_type.setText("*regular");
							row_9_rate.setText("120");
							row_9_qty.setText(Menu.ccb_qty_r_ins);
							row_9_price.setText(Menu.ccb_price_r);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Chicken Cheesy Bites");
							row_10_type.setText("*regular");
							row_10_rate.setText("120");
							row_10_qty.setText(Menu.ccb_qty_r_ins);
							row_10_price.setText(Menu.ccb_price_r);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Chicken Cheesy Bites");
							row_11_type.setText("*regular");
							row_11_rate.setText("120");
							row_11_qty.setText(Menu.ccb_qty_r_ins);
							row_11_price.setText(Menu.ccb_price_r);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Chicken Cheesy Bites");
							row_12_type.setText("*regular");
							row_12_rate.setText("120");
							row_12_qty.setText(Menu.ccb_qty_r_ins);
							row_12_price.setText(Menu.ccb_price_r);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Chicken Cheesy Bites");
							row_13_type.setText("*regular");
							row_13_rate.setText("120");
							row_13_qty.setText(Menu.ccb_qty_r_ins);
							row_13_price.setText(Menu.ccb_price_r);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Chicken Cheesy Bites");
							row_14_type.setText("*regular");
							row_14_rate.setText("120");
							row_14_qty.setText(Menu.ccb_qty_r_ins);
							row_14_price.setText(Menu.ccb_price_r);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Chicken Cheesy Bites");
							row_15_type.setText("*regular");
							row_15_rate.setText("120");
							row_15_qty.setText(Menu.ccb_qty_r_ins);
							row_15_price.setText(Menu.ccb_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Chicken Cheesy Bites");
							row_16_type.setText("*regular");
							row_16_rate.setText("120");
							row_16_qty.setText(Menu.ccb_qty_r_ins);
							row_16_price.setText(Menu.ccb_price_r);
						}
						}
					}
					if(Menu.flag_ccb_h==1) {
						if(Menu.ccb_qty_lint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Chicken Cheesy Bites");
							row_1_type.setText("*large");
							row_1_rate.setText("210");
							row_1_qty.setText(Menu.ccb_qty_l_ins);
							row_1_price.setText(Menu.ccb_price_l);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Chicken Cheesy Bites");
							row_2_type.setText("*large");
							row_2_rate.setText("210");
							row_2_qty.setText(Menu.ccb_qty_l_ins);
							row_2_price.setText(Menu.ccb_price_l);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Chicken Cheesy Bites");
							row_3_type.setText("*large");
							row_3_rate.setText("210");
							row_3_qty.setText(Menu.ccb_qty_l_ins);
							row_3_price.setText(Menu.ccb_price_l);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Chicken Cheesy Bites");
							row_4_type.setText("*large");
							row_4_rate.setText("210");
							row_4_qty.setText(Menu.ccb_qty_l_ins);
							row_4_price.setText(Menu.ccb_price_l);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Chicken Cheesy Bites");
							row_5_type.setText("*large");
							row_5_rate.setText("210");
							row_5_qty.setText(Menu.ccb_qty_l_ins);
							row_5_price.setText(Menu.ccb_price_l);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Chicken Cheesy Bites");
							row_6_type.setText("*large");
							row_6_rate.setText("210");
							row_6_qty.setText(Menu.ccb_qty_l_ins);
							row_6_price.setText(Menu.ccb_price_l);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Chicken Cheesy Bites");
							row_7_type.setText("*large");
							row_7_rate.setText("210");
							row_7_qty.setText(Menu.ccb_qty_l_ins);
							row_7_price.setText(Menu.ccb_price_l);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Chicken Cheesy Bites");
							row_8_type.setText("*large");
							row_8_rate.setText("210");
							row_8_qty.setText(Menu.ccb_qty_l_ins);
							row_8_price.setText(Menu.ccb_price_l);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Chicken Cheesy Bites");
							row_9_type.setText("*large");
							row_9_rate.setText("210");
							row_9_qty.setText(Menu.ccb_qty_l_ins);
							row_9_price.setText(Menu.ccb_price_l);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Chicken Cheesy Bites");
							row_10_type.setText("*large");
							row_10_rate.setText("210");
							row_10_qty.setText(Menu.ccb_qty_l_ins);
							row_10_price.setText(Menu.ccb_price_l);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Chicken Cheesy Bites");
							row_11_type.setText("*large");
							row_11_rate.setText("210");
							row_11_qty.setText(Menu.ccb_qty_l_ins);
							row_11_price.setText(Menu.ccb_price_l);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Chicken Cheesy Bites");
							row_12_type.setText("*large");
							row_12_rate.setText("210");
							row_12_qty.setText(Menu.ccb_qty_l_ins);
							row_12_price.setText(Menu.ccb_price_l);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Chicken Cheesy Bites");
							row_13_type.setText("*large");
							row_13_rate.setText("210");
							row_13_qty.setText(Menu.ccb_qty_l_ins);
							row_13_price.setText(Menu.ccb_price_l);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Chicken Cheesy Bites");
							row_14_type.setText("*large");
							row_14_rate.setText("210");
							row_14_qty.setText(Menu.ccb_qty_l_ins);
							row_14_price.setText(Menu.ccb_price_l);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Chicken Cheesy Bites");
							row_15_type.setText("*large");
							row_15_rate.setText("210");
							row_15_qty.setText(Menu.ccb_qty_l_ins);
							row_15_price.setText(Menu.ccb_price_l);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Chicken Cheesy Bites");
							row_16_type.setText("*large");
							row_16_rate.setText("210");
							row_16_qty.setText(Menu.ccb_qty_l_ins);
							row_16_price.setText(Menu.ccb_price_l);
						}
					}}
				}
				//------------------------------------------------------
				if(Menu.flag_nwb==1) {
					if(Menu.flag_nwb_m==1) {
						if(Menu.nwb_qty_rint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Naga Wings Barrel");
							row_1_type.setText("*regular");
							row_1_rate.setText("170");
							row_1_qty.setText(Menu.nwb_qty_r_ins);
							row_1_price.setText(Menu.nwb_price_r);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Naga Wings Barrel");
							row_2_type.setText("*regular");
							row_2_rate.setText("170");
							row_2_qty.setText(Menu.nwb_qty_r_ins);
							row_2_price.setText(Menu.nwb_price_r);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Naga Wings Barrel");
							row_3_type.setText("*regular");
							row_3_rate.setText("170");
							row_3_qty.setText(Menu.nwb_qty_r_ins);
							row_3_price.setText(Menu.nwb_price_r);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Naga Wings Barrel");
							row_4_type.setText("*regular");
							row_4_rate.setText("170");
							row_4_qty.setText(Menu.nwb_qty_r_ins);
							row_4_price.setText(Menu.nwb_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Naga Wings Barrel");
							row_5_type.setText("*regular");
							row_5_rate.setText("170");
							row_5_qty.setText(Menu.nwb_qty_r_ins);
							row_5_price.setText(Menu.nwb_price_r);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Naga Wings Barrel");
							row_6_type.setText("*regular");
							row_6_rate.setText("170");
							row_6_qty.setText(Menu.nwb_qty_r_ins);
							row_6_price.setText(Menu.nwb_price_r);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Naga Wings Barrel");
							row_7_type.setText("*regular");
							row_7_rate.setText("170");
							row_7_qty.setText(Menu.nwb_qty_r_ins);
							row_7_price.setText(Menu.nwb_price_r);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Naga Wings Barrel");
							row_8_type.setText("*regular");
							row_8_rate.setText("170");
							row_8_qty.setText(Menu.nwb_qty_r_ins);
							row_8_price.setText(Menu.nwb_price_r);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Naga Wings Barrel");
							row_9_type.setText("*regular");
							row_9_rate.setText("170");
							row_9_qty.setText(Menu.nwb_qty_r_ins);
							row_9_price.setText(Menu.nwb_price_r);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Naga Wings Barrel");
							row_10_type.setText("*regular");
							row_10_rate.setText("170");
							row_10_qty.setText(Menu.nwb_qty_r_ins);
							row_10_price.setText(Menu.nwb_price_r);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Naga Wings Barrel");
							row_11_type.setText("*regular");
							row_11_rate.setText("170");
							row_11_qty.setText(Menu.nwb_qty_r_ins);
							row_11_price.setText(Menu.nwb_price_r);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Naga Wings Barrel");
							row_12_type.setText("*regular");
							row_12_rate.setText("170");
							row_12_qty.setText(Menu.nwb_qty_r_ins);
							row_12_price.setText(Menu.nwb_price_r);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Naga Wings Barrel");
							row_13_type.setText("*regular");
							row_13_rate.setText("170");
							row_13_qty.setText(Menu.nwb_qty_r_ins);
							row_13_price.setText(Menu.nwb_price_r);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Naga Wings Barrel");
							row_14_type.setText("*regular");
							row_14_rate.setText("170");
							row_14_qty.setText(Menu.nwb_qty_r_ins);
							row_14_price.setText(Menu.nwb_price_r);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Naga Wings Barrel");
							row_15_type.setText("*regular");
							row_15_rate.setText("170");
							row_15_qty.setText(Menu.nwb_qty_r_ins);
							row_15_price.setText(Menu.nwb_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Naga Wings Barrel");
							row_16_type.setText("*regular");
							row_16_rate.setText("170");
							row_16_qty.setText(Menu.nwb_qty_r_ins);
							row_16_price.setText(Menu.nwb_price_r);
						}
						}
					}
					if(Menu.flag_nwb_h==1) {
						if(Menu.nwb_qty_lint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Naga Wings Barrel");
							row_1_type.setText("*large");
							row_1_rate.setText("310");
							row_1_qty.setText(Menu.nwb_qty_l_ins);
							row_1_price.setText(Menu.nwb_price_l);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Naga Wings Barrel");
							row_2_type.setText("*large");
							row_2_rate.setText("310");
							row_2_qty.setText(Menu.nwb_qty_l_ins);
							row_2_price.setText(Menu.nwb_price_l);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Naga Wings Barrel");
							row_3_type.setText("*large");
							row_3_rate.setText("310");
							row_3_qty.setText(Menu.nwb_qty_l_ins);
							row_3_price.setText(Menu.nwb_price_l);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Naga Wings Barrel");
							row_4_type.setText("*large");
							row_4_rate.setText("310");
							row_4_qty.setText(Menu.nwb_qty_l_ins);
							row_4_price.setText(Menu.nwb_price_l);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Naga Wings Barrel");
							row_5_type.setText("*large");
							row_5_rate.setText("310");
							row_5_qty.setText(Menu.nwb_qty_l_ins);
							row_5_price.setText(Menu.nwb_price_l);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Naga Wings Barrel");
							row_6_type.setText("*large");
							row_6_rate.setText("310");
							row_6_qty.setText(Menu.nwb_qty_l_ins);
							row_6_price.setText(Menu.nwb_price_l);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Naga Wings Barrel");
							row_7_type.setText("*large");
							row_7_rate.setText("310");
							row_7_qty.setText(Menu.nwb_qty_l_ins);
							row_7_price.setText(Menu.nwb_price_l);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Naga Wings Barrel");
							row_8_type.setText("*large");
							row_8_rate.setText("310");
							row_8_qty.setText(Menu.nwb_qty_l_ins);
							row_8_price.setText(Menu.nwb_price_l);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Naga Wings Barrel");
							row_9_type.setText("*large");
							row_9_rate.setText("310");
							row_9_qty.setText(Menu.nwb_qty_l_ins);
							row_9_price.setText(Menu.nwb_price_l);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Naga Wings Barrel");
							row_10_type.setText("*large");
							row_10_rate.setText("310");
							row_10_qty.setText(Menu.nwb_qty_l_ins);
							row_10_price.setText(Menu.nwb_price_l);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Naga Wings Barrel");
							row_11_type.setText("*large");
							row_11_rate.setText("310");
							row_11_qty.setText(Menu.nwb_qty_l_ins);
							row_11_price.setText(Menu.nwb_price_l);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Naga Wings Barrel");
							row_12_type.setText("*large");
							row_12_rate.setText("310");
							row_12_qty.setText(Menu.nwb_qty_l_ins);
							row_12_price.setText(Menu.nwb_price_l);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Naga Wings Barrel");
							row_13_type.setText("*large");
							row_13_rate.setText("310");
							row_13_qty.setText(Menu.nwb_qty_l_ins);
							row_13_price.setText(Menu.nwb_price_l);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Naga Wings Barrel");
							row_14_type.setText("*large");
							row_14_rate.setText("310");
							row_14_qty.setText(Menu.nwb_qty_l_ins);
							row_14_price.setText(Menu.nwb_price_l);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Naga Wings Barrel");
							row_15_type.setText("*large");
							row_15_rate.setText("310");
							row_15_qty.setText(Menu.nwb_qty_l_ins);
							row_15_price.setText(Menu.nwb_price_l);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Naga Wings Barrel");
							row_16_type.setText("*large");
							row_16_rate.setText("310");
							row_16_qty.setText(Menu.nwb_qty_l_ins);
							row_16_price.setText(Menu.nwb_price_l);
						}
					}}
				}
				//------------------------------------------------------
				if(Menu.flag_cc==1) {
					if(Menu.flag_cc_m==1) {
						if(Menu.cc_qty_rint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Coca-Cola");
							row_1_type.setText("*small");
							row_1_rate.setText("50");
							row_1_qty.setText(Menu.cc_qty_r_ins);
							row_1_price.setText(Menu.cc_price_r);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Coca-Cola");
							row_2_type.setText("*small");
							row_2_rate.setText("50");
							row_2_qty.setText(Menu.cc_qty_r_ins);
							row_2_price.setText(Menu.cc_price_r);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Coca-Cola");
							row_3_type.setText("*small");
							row_3_rate.setText("50");
							row_3_qty.setText(Menu.cc_qty_r_ins);
							row_3_price.setText(Menu.cc_price_r);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Coca-Cola");
							row_4_type.setText("*small");
							row_4_rate.setText("50");
							row_4_qty.setText(Menu.cc_qty_r_ins);
							row_4_price.setText(Menu.cc_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Coca-Cola");
							row_5_type.setText("*small");
							row_5_rate.setText("50");
							row_5_qty.setText(Menu.cc_qty_r_ins);
							row_5_price.setText(Menu.cc_price_r);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Coca-Cola");
							row_6_type.setText("*small");
							row_6_rate.setText("50");
							row_6_qty.setText(Menu.cc_qty_r_ins);
							row_6_price.setText(Menu.cc_price_r);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Coca-Cola");
							row_7_type.setText("*small");
							row_7_rate.setText("50");
							row_7_qty.setText(Menu.cc_qty_r_ins);
							row_7_price.setText(Menu.cc_price_r);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Coca-Cola");
							row_8_type.setText("*small");
							row_8_rate.setText("50");
							row_8_qty.setText(Menu.cc_qty_r_ins);
							row_8_price.setText(Menu.cc_price_r);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Coca-Cola");
							row_9_type.setText("*small");
							row_9_rate.setText("50");
							row_9_qty.setText(Menu.cc_qty_r_ins);
							row_9_price.setText(Menu.cc_price_r);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Coca-Cola");
							row_10_type.setText("*small");
							row_10_rate.setText("50");
							row_10_qty.setText(Menu.cc_qty_r_ins);
							row_10_price.setText(Menu.cc_price_r);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Coca-Cola");
							row_11_type.setText("*small");
							row_11_rate.setText("50");
							row_11_qty.setText(Menu.cc_qty_r_ins);
							row_11_price.setText(Menu.cc_price_r);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Coca-Cola");
							row_12_type.setText("*small");
							row_12_rate.setText("50");
							row_12_qty.setText(Menu.cc_qty_r_ins);
							row_12_price.setText(Menu.cc_price_r);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Coca-Cola");
							row_13_type.setText("*small");
							row_13_rate.setText("50");
							row_13_qty.setText(Menu.cc_qty_r_ins);
							row_13_price.setText(Menu.cc_price_r);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Coca-Cola");
							row_14_type.setText("*small");
							row_14_rate.setText("50");
							row_14_qty.setText(Menu.cc_qty_r_ins);
							row_14_price.setText(Menu.cc_price_r);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Coca-Cola");
							row_15_type.setText("*small");
							row_15_rate.setText("50");
							row_15_qty.setText(Menu.cc_qty_r_ins);
							row_15_price.setText(Menu.cc_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Coca-Cola");
							row_16_type.setText("*small");
							row_16_rate.setText("50");
							row_16_qty.setText(Menu.cc_qty_r_ins);
							row_16_price.setText(Menu.cc_price_r);
						}
						}
					}
					if(Menu.flag_cc_h==1) {
						if(Menu.cc_qty_lint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Coca-Cola");
							row_1_type.setText("*large");
							row_1_rate.setText("70");
							row_1_qty.setText(Menu.cc_qty_l_ins);
							row_1_price.setText(Menu.cc_price_l);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Coca-Cola");
							row_2_type.setText("*large");
							row_2_rate.setText("70");
							row_2_qty.setText(Menu.cc_qty_l_ins);
							row_2_price.setText(Menu.cc_price_l);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Coca-Cola");
							row_3_type.setText("*large");
							row_3_rate.setText("70");
							row_3_qty.setText(Menu.cc_qty_l_ins);
							row_3_price.setText(Menu.cc_price_l);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Coca-Cola");
							row_4_type.setText("*large");
							row_4_rate.setText("70");
							row_4_qty.setText(Menu.cc_qty_l_ins);
							row_4_price.setText(Menu.cc_price_l);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Coca-Cola");
							row_5_type.setText("*large");
							row_5_rate.setText("70");
							row_5_qty.setText(Menu.cc_qty_l_ins);
							row_5_price.setText(Menu.cc_price_l);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Coca-Cola");
							row_6_type.setText("*large");
							row_6_rate.setText("70");
							row_6_qty.setText(Menu.cc_qty_l_ins);
							row_6_price.setText(Menu.cc_price_l);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Coca-Cola");
							row_7_type.setText("*large");
							row_7_rate.setText("70");
							row_7_qty.setText(Menu.cc_qty_l_ins);
							row_7_price.setText(Menu.cc_price_l);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Coca-Cola");
							row_8_type.setText("*large");
							row_8_rate.setText("70");
							row_8_qty.setText(Menu.cc_qty_l_ins);
							row_8_price.setText(Menu.cc_price_l);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Coca-Cola");
							row_9_type.setText("*large");
							row_9_rate.setText("70");
							row_9_qty.setText(Menu.cc_qty_l_ins);
							row_9_price.setText(Menu.cc_price_l);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Coca-Cola");
							row_10_type.setText("*large");
							row_10_rate.setText("70");
							row_10_qty.setText(Menu.cc_qty_l_ins);
							row_10_price.setText(Menu.cc_price_l);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Coca-Cola");
							row_11_type.setText("*large");
							row_11_rate.setText("70");
							row_11_qty.setText(Menu.cc_qty_l_ins);
							row_11_price.setText(Menu.cc_price_l);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Coca-Cola");
							row_12_type.setText("*large");
							row_12_rate.setText("70");
							row_12_qty.setText(Menu.cc_qty_l_ins);
							row_12_price.setText(Menu.cc_price_l);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Coca-Cola");
							row_13_type.setText("*large");
							row_13_rate.setText("70");
							row_13_qty.setText(Menu.cc_qty_l_ins);
							row_13_price.setText(Menu.cc_price_l);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Coca-Cola");
							row_14_type.setText("*large");
							row_14_rate.setText("70");
							row_14_qty.setText(Menu.cc_qty_l_ins);
							row_14_price.setText(Menu.cc_price_l);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Coca-Cola");
							row_15_type.setText("*large");
							row_15_rate.setText("70");
							row_15_qty.setText(Menu.cc_qty_l_ins);
							row_15_price.setText(Menu.cc_price_l);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Coca-Cola");
							row_16_type.setText("*large");
							row_16_rate.setText("70");
							row_16_qty.setText(Menu.cc_qty_l_ins);
							row_16_price.setText(Menu.cc_price_l);
						}
					}}
					}
				//-------------------------------------------------
				if(Menu.flag_s==1) {
					if(Menu.flag_s_m==1) {
						if(Menu.s_qty_rint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Sprite");
							row_1_type.setText("*small");
							row_1_rate.setText("50");
							row_1_qty.setText(Menu.s_qty_r_ins);
							row_1_price.setText(Menu.s_price_r);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Sprite");
							row_2_type.setText("*small");
							row_2_rate.setText("50");
							row_2_qty.setText(Menu.s_qty_r_ins);
							row_2_price.setText(Menu.s_price_r);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Sprite");
							row_3_type.setText("*small");
							row_3_rate.setText("50");
							row_3_qty.setText(Menu.s_qty_r_ins);
							row_3_price.setText(Menu.s_price_r);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Sprite");
							row_4_type.setText("*small");
							row_4_rate.setText("50");
							row_4_qty.setText(Menu.s_qty_r_ins);
							row_4_price.setText(Menu.s_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Sprite");
							row_5_type.setText("*small");
							row_5_rate.setText("50");
							row_5_qty.setText(Menu.s_qty_r_ins);
							row_5_price.setText(Menu.s_price_r);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Sprite");
							row_6_type.setText("*small");
							row_6_rate.setText("50");
							row_6_qty.setText(Menu.s_qty_r_ins);
							row_6_price.setText(Menu.s_price_r);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Sprite");
							row_7_type.setText("*small");
							row_7_rate.setText("50");
							row_7_qty.setText(Menu.s_qty_r_ins);
							row_7_price.setText(Menu.s_price_r);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Sprite");
							row_8_type.setText("*small");
							row_8_rate.setText("50");
							row_8_qty.setText(Menu.s_qty_r_ins);
							row_8_price.setText(Menu.s_price_r);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Sprite");
							row_9_type.setText("*small");
							row_9_rate.setText("50");
							row_9_qty.setText(Menu.s_qty_r_ins);
							row_9_price.setText(Menu.s_price_r);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Sprite");
							row_10_type.setText("*small");
							row_10_rate.setText("50");
							row_10_qty.setText(Menu.s_qty_r_ins);
							row_10_price.setText(Menu.s_price_r);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Sprite");
							row_11_type.setText("*small");
							row_11_rate.setText("50");
							row_11_qty.setText(Menu.s_qty_r_ins);
							row_11_price.setText(Menu.s_price_r);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Sprite");
							row_12_type.setText("*small");
							row_12_rate.setText("50");
							row_12_qty.setText(Menu.s_qty_r_ins);
							row_12_price.setText(Menu.s_price_r);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Sprite");
							row_13_type.setText("*small");
							row_13_rate.setText("50");
							row_13_qty.setText(Menu.s_qty_r_ins);
							row_13_price.setText(Menu.s_price_r);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Sprite");
							row_14_type.setText("*small");
							row_14_rate.setText("50");
							row_14_qty.setText(Menu.s_qty_r_ins);
							row_14_price.setText(Menu.s_price_r);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Sprite");
							row_15_type.setText("*small");
							row_15_rate.setText("50");
							row_15_qty.setText(Menu.s_qty_r_ins);
							row_15_price.setText(Menu.s_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Sprite");
							row_16_type.setText("*small");
							row_16_rate.setText("50");
							row_16_qty.setText(Menu.s_qty_r_ins);
							row_16_price.setText(Menu.s_price_r);
						}
						}
					}
					if(Menu.flag_s_h==1) {
						if(Menu.s_qty_lint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Sprite");
							row_1_type.setText("*large");
							row_1_rate.setText("70");
							row_1_qty.setText(Menu.s_qty_l_ins);
							row_1_price.setText(Menu.s_price_l);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Sprite");
							row_2_type.setText("*large");
							row_2_rate.setText("70");
							row_2_qty.setText(Menu.s_qty_l_ins);
							row_2_price.setText(Menu.s_price_l);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Sprite");
							row_3_type.setText("*large");
							row_3_rate.setText("70");
							row_3_qty.setText(Menu.s_qty_l_ins);
							row_3_price.setText(Menu.s_price_l);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Sprite");
							row_4_type.setText("*large");
							row_4_rate.setText("70");
							row_4_qty.setText(Menu.s_qty_l_ins);
							row_4_price.setText(Menu.s_price_l);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Sprite");
							row_5_type.setText("*large");
							row_5_rate.setText("70");
							row_5_qty.setText(Menu.s_qty_l_ins);
							row_5_price.setText(Menu.s_price_l);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Sprite");
							row_6_type.setText("*large");
							row_6_rate.setText("70");
							row_6_qty.setText(Menu.s_qty_l_ins);
							row_6_price.setText(Menu.s_price_l);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Sprite");
							row_7_type.setText("*large");
							row_7_rate.setText("70");
							row_7_qty.setText(Menu.s_qty_l_ins);
							row_7_price.setText(Menu.s_price_l);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Sprite");
							row_8_type.setText("*large");
							row_8_rate.setText("70");
							row_8_qty.setText(Menu.s_qty_l_ins);
							row_8_price.setText(Menu.s_price_l);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Sprite");
							row_9_type.setText("*large");
							row_9_rate.setText("70");
							row_9_qty.setText(Menu.s_qty_l_ins);
							row_9_price.setText(Menu.s_price_l);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Sprite");
							row_10_type.setText("*large");
							row_10_rate.setText("70");
							row_10_qty.setText(Menu.s_qty_l_ins);
							row_10_price.setText(Menu.s_price_l);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Sprite");
							row_11_type.setText("*large");
							row_11_rate.setText("70");
							row_11_qty.setText(Menu.s_qty_l_ins);
							row_11_price.setText(Menu.s_price_l);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Sprite");
							row_12_type.setText("*large");
							row_12_rate.setText("70");
							row_12_qty.setText(Menu.s_qty_l_ins);
							row_12_price.setText(Menu.s_price_l);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Sprite");
							row_13_type.setText("*large");
							row_13_rate.setText("70");
							row_13_qty.setText(Menu.s_qty_l_ins);
							row_13_price.setText(Menu.s_price_l);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Sprite");
							row_14_type.setText("*large");
							row_14_rate.setText("70");
							row_14_qty.setText(Menu.s_qty_l_ins);
							row_14_price.setText(Menu.s_price_l);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Sprite");
							row_15_type.setText("*large");
							row_15_rate.setText("70");
							row_15_qty.setText(Menu.s_qty_l_ins);
							row_15_price.setText(Menu.s_price_l);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Sprite");
							row_16_type.setText("*large");
							row_16_rate.setText("70");
							row_16_qty.setText(Menu.s_qty_l_ins);
							row_16_price.setText(Menu.s_price_l);
						}
						
					}}
					}
				//-------------------------------------------------
				if(Menu.flag_fa==1) {
					if(Menu.flag_fa_m==1) {
						if(Menu.fa_qty_rint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Fanta");
							row_1_type.setText("*small");
							row_1_rate.setText("50");
							row_1_qty.setText(Menu.fa_qty_r_ins);
							row_1_price.setText(Menu.fa_price_r);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Fanta");
							row_2_type.setText("*small");
							row_2_rate.setText("50");
							row_2_qty.setText(Menu.fa_qty_r_ins);
							row_2_price.setText(Menu.fa_price_r);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Fanta");
							row_3_type.setText("*small");
							row_3_rate.setText("50");
							row_3_qty.setText(Menu.fa_qty_r_ins);
							row_3_price.setText(Menu.fa_price_r);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Fanta");
							row_4_type.setText("*small");
							row_4_rate.setText("50");
							row_4_qty.setText(Menu.fa_qty_r_ins);
							row_4_price.setText(Menu.fa_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Fanta");
							row_5_type.setText("*small");
							row_5_rate.setText("50");
							row_5_qty.setText(Menu.fa_qty_r_ins);
							row_5_price.setText(Menu.fa_price_r);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Fanta");
							row_6_type.setText("*small");
							row_6_rate.setText("50");
							row_6_qty.setText(Menu.fa_qty_r_ins);
							row_6_price.setText(Menu.fa_price_r);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Fanta");
							row_7_type.setText("*small");
							row_7_rate.setText("50");
							row_7_qty.setText(Menu.fa_qty_r_ins);
							row_7_price.setText(Menu.fa_price_r);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Fanta");
							row_8_type.setText("*small");
							row_8_rate.setText("50");
							row_8_qty.setText(Menu.fa_qty_r_ins);
							row_8_price.setText(Menu.fa_price_r);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Fanta");
							row_9_type.setText("*small");
							row_9_rate.setText("50");
							row_9_qty.setText(Menu.fa_qty_r_ins);
							row_9_price.setText(Menu.fa_price_r);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Fanta");
							row_10_type.setText("*small");
							row_10_rate.setText("50");
							row_10_qty.setText(Menu.fa_qty_r_ins);
							row_10_price.setText(Menu.fa_price_r);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Fanta");
							row_11_type.setText("*small");
							row_11_rate.setText("50");
							row_11_qty.setText(Menu.fa_qty_r_ins);
							row_11_price.setText(Menu.fa_price_r);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Fanta");
							row_12_type.setText("*small");
							row_12_rate.setText("50");
							row_12_qty.setText(Menu.fa_qty_r_ins);
							row_12_price.setText(Menu.fa_price_r);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Fanta");
							row_13_type.setText("*small");
							row_13_rate.setText("50");
							row_13_qty.setText(Menu.fa_qty_r_ins);
							row_13_price.setText(Menu.fa_price_r);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Fanta");
							row_14_type.setText("*small");
							row_14_rate.setText("50");
							row_14_qty.setText(Menu.fa_qty_r_ins);
							row_14_price.setText(Menu.fa_price_r);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Fanta");
							row_15_type.setText("*small");
							row_15_rate.setText("50");
							row_15_qty.setText(Menu.fa_qty_r_ins);
							row_15_price.setText(Menu.fa_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Fanta");
							row_16_type.setText("*small");
							row_16_rate.setText("50");
							row_16_qty.setText(Menu.fa_qty_r_ins);
							row_16_price.setText(Menu.fa_price_r);
						}
						}
					}
					if(Menu.flag_fa_h==1) {
						if(Menu.fa_qty_lint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Fanta");
							row_1_type.setText("*large");
							row_1_rate.setText("70");
							row_1_qty.setText(Menu.fa_qty_l_ins);
							row_1_price.setText(Menu.fa_price_l);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Fanta");
							row_2_type.setText("*large");
							row_2_rate.setText("70");
							row_2_qty.setText(Menu.fa_qty_l_ins);
							row_2_price.setText(Menu.fa_price_l);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Fanta");
							row_3_type.setText("*large");
							row_3_rate.setText("70");
							row_3_qty.setText(Menu.fa_qty_l_ins);
							row_3_price.setText(Menu.fa_price_l);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Fanta");
							row_4_type.setText("*large");
							row_4_rate.setText("70");
							row_4_qty.setText(Menu.fa_qty_l_ins);
							row_4_price.setText(Menu.fa_price_l);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Fanta");
							row_5_type.setText("*large");
							row_5_rate.setText("70");
							row_5_qty.setText(Menu.fa_qty_l_ins);
							row_5_price.setText(Menu.fa_price_l);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Fanta");
							row_6_type.setText("*large");
							row_6_rate.setText("70");
							row_6_qty.setText(Menu.fa_qty_l_ins);
							row_6_price.setText(Menu.fa_price_l);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Fanta");
							row_7_type.setText("*large");
							row_7_rate.setText("70");
							row_7_qty.setText(Menu.fa_qty_l_ins);
							row_7_price.setText(Menu.fa_price_l);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Fanta");
							row_8_type.setText("*large");
							row_8_rate.setText("70");
							row_8_qty.setText(Menu.fa_qty_l_ins);
							row_8_price.setText(Menu.fa_price_l);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Fanta");
							row_9_type.setText("*large");
							row_9_rate.setText("70");
							row_9_qty.setText(Menu.fa_qty_l_ins);
							row_9_price.setText(Menu.fa_price_l);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Fanta");
							row_10_type.setText("*large");
							row_10_rate.setText("70");
							row_10_qty.setText(Menu.fa_qty_l_ins);
							row_10_price.setText(Menu.fa_price_l);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Fanta");
							row_11_type.setText("*large");
							row_11_rate.setText("70");
							row_11_qty.setText(Menu.fa_qty_l_ins);
							row_11_price.setText(Menu.fa_price_l);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Fanta");
							row_12_type.setText("*large");
							row_12_rate.setText("70");
							row_12_qty.setText(Menu.fa_qty_l_ins);
							row_12_price.setText(Menu.fa_price_l);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Fanta");
							row_13_type.setText("*large");
							row_13_rate.setText("70");
							row_13_qty.setText(Menu.fa_qty_l_ins);
							row_13_price.setText(Menu.fa_price_l);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Fanta");
							row_14_type.setText("*large");
							row_14_rate.setText("70");
							row_14_qty.setText(Menu.fa_qty_l_ins);
							row_14_price.setText(Menu.fa_price_l);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Fanta");
							row_15_type.setText("*large");
							row_15_rate.setText("70");
							row_15_qty.setText(Menu.fa_qty_l_ins);
							row_15_price.setText(Menu.fa_price_l);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Fanta");
							row_16_type.setText("*large");
							row_16_rate.setText("70");
							row_16_qty.setText(Menu.fa_qty_l_ins);
							row_16_price.setText(Menu.fa_price_l);
						}
					}}
					}
				//-------------------------------------------------
				if(Menu.flag_mw==1) {
						if(Menu.mw_qty_rint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Mineral Water (500ml)");
							row_1_rate.setText("25");
							row_1_qty.setText(Menu.mw_qty_r_ins);
							row_1_price.setText(Menu.mw_price_r);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Mineral Water (500ml)");
							row_2_rate.setText("25");
							row_2_qty.setText(Menu.mw_qty_r_ins);
							row_2_price.setText(Menu.mw_price_r);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Mineral Water (500ml)");
							row_3_rate.setText("25");
							row_3_qty.setText(Menu.mw_qty_r_ins);
							row_3_price.setText(Menu.mw_price_r);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Mineral Water (500ml)");
							row_4_rate.setText("25");
							row_4_qty.setText(Menu.mw_qty_r_ins);
							row_4_price.setText(Menu.mw_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Mineral Water (500ml)");
							row_5_rate.setText("25");
							row_5_qty.setText(Menu.mw_qty_r_ins);
							row_5_price.setText(Menu.mw_price_r);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Mineral Water (500ml)");
							row_6_rate.setText("25");
							row_6_qty.setText(Menu.mw_qty_r_ins);
							row_6_price.setText(Menu.mw_price_r);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Mineral Water (500ml)");
							row_7_rate.setText("25");
							row_7_qty.setText(Menu.mw_qty_r_ins);
							row_7_price.setText(Menu.mw_price_r);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Mineral Water (500ml)");
							row_8_rate.setText("25");
							row_8_qty.setText(Menu.mw_qty_r_ins);
							row_8_price.setText(Menu.mw_price_r);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Mineral Water (500ml)");
							row_9_rate.setText("25");
							row_9_qty.setText(Menu.mw_qty_r_ins);
							row_9_price.setText(Menu.mw_price_r);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Mineral Water (500ml)");
							row_10_rate.setText("25");
							row_10_qty.setText(Menu.mw_qty_r_ins);
							row_10_price.setText(Menu.mw_price_r);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Mineral Water (500ml)");
							row_11_rate.setText("25");
							row_11_qty.setText(Menu.mw_qty_r_ins);
							row_11_price.setText(Menu.mw_price_r);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Mineral Water (500ml)");
							row_12_rate.setText("25");
							row_12_qty.setText(Menu.mw_qty_r_ins);
							row_12_price.setText(Menu.mw_price_r);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Mineral Water (500ml)");
							row_13_rate.setText("25");
							row_13_qty.setText(Menu.mw_qty_r_ins);
							row_13_price.setText(Menu.mw_price_r);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Mineral Water (500ml)");
							row_14_rate.setText("25");
							row_14_qty.setText(Menu.mw_qty_r_ins);
							row_14_price.setText(Menu.mw_price_r);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Mineral Water (500ml)");
							row_15_rate.setText("25");
							row_15_qty.setText(Menu.mw_qty_r_ins);
							row_15_price.setText(Menu.mw_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Mineral Water (500ml)");
							row_16_rate.setText("25");
							row_16_qty.setText(Menu.mw_qty_r_ins);
							row_16_price.setText(Menu.mw_price_r);
						}
						}
				}
				
				//-------------------------------------------------
				if(Menu.flag_ca==1) {
					if(Menu.flag_ca_m==1) {
						if(Menu.ca_qty_rint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Caramel");
							row_1_type.setText("*small");
							row_1_rate.setText("90");
							row_1_qty.setText(Menu.ca_qty_r_ins);
							row_1_price.setText(Menu.ca_price_r);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Caramel");
							row_2_type.setText("*small");
							row_2_rate.setText("90");
							row_2_qty.setText(Menu.ca_qty_r_ins);
							row_2_price.setText(Menu.ca_price_r);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Caramel");
							row_3_type.setText("*small");
							row_3_rate.setText("90");
							row_3_qty.setText(Menu.ca_qty_r_ins);
							row_3_price.setText(Menu.ca_price_r);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Caramel");
							row_4_type.setText("*small");
							row_4_rate.setText("90");
							row_4_qty.setText(Menu.ca_qty_r_ins);
							row_4_price.setText(Menu.ca_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Caramel");
							row_5_type.setText("*small");
							row_5_rate.setText("90");
							row_5_qty.setText(Menu.ca_qty_r_ins);
							row_5_price.setText(Menu.ca_price_r);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Caramel");
							row_6_type.setText("*small");
							row_6_rate.setText("90");
							row_6_qty.setText(Menu.ca_qty_r_ins);
							row_6_price.setText(Menu.ca_price_r);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Caramel");
							row_7_type.setText("*small");
							row_7_rate.setText("90");
							row_7_qty.setText(Menu.ca_qty_r_ins);
							row_7_price.setText(Menu.ca_price_r);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Caramel");
							row_8_type.setText("*small");
							row_8_rate.setText("90");
							row_8_qty.setText(Menu.ca_qty_r_ins);
							row_8_price.setText(Menu.ca_price_r);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Caramel");
							row_9_type.setText("*small");
							row_9_rate.setText("90");
							row_9_qty.setText(Menu.ca_qty_r_ins);
							row_9_price.setText(Menu.ca_price_r);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Caramel");
							row_10_type.setText("*small");
							row_10_rate.setText("90");
							row_10_qty.setText(Menu.ca_qty_r_ins);
							row_10_price.setText(Menu.ca_price_r);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Caramel");
							row_11_type.setText("*small");
							row_11_rate.setText("90");
							row_11_qty.setText(Menu.ca_qty_r_ins);
							row_11_price.setText(Menu.ca_price_r);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Caramel");
							row_12_type.setText("*small");
							row_12_rate.setText("90");
							row_12_qty.setText(Menu.ca_qty_r_ins);
							row_12_price.setText(Menu.ca_price_r);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Caramel");
							row_13_type.setText("*small");
							row_13_rate.setText("90");
							row_13_qty.setText(Menu.ca_qty_r_ins);
							row_13_price.setText(Menu.ca_price_r);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Caramel");
							row_14_type.setText("*small");
							row_14_rate.setText("90");
							row_14_qty.setText(Menu.ca_qty_r_ins);
							row_14_price.setText(Menu.ca_price_r);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Caramel");
							row_15_type.setText("*small");
							row_15_rate.setText("90");
							row_15_qty.setText(Menu.ca_qty_r_ins);
							row_15_price.setText(Menu.ca_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Caramel");
							row_16_type.setText("*small");
							row_16_rate.setText("90");
							row_16_qty.setText(Menu.ca_qty_r_ins);
							row_16_price.setText(Menu.ca_price_r);
						}
						}
					}
					if(Menu.flag_ca_h==1) {
						if(Menu.ca_qty_lint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Caramel");
							row_1_type.setText("*large");
							row_1_rate.setText("170");
							row_1_qty.setText(Menu.ca_qty_l_ins);
							row_1_price.setText(Menu.ca_price_l);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Caramel");
							row_2_type.setText("*large");
							row_2_rate.setText("170");
							row_2_qty.setText(Menu.ca_qty_l_ins);
							row_2_price.setText(Menu.ca_price_l);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Caramel");
							row_3_type.setText("*large");
							row_3_rate.setText("170");
							row_3_qty.setText(Menu.ca_qty_l_ins);
							row_3_price.setText(Menu.ca_price_l);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Caramel");
							row_4_type.setText("*large");
							row_4_rate.setText("170");
							row_4_qty.setText(Menu.ca_qty_l_ins);
							row_4_price.setText(Menu.ca_price_l);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Caramel");
							row_5_type.setText("*large");
							row_5_rate.setText("170");
							row_5_qty.setText(Menu.ca_qty_l_ins);
							row_5_price.setText(Menu.ca_price_l);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Caramel");
							row_6_type.setText("*large");
							row_6_rate.setText("170");
							row_6_qty.setText(Menu.ca_qty_l_ins);
							row_6_price.setText(Menu.ca_price_l);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Caramel");
							row_7_type.setText("*large");
							row_7_rate.setText("170");
							row_7_qty.setText(Menu.ca_qty_l_ins);
							row_7_price.setText(Menu.ca_price_l);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Caramel");
							row_8_type.setText("*large");
							row_8_rate.setText("170");
							row_8_qty.setText(Menu.ca_qty_l_ins);
							row_8_price.setText(Menu.ca_price_l);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Caramel");
							row_9_type.setText("*large");
							row_9_rate.setText("170");
							row_9_qty.setText(Menu.ca_qty_l_ins);
							row_9_price.setText(Menu.ca_price_l);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Caramel");
							row_10_type.setText("*large");
							row_10_rate.setText("170");
							row_10_qty.setText(Menu.ca_qty_l_ins);
							row_10_price.setText(Menu.ca_price_l);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Caramel");
							row_11_type.setText("*large");
							row_11_rate.setText("170");
							row_11_qty.setText(Menu.ca_qty_l_ins);
							row_11_price.setText(Menu.ca_price_l);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Caramel");
							row_12_type.setText("*large");
							row_12_rate.setText("170");
							row_12_qty.setText(Menu.ca_qty_l_ins);
							row_12_price.setText(Menu.ca_price_l);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Caramel");
							row_13_type.setText("*large");
							row_13_rate.setText("170");
							row_13_qty.setText(Menu.ca_qty_l_ins);
							row_13_price.setText(Menu.ca_price_l);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Caramel");
							row_14_type.setText("*large");
							row_14_rate.setText("170");
							row_14_qty.setText(Menu.ca_qty_l_ins);
							row_14_price.setText(Menu.ca_price_l);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Caramel");
							row_15_type.setText("*large");
							row_15_rate.setText("170");
							row_15_qty.setText(Menu.ca_qty_l_ins);
							row_15_price.setText(Menu.ca_price_l);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Caramel");
							row_16_type.setText("*large");
							row_16_rate.setText("170");
							row_16_qty.setText(Menu.ca_qty_l_ins);
							row_16_price.setText(Menu.ca_price_l);
						}
					}}
					}
				//-------------------------------------------------
				if(Menu.flag_ch==1) {
					if(Menu.flag_ch_m==1) {
						if(Menu.ch_qty_rint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Chocolate");
							row_1_type.setText("*small");
							row_1_rate.setText("85");
							row_1_qty.setText(Menu.ch_qty_r_ins);
							row_1_price.setText(Menu.ch_price_r);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Chocolate");
							row_2_type.setText("*small");
							row_2_rate.setText("85");
							row_2_qty.setText(Menu.ch_qty_r_ins);
							row_2_price.setText(Menu.ch_price_r);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Chocolate");
							row_3_type.setText("*small");
							row_3_rate.setText("85");
							row_3_qty.setText(Menu.ch_qty_r_ins);
							row_3_price.setText(Menu.ch_price_r);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Chocolate");
							row_4_type.setText("*small");
							row_4_rate.setText("85");
							row_4_qty.setText(Menu.ch_qty_r_ins);
							row_4_price.setText(Menu.ch_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Chocolate");
							row_5_type.setText("*small");
							row_5_rate.setText("85");
							row_5_qty.setText(Menu.ch_qty_r_ins);
							row_5_price.setText(Menu.ch_price_r);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Chocolate");
							row_6_type.setText("*small");
							row_6_rate.setText("85");
							row_6_qty.setText(Menu.ch_qty_r_ins);
							row_6_price.setText(Menu.ch_price_r);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Chocolate");
							row_7_type.setText("*small");
							row_7_rate.setText("85");
							row_7_qty.setText(Menu.ch_qty_r_ins);
							row_7_price.setText(Menu.ch_price_r);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Chocolate");
							row_8_type.setText("*small");
							row_8_rate.setText("85");
							row_8_qty.setText(Menu.ch_qty_r_ins);
							row_8_price.setText(Menu.ch_price_r);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Chocolate");
							row_9_type.setText("*small");
							row_9_rate.setText("85");
							row_9_qty.setText(Menu.ch_qty_r_ins);
							row_9_price.setText(Menu.ch_price_r);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Chocolate");
							row_10_type.setText("*small");
							row_10_rate.setText("85");
							row_10_qty.setText(Menu.ch_qty_r_ins);
							row_10_price.setText(Menu.ch_price_r);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Chocolate");
							row_11_type.setText("*small");
							row_11_rate.setText("85");
							row_11_qty.setText(Menu.ch_qty_r_ins);
							row_11_price.setText(Menu.ch_price_r);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Chocolate");
							row_12_type.setText("*small");
							row_12_rate.setText("85");
							row_12_qty.setText(Menu.ch_qty_r_ins);
							row_12_price.setText(Menu.ch_price_r);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Chocolate");
							row_13_type.setText("*small");
							row_13_rate.setText("85");
							row_13_qty.setText(Menu.ch_qty_r_ins);
							row_13_price.setText(Menu.ch_price_r);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Chocolate");
							row_14_type.setText("*small");
							row_14_rate.setText("85");
							row_14_qty.setText(Menu.ch_qty_r_ins);
							row_14_price.setText(Menu.ch_price_r);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Chocolate");
							row_15_type.setText("*small");
							row_15_rate.setText("85");
							row_15_qty.setText(Menu.ch_qty_r_ins);
							row_15_price.setText(Menu.ch_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Chocolate");
							row_16_type.setText("*small");
							row_16_rate.setText("85");
							row_16_qty.setText(Menu.ch_qty_r_ins);
							row_16_price.setText(Menu.ch_price_r);
						}
						}
					}
					if(Menu.flag_ch_h==1) {
						if(Menu.ch_qty_lint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Chocolate");
							row_1_type.setText("*large");
							row_1_rate.setText("160");
							row_1_qty.setText(Menu.ch_qty_l_ins);
							row_1_price.setText(Menu.ch_price_l);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Chocolate");
							row_2_type.setText("*large");
							row_2_rate.setText("160");
							row_2_qty.setText(Menu.ch_qty_l_ins);
							row_2_price.setText(Menu.ch_price_l);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Chocolate");
							row_3_type.setText("*large");
							row_3_rate.setText("160");
							row_3_qty.setText(Menu.ch_qty_l_ins);
							row_3_price.setText(Menu.ch_price_l);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Chocolate");
							row_4_type.setText("*large");
							row_4_rate.setText("160");
							row_4_qty.setText(Menu.ch_qty_l_ins);
							row_4_price.setText(Menu.ch_price_l);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Chocolate");
							row_5_type.setText("*large");
							row_5_rate.setText("160");
							row_5_qty.setText(Menu.ch_qty_l_ins);
							row_5_price.setText(Menu.ch_price_l);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Chocolate");
							row_6_type.setText("*large");
							row_6_rate.setText("160");
							row_6_qty.setText(Menu.ch_qty_l_ins);
							row_6_price.setText(Menu.ch_price_l);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Chocolate");
							row_7_type.setText("*large");
							row_7_rate.setText("160");
							row_7_qty.setText(Menu.ch_qty_l_ins);
							row_7_price.setText(Menu.ch_price_l);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Chocolate");
							row_8_type.setText("*large");
							row_8_rate.setText("160");
							row_8_qty.setText(Menu.ch_qty_l_ins);
							row_8_price.setText(Menu.ch_price_l);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Chocolate");
							row_9_type.setText("*large");
							row_9_rate.setText("160");
							row_9_qty.setText(Menu.ch_qty_l_ins);
							row_9_price.setText(Menu.ch_price_l);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Chocolate");
							row_10_type.setText("*large");
							row_10_rate.setText("160");
							row_10_qty.setText(Menu.ch_qty_l_ins);
							row_10_price.setText(Menu.ch_price_l);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Chocolate");
							row_11_type.setText("*large");
							row_11_rate.setText("160");
							row_11_qty.setText(Menu.ch_qty_l_ins);
							row_11_price.setText(Menu.ch_price_l);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Chocolate");
							row_12_type.setText("*large");
							row_12_rate.setText("160");
							row_12_qty.setText(Menu.ch_qty_l_ins);
							row_12_price.setText(Menu.ch_price_l);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Chocolate");
							row_13_type.setText("*large");
							row_13_rate.setText("160");
							row_13_qty.setText(Menu.ch_qty_l_ins);
							row_13_price.setText(Menu.ch_price_l);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Chocolate");
							row_14_type.setText("*large");
							row_14_rate.setText("160");
							row_14_qty.setText(Menu.ch_qty_l_ins);
							row_14_price.setText(Menu.ch_price_l);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Chocolate");
							row_15_type.setText("*large");
							row_15_rate.setText("160");
							row_15_qty.setText(Menu.ch_qty_l_ins);
							row_15_price.setText(Menu.ch_price_l);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Chocolate");
							row_16_type.setText("*large");
							row_16_rate.setText("160");
							row_16_qty.setText(Menu.ch_qty_l_ins);
							row_16_price.setText(Menu.ch_price_l);
						}
					}}
					}
				//-------------------------------------------------
				if(Menu.flag_ha==1) {
					if(Menu.flag_ha_m==1) {
						if(Menu.ha_qty_rint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Hazelnut");
							row_1_type.setText("*small");
							row_1_rate.setText("80");
							row_1_qty.setText(Menu.ha_qty_r_ins);
							row_1_price.setText(Menu.ha_price_r);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Hazelnut");
							row_2_type.setText("*small");
							row_2_rate.setText("80");
							row_2_qty.setText(Menu.ha_qty_r_ins);
							row_2_price.setText(Menu.ha_price_r);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Hazelnut");
							row_3_type.setText("*small");
							row_3_rate.setText("80");
							row_3_qty.setText(Menu.ha_qty_r_ins);
							row_3_price.setText(Menu.ha_price_r);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Hazelnut");
							row_4_type.setText("*small");
							row_4_rate.setText("80");
							row_4_qty.setText(Menu.ha_qty_r_ins);
							row_4_price.setText(Menu.ha_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Hazelnut");
							row_5_type.setText("*small");
							row_5_rate.setText("80");
							row_5_qty.setText(Menu.ha_qty_r_ins);
							row_5_price.setText(Menu.ha_price_r);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Hazelnut");
							row_6_type.setText("*small");
							row_6_rate.setText("80");
							row_6_qty.setText(Menu.ha_qty_r_ins);
							row_6_price.setText(Menu.ha_price_r);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Hazelnut");
							row_7_type.setText("*small");
							row_7_rate.setText("80");
							row_7_qty.setText(Menu.ha_qty_r_ins);
							row_7_price.setText(Menu.ha_price_r);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Hazelnut");
							row_8_type.setText("*small");
							row_8_rate.setText("80");
							row_8_qty.setText(Menu.ha_qty_r_ins);
							row_8_price.setText(Menu.ha_price_r);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Hazelnut");
							row_9_type.setText("*small");
							row_9_rate.setText("80");
							row_9_qty.setText(Menu.ha_qty_r_ins);
							row_9_price.setText(Menu.ha_price_r);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Hazelnut");
							row_10_type.setText("*small");
							row_10_rate.setText("80");
							row_10_qty.setText(Menu.ha_qty_r_ins);
							row_10_price.setText(Menu.ha_price_r);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Hazelnut");
							row_11_type.setText("*small");
							row_11_rate.setText("80");
							row_11_qty.setText(Menu.ha_qty_r_ins);
							row_11_price.setText(Menu.ha_price_r);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Hazelnut");
							row_12_type.setText("*small");
							row_12_rate.setText("80");
							row_12_qty.setText(Menu.ha_qty_r_ins);
							row_12_price.setText(Menu.ha_price_r);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Hazelnut");
							row_13_type.setText("*small");
							row_13_rate.setText("80");
							row_13_qty.setText(Menu.ha_qty_r_ins);
							row_13_price.setText(Menu.ha_price_r);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Hazelnut");
							row_14_type.setText("*small");
							row_14_rate.setText("80");
							row_14_qty.setText(Menu.ha_qty_r_ins);
							row_14_price.setText(Menu.ha_price_r);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Hazelnut");
							row_15_type.setText("*small");
							row_15_rate.setText("80");
							row_15_qty.setText(Menu.ha_qty_r_ins);
							row_15_price.setText(Menu.ha_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Hazelnut");
							row_16_type.setText("*small");
							row_16_rate.setText("80");
							row_16_qty.setText(Menu.ha_qty_r_ins);
							row_16_price.setText(Menu.ha_price_r);
						}
						}
					}
					if(Menu.flag_ha_h==1) {
						if(Menu.ha_qty_lint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Hazelnut");
							row_1_type.setText("*large");
							row_1_rate.setText("150");
							row_1_qty.setText(Menu.ha_qty_l_ins);
							row_1_price.setText(Menu.ha_price_l);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Hazelnut");
							row_2_type.setText("*large");
							row_2_rate.setText("150");
							row_2_qty.setText(Menu.ha_qty_l_ins);
							row_2_price.setText(Menu.ha_price_l);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Hazelnut");
							row_3_type.setText("*large");
							row_3_rate.setText("150");
							row_3_qty.setText(Menu.ha_qty_l_ins);
							row_3_price.setText(Menu.ha_price_l);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Hazelnut");
							row_4_type.setText("*large");
							row_4_rate.setText("150");
							row_4_qty.setText(Menu.ha_qty_l_ins);
							row_4_price.setText(Menu.ha_price_l);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Hazelnut");
							row_5_type.setText("*large");
							row_5_rate.setText("150");
							row_5_qty.setText(Menu.ha_qty_l_ins);
							row_5_price.setText(Menu.ha_price_l);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Hazelnut");
							row_6_type.setText("*large");
							row_6_rate.setText("150");
							row_6_qty.setText(Menu.ha_qty_l_ins);
							row_6_price.setText(Menu.ha_price_l);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Hazelnut");
							row_7_type.setText("*large");
							row_7_rate.setText("150");
							row_7_qty.setText(Menu.ha_qty_l_ins);
							row_7_price.setText(Menu.ha_price_l);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Hazelnut");
							row_8_type.setText("*large");
							row_8_rate.setText("150");
							row_8_qty.setText(Menu.ha_qty_l_ins);
							row_8_price.setText(Menu.ha_price_l);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Hazelnut");
							row_9_type.setText("*large");
							row_9_rate.setText("150");
							row_9_qty.setText(Menu.ha_qty_l_ins);
							row_9_price.setText(Menu.ha_price_l);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Hazelnut");
							row_10_type.setText("*large");
							row_10_rate.setText("150");
							row_10_qty.setText(Menu.ha_qty_l_ins);
							row_10_price.setText(Menu.ha_price_l);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Hazelnut");
							row_11_type.setText("*large");
							row_11_rate.setText("150");
							row_11_qty.setText(Menu.ha_qty_l_ins);
							row_11_price.setText(Menu.ha_price_l);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Hazelnut");
							row_12_type.setText("*large");
							row_12_rate.setText("150");
							row_12_qty.setText(Menu.ha_qty_l_ins);
							row_12_price.setText(Menu.ha_price_l);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Hazelnut");
							row_13_type.setText("*large");
							row_13_rate.setText("150");
							row_13_qty.setText(Menu.ha_qty_l_ins);
							row_13_price.setText(Menu.ha_price_l);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Hazelnut");
							row_14_type.setText("*large");
							row_14_rate.setText("150");
							row_14_qty.setText(Menu.ha_qty_l_ins);
							row_14_price.setText(Menu.ha_price_l);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Hazelnut");
							row_15_type.setText("*large");
							row_15_rate.setText("150");
							row_15_qty.setText(Menu.ha_qty_l_ins);
							row_15_price.setText(Menu.ha_price_l);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Hazelnut");
							row_16_type.setText("*large");
							row_16_rate.setText("150");
							row_16_qty.setText(Menu.ha_qty_l_ins);
							row_16_price.setText(Menu.ha_price_l);
						}
					}}
					}
				//-------------------------------------------------
				if(Menu.flag_st==1) {
					if(Menu.flag_st_m==1) {
						if(Menu.st_qty_rint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Strawberry");
							row_1_type.setText("*small");
							row_1_rate.setText("75");
							row_1_qty.setText(Menu.st_qty_r_ins);
							row_1_price.setText(Menu.st_price_r);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Strawberry");
							row_2_type.setText("*small");
							row_2_rate.setText("75");
							row_2_qty.setText(Menu.st_qty_r_ins);
							row_2_price.setText(Menu.st_price_r);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Strawberry");
							row_3_type.setText("*small");
							row_3_rate.setText("75");
							row_3_qty.setText(Menu.st_qty_r_ins);
							row_3_price.setText(Menu.st_price_r);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Strawberry");
							row_4_type.setText("*small");
							row_4_rate.setText("75");
							row_4_qty.setText(Menu.st_qty_r_ins);
							row_4_price.setText(Menu.st_price_r);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Strawberry");
							row_5_type.setText("*small");
							row_5_rate.setText("75");
							row_5_qty.setText(Menu.st_qty_r_ins);
							row_5_price.setText(Menu.st_price_r);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Strawberry");
							row_6_type.setText("*small");
							row_6_rate.setText("75");
							row_6_qty.setText(Menu.st_qty_r_ins);
							row_6_price.setText(Menu.st_price_r);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Strawberry");
							row_7_type.setText("*small");
							row_7_rate.setText("75");
							row_7_qty.setText(Menu.st_qty_r_ins);
							row_7_price.setText(Menu.st_price_r);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Strawberry");
							row_8_type.setText("*small");
							row_8_rate.setText("75");
							row_8_qty.setText(Menu.st_qty_r_ins);
							row_8_price.setText(Menu.st_price_r);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Strawberry");
							row_9_type.setText("*small");
							row_9_rate.setText("75");
							row_9_qty.setText(Menu.st_qty_r_ins);
							row_9_price.setText(Menu.st_price_r);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Strawberry");
							row_10_type.setText("*small");
							row_10_rate.setText("75");
							row_10_qty.setText(Menu.st_qty_r_ins);
							row_10_price.setText(Menu.st_price_r);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Strawberry");
							row_11_type.setText("*small");
							row_11_rate.setText("75");
							row_11_qty.setText(Menu.st_qty_r_ins);
							row_11_price.setText(Menu.st_price_r);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Strawberry");
							row_12_type.setText("*small");
							row_12_rate.setText("75");
							row_12_qty.setText(Menu.st_qty_r_ins);
							row_12_price.setText(Menu.st_price_r);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Strawberry");
							row_13_type.setText("*small");
							row_13_rate.setText("75");
							row_13_qty.setText(Menu.st_qty_r_ins);
							row_13_price.setText(Menu.st_price_r);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Strawberry");
							row_14_type.setText("*small");
							row_14_rate.setText("75");
							row_14_qty.setText(Menu.st_qty_r_ins);
							row_14_price.setText(Menu.st_price_r);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Strawberry");
							row_15_type.setText("*small");
							row_15_rate.setText("75");
							row_15_qty.setText(Menu.st_qty_r_ins);
							row_15_price.setText(Menu.st_price_r);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Strawberry");
							row_16_type.setText("*small");
							row_16_rate.setText("75");
							row_16_qty.setText(Menu.st_qty_r_ins);
							row_16_price.setText(Menu.st_price_r);
						}
						}
					}
					if(Menu.flag_ca_h==1) {
						if(Menu.ca_qty_lint>0) {
						if(row_1_name.getText().equals("")) {
							row_1_name.setText("Strawberry");
							row_1_type.setText("*large");
							row_1_rate.setText("140");
							row_1_qty.setText(Menu.st_qty_l_ins);
							row_1_price.setText(Menu.st_price_l);
						}
						else if(row_2_name.getText().equals("")) {
							row_2_name.setText("Strawberry");
							row_2_type.setText("*large");
							row_2_rate.setText("140");
							row_2_qty.setText(Menu.st_qty_l_ins);
							row_2_price.setText(Menu.st_price_l);
						}
						else if(row_3_name.getText().equals("")) {
							row_3_name.setText("Strawberry");
							row_3_type.setText("*large");
							row_3_rate.setText("140");
							row_3_qty.setText(Menu.st_qty_l_ins);
							row_3_price.setText(Menu.st_price_l);
						}
						else if(row_4_name.getText().equals("")) {
							row_4_name.setText("Strawberry");
							row_4_type.setText("*large");
							row_4_rate.setText("140");
							row_4_qty.setText(Menu.st_qty_l_ins);
							row_4_price.setText(Menu.st_price_l);
						}
						else if(row_5_name.getText().equals("")) {
							row_5_name.setText("Strawberry");
							row_5_type.setText("*large");
							row_5_rate.setText("140");
							row_5_qty.setText(Menu.st_qty_l_ins);
							row_5_price.setText(Menu.st_price_l);
						}
						else if(row_6_name.getText().equals("")) {
							row_6_name.setText("Strawberry");
							row_6_type.setText("*large");
							row_6_rate.setText("140");
							row_6_qty.setText(Menu.st_qty_l_ins);
							row_6_price.setText(Menu.st_price_l);
						}
						else if(row_7_name.getText().equals("")) {
							row_7_name.setText("Strawberry");
							row_7_type.setText("*large");
							row_7_rate.setText("140");
							row_7_qty.setText(Menu.st_qty_l_ins);
							row_7_price.setText(Menu.st_price_l);
						}
						else if(row_8_name.getText().equals("")) {
							row_8_name.setText("Strawberry");
							row_8_type.setText("*large");
							row_8_rate.setText("140");
							row_8_qty.setText(Menu.st_qty_l_ins);
							row_8_price.setText(Menu.st_price_l);
						}
						else if(row_9_name.getText().equals("")) {
							row_9_name.setText("Strawberry");
							row_9_type.setText("*large");
							row_9_rate.setText("140");
							row_9_qty.setText(Menu.st_qty_l_ins);
							row_9_price.setText(Menu.st_price_l);
						}
						else if(row_10_name.getText().equals("")) {
							row_10_name.setText("Strawberry");
							row_10_type.setText("*large");
							row_10_rate.setText("140");
							row_10_qty.setText(Menu.st_qty_l_ins);
							row_10_price.setText(Menu.st_price_l);
						}
						else if(row_11_name.getText().equals("")) {
							row_11_name.setText("Strawberry");
							row_11_type.setText("*large");
							row_11_rate.setText("140");
							row_11_qty.setText(Menu.st_qty_l_ins);
							row_11_price.setText(Menu.st_price_l);
						}
						else if(row_12_name.getText().equals("")) {
							row_12_name.setText("Strawberry");
							row_12_type.setText("*large");
							row_12_rate.setText("140");
							row_12_qty.setText(Menu.st_qty_l_ins);
							row_12_price.setText(Menu.st_price_l);
						}
						else if(row_13_name.getText().equals("")) {
							row_13_name.setText("Strawberry");
							row_13_type.setText("*large");
							row_13_rate.setText("140");
							row_13_qty.setText(Menu.st_qty_l_ins);
							row_13_price.setText(Menu.st_price_l);
						}
						else if(row_14_name.getText().equals("")) {
							row_14_name.setText("Strawberry");
							row_14_type.setText("*large");
							row_14_rate.setText("140");
							row_14_qty.setText(Menu.st_qty_l_ins);
							row_14_price.setText(Menu.st_price_l);
						}
						else if(row_15_name.getText().equals("")) {
							row_15_name.setText("Strawberry");
							row_15_type.setText("*large");
							row_15_rate.setText("140");
							row_15_qty.setText(Menu.st_qty_l_ins);
							row_15_price.setText(Menu.st_price_l);
						}
						else if(row_16_name.getText().equals("")) {
							row_16_name.setText("Strawberry");
							row_16_type.setText("*large");
							row_16_rate.setText("140");
							row_16_qty.setText(Menu.st_qty_l_ins);
							row_16_price.setText(Menu.st_price_l);
						}
					}}
					}
				//-------------------------------------------------
				if((Menu.flag_done==1)) {
				if(row_1_name.getText().equals("")) {
					row_1_name.setText("===================");
					row_1_type.setText("=======");
					row_1_rate.setText("==========");
					row_1_qty.setText("======");
					row_1_price.setText("========");
				}
				else if(row_2_name.getText().equals("")) {
					row_2_name.setText("===================");
					row_2_type.setText("=======");
					row_2_rate.setText("==========");
					row_2_qty.setText("======");
					row_2_price.setText("========");
				}
				else if(row_3_name.getText().equals("")) {
					row_3_name.setText("===================");
					row_3_type.setText("=======");
					row_3_rate.setText("==========");
					row_3_qty.setText("======");
					row_3_price.setText("========");
				}
				else if(row_4_name.getText().equals("")) {
					row_4_name.setText("===================");
					row_4_type.setText("=======");
					row_4_rate.setText("==========");
					row_4_qty.setText("========");
					row_4_price.setText("========");
				}
				else if(row_5_name.getText().equals("")) {
					row_5_name.setText("===================");
					row_5_type.setText("=======");
					row_5_rate.setText("==========");
					row_5_qty.setText("========");
					row_5_price.setText("========");
				}
				else if(row_6_name.getText().equals("")) {
					row_6_name.setText("===================");
					row_6_type.setText("=======");
					row_6_rate.setText("==========");
					row_6_qty.setText("========");
					row_6_price.setText("========");
				}
				else if(row_7_name.getText().equals("")) {
					row_7_name.setText("===================");
					row_7_type.setText("=======");
					row_7_rate.setText("==========");
					row_7_qty.setText("========");
					row_7_price.setText("========");
				}
				else if(row_8_name.getText().equals("")) {
					row_8_name.setText("===================");
					row_8_type.setText("=======");
					row_8_rate.setText("==========");
					row_8_qty.setText("========");
					row_8_price.setText("========");
				}
				else if(row_9_name.getText().equals("")) {
					row_9_name.setText("===================");
					row_9_type.setText("=======");
					row_9_rate.setText("==========");
					row_9_qty.setText("========");
					row_9_price.setText("========");
				}
				else if(row_10_name.getText().equals("")) {
					row_10_name.setText("===================");
					row_10_type.setText("=======");
					row_10_rate.setText("==========");
					row_10_qty.setText("========");
					row_10_price.setText("========");
				}
				else if(row_11_name.getText().equals("")) {
					row_11_name.setText("===================");
					row_11_type.setText("=======");
					row_11_rate.setText("==========");
					row_11_qty.setText("========");
					row_11_price.setText("========");
				}
				else if(row_12_name.getText().equals("")) {
					row_12_name.setText("===================");
					row_12_type.setText("=======");
					row_12_rate.setText("==========");
					row_12_qty.setText("========");
					row_12_price.setText("========");
				}
				else if(row_13_name.getText().equals("")) {
					row_13_name.setText("===================");
					row_13_type.setText("=======");
					row_13_rate.setText("==========");
					row_13_qty.setText("========");
					row_13_price.setText("========");
				}
				else if(row_14_name.getText().equals("")) {
					row_14_name.setText("===================");
					row_14_type.setText("=======");
					row_14_rate.setText("==========");
					row_14_qty.setText("========");
					row_14_price.setText("========");
				}
				else if(row_15_name.getText().equals("")) {
					row_15_name.setText("===================");
					row_15_type.setText("=======");
					row_15_rate.setText("==========");
					row_15_qty.setText("========");
					row_15_price.setText("========");
				}
				else if(row_16_name.getText().equals("")) {
					row_16_name.setText("===================");
					row_16_type.setText("=======");
					row_16_rate.setText("==========");
					row_16_qty.setText("========");
					row_16_price.setText("========");
				}
				else if(row_17_name.getText().equals("")) {
					row_17_name.setText("===================");
					row_17_type.setText("=======");
					row_17_rate.setText("==========");
					row_17_qty.setText("========");
					row_17_price.setText("========");
				}
				}
				//--------------------------------------------------
				if((Menu.flag_done==1)) {
				   if(row_1_name.getText().equals("")) {
						row_1_name.setText("-");
						row_1_type.setText("");
						row_1_rate.setText("Sub-");
						row_1_qty.setText("Total");
						row_1_price.setText(Menu.subtotal_str);
					}
				else if(row_2_name.getText().equals("")) {
					row_2_name.setText("-");
					row_2_type.setText("");
					row_2_rate.setText("Sub-");
					row_2_qty.setText("Total");
					row_2_price.setText(Menu.subtotal_str);
				}
				else if(row_3_name.getText().equals("")) {
					row_3_name.setText("-");
					row_3_type.setText("");
					row_3_rate.setText("Sub-");
					row_3_qty.setText("Toatl");
					row_3_price.setText(Menu.subtotal_str);
				}
				else if(row_4_name.getText().equals("")) {
					row_4_name.setText("-");
					row_4_type.setText("");
					row_4_rate.setText("Sub-");
					row_4_qty.setText("Total");
					row_4_price.setText(Menu.subtotal_str);
				}
				else if(row_5_name.getText().equals("")) {
					row_5_name.setText("-");
					row_5_type.setText("");
					row_5_rate.setText("Sub-");
					row_5_qty.setText("Total");
					row_5_price.setText(Menu.subtotal_str);
				}
				else if(row_6_name.getText().equals("")) {
					row_6_name.setText("-");
					row_6_type.setText("");
					row_6_rate.setText("Sub-");
					row_6_qty.setText("Total");
					row_6_price.setText(Menu.subtotal_str);
				}
				else if(row_7_name.getText().equals("")) {
					row_7_name.setText("-");
					row_7_type.setText("");
					row_7_rate.setText("Sub-");
					row_7_qty.setText("Total");
					row_7_price.setText(Menu.subtotal_str);
				}
				else if(row_8_name.getText().equals("")) {
					row_8_name.setText("-");
					row_8_type.setText("");
					row_8_rate.setText("Sub-");
					row_8_qty.setText("Total");
					row_8_price.setText(Menu.subtotal_str);
				}
				else if(row_9_name.getText().equals("")) {
					row_9_name.setText("-");
					row_9_type.setText("");
					row_9_rate.setText("Sub-");
					row_9_qty.setText("Total");
					row_9_price.setText(Menu.subtotal_str);
				}
				else if(row_10_name.getText().equals("")) {
					row_10_name.setText("-");
					row_10_type.setText("");
					row_10_rate.setText("Sub-");
					row_10_qty.setText("Total");
					row_10_price.setText(Menu.subtotal_str);
				}
				else if(row_11_name.getText().equals("")) {
					row_11_name.setText("-");
					row_11_type.setText("");
					row_11_rate.setText("Sub-");
					row_11_qty.setText("Total");
					row_11_price.setText(Menu.subtotal_str);
				}
				else if(row_12_name.getText().equals("")) {
					row_12_name.setText("-");
					row_12_type.setText("");
					row_12_rate.setText("Sub-");
					row_12_qty.setText("Total");
					row_12_price.setText(Menu.subtotal_str);
				}
				else if(row_13_name.getText().equals("")) {
					row_13_name.setText("-");
					row_13_type.setText("");
					row_13_rate.setText("Sub-");
					row_13_qty.setText("Total");
					row_13_price.setText(Menu.subtotal_str);
				}
				else if(row_14_name.getText().equals("")) {
					row_14_name.setText("-");
					row_14_type.setText("");
					row_14_rate.setText("Sub-");
					row_14_qty.setText("Total");
					row_14_price.setText(Menu.subtotal_str);
				}
				else if(row_15_name.getText().equals("")) {
					row_15_name.setText("-");
					row_15_type.setText("");
					row_15_rate.setText("Sub-");
					row_15_qty.setText("Total");
					row_15_price.setText(Menu.subtotal_str);
				}
				else if(row_16_name.getText().equals("")) {
					row_16_name.setText("-");
					row_16_type.setText("");
					row_16_rate.setText("Sub-");
					row_16_qty.setText("Total");
					row_16_price.setText(Menu.subtotal_str);
				}
				else if(row_17_name.getText().equals("")) {
					row_17_name.setText("-");
					row_17_type.setText("");
					row_17_rate.setText("Sub-");
					row_17_qty.setText("Total");
					row_17_price.setText(Menu.subtotal_str);
				}
				else if(row_18_name.getText().equals("")) {
					row_18_name.setText("-");
					row_18_type.setText("");
					row_18_rate.setText("Sub-");
					row_18_qty.setText("Total");
					row_18_price.setText(Menu.subtotal_str);
				}
				  
				}
				//--------------------------------------------------
				if((Menu.flag_done==1)) {
				   if(row_1_name.getText().equals("")) {
						row_1_name.setText("-");
						row_1_type.setText("");
						row_1_rate.setText("Service");
						row_1_qty.setText("Charge");
						row_1_price.setText(Menu.ser_cha_str);
					}
				   else if(row_2_name.getText().equals("")) {
						row_2_name.setText("-");
						row_2_type.setText("");
						row_2_rate.setText("Service");
						row_2_qty.setText("Charge");
						row_2_price.setText(Menu.ser_cha_str);
					}
				   else if(row_3_name.getText().equals("")) {
						row_3_name.setText("-");
						row_3_type.setText("");
						row_3_rate.setText("Service");
						row_3_qty.setText("Charge");
						row_3_price.setText(Menu.ser_cha_str);
					}
				   else if(row_4_name.getText().equals("")) {
						row_4_name.setText("-");
						row_4_type.setText("");
						row_4_rate.setText("Service");
						row_4_qty.setText("Charge");
						row_4_price.setText(Menu.ser_cha_str);
					}
				   else if(row_5_name.getText().equals("")) {
						row_5_name.setText("-");
						row_5_type.setText("");
						row_5_rate.setText("Service");
						row_5_qty.setText("Charge");
						row_5_price.setText(Menu.ser_cha_str);
					}
				   else if(row_6_name.getText().equals("")) {
						row_6_name.setText("-");
						row_6_type.setText("");
						row_6_rate.setText("Service");
						row_6_qty.setText("Charge");
						row_6_price.setText(Menu.ser_cha_str);
					}
				   else if(row_7_name.getText().equals("")) {
						row_7_name.setText("-");
						row_7_type.setText("");
						row_7_rate.setText("Service");
						row_7_qty.setText("Charge");
						row_7_price.setText(Menu.ser_cha_str);
					}
				   else if(row_8_name.getText().equals("")) {
						row_8_name.setText("-");
						row_8_type.setText("");
						row_8_rate.setText("Service");
						row_8_qty.setText("Charge");
						row_8_price.setText(Menu.ser_cha_str);
					}
				   else if(row_9_name.getText().equals("")) {
						row_9_name.setText("-");
						row_9_type.setText("");
						row_9_rate.setText("Service");
						row_9_qty.setText("Charge");
						row_9_price.setText(Menu.ser_cha_str);
					}
				   else if(row_10_name.getText().equals("")) {
						row_10_name.setText("-");
						row_10_type.setText("");
						row_10_rate.setText("Service");
						row_10_qty.setText("Charge");
						row_10_price.setText(Menu.ser_cha_str);
					}
				   else if(row_11_name.getText().equals("")) {
						row_11_name.setText("-");
						row_11_type.setText("");
						row_11_rate.setText("Service");
						row_11_qty.setText("Charge");
						row_11_price.setText(Menu.ser_cha_str);
					}
				   else if(row_12_name.getText().equals("")) {
						row_12_name.setText("-");
						row_12_type.setText("");
						row_12_rate.setText("Service");
						row_12_qty.setText("Charge");
						row_12_price.setText(Menu.ser_cha_str);
					}
				   else if(row_13_name.getText().equals("")) {
						row_13_name.setText("-");
						row_13_type.setText("");
						row_13_rate.setText("Service");
						row_13_qty.setText("Charge");
						row_13_price.setText(Menu.ser_cha_str);
					}
				   else if(row_14_name.getText().equals("")) {
						row_14_name.setText("-");
						row_14_type.setText("");
						row_14_rate.setText("Service");
						row_14_qty.setText("Charge");
						row_14_price.setText(Menu.ser_cha_str);
					}
				   else if(row_15_name.getText().equals("")) {
						row_15_name.setText("-");
						row_15_type.setText("");
						row_15_rate.setText("Service");
						row_15_qty.setText("Charge");
						row_15_price.setText(Menu.ser_cha_str);
					}
				   else if(row_16_name.getText().equals("")) {
						row_16_name.setText("-");
						row_16_type.setText("");
						row_16_rate.setText("Service");
						row_16_qty.setText("Charge");
						row_16_price.setText(Menu.ser_cha_str);
					}
				   else if(row_17_name.getText().equals("")) {
						row_17_name.setText("-");
						row_17_type.setText("");
						row_17_rate.setText("Service");
						row_17_qty.setText("Charge");
						row_17_price.setText(Menu.ser_cha_str);
					}
				   else if(row_18_name.getText().equals("")) {
						row_18_name.setText("-");
						row_18_type.setText("");
						row_18_rate.setText("Service");
						row_18_qty.setText("Charge");
						row_18_price.setText(Menu.ser_cha_str);
					}
				   else if(row_19_name.getText().equals("")) {
						row_19_name.setText("-");
						row_19_type.setText("");
						row_19_rate.setText("Service");
						row_19_qty.setText("Charge");
						row_19_price.setText(Menu.ser_cha_str);
					}
				}
				//--------------------------------------------------
				if((Menu.flag_done==1)) {
				   if(row_1_name.getText().equals("")) {
						row_1_name.setText("-");
						row_1_type.setText("");
						row_1_rate.setText("");
						row_1_qty.setText("Total");
						row_1_price.setText(Menu.total_str);
					}
				   else if(row_2_name.getText().equals("")) {
						row_2_name.setText("-");
						row_2_type.setText("");
						row_2_rate.setText("");
						row_2_qty.setText("Total");
						row_2_price.setText(Menu.total_str);
					}
				   else if(row_3_name.getText().equals("")) {
						row_3_name.setText("-");
						row_3_type.setText("");
						row_3_rate.setText("");
						row_3_qty.setText("Total");
						row_3_price.setText(Menu.total_str);
					}
				   else if(row_4_name.getText().equals("")) {
						row_4_name.setText("-");
						row_4_type.setText("");
						row_4_rate.setText("");
						row_4_qty.setText("Total");
						row_4_price.setText(Menu.total_str);
					}
				   else if(row_5_name.getText().equals("")) {
						row_5_name.setText("-");
						row_5_type.setText("");
						row_5_rate.setText("");
						row_5_qty.setText("Total");
						row_5_price.setText(Menu.total_str);
					}
				   else if(row_6_name.getText().equals("")) {
						row_6_name.setText("-");
						row_6_type.setText("");
						row_6_rate.setText("");
						row_6_qty.setText("Total");
						row_6_price.setText(Menu.total_str);
					}
				   else if(row_7_name.getText().equals("")) {
						row_7_name.setText("-");
						row_7_type.setText("");
						row_7_rate.setText("");
						row_7_qty.setText("Total");
						row_7_price.setText(Menu.total_str);
					}
				   else if(row_8_name.getText().equals("")) {
						row_8_name.setText("-");
						row_8_type.setText("");
						row_8_rate.setText("");
						row_8_qty.setText("Total");
						row_8_price.setText(Menu.total_str);
					}
				   else if(row_9_name.getText().equals("")) {
						row_9_name.setText("-");
						row_9_type.setText("");
						row_9_rate.setText("");
						row_9_qty.setText("Total");
						row_9_price.setText(Menu.total_str);
					}
				   else if(row_10_name.getText().equals("")) {
						row_10_name.setText("-");
						row_10_type.setText("");
						row_10_rate.setText("");
						row_10_qty.setText("Total");
						row_10_price.setText(Menu.total_str);
					}
				   else if(row_11_name.getText().equals("")) {
						row_11_name.setText("-");
						row_11_type.setText("");
						row_11_rate.setText("");
						row_11_qty.setText("Total");
						row_11_price.setText(Menu.total_str);
					}
				   else if(row_12_name.getText().equals("")) {
						row_12_name.setText("-");
						row_12_type.setText("");
						row_12_rate.setText("");
						row_12_qty.setText("Total");
						row_12_price.setText(Menu.total_str);
					}
				   else if(row_13_name.getText().equals("")) {
						row_13_name.setText("-");
						row_13_type.setText("");
						row_13_rate.setText("");
						row_13_qty.setText("Total");
						row_13_price.setText(Menu.total_str);
					}
				   else if(row_14_name.getText().equals("")) {
						row_14_name.setText("-");
						row_14_type.setText("");
						row_14_rate.setText("");
						row_14_qty.setText("Total");
						row_14_price.setText(Menu.total_str);
					}
				   else if(row_15_name.getText().equals("")) {
						row_15_name.setText("-");
						row_15_type.setText("");
						row_15_rate.setText("");
						row_15_qty.setText("Total");
						row_15_price.setText(Menu.total_str);
					}
				   else if(row_16_name.getText().equals("")) {
						row_16_name.setText("-");
						row_16_type.setText("");
						row_16_rate.setText("");
						row_16_qty.setText("Total");
						row_16_price.setText(Menu.total_str);
					}
				   else if(row_17_name.getText().equals("")) {
						row_17_name.setText("-");
						row_17_type.setText("");
						row_17_rate.setText("");
						row_17_qty.setText("Total");
						row_17_price.setText(Menu.total_str);
					}
				   else if(row_18_name.getText().equals("")) {
						row_18_name.setText("-");
						row_18_type.setText("");
						row_18_rate.setText("");
						row_18_qty.setText("Total");
						row_18_price.setText(Menu.total_str);
					}
				   else if(row_19_name.getText().equals("")) {
						row_19_name.setText("-");
						row_19_type.setText("");
						row_19_rate.setText("");
						row_19_qty.setText("Total");
						row_19_price.setText(Menu.total_str);
					}
				   else if(row_20_name.getText().equals("")) {
						row_20_name.setText("-");
						row_20_type.setText("");
						row_20_rate.setText("");
						row_20_qty.setText("Total");
						row_20_price.setText(Menu.total_str);
					}
				   
				}
				//--------------------------------------------------
				}
		});
			
	}	
}