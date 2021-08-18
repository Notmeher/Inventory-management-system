package RestaurantManagemkent;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter; 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Menu extends JFrame {
    
	public static int c=0;;
	
    public static int flag_bb;
    public static int flag_bb_m;
    public static int flag_bb_h;
    public static int flag_bb_s;
    
    public static int flag_bbc;
    public static int flag_bbc_m;
    public static int flag_bbc_h;
    public static int flag_bbc_s;
    
    public static int flag_cb;
    public static int flag_cb_m;
    public static int flag_cb_h;
    public static int flag_cb_s;
    
    public static int flag_cbc;
    public static int flag_cbc_m;
    public static int flag_cbc_h;
    public static int flag_cbc_s;
    
    public static int flag_bbqbb;
    public static int flag_bbqbb_m;
    public static int flag_bbqbb_h;
    public static int flag_bbqbb_s;
    
    public static int flag_bbqcb;
    public static int flag_bbqcb_m;
    public static int flag_bbqcb_h;
    public static int flag_bbqcb_s;
    
    public static int flag_f;
    public static int flag_f_m;
    public static int flag_f_h;
    
    public static int flag_cf;
    public static int flag_cf_m;
    public static int flag_cf_h;
    
    public static int flag_pw;
    public static int flag_pw_m;
    public static int flag_pw_h;
    
    public static int flag_ccb;
    public static int flag_ccb_m;
    public static int flag_ccb_h;
    
    public static int flag_nwb;
    public static int flag_nwb_m;
    public static int flag_nwb_h;
    
    public static int flag_cc;
    public static int flag_cc_m;
    public static int flag_cc_h;
    
    public static int flag_s;
    public static int flag_s_m;
    public static int flag_s_h;
    
    public static int flag_fa;
    public static int flag_fa_m;
    public static int flag_fa_h;
    
    public static int flag_mw;
    
    public static int flag_ca;
    public static int flag_ca_m;
    public static int flag_ca_h;
    
    public static int flag_ch;
    public static int flag_ch_m;
    public static int flag_ch_h;
    
    public static int flag_ha;
    public static int flag_ha_m;
    public static int flag_ha_h;
    
    public static int flag_st;
    public static int flag_st_m;
    public static int flag_st_h;
    
    public static int flag_done;
    
    public static String bb_qty_m_ins;
    public static String bb_price_m;
    public static double bb_qty_mint;
    public static double bb_price_m_double;
    
    public static String bb_qty_h_ins;
    public static String bb_price_h;
    public static double bb_qty_hint;
    public static double bb_price_h_double;
    
    public static String bb_qty_s_ins;
    public static String bb_price_s;
    public static double bb_qty_sint;
    public static double bb_price_s_double;
    
    public static String bbc_qty_m_ins;
    public static String bbc_price_m;
    public static double bbc_qty_mint;
    public static double bbc_price_m_double;
    
    public static String bbc_qty_h_ins;
    public static String bbc_price_h;
    public static double bbc_qty_hint;
    public static double bbc_price_h_double;
    
    public static String bbc_qty_s_ins;
    public static String bbc_price_s;
    public static double bbc_qty_sint;
    public static double bbc_price_s_double;
    
    public static String cb_qty_m_ins;
    public static String cb_price_m;
    public static double cb_qty_mint;
    public static double cb_price_m_double;
    
    public static String cb_qty_h_ins;
    public static String cb_price_h;
    public static double cb_qty_hint;
    public static double cb_price_h_double;
    
    public static String cb_qty_s_ins;
    public static String cb_price_s;
    public static double cb_qty_sint;
    public static double cb_price_s_double;
    
    public static String cbc_qty_m_ins;
    public static String cbc_price_m;
    public static double cbc_qty_mint;
    public static double cbc_price_m_double;
    
    public static String cbc_qty_h_ins;
    public static String cbc_price_h;
    public static double cbc_qty_hint;
    public static double cbc_price_h_double;
    
    public static String cbc_qty_s_ins;
    public static String cbc_price_s;
    public static double cbc_qty_sint;
    public static double cbc_price_s_double;
    
    public static String bbqbb_qty_m_ins;
    public static String bbqbb_price_m;
    public static double bbqbb_qty_mint;
    public static double bbqbb_price_m_double;
    
    public static String bbqbb_qty_h_ins;
    public static String bbqbb_price_h;
    public static double bbqbb_qty_hint;
    public static double bbqbb_price_h_double;
    
    public static String bbqbb_qty_s_ins;
    public static String bbqbb_price_s;
    public static double bbqbb_qty_sint;
    public static double bbqbb_price_s_double;
    
    public static String bbqcb_qty_m_ins;
    public static String bbqcb_price_m;
    public static double bbqcb_qty_mint;
    public static double bbqcb_price_m_double;
    
    public static String bbqcb_qty_h_ins;
    public static String bbqcb_price_h;
    public static double bbqcb_qty_hint;
    public static double bbqcb_price_h_double;
    
    public static String bbqcb_qty_s_ins;
    public static String bbqcb_price_s;
    public static double bbqcb_qty_sint;
    public static double bbqcb_price_s_double;
    
    public static String fri_qty_l_ins;
    public static String fri_price_l;
    public static double fri_qty_lint;
    public static double fri_price_l_double;
    
    public static String fri_qty_r_ins;
    public static String fri_price_r;
    public static double fri_qty_rint;
    public static double fri_price_r_double;
    
    public static String cfri_qty_l_ins;
    public static String cfri_price_l;
    public static double cfri_qty_lint;
    public static double cfri_price_l_double;
    
    public static String cfri_qty_r_ins;
    public static String cfri_price_r;
    public static double cfri_qty_rint;
    public static double cfri_price_r_double;
    
    public static String pw_qty_l_ins;
    public static String pw_price_l;
    public static double pw_qty_lint;
    public static double pw_price_l_double;
    
    public static String pw_qty_r_ins;
    public static String pw_price_r;
    public static double pw_qty_rint;
    public static double pw_price_r_double;
    
    public static String ccb_qty_l_ins;
    public static String ccb_price_l;
    public static double ccb_qty_lint;
    public static double ccb_price_l_double;
    
    public static String ccb_qty_r_ins;
    public static String ccb_price_r;
    public static double ccb_qty_rint;
    public static double ccb_price_r_double;
    
    public static String nwb_qty_l_ins;
    public static String nwb_price_l;
    public static double nwb_qty_lint;
    public static double nwb_price_l_double;
    
    public static String nwb_qty_r_ins;
    public static String nwb_price_r;
    public static double nwb_qty_rint;
    public static double nwb_price_r_double;
    
    public static String cc_qty_l_ins;
    public static String cc_price_l;
    public static double cc_qty_lint;
    public static double cc_price_l_double;
    
    public static String cc_qty_r_ins;
    public static String cc_price_r;
    public static double cc_qty_rint;
    public static double cc_price_r_double;
    
    public static String s_qty_l_ins;
    public static String s_price_l;
    public static double s_qty_lint;
    public static double s_price_l_double;
    
    public static String s_qty_r_ins;
    public static String s_price_r;
    public static double s_qty_rint;
    public static double s_price_r_double;
    
    public static String fa_qty_l_ins;
    public static String fa_price_l;
    public static double fa_qty_lint;
    public static double fa_price_l_double;
    
    public static String fa_qty_r_ins;
    public static String fa_price_r;
    public static double fa_qty_rint;
    public static double fa_price_r_double;
    
    public static String mw_qty_r_ins;
    public static String mw_price_r;
    public static double mw_qty_rint;
    public static double mw_price_r_double;
    
    public static String ca_qty_l_ins;
    public static String ca_price_l;
    public static double ca_qty_lint;
    public static double ca_price_l_double;
    
    public static String ca_qty_r_ins;
    public static String ca_price_r;
    public static double ca_qty_rint;
    public static double ca_price_r_double;
    
    public static String ch_qty_l_ins;
    public static String ch_price_l;
    public static double ch_qty_lint;
    public static double ch_price_l_double;
    
    public static String ch_qty_r_ins;
    public static String ch_price_r;
    public static double ch_qty_rint;
    public static double ch_price_r_double;
    
    public static String ha_qty_l_ins;
    public static String ha_price_l;
    public static double ha_qty_lint;
    public static double ha_price_l_double;
    
    public static String ha_qty_r_ins;
    public static String ha_price_r;
    public static double ha_qty_rint;
    public static double ha_price_r_double;
    
    public static String st_qty_l_ins;
    public static String st_price_l;
    public static double st_qty_lint;
    public static double st_price_l_double;
    
    public static String st_qty_r_ins;
    public static String st_price_r;
    public static double st_qty_rint;
    public static double st_price_r_double;
    
    public static String subtotal_str;
    public static double subtotal;
    
    public static String ser_cha_str;
    public static double ser_cha;
    
    public static String total_str;
    public static double total;
    
    private JTextField Sub_total_cost;
    private JTextField txtServiceCharge_str;
    private JTextField txttotal_str;
    private JSpinner reg_qty_bb;
    private JRadioButton Reg_fries;
    private JLabel cc_Reg_rate;
    private JTextField txtBurgerName;
    private JTextField txtQty;
    private JTextField txtRate;
    private JTextField txtItem;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField sub_total;
    private JTextField txtServiceCharge;
    private JTextField txtTotal;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 5, 1600, 850);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 204, 255));
		panel_1.setBounds(85, 58, 400, 115);
		contentPane.add(panel_1);
		
		JLabel price_bb = new JLabel("300");
		price_bb.setHorizontalAlignment(SwingConstants.CENTER);
		price_bb.setFont(new Font("Tahoma", Font.PLAIN, 17));
		price_bb.setBounds(320, 20, 80, 80);
		panel_1.add(price_bb);
		
		
		
		reg_qty_bb = new JSpinner();
		reg_qty_bb.setEnabled(false);
		reg_qty_bb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_bb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_bb.setBounds(270, 20, 50, 25);
		panel_1.add(reg_qty_bb);
		
		JSpinner hot_qty_bb = new JSpinner();
		hot_qty_bb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		hot_qty_bb.setEnabled(false);
		hot_qty_bb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hot_qty_bb.setBounds(270, 50, 50, 25);
		panel_1.add(hot_qty_bb);
		
		JSpinner spi_qty_bb = new JSpinner();
		spi_qty_bb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spi_qty_bb.setEnabled(false);
		spi_qty_bb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spi_qty_bb.setBounds(270, 80, 50, 25);
		panel_1.add(spi_qty_bb);
		
		JRadioButton mild_bb = new JRadioButton("Regular");
		mild_bb.setForeground(new Color(0, 0, 0));
		mild_bb.setBackground(new Color(102, 204, 255));
		mild_bb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mild_bb.isSelected()) {
					c++;
					flag_bb_m=1;
					reg_qty_bb.setEnabled(true);
					
				}
				else {
					c--;
					reg_qty_bb.setEnabled(false);
					reg_qty_bb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
				
			}
		});
		mild_bb.setEnabled(false);
		mild_bb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mild_bb.setBounds(190, 20, 74, 25);
		panel_1.add(mild_bb);
		
		JRadioButton hot_bb = new JRadioButton("Hot");
		hot_bb.setForeground(new Color(0, 0, 0));
		hot_bb.setBackground(new Color(255, 255, 51));
		hot_bb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hot_bb.isSelected()) {
					c++;
					flag_bb_h=1;
					hot_qty_bb.setEnabled(true);
					
				}
				else {
					c--;
					hot_qty_bb.setEnabled(false);
					hot_qty_bb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		hot_bb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hot_bb.setEnabled(false);
		hot_bb.setBounds(190, 50, 74, 25);
		panel_1.add(hot_bb);
		
		JRadioButton spicy_bb = new JRadioButton("Spicy");
		spicy_bb.setBackground(new Color(255, 0, 51));
		spicy_bb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(spicy_bb.isSelected()) {
					c++;
					flag_bb_s=1;
					spi_qty_bb.setEnabled(true);
				}
				else {
					c--;
					spi_qty_bb.setEnabled(false);
					spi_qty_bb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		spicy_bb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spicy_bb.setEnabled(false);
		spicy_bb.setBounds(190, 80, 74, 25);
		panel_1.add(spicy_bb);
		
		JCheckBox beef_burger = new JCheckBox("Beef Burger");
		beef_burger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(beef_burger.isSelected()) {
					flag_bb=1;
					mild_bb.setEnabled(true);
					hot_bb.setEnabled(true);
					spicy_bb.setEnabled(true);
					beef_burger.setBackground(new Color(255, 51, 255));
				}
				else {
					beef_burger.setBackground(new Color(255, 204, 255));
					mild_bb.setSelected(false);
					hot_bb.setSelected(false);
					spicy_bb.setSelected(false);
				    price_bb.setText("300");
				    //__________________________________
					mild_bb.setEnabled(false);
					hot_bb.setEnabled(false);
					spicy_bb.setEnabled(false);
					//___________________________________
					reg_qty_bb.setEnabled(false);
					hot_qty_bb.setEnabled(false);
					spi_qty_bb.setEnabled(false);
					//___________________________________
					reg_qty_bb.setValue(0);
					hot_qty_bb.setValue(0);
					spi_qty_bb.setValue(0);
				}
			}
		});
		beef_burger.setFont(new Font("Tahoma", Font.PLAIN, 15));
		beef_burger.setBackground(new Color(255, 204, 255));
		beef_burger.setBounds(5, 20, 180, 25);
		panel_1.add(beef_burger);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(255, 204, 255));
		panel_6.setBounds(590, 58, 400, 445);
		contentPane.add(panel_6);
		
		JLabel fries_reg_rate = new JLabel("100");
		fries_reg_rate.setHorizontalAlignment(SwingConstants.CENTER);
		fries_reg_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		fries_reg_rate.setBounds(320, 35, 80, 25);
		panel_6.add(fries_reg_rate);
		
		JSpinner reg_qty_fries = new JSpinner();
		reg_qty_fries.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_fries.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_fries.setEnabled(false);
		reg_qty_fries.setBounds(270, 35, 50, 25);
		panel_6.add(reg_qty_fries);
		
		JSpinner lar_qty_fries = new JSpinner();
		lar_qty_fries.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		lar_qty_fries.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lar_qty_fries.setEnabled(false);
		lar_qty_fries.setBounds(270, 65, 50, 25);
		panel_6.add(lar_qty_fries);
		
		Reg_fries = new JRadioButton("Regular");
		Reg_fries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Reg_fries.isSelected()) {
					c++;
					flag_f_m=1;
					reg_qty_fries.setEnabled(true);
					
				}
				else {
					c--;
					reg_qty_fries.setEnabled(false);
					reg_qty_fries.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		Reg_fries.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Reg_fries.setEnabled(false);
		Reg_fries.setBounds(190, 35, 74, 25);
		panel_6.add(Reg_fries);
		
		JRadioButton lar_fries = new JRadioButton("Large");
		lar_fries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lar_fries.isSelected()) {
					c++;
					flag_f_h=1;
					lar_qty_fries.setEnabled(true);
					
				}
				else {
					c--;
					lar_qty_fries.setEnabled(false);
					lar_qty_fries.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		lar_fries.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lar_fries.setEnabled(false);
		lar_fries.setBounds(190, 65, 74, 25);
		panel_6.add(lar_fries);
		
		JLabel fries_lar_rate = new JLabel("140");
		fries_lar_rate.setHorizontalAlignment(SwingConstants.CENTER);
		fries_lar_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		fries_lar_rate.setBounds(320, 65, 80, 25);
		panel_6.add(fries_lar_rate);
		
		JCheckBox Fries = new JCheckBox("Fries");
		Fries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fries.isSelected()) {
					flag_f=1;
					Reg_fries.setEnabled(true);
					lar_fries.setEnabled(true);
					
					Fries.setBackground(new Color(255, 51, 255));
				}
				else {
					Fries.setBackground(new Color(255, 204, 255));
					Reg_fries.setSelected(false);
					lar_fries.setSelected(false);
					
					fries_reg_rate.setText("100");
					fries_lar_rate.setText("140");
				    //__________________________________
					Reg_fries.setEnabled(false);
					lar_fries.setEnabled(false);
					//___________________________________
					reg_qty_fries.setEnabled(false);
					lar_qty_fries.setEnabled(false);
					//___________________________________
					reg_qty_fries.setValue(0);
					lar_qty_fries.setValue(0);
				}
			}
		});
		Fries.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Fries.setBackground(new Color(255, 204, 255));
		Fries.setBounds(6, 35, 182, 25);
		panel_6.add(Fries);
		
		JSpinner reg_qty_c_fries = new JSpinner();
		reg_qty_c_fries.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_c_fries.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_c_fries.setEnabled(false);
		reg_qty_c_fries.setBounds(270, 115, 50, 25);
		panel_6.add(reg_qty_c_fries);
		
		JSpinner lar_qty_c_fries = new JSpinner();
		lar_qty_c_fries.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		lar_qty_c_fries.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lar_qty_c_fries.setEnabled(false);
		lar_qty_c_fries.setBounds(270, 145, 50, 25);
		panel_6.add(lar_qty_c_fries);
		
		JRadioButton c_Reg_fries = new JRadioButton("Regular");
		c_Reg_fries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c_Reg_fries.isSelected()) {
					c++;
					flag_cf_m=1;
					reg_qty_c_fries.setEnabled(true);
					
				}
				else {
					c--;
					reg_qty_c_fries.setEnabled(false);
					reg_qty_c_fries.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		c_Reg_fries.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c_Reg_fries.setEnabled(false);
		c_Reg_fries.setBounds(190, 115, 74, 25);
		panel_6.add(c_Reg_fries);
		
		JRadioButton c_lar_fries = new JRadioButton("Large");
		c_lar_fries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c_lar_fries.isSelected()) {
					c++;
					flag_cf_h=1;
					lar_qty_c_fries.setEnabled(true);
					
				}
				else {
					c--;
					lar_qty_c_fries.setEnabled(false);
					lar_qty_c_fries.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		c_lar_fries.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c_lar_fries.setEnabled(false);
		c_lar_fries.setBounds(190, 145, 74, 25);
		panel_6.add(c_lar_fries);
		
		JLabel c_Reg_fries_rate = new JLabel("120");
		c_Reg_fries_rate.setHorizontalAlignment(SwingConstants.CENTER);
		c_Reg_fries_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		c_Reg_fries_rate.setBounds(320, 115, 80, 25);
		panel_6.add(c_Reg_fries_rate);
		
		JLabel c_lar_fries_rate = new JLabel("160");
		c_lar_fries_rate.setHorizontalAlignment(SwingConstants.CENTER);
		c_lar_fries_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		c_lar_fries_rate.setBounds(320, 145, 80, 25);
		panel_6.add(c_lar_fries_rate);
		
		JCheckBox CurlyFries = new JCheckBox("Curly Fries");
		CurlyFries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CurlyFries.isSelected()) {
					flag_cf=1;
					c_Reg_fries.setEnabled(true);
					c_lar_fries.setEnabled(true);
					
					CurlyFries.setBackground(new Color(255, 51, 255));
				}
				else {
					CurlyFries.setBackground(new Color(255, 204, 255));
					c_Reg_fries.setSelected(false);
					c_lar_fries.setSelected(false);
					
					c_Reg_fries_rate.setText("120");
					c_lar_fries_rate.setText("160");
				    //__________________________________
					c_Reg_fries.setEnabled(false);
					c_lar_fries.setEnabled(false);
					//___________________________________
					reg_qty_c_fries.setEnabled(false);
					lar_qty_c_fries.setEnabled(false);
					//___________________________________
					reg_qty_c_fries.setValue(0);
					lar_qty_c_fries.setValue(0);
				}
			}
		});
		CurlyFries.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CurlyFries.setBackground(new Color(255, 204, 255));
		CurlyFries.setBounds(6, 115, 182, 25);
		panel_6.add(CurlyFries);
		
		JSpinner reg_qty_ccb = new JSpinner();
		reg_qty_ccb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_ccb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_ccb.setEnabled(false);
		reg_qty_ccb.setBounds(270, 275, 50, 25);
		panel_6.add(reg_qty_ccb);
		
		JSpinner lar_qty_ccb = new JSpinner();
		lar_qty_ccb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		lar_qty_ccb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lar_qty_ccb.setEnabled(false);
		lar_qty_ccb.setBounds(270, 305, 50, 25);
		panel_6.add(lar_qty_ccb);
		
		JRadioButton ccb_Reg = new JRadioButton("3 Pieces");
		ccb_Reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ccb_Reg.isSelected()) {
					c++;
					flag_ccb_m=1;
					reg_qty_ccb.setEnabled(true);
					
				}
				else {
					c--;
					reg_qty_ccb.setEnabled(false);
					reg_qty_ccb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		ccb_Reg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ccb_Reg.setEnabled(false);
		ccb_Reg.setBounds(190, 275, 74, 25);
		panel_6.add(ccb_Reg);
		
		JRadioButton ccb_lar = new JRadioButton("6 Pieces");
		ccb_lar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ccb_lar.isSelected()) {
					c++;
					flag_ccb_h=1;
					lar_qty_ccb.setEnabled(true);
					
				}
				else {
					c--;
					lar_qty_ccb.setEnabled(false);
					lar_qty_ccb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		ccb_lar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ccb_lar.setEnabled(false);
		ccb_lar.setBounds(190, 305, 74, 25);
		panel_6.add(ccb_lar);
		
		JLabel ccb_Reg_rate = new JLabel("120");
		ccb_Reg_rate.setHorizontalAlignment(SwingConstants.CENTER);
		ccb_Reg_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ccb_Reg_rate.setBounds(320, 275, 80, 25);
		panel_6.add(ccb_Reg_rate);
		
		JLabel ccb_lar_rate = new JLabel("210");
		ccb_lar_rate.setHorizontalAlignment(SwingConstants.CENTER);
		ccb_lar_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ccb_lar_rate.setBounds(320, 305, 80, 25);
		panel_6.add(ccb_lar_rate);
		
		JSpinner reg_qty_nwb = new JSpinner();
		reg_qty_nwb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_nwb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_nwb.setEnabled(false);
		reg_qty_nwb.setBounds(270, 355, 50, 25);
		panel_6.add(reg_qty_nwb);
		
		JSpinner lar_qty_nwb = new JSpinner();
		lar_qty_nwb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		lar_qty_nwb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lar_qty_nwb.setEnabled(false);
		lar_qty_nwb.setBounds(270, 385, 50, 25);
		panel_6.add(lar_qty_nwb);
		
		JCheckBox ChickenCheesyBites = new JCheckBox("Chicken Cheesy Bites");
		ChickenCheesyBites.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ChickenCheesyBites.isSelected()) {
					flag_ccb=1;
					ccb_Reg.setEnabled(true);
					ccb_lar.setEnabled(true);
					
					ChickenCheesyBites.setBackground(new Color(255, 51, 255));
				}
				else {
					ChickenCheesyBites.setBackground(new Color(255, 204, 255));
					ccb_Reg.setSelected(false);
					ccb_lar.setSelected(false);
					
					ccb_Reg_rate.setText("120");
					ccb_lar_rate.setText("210");
				    //__________________________________
					ccb_Reg.setEnabled(false);
					ccb_lar.setEnabled(false);
					//___________________________________
					reg_qty_ccb.setEnabled(false);
					lar_qty_ccb.setEnabled(false);
					//___________________________________
					reg_qty_ccb.setValue(0);
					lar_qty_ccb.setValue(0);
				}
			}
		});
		ChickenCheesyBites.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ChickenCheesyBites.setBackground(new Color(255, 204, 255));
		ChickenCheesyBites.setBounds(6, 275, 182, 25);
		panel_6.add(ChickenCheesyBites);
		
		JSpinner reg_qty_pw = new JSpinner();
		reg_qty_pw.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_pw.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_pw.setEnabled(false);
		reg_qty_pw.setBounds(270, 195, 50, 25);
		panel_6.add(reg_qty_pw);
		
		JSpinner lar_qty_pw = new JSpinner();
		lar_qty_pw.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		lar_qty_pw.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lar_qty_pw.setEnabled(false);
		lar_qty_pw.setBounds(270, 225, 50, 25);
		panel_6.add(lar_qty_pw);
		
		JRadioButton pw_Reg = new JRadioButton("Regular");
		pw_Reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pw_Reg.isSelected()) {
					c++;
					flag_pw_m=1;
					reg_qty_pw.setEnabled(true);
					
				}
				else {
					c--;
					reg_qty_pw.setEnabled(false);
					reg_qty_pw.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		pw_Reg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pw_Reg.setEnabled(false);
		pw_Reg.setBounds(190, 195, 74, 25);
		panel_6.add(pw_Reg);
		
		JRadioButton pw_lar = new JRadioButton("Large");
		pw_lar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pw_lar.isSelected()) {
					c++;
					flag_pw_h=1;
					lar_qty_pw.setEnabled(true);
					
				}
				else {
					c--;
					lar_qty_pw.setEnabled(false);
					lar_qty_pw.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		pw_lar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pw_lar.setEnabled(false);
		pw_lar.setBounds(190, 225, 74, 25);
		panel_6.add(pw_lar);
		
		JLabel pw_Reg_rate = new JLabel("100");
		pw_Reg_rate.setHorizontalAlignment(SwingConstants.CENTER);
		pw_Reg_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pw_Reg_rate.setBounds(320, 195, 80, 25);
		panel_6.add(pw_Reg_rate);
		
		JLabel pw_lar_rate = new JLabel("140");
		pw_lar_rate.setHorizontalAlignment(SwingConstants.CENTER);
		pw_lar_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pw_lar_rate.setBounds(320, 225, 80, 25);
		panel_6.add(pw_lar_rate);
		
		JCheckBox PotatoWedges = new JCheckBox("Potato wedges");
		PotatoWedges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(PotatoWedges.isSelected()) {
					flag_pw=1;
					pw_Reg.setEnabled(true);
					pw_lar.setEnabled(true);
					
					PotatoWedges.setBackground(new Color(255, 51, 255));
				}
				else {
					PotatoWedges.setBackground(new Color(255, 204, 255));
					pw_Reg.setSelected(false);
					pw_lar.setSelected(false);
					
					pw_Reg_rate.setText("100");
					pw_lar_rate.setText("140");
				    //__________________________________
					pw_Reg.setEnabled(false);
					pw_lar.setEnabled(false);
					//___________________________________
					reg_qty_pw.setEnabled(false);
					lar_qty_pw.setEnabled(false);
					//___________________________________
					reg_qty_pw.setValue(0);
					lar_qty_pw.setValue(0);
				}
			}
		});
		PotatoWedges.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PotatoWedges.setBackground(new Color(255, 204, 255));
		PotatoWedges.setBounds(6, 195, 182, 25);
		panel_6.add(PotatoWedges);
		
		JRadioButton nwb_Reg = new JRadioButton("3 pieces");
		nwb_Reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nwb_Reg.isSelected()) {
					c++;
					flag_nwb_m=1;
					reg_qty_nwb.setEnabled(true);
					
				}
				else {
					c--;
					reg_qty_nwb.setEnabled(false);
					reg_qty_nwb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		nwb_Reg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nwb_Reg.setEnabled(false);
		nwb_Reg.setBounds(190, 355, 74, 25);
		panel_6.add(nwb_Reg);
		
		JRadioButton nwb_lar = new JRadioButton("6 pieces");
		nwb_lar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nwb_lar.isSelected()) {
					c++;
					flag_nwb_h=1;
					lar_qty_nwb.setEnabled(true);
					
				}
				else {
					c--;
					lar_qty_nwb.setEnabled(false);
					lar_qty_nwb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		nwb_lar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nwb_lar.setEnabled(false);
		nwb_lar.setBounds(190, 385, 74, 25);
		panel_6.add(nwb_lar);
		
		JLabel nwb_Reg_rate = new JLabel("170");
		nwb_Reg_rate.setHorizontalAlignment(SwingConstants.CENTER);
		nwb_Reg_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nwb_Reg_rate.setBounds(320, 355, 80, 25);
		panel_6.add(nwb_Reg_rate);
		
		JLabel nwb_lar_rate = new JLabel("310");
		nwb_lar_rate.setHorizontalAlignment(SwingConstants.CENTER);
		nwb_lar_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nwb_lar_rate.setBounds(320, 385, 80, 25);
		panel_6.add(nwb_lar_rate);
		
		JCheckBox NagaWingsBarrel = new JCheckBox("Naga Wings Barrel");
		NagaWingsBarrel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(NagaWingsBarrel.isSelected()) {
					flag_nwb=1;
					nwb_Reg.setEnabled(true);
					nwb_lar.setEnabled(true);
					
					NagaWingsBarrel.setBackground(new Color(255, 51, 255));
				}
				else {
					NagaWingsBarrel.setBackground(new Color(255, 204, 255));
					nwb_Reg.setSelected(false);
					nwb_lar.setSelected(false);
					
					nwb_Reg_rate.setText("170");
					nwb_lar_rate.setText("310");
				    //__________________________________
					nwb_Reg.setEnabled(false);
					nwb_lar.setEnabled(false);
					//___________________________________
					reg_qty_nwb.setEnabled(false);
					lar_qty_nwb.setEnabled(false);
					//___________________________________
					reg_qty_nwb.setValue(0);
					lar_qty_nwb.setValue(0);
				}
			}
		});
		NagaWingsBarrel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		NagaWingsBarrel.setBackground(new Color(255, 204, 255));
		NagaWingsBarrel.setBounds(6, 355, 182, 23);
		panel_6.add(NagaWingsBarrel);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBounds(590, 518, 400, 227);
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		Sub_total_cost = new JTextField();
		Sub_total_cost.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Sub_total_cost.setHorizontalAlignment(SwingConstants.CENTER);
		Sub_total_cost.setText("0");
		Sub_total_cost.setEditable(false);
		Sub_total_cost.setBounds(269, 40, 120, 30);
		panel_7.add(Sub_total_cost);
		Sub_total_cost.setColumns(10);
		
		txtServiceCharge_str = new JTextField();
		txtServiceCharge_str.setText("0");
		txtServiceCharge_str.setHorizontalAlignment(SwingConstants.CENTER);
		txtServiceCharge_str.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtServiceCharge_str.setEditable(false);
		txtServiceCharge_str.setColumns(10);
		txtServiceCharge_str.setBounds(269, 85, 120, 30);
		panel_7.add(txtServiceCharge_str);
		
		txttotal_str = new JTextField();
		txttotal_str.setText("0");
		txttotal_str.setHorizontalAlignment(SwingConstants.CENTER);
		txttotal_str.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txttotal_str.setEditable(false);
		txttotal_str.setColumns(10);
		txttotal_str.setBounds(269, 130, 120, 30);
		panel_7.add(txttotal_str);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 204, 255));
		panel.setBounds(85, 171, 400, 115);
		contentPane.add(panel);
		
		JSpinner reg_qty_bbc = new JSpinner();
		reg_qty_bbc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_bbc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_bbc.setEnabled(false);
		reg_qty_bbc.setBounds(270, 20, 50, 25);
		panel.add(reg_qty_bbc);
		
		JSpinner hot_qty_bbc = new JSpinner();
		hot_qty_bbc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		hot_qty_bbc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hot_qty_bbc.setEnabled(false);
		hot_qty_bbc.setBounds(270, 50, 50, 25);
		panel.add(hot_qty_bbc);
		
		JSpinner spi_qty_bbc = new JSpinner();
		spi_qty_bbc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spi_qty_bbc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spi_qty_bbc.setEnabled(false);
		spi_qty_bbc.setBounds(270, 80, 50, 25);
		panel.add(spi_qty_bbc);
		
		JLabel price_bbc = new JLabel("325");
		price_bbc.setHorizontalAlignment(SwingConstants.CENTER);
		price_bbc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		price_bbc.setBounds(320, 20, 80, 80);
		panel.add(price_bbc);
		
		JRadioButton mild_bbc = new JRadioButton("Regular");
		mild_bbc.setBackground(new Color(102,204,255));
		mild_bbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mild_bbc.isSelected()) {
					c++;
					flag_bbc_m=1;
					reg_qty_bbc.setEnabled(true);
					
				}
				else {
					c--;
					reg_qty_bbc.setEnabled(false);
					reg_qty_bbc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		mild_bbc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mild_bbc.setEnabled(false);
		mild_bbc.setBounds(190, 20, 74, 25);
		panel.add(mild_bbc);
		
		JRadioButton hot_bbc = new JRadioButton("Hot");
		hot_bbc.setBackground(new Color(255, 255, 51));
		hot_bbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hot_bbc.isSelected()) {
					c++;
					flag_bbc_h=1;
					hot_qty_bbc.setEnabled(true);
					
				}
				else {
					c--;
					hot_qty_bbc.setEnabled(false);
					hot_qty_bbc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		hot_bbc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hot_bbc.setEnabled(false);
		hot_bbc.setBounds(190, 50, 74, 25);
		panel.add(hot_bbc);
		
		JRadioButton spicy_bbc = new JRadioButton("Spicy");
		spicy_bbc.setBackground(new Color(255, 0, 51));
		spicy_bbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(spicy_bbc.isSelected()) {
					c++;
					flag_bbc_s=1;
					spi_qty_bbc.setEnabled(true);
				}
				else {
					c--;
					spi_qty_bbc.setEnabled(false);
					spi_qty_bbc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		spicy_bbc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spicy_bbc.setEnabled(false);
		spicy_bbc.setBounds(190, 80, 74, 25);
		panel.add(spicy_bbc);
		
		JCheckBox Beef_Burger_Cheese = new JCheckBox("Beef Burger Cheese");
		Beef_Burger_Cheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Beef_Burger_Cheese.isSelected()) {
					flag_bbc=1;
					Beef_Burger_Cheese.setBackground(new Color(255, 51, 255));
					mild_bbc.setEnabled(true);
					hot_bbc.setEnabled(true);
					spicy_bbc.setEnabled(true);
				}
				else {
					Beef_Burger_Cheese.setBackground(new Color(255, 204, 255));
					mild_bbc.setSelected(false);
					hot_bbc.setSelected(false);
					spicy_bbc.setSelected(false);
				    price_bbc.setText("325");
				    //___________________________________
					mild_bbc.setEnabled(false);
					hot_bbc.setEnabled(false);
					spicy_bbc.setEnabled(false);
					//___________________________________
					reg_qty_bbc.setEnabled(false);
					hot_qty_bbc.setEnabled(false);
					spi_qty_bbc.setEnabled(false);
					//___________________________________
					reg_qty_bbc.setValue(0);
					hot_qty_bbc.setValue(0);
					spi_qty_bbc.setValue(0);
					
				}
			}
		});
		Beef_Burger_Cheese.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Beef_Burger_Cheese.setBackground(new Color(255, 204, 255));
		Beef_Burger_Cheese.setBounds(5, 20, 180, 25);
		panel.add(Beef_Burger_Cheese);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 204, 255));
		panel_2.setBounds(85, 285, 400, 115);
		contentPane.add(panel_2);
		
		JLabel price_cb = new JLabel("250");
		price_cb.setHorizontalAlignment(SwingConstants.CENTER);
		price_cb.setFont(new Font("Tahoma", Font.PLAIN, 17));
		price_cb.setBounds(320, 20, 80, 80);
		panel_2.add(price_cb);
		
		JSpinner reg_qty_cb = new JSpinner();
		reg_qty_cb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_cb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_cb.setEnabled(false);
		reg_qty_cb.setBounds(270, 20, 50, 25);
		panel_2.add(reg_qty_cb);
		
		JSpinner hot_qty_cb = new JSpinner();
		hot_qty_cb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		hot_qty_cb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hot_qty_cb.setEnabled(false);
		hot_qty_cb.setBounds(270, 50, 50, 25);
		panel_2.add(hot_qty_cb);
		
		JSpinner spi_qty_cb = new JSpinner();
		spi_qty_cb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spi_qty_cb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spi_qty_cb.setEnabled(false);
		spi_qty_cb.setBounds(270, 80, 50, 25);
		panel_2.add(spi_qty_cb);
		
		JRadioButton mild_cb = new JRadioButton("Regular");
		mild_cb.setBackground(new Color(102,204,255));
		mild_cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mild_cb.isSelected()) {
					c++;
					flag_cb_m=1;
					reg_qty_cb.setEnabled(true);
					
				}
				else {
					c--;
					reg_qty_cb.setEnabled(false);
					reg_qty_cb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		mild_cb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mild_cb.setEnabled(false);
		mild_cb.setBounds(190, 20, 74, 25);
		panel_2.add(mild_cb);
		
		JRadioButton hot_cb = new JRadioButton("Hot");
		hot_cb.setBackground(new Color(255, 255, 51));
		hot_cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hot_cb.isSelected()) {
					c++;
					flag_cb_h=1;
					hot_qty_cb.setEnabled(true);
					
				}
				else {
					c--;
					hot_qty_cb.setEnabled(false);
					hot_qty_cb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		hot_cb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hot_cb.setEnabled(false);
		hot_cb.setBounds(190, 50, 74, 25);
		panel_2.add(hot_cb);
		
		JRadioButton spicy_cb = new JRadioButton("Spicy");
		spicy_cb.setBackground(new Color(255, 0, 51));
		spicy_cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(spicy_cb.isSelected()) {
					c++;
					flag_cb_s=1;
					spi_qty_cb.setEnabled(true);
				}
				else {
					c--;
					spi_qty_cb.setEnabled(false);
					spi_qty_cb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		spicy_cb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spicy_cb.setEnabled(false);
		spicy_cb.setBounds(190, 80, 74, 25);
		panel_2.add(spicy_cb);
		
		JCheckBox chicken_burger = new JCheckBox("Chicken Burger");
		chicken_burger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chicken_burger.isSelected()) {
					flag_cb=1;
					chicken_burger.setBackground(new Color(255, 51, 255));
					mild_cb.setEnabled(true);
					hot_cb.setEnabled(true);
					spicy_cb.setEnabled(true);
				}
				else {
					chicken_burger.setBackground(new Color(255, 204, 255));
					mild_cb.setSelected(false);
					hot_cb.setSelected(false);
					spicy_cb.setSelected(false);
				    price_cb.setText("250");
				  //___________________________________
					mild_cb.setEnabled(false);
					hot_cb.setEnabled(false);
					spicy_cb.setEnabled(false);
					//___________________________________
					reg_qty_cb.setEnabled(false);
					hot_qty_cb.setEnabled(false);
					spi_qty_cb.setEnabled(false);
					//___________________________________
					reg_qty_cb.setValue(0);
					hot_qty_cb.setValue(0);
					spi_qty_cb.setValue(0);
				}
			}
		});
		chicken_burger.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chicken_burger.setBackground(new Color(255, 204, 255));
		chicken_burger.setBounds(5, 20, 180, 25);
		panel_2.add(chicken_burger);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(255, 204, 255));
		panel_3.setBounds(85, 400, 400, 115);
		contentPane.add(panel_3);
		
		JLabel price_cbc = new JLabel("275");
		price_cbc.setHorizontalAlignment(SwingConstants.CENTER);
		price_cbc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		price_cbc.setBounds(320, 20, 80, 80);
		panel_3.add(price_cbc);
		
		JSpinner reg_qty_cbc = new JSpinner();
		reg_qty_cbc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_cbc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_cbc.setEnabled(false);
		reg_qty_cbc.setBounds(270, 20, 50, 25);
		panel_3.add(reg_qty_cbc);
		
		JSpinner hot_qty_cbc = new JSpinner();
		hot_qty_cbc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		hot_qty_cbc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hot_qty_cbc.setEnabled(false);
		hot_qty_cbc.setBounds(270, 50, 50, 25);
		panel_3.add(hot_qty_cbc);
		
		JSpinner spi_qty_cbc = new JSpinner();
		spi_qty_cbc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spi_qty_cbc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spi_qty_cbc.setEnabled(false);
		spi_qty_cbc.setBounds(270, 80, 50, 25);
		panel_3.add(spi_qty_cbc);
		
		JRadioButton mild_cbc = new JRadioButton("Regular");
		mild_cbc.setBackground(new Color(102,204,255));
		mild_cbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mild_cbc.isSelected()) {
					c++;
					flag_cbc_m=1;
					reg_qty_cbc.setEnabled(true);
					
				}
				else {
					c--;
					reg_qty_cbc.setEnabled(false);
					reg_qty_cbc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		mild_cbc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mild_cbc.setEnabled(false);
		mild_cbc.setBounds(190, 20, 74, 25);
		panel_3.add(mild_cbc);
		
		JRadioButton hot_cbc = new JRadioButton("Hot");
		hot_cbc.setBackground(new Color(255, 255, 51));
		hot_cbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hot_cbc.isSelected()) {
					c++;
					flag_cbc_h=1;
					hot_qty_cbc.setEnabled(true);
					
				}
				else {
					c--;
					hot_qty_cbc.setEnabled(false);
					hot_qty_cbc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		hot_cbc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hot_cbc.setEnabled(false);
		hot_cbc.setBounds(190, 50, 74, 25);
		panel_3.add(hot_cbc);
		
		JRadioButton spicy_cbc = new JRadioButton("Spicy");
		spicy_cbc.setBackground(new Color(255, 0, 51));
		spicy_cbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(spicy_cbc.isSelected()) {
					c++;
					flag_cbc_s=1;
					spi_qty_cbc.setEnabled(true);
				}
				else {
					c--;
					spi_qty_cbc.setEnabled(false);
					spi_qty_cbc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		spicy_cbc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spicy_cbc.setEnabled(false);
		spicy_cbc.setBounds(190, 80, 74, 25);
		panel_3.add(spicy_cbc);
		
		JCheckBox Chicken_Burger_Cheese = new JCheckBox("Chicken Burger Cheese");
		Chicken_Burger_Cheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Chicken_Burger_Cheese.isSelected()) {
					flag_cbc=1;
					Chicken_Burger_Cheese.setBackground(new Color(255, 51, 255));
					mild_cbc.setEnabled(true);
					hot_cbc.setEnabled(true);
					spicy_cbc.setEnabled(true);
				}
				else {
					Chicken_Burger_Cheese.setBackground(new Color(255, 204, 255));
					mild_cbc.setSelected(false);
					hot_cbc.setSelected(false);
					spicy_cbc.setSelected(false);
				    price_cbc.setText("275");
				  //___________________________________
					mild_cbc.setEnabled(false);
					hot_cbc.setEnabled(false);
					spicy_cbc.setEnabled(false);
					//___________________________________
					reg_qty_cbc.setEnabled(false);
					hot_qty_cbc.setEnabled(false);
					spi_qty_cbc.setEnabled(false);
					//___________________________________
					reg_qty_cbc.setValue(0);
					hot_qty_cbc.setValue(0);
					spi_qty_cbc.setValue(0);
				}
				
			}
		});
		Chicken_Burger_Cheese.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Chicken_Burger_Cheese.setBackground(new Color(255, 204, 255));
		Chicken_Burger_Cheese.setBounds(5, 20, 180, 25);
		panel_3.add(Chicken_Burger_Cheese);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(255, 204, 255));
		panel_4.setBounds(85, 515, 400, 115);
		contentPane.add(panel_4);
		
		JLabel price_bbqbb = new JLabel("350");
		price_bbqbb.setHorizontalAlignment(SwingConstants.CENTER);
		price_bbqbb.setFont(new Font("Tahoma", Font.PLAIN, 17));
		price_bbqbb.setBounds(320, 20, 80, 80);
		panel_4.add(price_bbqbb);
		
		JSpinner reg_qty_bbqbb = new JSpinner();
		reg_qty_bbqbb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_bbqbb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_bbqbb.setEnabled(false);
		reg_qty_bbqbb.setBounds(270, 20, 50, 25);
		panel_4.add(reg_qty_bbqbb);
		
		JSpinner hot_qty_bbqbb = new JSpinner();
		hot_qty_bbqbb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		hot_qty_bbqbb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hot_qty_bbqbb.setEnabled(false);
		hot_qty_bbqbb.setBounds(270, 50, 50, 25);
		panel_4.add(hot_qty_bbqbb);
		
		JSpinner spi_qty_bbqbb = new JSpinner();
		spi_qty_bbqbb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spi_qty_bbqbb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spi_qty_bbqbb.setEnabled(false);
		spi_qty_bbqbb.setBounds(270, 80, 50, 25);
		panel_4.add(spi_qty_bbqbb);
		
		JRadioButton mild_bbqbb = new JRadioButton("Regular");
		mild_bbqbb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mild_bbqbb.isSelected()) {
					c++;
					flag_bbqbb_m=1;
					reg_qty_bbqbb.setEnabled(true);
					
				}
				else {
					c--;
					reg_qty_bbqbb.setEnabled(false);
					reg_qty_bbqbb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		mild_bbqbb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mild_bbqbb.setEnabled(false);
		mild_bbqbb.setBounds(190, 20, 74, 25);
		mild_bbqbb.setBackground(new Color(102,204,255));
		panel_4.add(mild_bbqbb);
		
		JRadioButton hot_bbqbb = new JRadioButton("Hot");
		hot_bbqbb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hot_bbqbb.isSelected()) {
					c++;
					flag_bbqbb_h=1;
					hot_qty_bbqbb.setEnabled(true);
					
				}
				else {
					c--;
					hot_qty_bbqbb.setEnabled(false);
					hot_qty_bbqbb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		hot_bbqbb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hot_bbqbb.setEnabled(false);
		hot_bbqbb.setBounds(190, 50, 74, 25);
		hot_bbqbb.setBackground(new Color(255, 255, 51));
		panel_4.add(hot_bbqbb);
		
		JRadioButton spicy_bbqbb = new JRadioButton("Spicy");
		spicy_bbqbb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(spicy_bbqbb.isSelected()) {
					c++;
					flag_bbqbb_s=1;
					spi_qty_bbqbb.setEnabled(true);
				}
				else {
					c--;
					spi_qty_bbqbb.setEnabled(false);
					spi_qty_bbqbb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		spicy_bbqbb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spicy_bbqbb.setEnabled(false);
		spicy_bbqbb.setBounds(190, 80, 74, 25);
		spicy_bbqbb.setBackground(new Color(255, 0, 51));
		panel_4.add(spicy_bbqbb);
		
		JCheckBox Bbq_Beef_Burger = new JCheckBox("BBQ Beef Burger");
		Bbq_Beef_Burger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Bbq_Beef_Burger.isSelected()) {
					flag_bbqbb=1;
					mild_bbqbb.setEnabled(true);
					hot_bbqbb.setEnabled(true);
					spicy_bbqbb.setEnabled(true);
					Bbq_Beef_Burger.setBackground(new Color(255, 51, 255));
				}
				else {
					Bbq_Beef_Burger.setBackground(new Color(255, 204, 255));
					mild_bbqbb.setSelected(false);
					hot_bbqbb.setSelected(false);
					spicy_bbqbb.setSelected(false);
				    price_bbqbb.setText("350");
				    //__________________________________
					mild_bbqbb.setEnabled(false);
					hot_bbqbb.setEnabled(false);
					spicy_bbqbb.setEnabled(false);
					//___________________________________
					reg_qty_bbqbb.setEnabled(false);
					hot_qty_bbqbb.setEnabled(false);
					spi_qty_bbqbb.setEnabled(false);
					//___________________________________
					reg_qty_bbqbb.setValue(0);
					hot_qty_bbqbb.setValue(0);
					spi_qty_bbqbb.setValue(0);
				}
			}
		});
		Bbq_Beef_Burger.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Bbq_Beef_Burger.setBackground(new Color(255, 204, 255));
		Bbq_Beef_Burger.setBounds(5, 20, 180, 25);
		panel_4.add(Bbq_Beef_Burger);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(255, 204, 255));
		panel_5.setBounds(85, 630, 400, 115);
		contentPane.add(panel_5);
		
		JLabel price_bbqcb = new JLabel("325");
		price_bbqcb.setHorizontalAlignment(SwingConstants.CENTER);
		price_bbqcb.setFont(new Font("Tahoma", Font.PLAIN, 17));
		price_bbqcb.setBounds(320, 20, 80, 80);
		panel_5.add(price_bbqcb);
		
		JSpinner reg_qty_bbqcb = new JSpinner();
		reg_qty_bbqcb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_bbqcb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_bbqcb.setEnabled(false);
		reg_qty_bbqcb.setBounds(270, 20, 50, 25);
		panel_5.add(reg_qty_bbqcb);
		
		JSpinner hot_qty_bbqcb = new JSpinner();
		hot_qty_bbqcb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		hot_qty_bbqcb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hot_qty_bbqcb.setEnabled(false);
		hot_qty_bbqcb.setBounds(270, 50, 50, 25);
		panel_5.add(hot_qty_bbqcb);
		
		JSpinner spi_qty_bbqcb = new JSpinner();
		spi_qty_bbqcb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spi_qty_bbqcb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spi_qty_bbqcb.setEnabled(false);
		spi_qty_bbqcb.setBounds(270, 80, 50, 25);
		panel_5.add(spi_qty_bbqcb);
		
		JRadioButton mild_bbqcb = new JRadioButton("Regular");
		mild_bbqcb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mild_bbqcb.isSelected()) {
					c++;
					flag_bbqcb_m=1;
					reg_qty_bbqcb.setEnabled(true);
					
				}
				else {
					c--;
					reg_qty_bbqcb.setEnabled(false);
					reg_qty_bbqcb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		mild_bbqcb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mild_bbqcb.setEnabled(false);
		mild_bbqcb.setBounds(190, 20, 74, 25);
		mild_bbqcb.setBackground(new Color(102,204,255));
		panel_5.add(mild_bbqcb);
		
		JRadioButton hot_bbqcb = new JRadioButton("Hot");
		hot_bbqcb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hot_bbqcb.isSelected()) {
					c++;
					flag_bbqcb_h=1;
					hot_qty_bbqcb.setEnabled(true);
					
				}
				else {
					c--;
					hot_qty_bbqcb.setEnabled(false);
					hot_qty_bbqcb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		hot_bbqcb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hot_bbqcb.setEnabled(false);
		hot_bbqcb.setBounds(190, 50, 74, 25);
		hot_bbqcb.setBackground(new Color(255, 255, 51));
		panel_5.add(hot_bbqcb);
		
		JRadioButton spicy_bbqcb = new JRadioButton("Spicy");
		spicy_bbqcb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(spicy_bbqcb.isSelected()) {
					c++;
					flag_bbqcb_s=1;
					spi_qty_bbqcb.setEnabled(true);
				}
				else {
					c--;
					spi_qty_bbqcb.setEnabled(false);
					spi_qty_bbqcb.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		spicy_bbqcb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spicy_bbqcb.setEnabled(false);
		spicy_bbqcb.setBounds(190, 80, 74, 25);
		spicy_bbqcb.setBackground(new Color(255, 0, 51));
		panel_5.add(spicy_bbqcb);
		
		JCheckBox Bbq_Chicken_Burger = new JCheckBox("BBQ Chicken Burger");
		Bbq_Chicken_Burger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Bbq_Chicken_Burger.isSelected()) {
					flag_bbqcb=1;
					mild_bbqcb.setEnabled(true);
					hot_bbqcb.setEnabled(true);
					spicy_bbqcb.setEnabled(true);
					Bbq_Chicken_Burger.setBackground(new Color(255, 51, 255));
				}
				else {
					Bbq_Chicken_Burger.setBackground(new Color(255, 204, 255));
					mild_bbqcb.setSelected(false);
					hot_bbqcb.setSelected(false);
					spicy_bbqcb.setSelected(false);
				    price_bbqcb.setText("325");
				    //__________________________________
					mild_bbqcb.setEnabled(false);
					hot_bbqcb.setEnabled(false);
					spicy_bbqcb.setEnabled(false);
					//___________________________________
					reg_qty_bbqcb.setEnabled(false);
					hot_qty_bbqcb.setEnabled(false);
					spi_qty_bbqcb.setEnabled(false);
					//___________________________________
					reg_qty_bbqcb.setValue(0);
					hot_qty_bbqcb.setValue(0);
					spi_qty_bbqcb.setValue(0);
				}
			}
		});
		Bbq_Chicken_Burger.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Bbq_Chicken_Burger.setBackground(new Color(255, 204, 255));
		Bbq_Chicken_Burger.setBounds(5, 20, 180, 25);
		panel_5.add(Bbq_Chicken_Burger);
		
		MoneyReceipt mr=new MoneyReceipt();
		
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(255, 204, 255));
		panel_8.setBounds(1110, 58, 400, 687);
		contentPane.add(panel_8);
		
		JSpinner reg_qty_cc = new JSpinner();
		reg_qty_cc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_cc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_cc.setEnabled(false);
		reg_qty_cc.setBounds(270, 41, 50, 25);
		panel_8.add(reg_qty_cc);
		
		JSpinner lar_qty_cc = new JSpinner();
		lar_qty_cc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		lar_qty_cc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lar_qty_cc.setEnabled(false);
		lar_qty_cc.setBounds(270, 71, 50, 25);
		panel_8.add(lar_qty_cc);
		
		JRadioButton cc_Reg = new JRadioButton("Small");
		cc_Reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cc_Reg.isSelected()) {
					flag_cc_m=1;
					reg_qty_cc.setEnabled(true);
					
				}
				else {
					reg_qty_cc.setEnabled(false);
					reg_qty_cc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		cc_Reg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cc_Reg.setEnabled(false);
		cc_Reg.setBounds(190, 41, 74, 25);
		panel_8.add(cc_Reg);
		
		JRadioButton cc_lar = new JRadioButton("Large");
		cc_lar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cc_lar.isSelected()) {
					flag_cc_h=1;
					lar_qty_cc.setEnabled(true);
					
				}
				else {
					lar_qty_cc.setEnabled(false);
					lar_qty_cc.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		cc_lar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cc_lar.setEnabled(false);
		cc_lar.setBounds(190, 71, 74, 25);
		panel_8.add(cc_lar);
		
		cc_Reg_rate = new JLabel("50");
		cc_Reg_rate.setHorizontalAlignment(SwingConstants.CENTER);
		cc_Reg_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cc_Reg_rate.setBounds(320, 41, 80, 25);
		panel_8.add(cc_Reg_rate);
		
		JLabel cc_lar_rate = new JLabel("70");
		cc_lar_rate.setHorizontalAlignment(SwingConstants.CENTER);
		cc_lar_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cc_lar_rate.setBounds(320, 71, 80, 25);
		panel_8.add(cc_lar_rate);
		
		JCheckBox CocaCola = new JCheckBox("Coca-Cola");
		CocaCola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CocaCola.isSelected()) {
					flag_cc=1;
					cc_Reg.setEnabled(true);
					cc_lar.setEnabled(true);
					
					CocaCola.setBackground(new Color(255, 51, 255));
				}
				else {
					CocaCola.setBackground(new Color(255, 204, 255));
					cc_Reg.setSelected(false);
					cc_lar.setSelected(false);
					
					cc_Reg_rate.setText("50");
					cc_lar_rate.setText("70");
				    //__________________________________
					cc_Reg.setEnabled(false);
					cc_lar.setEnabled(false);
					//___________________________________
					reg_qty_cc.setEnabled(false);
					lar_qty_cc.setEnabled(false);
					//___________________________________
					reg_qty_cc.setValue(0);
					lar_qty_cc.setValue(0);
				}
			}
		});
		CocaCola.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CocaCola.setBackground(new Color(255, 204, 255));
		CocaCola.setBounds(6, 41, 182, 25);
		panel_8.add(CocaCola);
		
		JSpinner reg_qty_f = new JSpinner();
		reg_qty_f.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_f.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_f.setEnabled(false);
		reg_qty_f.setBounds(270, 202, 50, 25);
		panel_8.add(reg_qty_f);
		
		JSpinner lar_qty_f = new JSpinner();
		lar_qty_f.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		lar_qty_f.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lar_qty_f.setEnabled(false);
		lar_qty_f.setBounds(270, 232, 50, 25);
		panel_8.add(lar_qty_f);
		
		JRadioButton f_Reg = new JRadioButton("Small");
		f_Reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f_Reg.isSelected()) {
					flag_fa_m=1;
					reg_qty_f.setEnabled(true);
					
				}
				else {
					reg_qty_f.setEnabled(false);
					reg_qty_f.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		f_Reg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		f_Reg.setEnabled(false);
		f_Reg.setBounds(190, 202, 74, 25);
		panel_8.add(f_Reg);
		
		JRadioButton f_lar = new JRadioButton("Large");
		f_lar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f_lar.isSelected()) {
					flag_fa_h=1;
					lar_qty_f.setEnabled(true);
					
				}
				else {
					lar_qty_f.setEnabled(false);
					lar_qty_f.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		f_lar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		f_lar.setEnabled(false);
		f_lar.setBounds(190, 232, 74, 25);
		panel_8.add(f_lar);
		
		JLabel f_Reg_rate = new JLabel("50");
		f_Reg_rate.setHorizontalAlignment(SwingConstants.CENTER);
		f_Reg_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		f_Reg_rate.setBounds(320, 202, 80, 25);
		panel_8.add(f_Reg_rate);
		
		JLabel f_lar_rate = new JLabel("70");
		f_lar_rate.setHorizontalAlignment(SwingConstants.CENTER);
		f_lar_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		f_lar_rate.setBounds(320, 232, 80, 25);
		panel_8.add(f_lar_rate);
		
		JCheckBox Fanta = new JCheckBox("Fanta");
		Fanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fanta.isSelected()) {
					flag_fa=1;
					f_Reg.setEnabled(true);
					f_lar.setEnabled(true);
					
					Fanta.setBackground(new Color(255, 51, 255));
				}
				else {
					Fanta.setBackground(new Color(255, 204, 255));
					f_Reg.setSelected(false);
					f_lar.setSelected(false);
					
					f_Reg_rate.setText("50");
					f_lar_rate.setText("70");
				    //__________________________________
					f_Reg.setEnabled(false);
					f_lar.setEnabled(false);
					//___________________________________
					reg_qty_f.setEnabled(false);
					lar_qty_f.setEnabled(false);
					//___________________________________
					reg_qty_f.setValue(0);
					lar_qty_f.setValue(0);
				}
			}
		});
		Fanta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Fanta.setBackground(new Color(255, 204, 255));
		Fanta.setBounds(6, 202, 182, 25);
		panel_8.add(Fanta);
		
		JSpinner reg_qty_s = new JSpinner();
		reg_qty_s.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_s.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_s.setEnabled(false);
		reg_qty_s.setBounds(270, 122, 50, 25);
		panel_8.add(reg_qty_s);
		
		JSpinner lar_qty_s = new JSpinner();
		lar_qty_s.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		lar_qty_s.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lar_qty_s.setEnabled(false);
		lar_qty_s.setBounds(270, 152, 50, 25);
		panel_8.add(lar_qty_s);
		
		JRadioButton s_Reg = new JRadioButton("Small");
		s_Reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s_Reg.isSelected()) {
					flag_s_m=1;
					reg_qty_s.setEnabled(true);
					
				}
				else {
					reg_qty_s.setEnabled(false);
					reg_qty_s.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		s_Reg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_Reg.setEnabled(false);
		s_Reg.setBounds(190, 122, 74, 25);
		panel_8.add(s_Reg);
		
		JRadioButton s_lar = new JRadioButton("Large");
		s_lar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s_lar.isSelected()) {
					flag_s_h=1;
					lar_qty_s.setEnabled(true);
					
				}
				else {
					lar_qty_s.setEnabled(false);
					lar_qty_s.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		s_lar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		s_lar.setEnabled(false);
		s_lar.setBounds(190, 152, 74, 25);
		panel_8.add(s_lar);
		
		JLabel s_Reg_rate = new JLabel("50");
		s_Reg_rate.setHorizontalAlignment(SwingConstants.CENTER);
		s_Reg_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		s_Reg_rate.setBounds(320, 122, 80, 25);
		panel_8.add(s_Reg_rate);
		
		JLabel s_lar_rate = new JLabel("70");
		s_lar_rate.setHorizontalAlignment(SwingConstants.CENTER);
		s_lar_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		s_lar_rate.setBounds(320, 152, 80, 25);
		panel_8.add(s_lar_rate);
		
		JCheckBox Sprite = new JCheckBox("Sprite");
		Sprite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Sprite.isSelected()) {
					flag_s=1;
					s_Reg.setEnabled(true);
					s_lar.setEnabled(true);
					
					Sprite.setBackground(new Color(255, 51, 255));
				}
				else {
					Sprite.setBackground(new Color(255, 204, 255));
					s_Reg.setSelected(false);
					s_lar.setSelected(false);
					
					s_Reg_rate.setText("50");
					s_lar_rate.setText("70");
				    //__________________________________
					s_Reg.setEnabled(false);
					s_lar.setEnabled(false);
					//___________________________________
					reg_qty_s.setEnabled(false);
					lar_qty_s.setEnabled(false);
					//___________________________________
					reg_qty_s.setValue(0);
					lar_qty_s.setValue(0);
				}
			}
		});
		Sprite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Sprite.setBackground(new Color(255, 204, 255));
		Sprite.setBounds(6, 122, 182, 25);
		panel_8.add(Sprite);
		
		JLabel mw_Reg_rate = new JLabel("25");
		mw_Reg_rate.setHorizontalAlignment(SwingConstants.CENTER);
		mw_Reg_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		mw_Reg_rate.setBounds(320, 275, 80, 25);
		panel_8.add(mw_Reg_rate);
		
		
		JSpinner reg_qty_mw = new JSpinner();
		reg_qty_mw.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_mw.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_mw.setEnabled(false);
		reg_qty_mw.setBounds(270, 275, 50, 25);
		panel_8.add(reg_qty_mw);
		
		JCheckBox MineralWaterml = new JCheckBox("Mineral Water (500ml)");
		MineralWaterml.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(MineralWaterml.isSelected()) {
					flag_mw=1;
					reg_qty_mw.setEnabled(true);
					MineralWaterml.setBackground(new Color(255, 51, 255));
				}
				else {
					MineralWaterml.setBackground(new Color(255, 204, 255));
					mw_Reg_rate.setText("25");
				    //__________________________________
					//___________________________________
					reg_qty_mw.setEnabled(false);
					//___________________________________
					reg_qty_mw.setValue(0);
				}
			}
		});
		MineralWaterml.setFont(new Font("Tahoma", Font.PLAIN, 15));
		MineralWaterml.setBackground(new Color(255, 204, 255));
		MineralWaterml.setBounds(6, 275, 258, 25);
		panel_8.add(MineralWaterml);
		
		JLabel lblNewLabel_1 = new JLabel("  Drinks");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(6, 0, 135, 30);
		panel_8.add(lblNewLabel_1);
		
		JLabel lblColdCoffee = new JLabel("COLD COFFEE");
		lblColdCoffee.setHorizontalAlignment(SwingConstants.LEFT);
		lblColdCoffee.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblColdCoffee.setBounds(6, 328, 182, 30);
		panel_8.add(lblColdCoffee);
		
		JLabel lblNewLabel_2 = new JLabel("======================================================");
		lblNewLabel_2.setBounds(6, 318, 384, 14);
		panel_8.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("----------------------------------");
		lblNewLabel_3.setBounds(6, 354, 147, 14);
		panel_8.add(lblNewLabel_3);
		
		JLabel label = new JLabel("---------------------------");
		label.setBounds(6, 24, 147, 14);
		panel_8.add(label);
		
		JSpinner reg_qty_ca = new JSpinner();
		reg_qty_ca.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_ca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_ca.setEnabled(false);
		reg_qty_ca.setBounds(270, 380, 50, 25);
		panel_8.add(reg_qty_ca);
		
		JSpinner lar_qty_ca = new JSpinner();
		lar_qty_ca.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		lar_qty_ca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lar_qty_ca.setEnabled(false);
		lar_qty_ca.setBounds(270, 410, 50, 25);
		panel_8.add(lar_qty_ca);
		
		JRadioButton ca_Reg = new JRadioButton("Small");
		ca_Reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ca_Reg.isSelected()) {
					flag_ca_m=1;
					reg_qty_ca.setEnabled(true);
					
				}
				else {
					reg_qty_ca.setEnabled(false);
					reg_qty_ca.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		ca_Reg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ca_Reg.setEnabled(false);
		ca_Reg.setBounds(190, 380, 74, 25);
		panel_8.add(ca_Reg);
		
		JRadioButton ca_lar = new JRadioButton("Large");
		ca_lar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ca_lar.isSelected()) {
					flag_ca_h=1;
					lar_qty_ca.setEnabled(true);
					
				}
				else {
					lar_qty_ca.setEnabled(false);
					lar_qty_ca.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		ca_lar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ca_lar.setEnabled(false);
		ca_lar.setBounds(190, 410, 74, 25);
		panel_8.add(ca_lar);
		
		JLabel ca_Reg_rate = new JLabel("90");
		ca_Reg_rate.setHorizontalAlignment(SwingConstants.CENTER);
		ca_Reg_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ca_Reg_rate.setBounds(320, 380, 80, 25);
		panel_8.add(ca_Reg_rate);
		
		JLabel ca_lar_rate = new JLabel("170");
		ca_lar_rate.setHorizontalAlignment(SwingConstants.CENTER);
		ca_lar_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ca_lar_rate.setBounds(320, 410, 80, 25);
		panel_8.add(ca_lar_rate);
		
		JCheckBox Caramel = new JCheckBox("Caramel");
		Caramel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Caramel.isSelected()) {
					flag_ca=1;
					ca_Reg.setEnabled(true);
					ca_lar.setEnabled(true);
					
					Caramel.setBackground(new Color(255, 51, 255));
				}
				else {
					Caramel.setBackground(new Color(255, 204, 255));
					ca_Reg.setSelected(false);
					cc_lar.setSelected(false);
					
					ca_Reg_rate.setText("90");
					ca_lar_rate.setText("170");
				    //__________________________________
					ca_Reg.setEnabled(false);
					ca_lar.setEnabled(false);
					//___________________________________
					reg_qty_ca.setEnabled(false);
					lar_qty_ca.setEnabled(false);
					//___________________________________
					reg_qty_ca.setValue(0);
					lar_qty_ca.setValue(0);
				}
			}
		});
		Caramel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Caramel.setBackground(new Color(255, 204, 255));
		Caramel.setBounds(6, 380, 182, 25);
		panel_8.add(Caramel);
		
		JSpinner reg_qty_ch = new JSpinner();
		reg_qty_ch.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_ch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_ch.setEnabled(false);
		reg_qty_ch.setBounds(270, 461, 50, 25);
		panel_8.add(reg_qty_ch);
		
		JSpinner lar_qty_ch = new JSpinner();
		lar_qty_ch.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		lar_qty_ch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lar_qty_ch.setEnabled(false);
		lar_qty_ch.setBounds(270, 491, 50, 25);
		panel_8.add(lar_qty_ch);
		

		JRadioButton ch_Reg = new JRadioButton("Small");
		ch_Reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ch_Reg.isSelected()) {
					flag_ch_m=1;
					reg_qty_ch.setEnabled(true);
					
				}
				else {
					reg_qty_ch.setEnabled(false);
					reg_qty_ch.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		ch_Reg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ch_Reg.setEnabled(false);
		ch_Reg.setBounds(190, 461, 74, 25);
		panel_8.add(ch_Reg);
		
		JRadioButton ch_lar = new JRadioButton("Large");
		ch_lar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ch_lar.isSelected()) {
					flag_ch_h=1;
					lar_qty_ch.setEnabled(true);
					
				}
				else {
					lar_qty_ch.setEnabled(false);
					lar_qty_ch.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		ch_lar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ch_lar.setEnabled(false);
		ch_lar.setBounds(190, 491, 74, 25);
		panel_8.add(ch_lar);
		
		JLabel ch_Reg_rate = new JLabel("85");
		ch_Reg_rate.setHorizontalAlignment(SwingConstants.CENTER);
		ch_Reg_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ch_Reg_rate.setBounds(320, 461, 80, 25);
		panel_8.add(ch_Reg_rate);
		
		JLabel ch_lar_rate = new JLabel("160");
		ch_lar_rate.setHorizontalAlignment(SwingConstants.CENTER);
		ch_lar_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ch_lar_rate.setBounds(320, 491, 80, 25);
		panel_8.add(ch_lar_rate);
		
		JCheckBox Chocolate = new JCheckBox("Chocolate");
		Chocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Chocolate.isSelected()) {
					flag_ch=1;
					ch_Reg.setEnabled(true);
					ch_lar.setEnabled(true);
					
					Chocolate.setBackground(new Color(255, 51, 255));
				}
				else {
					Chocolate.setBackground(new Color(255, 204, 255));
					ch_Reg.setSelected(false);
					ch_lar.setSelected(false);
					
					ch_Reg_rate.setText("85");
					ch_lar_rate.setText("160");
				    //__________________________________
					ch_Reg.setEnabled(false);
					ch_lar.setEnabled(false);
					//___________________________________
					reg_qty_ch.setEnabled(false);
					lar_qty_ch.setEnabled(false);
					//___________________________________
					reg_qty_ch.setValue(0);
					lar_qty_ch.setValue(0);
				}
			}
		});
		Chocolate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Chocolate.setBackground(new Color(255, 204, 255));
		Chocolate.setBounds(6, 461, 182, 25);
		panel_8.add(Chocolate);
		
		JSpinner reg_qty_ha = new JSpinner();
		reg_qty_ha.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_ha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_ha.setEnabled(false);
		reg_qty_ha.setBounds(270, 541, 50, 25);
		panel_8.add(reg_qty_ha);
		
		JSpinner lar_qty_ha = new JSpinner();
		lar_qty_ha.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		lar_qty_ha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lar_qty_ha.setEnabled(false);
		lar_qty_ha.setBounds(270, 571, 50, 25);
		panel_8.add(lar_qty_ha);
		
		JRadioButton ha_Reg = new JRadioButton("Small");
		ha_Reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ha_Reg.isSelected()) {
					flag_ha_m=1;
					reg_qty_ha.setEnabled(true);
					
				}
				else {
					reg_qty_ha.setEnabled(false);
					reg_qty_ha.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		ha_Reg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ha_Reg.setEnabled(false);
		ha_Reg.setBounds(190, 541, 74, 25);
		panel_8.add(ha_Reg);
		
		JRadioButton ha_lar = new JRadioButton("Large");
		ha_lar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ha_lar.isSelected()) {
					flag_ha_h=1;
					lar_qty_ha.setEnabled(true);
					
				}
				else {
					lar_qty_ha.setEnabled(false);
					lar_qty_ha.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		ha_lar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ha_lar.setEnabled(false);
		ha_lar.setBounds(190, 571, 74, 25);
		panel_8.add(ha_lar);
		
		JLabel ha_Reg_rate = new JLabel("80");
		ha_Reg_rate.setHorizontalAlignment(SwingConstants.CENTER);
		ha_Reg_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ha_Reg_rate.setBounds(320, 541, 80, 25);
		panel_8.add(ha_Reg_rate);
		
		JLabel ha_lar_rate = new JLabel("150");
		ha_lar_rate.setHorizontalAlignment(SwingConstants.CENTER);
		ha_lar_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ha_lar_rate.setBounds(320, 571, 80, 25);
		panel_8.add(ha_lar_rate);
		
		JCheckBox Hazelnut = new JCheckBox("Hazelnut");
		Hazelnut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Hazelnut.isSelected()) {
					flag_ha=1;
					ha_Reg.setEnabled(true);
					ha_lar.setEnabled(true);
					
					Hazelnut.setBackground(new Color(255, 51, 255));
				}
				else {
					Hazelnut.setBackground(new Color(255, 204, 255));
					ha_Reg.setSelected(false);
					ha_lar.setSelected(false);
					
					ha_Reg_rate.setText("80");
					ha_lar_rate.setText("150");
				    //__________________________________
					ha_Reg.setEnabled(false);
					ha_lar.setEnabled(false);
					//___________________________________
					reg_qty_ha.setEnabled(false);
					lar_qty_ha.setEnabled(false);
					//___________________________________
					reg_qty_ha.setValue(0);
					lar_qty_ha.setValue(0);
				}
			}
		});
		Hazelnut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Hazelnut.setBackground(new Color(255, 204, 255));
		Hazelnut.setBounds(6, 541, 182, 25);
		panel_8.add(Hazelnut);
		
		
		
		JSpinner reg_qty_st = new JSpinner();
		reg_qty_st.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		reg_qty_st.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reg_qty_st.setEnabled(false);
		reg_qty_st.setBounds(270, 621, 50, 25);
		panel_8.add(reg_qty_st);
		
		JSpinner lar_qty_st = new JSpinner();
		lar_qty_st.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		lar_qty_st.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lar_qty_st.setEnabled(false);
		lar_qty_st.setBounds(270, 651, 50, 25);
		panel_8.add(lar_qty_st);
		
		JRadioButton st_Reg = new JRadioButton("Small");
		st_Reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(st_Reg.isSelected()) {
					flag_st_m=1;
					reg_qty_st.setEnabled(true);
					
				}
				else {
					reg_qty_st.setEnabled(false);
					reg_qty_st.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		st_Reg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		st_Reg.setEnabled(false);
		st_Reg.setBounds(190, 621, 74, 25);
		panel_8.add(st_Reg);
		
		JRadioButton st_lar = new JRadioButton("Large");
		st_lar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(st_lar.isSelected()) {
					flag_st_h=1;
					lar_qty_st.setEnabled(true);
					
				}
				else {
					lar_qty_st.setEnabled(false);
					lar_qty_st.setModel(new SpinnerNumberModel(0, 0, 100, 1));
				}
			}
		});
		st_lar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		st_lar.setEnabled(false);
		st_lar.setBounds(190, 651, 74, 25);
		panel_8.add(st_lar);
		
		JLabel st_Reg_rate = new JLabel("75");
		st_Reg_rate.setHorizontalAlignment(SwingConstants.CENTER);
		st_Reg_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		st_Reg_rate.setBounds(320, 621, 80, 25);
		panel_8.add(st_Reg_rate);
		
		JLabel st_lar_rate = new JLabel("140");
		st_lar_rate.setHorizontalAlignment(SwingConstants.CENTER);
		st_lar_rate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		st_lar_rate.setBounds(320, 651, 80, 25);
		panel_8.add(st_lar_rate);
		
		JCheckBox Strawberry = new JCheckBox("Strawberry");
		Strawberry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Strawberry.isSelected()) {
					flag_st=1;
					st_Reg.setEnabled(true);
					st_lar.setEnabled(true);
					
					Strawberry.setBackground(new Color(255, 51, 255));
				}
				else {
					Strawberry.setBackground(new Color(255, 204, 255));
					st_Reg.setSelected(false);
					st_lar.setSelected(false);
					
					st_Reg_rate.setText("75");
					st_lar_rate.setText("140");
				    //__________________________________
					st_Reg.setEnabled(false);
					st_lar.setEnabled(false);
					//___________________________________
					reg_qty_st.setEnabled(false);
					lar_qty_st.setEnabled(false);
					//___________________________________
					reg_qty_st.setValue(0);
					lar_qty_st.setValue(0);
				}
			}
		});
		Strawberry.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Strawberry.setBackground(new Color(255, 204, 255));
		Strawberry.setBounds(6, 621, 182, 25);
		panel_8.add(Strawberry);
		
		textField = new JTextField();
		textField.setText("Qty");
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(255, 204, 255));
		textField.setBounds(270, -1, 41, 30);
		panel_8.add(textField);
		
		textField_3 = new JTextField();
		textField_3.setText("Rate");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(255, 204, 255));
		textField_3.setBounds(318, 0, 80, 30);
		panel_8.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("Qty");
		textField_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(255, 204, 255));
		textField_4.setBounds(272, 328, 41, 30);
		panel_8.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("Rate");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(255, 204, 255));
		textField_5.setBounds(320, 329, 80, 30);
		panel_8.add(textField_5);
		
		JButton btnTotal = new JButton("Total");
		
		JButton doneButton = new JButton("Done");
		doneButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		doneButton.setVisible(false);
		doneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				mr.setVisible(true);
				btnTotal.setVisible(false);
				doneButton.setEnabled(false);
				flag_done=1;
				//-----------------------------
				beef_burger.setEnabled(false);
				mild_bb.setEnabled(false);
				hot_bb.setEnabled(false);
				spicy_bb.setEnabled(false);
				reg_qty_bb.setEnabled(false);
				hot_qty_bb.setEnabled(false);
				spi_qty_bb.setEnabled(false);
				price_bb.setEnabled(false);
				//-----------------------------
				Beef_Burger_Cheese.setEnabled(false);
				mild_bbc.setEnabled(false);
				hot_bbc.setEnabled(false);
				spicy_bbc.setEnabled(false);
				reg_qty_bbc.setEnabled(false);
				hot_qty_bbc.setEnabled(false);
				spi_qty_bbc.setEnabled(false);
				price_bbc.setEnabled(false);
				//-----------------------------
				chicken_burger.setEnabled(false);
				mild_cb.setEnabled(false);
				hot_cb.setEnabled(false);
				spicy_cb.setEnabled(false);
				reg_qty_cb.setEnabled(false);
				hot_qty_cb.setEnabled(false);
				spi_qty_cb.setEnabled(false);
				price_cb.setEnabled(false);
				//-----------------------------
				Chicken_Burger_Cheese.setEnabled(false);
				mild_cbc.setEnabled(false);
				hot_cbc.setEnabled(false);
				spicy_cbc.setEnabled(false);
				reg_qty_cbc.setEnabled(false);
				hot_qty_cbc.setEnabled(false);
				spi_qty_cbc.setEnabled(false);
				price_cbc.setEnabled(false);
				//-----------------------------
				Bbq_Beef_Burger.setEnabled(false);
				mild_bbqbb.setEnabled(false);
				hot_bbqbb.setEnabled(false);
				spicy_bbqbb.setEnabled(false);
				reg_qty_bbqbb.setEnabled(false);
				hot_qty_bbqbb.setEnabled(false);
				spi_qty_bbqbb.setEnabled(false);
				price_bbqbb.setEnabled(false);
				//-----------------------------
				Bbq_Chicken_Burger.setEnabled(false);
				mild_bbqcb.setEnabled(false);
				hot_bbqcb.setEnabled(false);
				spicy_bbqcb.setEnabled(false);
				reg_qty_bbqcb.setEnabled(false);
				hot_qty_bbqcb.setEnabled(false);
				spi_qty_bbqcb.setEnabled(false);
				price_bbqcb.setEnabled(false);
				//-----------------------------
				Fries.setEnabled(false);
				Reg_fries.setEnabled(false);
				lar_fries.setEnabled(false);
				
				reg_qty_fries.setEnabled(false);
				lar_qty_fries.setEnabled(false);
				
				reg_qty_fries.setEnabled(false);
				lar_qty_fries.setEnabled(false);
				//-----------------------------
				CurlyFries.setEnabled(false);
				c_Reg_fries.setEnabled(false);
				c_lar_fries.setEnabled(false);
				
				reg_qty_c_fries.setEnabled(false);
				lar_qty_c_fries.setEnabled(false);
				
				reg_qty_c_fries.setEnabled(false);
				lar_qty_c_fries.setEnabled(false);
				//-----------------------------
				PotatoWedges.setEnabled(false);
				pw_Reg.setEnabled(false);
				pw_lar.setEnabled(false);
				
				reg_qty_pw.setEnabled(false);
				lar_qty_pw.setEnabled(false);
				
				reg_qty_pw.setEnabled(false);
				lar_qty_pw.setEnabled(false);
				//-----------------------------
				ChickenCheesyBites.setEnabled(false);
				ccb_Reg.setEnabled(false);
				ccb_lar.setEnabled(false);
				
				reg_qty_ccb.setEnabled(false);
				lar_qty_ccb.setEnabled(false);
				
				reg_qty_ccb.setEnabled(false);
				lar_qty_ccb.setEnabled(false);
				//-----------------------------
				NagaWingsBarrel.setEnabled(false);
				nwb_Reg.setEnabled(false);
				nwb_lar.setEnabled(false);
				
				reg_qty_nwb.setEnabled(false);
				lar_qty_nwb.setEnabled(false);
				
				reg_qty_nwb.setEnabled(false);
				lar_qty_nwb.setEnabled(false);
				//-----------------------------
				CocaCola.setEnabled(false);
				cc_Reg.setEnabled(false);
				cc_lar.setEnabled(false);
				
				reg_qty_cc.setEnabled(false);
				lar_qty_cc.setEnabled(false);
				
				reg_qty_cc.setEnabled(false);
				lar_qty_cc.setEnabled(false);
				//-----------------------------
				Sprite.setEnabled(false);
				s_Reg.setEnabled(false);
				s_lar.setEnabled(false);
				
				reg_qty_s.setEnabled(false);
				lar_qty_s.setEnabled(false);
				
				reg_qty_s.setEnabled(false);
				lar_qty_s.setEnabled(false);
				//-----------------------------
				Fanta.setEnabled(false);
				f_Reg.setEnabled(false);
				f_lar.setEnabled(false);
				
				reg_qty_f.setEnabled(false);
				lar_qty_f.setEnabled(false);
				
				reg_qty_f.setEnabled(false);
				lar_qty_f.setEnabled(false);
				//-----------------------------
				MineralWaterml.setEnabled(false);
				
				reg_qty_mw.setEnabled(false);
				
				reg_qty_mw.setEnabled(false);
				//-----------------------------
				Caramel.setEnabled(false);
				ca_Reg.setEnabled(false);
				ca_lar.setEnabled(false);
				
				reg_qty_ca.setEnabled(false);
				lar_qty_ca.setEnabled(false);
				
				reg_qty_ca.setEnabled(false);
				lar_qty_ca.setEnabled(false);
				//-----------------------------
				Chocolate.setEnabled(false);
				ch_Reg.setEnabled(false);
				ch_lar.setEnabled(false);
				
				reg_qty_ch.setEnabled(false);
				lar_qty_ch.setEnabled(false);
				
				reg_qty_ch.setEnabled(false);
				lar_qty_ch.setEnabled(false);
				//-----------------------------
				Hazelnut.setEnabled(false);
				ha_Reg.setEnabled(false);
				ha_lar.setEnabled(false);
				
				reg_qty_ha.setEnabled(false);
				lar_qty_ha.setEnabled(false);
				
				reg_qty_ha.setEnabled(false);
				lar_qty_ha.setEnabled(false);
				//-----------------------------
				Strawberry.setEnabled(false);
				st_Reg.setEnabled(false);
				st_lar.setEnabled(false);
				
				reg_qty_st.setEnabled(false);
				lar_qty_st.setEnabled(false);
				
				reg_qty_st.setEnabled(false);
				lar_qty_st.setEnabled(false);
				//-----------------------------
				File file = new File("MRFile.txt");
				 
				 try {
					 PrintWriter out = new PrintWriter (file); 
					 
					 out.println("====================================================================");
					 out.println("Restaurant Management");
					 out.println("--------------------------------------------------------------------");
					 out.println("Name:"+Main.name);
					 out.println("Phone number: "+Main.phone);
					 out.println("Table: "+Main.table);
					 out.println("====================================================================");
					 out.println("Qty   Items Name                          Rate   Price");
					 if(Menu.bb_qty_mint>0) {
					 out.println(Menu.bb_qty_m_ins+"     "+"Beef Burger            *regular     300"+"    "+Menu.bb_price_m);	 
					 }
					 if(Menu.bb_qty_hint>0) {
					 out.println(Menu.bb_qty_h_ins+"     "+"Beef Burger            *hot         300"+"    "+Menu.bb_price_h);	 
						 }
					 if(Menu.bb_qty_sint>0) {
					 out.println(Menu.bb_qty_s_ins+"     "+"Beef Burger            *spicy       300"+"    "+Menu.bb_price_s);	 
							 }
					 //------------------------------------------------------------------------
					 if(Menu.bbc_qty_mint>0) {
					 out.println(Menu.bbc_qty_m_ins+"     "+"Beef Burger Cheese     *regular     325"+"    "+Menu.bbc_price_m);	 
						 }
					 if(Menu.bbc_qty_hint>0) {
					 out.println(Menu.bbc_qty_h_ins+"     "+"Beef Burger Cheese     *hot         325"+"    "+Menu.bbc_price_h);	 
							 }
					 if(Menu.bbc_qty_sint>0) {
					 out.println(Menu.bbc_qty_s_ins+"     "+"Beef Burger Cheese     *spicy       325"+"    "+Menu.bbc_price_s);	 
							 }
					//------------------------------------------------------------------------
					 if(Menu.cb_qty_mint>0) {
					 out.println(Menu.cb_qty_m_ins+"     "+"Chicken Burger         *regular     250"+"    "+Menu.cb_price_m);	 
							 }
					 if(Menu.cb_qty_hint>0) {
					 out.println(Menu.cb_qty_h_ins+"     "+"Chicken Burger         *hot         250"+"    "+Menu.cb_price_h);	 
								 }
					 if(Menu.cb_qty_sint>0) {
					 out.println(Menu.cb_qty_s_ins+"     "+"Chicken Burger         *spicy       250"+"    "+Menu.cb_price_s);	 
								 }
					//------------------------------------------------------------------------
					 if(Menu.cbc_qty_mint>0) {
					 out.println(Menu.cbc_qty_m_ins+"     "+"Chicken Burger Cheese  *regular     275"+"    "+Menu.cbc_price_m);	 
								 }
					 if(Menu.cbc_qty_hint>0) {
					 out.println(Menu.cbc_qty_h_ins+"     "+"Chicken Burger Cheese  *hot         275"+"    "+Menu.cbc_price_h);	 
									 }
					 if(Menu.cbc_qty_sint>0) {
					 out.println(Menu.cbc_qty_s_ins+"     "+"Chicken Burger Cheese  *spicy       275"+"    "+Menu.cbc_price_s);	 
									 }
					//------------------------------------------------------------------------
					 if(Menu.bbqbb_qty_mint>0) {
					 out.println(Menu.bbqbb_qty_m_ins+"     "+"BBQ Beef Burger        *regular     350"+"    "+Menu.bbqbb_price_m);	 
									 }
					 if(Menu.bbqbb_qty_hint>0) {
					 out.println(Menu.bbqbb_qty_h_ins+"     "+"BBQ Beef Burger        *hot         350"+"    "+Menu.bbqbb_price_h);	 
										 }
					 if(Menu.bbqbb_qty_sint>0) {
					 out.println(Menu.bbqbb_qty_s_ins+"     "+"BBQ Beef Burger        *spicy       350"+"    "+Menu.bbqbb_price_s);	 
										 }
					//------------------------------------------------------------------------
					 if(Menu.bbqcb_qty_mint>0) {
					 out.println(Menu.bbqcb_qty_m_ins+"     "+"BBQ Chicken Burger     *regular     325"+"    "+Menu.bbqcb_price_m);	 
										 }
					 if(Menu.bbqcb_qty_hint>0) {
					 out.println(Menu.bbqcb_qty_h_ins+"     "+"BBQ Chicken Burger     *hot         325"+"    "+Menu.bbqcb_price_h);	 
											 }
					 if(Menu.bbqcb_qty_sint>0) {
					 out.println(Menu.bbqcb_qty_s_ins+"     "+"BBQ Chicken Burger     *spicy       325"+"    "+Menu.bbqcb_price_s);	 
											 }
					//------------------------------------------------------------------------
					 if(Menu.fri_qty_rint>0) {
					 out.println(Menu.fri_qty_r_ins+"     "+"Fries                  *regular     100"+"    "+Menu.fri_price_r);	 
											 }
					 if(Menu.fri_qty_lint>0) {
					 out.println(Menu.fri_qty_l_ins+"     "+"Fries                  *large       140"+"    "+Menu.fri_price_l);	 
												 }
					//------------------------------------------------------------------------
					 if(Menu.cfri_qty_rint>0) {
					 out.println(Menu.cfri_qty_r_ins+"     "+"Curly Fries            *regular     120"+"    "+Menu.cfri_price_r);	 
												 }
					 if(Menu.cfri_qty_lint>0) {
					 out.println(Menu.cfri_qty_l_ins+"     "+"Curly Fries            *large       160"+"    "+Menu.cfri_price_l);	 
													 }
					//------------------------------------------------------------------------
					 if(Menu.pw_qty_rint>0) {
					 out.println(Menu.pw_qty_r_ins+"     "+"Potato Wedges          *regular     100"+"    "+Menu.pw_price_r);	 
													 }
					 if(Menu.pw_qty_lint>0) {
					 out.println(Menu.pw_qty_l_ins+"     "+"Potato Wedges          *large       140"+"    "+Menu.pw_price_l);	 
														 }
					//------------------------------------------------------------------------
					 if(Menu.ccb_qty_rint>0) {
					 out.println(Menu.ccb_qty_r_ins+"     "+"Chicken Cheesy Bites   *regular     120"+"    "+Menu.ccb_price_r);	 
														 }
					 if(Menu.ccb_qty_lint>0) {
					 out.println(Menu.ccb_qty_l_ins+"     "+"Chicken Cheesy Bites   *large       210"+"    "+Menu.ccb_price_l);	 
															 }
					//------------------------------------------------------------------------
					 if(Menu.nwb_qty_rint>0) {
					 out.println(Menu.nwb_qty_r_ins+"     "+"Naga Wings Barrel      *regular     170"+"    "+Menu.nwb_price_r);	 
															 }
					 if(Menu.nwb_qty_lint>0) {
					 out.println(Menu.nwb_qty_l_ins+"     "+"Naga Wings Barrel      *large       310"+"    "+Menu.nwb_price_l);	 
																 }
					//------------------------------------------------------------------------
					 if(Menu.cc_qty_rint>0) {
					 out.println(Menu.cc_qty_r_ins+"     "+"Coca-Cola              *small        50"+"     "+Menu.cc_price_r);	 
																 }
					 if(Menu.cc_qty_lint>0) {
					 out.println(Menu.cc_qty_l_ins+"     "+"Coca-Cola              *large        70"+"     "+Menu.cc_price_l);	 
																	 }
					//------------------------------------------------------------------------
					 if(Menu.s_qty_rint>0) {
					 out.println(Menu.s_qty_r_ins+"     "+"Sprite                 *small        50"+"     "+Menu.s_price_r);	 
																	 }
					 if(Menu.s_qty_lint>0) {
					 out.println(Menu.s_qty_l_ins+"     "+"Sprite                 *large        70"+"     "+Menu.s_price_l);	 
																		 }
					//------------------------------------------------------------------------
					 if(Menu.fa_qty_rint>0) {
					 out.println(Menu.fa_qty_r_ins+"     "+"Fanta                  *small        50"+"     "+Menu.fa_price_r);	 
																		 }
					 if(Menu.fa_qty_lint>0) {
					 out.println(Menu.fa_qty_l_ins+"     "+"Fanta                  *large        70"+"     "+Menu.fa_price_l);	 
																			 }
					//------------------------------------------------------------------------
					 if(Menu.mw_qty_rint>0) {
					 out.println(Menu.mw_qty_r_ins+"     "+"Mineral Water (500ml)                25"+"     "+Menu.mw_price_r);	 
																			 }
					//------------------------------------------------------------------------
					 if(Menu.ca_qty_rint>0) {
					 out.println(Menu.ca_qty_r_ins+"     "+"Caramel                *small        90"+"     "+Menu.ca_price_r);	 
																	 }
					 if(Menu.ca_qty_lint>0) {
					 out.println(Menu.ca_qty_l_ins+"     "+"Caramel                *large       170"+"    "+Menu.ca_price_l);	 
																		 }
					//------------------------------------------------------------------------
					 if(Menu.ch_qty_rint>0) {
					 out.println(Menu.ch_qty_r_ins+"     "+"Chocolate              *small        85"+"     "+Menu.ch_price_r);	 
																		 }
					 if(Menu.ch_qty_lint>0) {
					 out.println(Menu.ch_qty_l_ins+"     "+"Chocolate              *large       160"+"    "+Menu.ch_price_l);	 
																			 }
					//------------------------------------------------------------------------
					 if(Menu.ha_qty_rint>0) {
					 out.println(Menu.ha_qty_r_ins+"     "+"Hazelnut               *small        80"+"     "+Menu.ha_price_r);	 
																			 }
					 if(Menu.ha_qty_lint>0) {
					 out.println(Menu.ha_qty_l_ins+"     "+"Hazelnut               *large       150"+"    "+Menu.ha_price_l);	 
																				 }
					//------------------------------------------------------------------------
					 if(Menu.st_qty_rint>0) {
					 out.println(Menu.st_qty_r_ins+"     "+"Strawberry             *small        75"+"     "+Menu.st_price_r);	 
																				 }
					 if(Menu.st_qty_lint>0) {
					 out.println(Menu.st_qty_l_ins+"     "+"Strawberry             *large       140"+"    "+Menu.st_price_l);	 
																					 }
					//------------------------------------------------------------------------
					 out.println("====================================================================");
				    //------------------------------------------------------------------------
					 out.println("                                     Sub-total = "+Menu.subtotal_str);
				    //------------------------------------------------------------------------
					 out.println("                           Service Charge(10%) = "+Menu.ser_cha_str);
					//------------------------------------------------------------------------
					 out.println("                                         Total = "+Menu.total_str);
					//------------------------------------------------------------------------
					 out.close();
				 }
				 catch(IOException ex) {
					 System.out.println(ex); 
				 }
				
				
			}
		});
		doneButton.setBounds(282, 172, 107, 30);
		panel_7.add(doneButton);
		
		sub_total = new JTextField();
		sub_total.setFont(new Font("Tahoma", Font.BOLD, 20));
		sub_total.setText("Sub-total:");
		sub_total.setEditable(false);
		sub_total.setColumns(10);
		sub_total.setBounds(10, 40, 185, 30);
		panel_7.add(sub_total);
		
		txtServiceCharge = new JTextField();
		txtServiceCharge.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtServiceCharge.setText("Service charge(10%):");
		txtServiceCharge.setEditable(false);
		txtServiceCharge.setColumns(10);
		txtServiceCharge.setBounds(10, 85, 185, 30);
		panel_7.add(txtServiceCharge);
		
		txtTotal = new JTextField();
		txtTotal.setText("Total:");
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtTotal.setEditable(false);
		txtTotal.setColumns(10);
		txtTotal.setBounds(10, 130, 185, 30);
		panel_7.add(txtTotal);
		
		
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c>16) {
					ExtraOrder eo=new ExtraOrder();
					eo.setVisible(true);
					doneButton.setVisible(false);
				}
				
				else {
				doneButton.setVisible(true);
				//--------------------------
			    bb_qty_m_ins= reg_qty_bb.getValue().toString();
				bb_qty_mint=Double.parseDouble(bb_qty_m_ins);
				bb_price_m=Double.toString(bb_qty_mint*300);
				bb_price_m_double=bb_qty_mint*300;
						
				bb_qty_h_ins= hot_qty_bb.getValue().toString();
				bb_qty_hint=Double.parseDouble(bb_qty_h_ins);
				bb_price_h=Double.toString(bb_qty_hint*300);
				bb_price_h_double=bb_qty_hint*300;
				
				bb_qty_s_ins= spi_qty_bb.getValue().toString();
				bb_qty_sint=Double.parseDouble(bb_qty_s_ins);
				bb_price_s=Double.toString(bb_qty_sint*300);
				bb_price_s_double=bb_qty_sint*300;
				//--------------------------
				bbc_qty_m_ins= reg_qty_bbc.getValue().toString();
				bbc_qty_mint=Double.parseDouble(bbc_qty_m_ins);
				bbc_price_m=Double.toString(bbc_qty_mint*325);
				bbc_price_m_double=bbc_qty_mint*325;
				
				bbc_qty_h_ins= hot_qty_bbc.getValue().toString();
				bbc_qty_hint=Double.parseDouble(bbc_qty_h_ins);
				bbc_price_h=Double.toString(bbc_qty_hint*325);
				bbc_price_h_double=bbc_qty_hint*325;
				
				bbc_qty_s_ins= spi_qty_bbc.getValue().toString();
				bbc_qty_sint=Double.parseDouble(bbc_qty_s_ins);
				bbc_price_s=Double.toString(bbc_qty_sint*325);
				bbc_price_s_double=bbc_qty_sint*325;
				//--------------------------
				cb_qty_m_ins= reg_qty_cb.getValue().toString();
				cb_qty_mint=Double.parseDouble(cb_qty_m_ins);
				cb_price_m=Double.toString(cb_qty_mint*250);
				cb_price_m_double=cb_qty_mint*250;
				
				cb_qty_h_ins= hot_qty_cb.getValue().toString();
				cb_qty_hint=Double.parseDouble(cb_qty_h_ins);
				cb_price_h=Double.toString(cb_qty_hint*250);
				cb_price_h_double=cb_qty_hint*250;
				
				cb_qty_s_ins= spi_qty_cb.getValue().toString();
				cb_qty_sint=Double.parseDouble(cb_qty_s_ins);
				cb_price_s=Double.toString(cb_qty_sint*250);
				cb_price_s_double=cb_qty_sint*250;
				//--------------------------
				cbc_qty_m_ins= reg_qty_cbc.getValue().toString();
				cbc_qty_mint=Double.parseDouble(cbc_qty_m_ins);
				cbc_price_m=Double.toString(cbc_qty_mint*275);
				cbc_price_m_double=cbc_qty_mint*275;
				
				cbc_qty_h_ins= hot_qty_cbc.getValue().toString();
				cbc_qty_hint=Double.parseDouble(cbc_qty_h_ins);
				cbc_price_h=Double.toString(cbc_qty_hint*275);
				cbc_price_h_double=cbc_qty_hint*275;
				
				cbc_qty_s_ins= spi_qty_cbc.getValue().toString();
				cbc_qty_sint=Double.parseDouble(cbc_qty_s_ins);
				cbc_price_s=Double.toString(cbc_qty_sint*275);
				cbc_price_s_double=cbc_qty_sint*275;
				//--------------------------
				bbqbb_qty_m_ins= reg_qty_bbqbb.getValue().toString();
				bbqbb_qty_mint=Double.parseDouble(bbqbb_qty_m_ins);
				bbqbb_price_m=Double.toString(bbqbb_qty_mint*350);
				bbqbb_price_m_double=bbqbb_qty_mint*350;
				
				bbqbb_qty_h_ins= hot_qty_bbqbb.getValue().toString();
				bbqbb_qty_hint=Double.parseDouble(bbqbb_qty_h_ins);
				bbqbb_price_h=Double.toString(bbqbb_qty_hint*350);
				bbqbb_price_h_double=bbqbb_qty_hint*350;
				
				bbqbb_qty_s_ins= spi_qty_bbqbb.getValue().toString();
				bbqbb_qty_sint=Double.parseDouble(bbqbb_qty_s_ins);
				bbqbb_price_s=Double.toString(bbqbb_qty_sint*350);
				bbqbb_price_s_double=bbqbb_qty_sint*350;
				//--------------------------
				bbqcb_qty_m_ins= reg_qty_bbqcb.getValue().toString();
				bbqcb_qty_mint=Double.parseDouble(bbqcb_qty_m_ins);
				bbqcb_price_m=Double.toString(bbqcb_qty_mint*325);
				bbqcb_price_m_double=bbqcb_qty_mint*325;
				
				bbqcb_qty_h_ins= hot_qty_bbqcb.getValue().toString();
				bbqcb_qty_hint=Double.parseDouble(bbqcb_qty_h_ins);
				bbqcb_price_h=Double.toString(bbqcb_qty_hint*325);
				bbqcb_price_h_double=bbqcb_qty_hint*325;
				
				bbqcb_qty_s_ins= spi_qty_bbqcb.getValue().toString();
				bbqcb_qty_sint=Double.parseDouble(bbqcb_qty_s_ins);
				bbqcb_price_s=Double.toString(bbqcb_qty_sint*325);
				bbqcb_price_s_double=bbqcb_qty_sint*325;
				//--------------------------
				fri_qty_r_ins= reg_qty_fries.getValue().toString();
				fri_qty_rint=Double.parseDouble(fri_qty_r_ins);
				fri_price_r=Double.toString(fri_qty_rint*100);
				fri_price_r_double=fri_qty_rint*100;
				
				fri_qty_l_ins=lar_qty_fries.getValue().toString();
				fri_qty_lint=Double.parseDouble(fri_qty_l_ins);
				fri_price_l=Double.toString(fri_qty_lint*140);
				fri_price_l_double=fri_qty_lint*140;
				//--------------------------
				cfri_qty_r_ins= reg_qty_c_fries.getValue().toString();
				cfri_qty_rint=Double.parseDouble(cfri_qty_r_ins);
				cfri_price_r=Double.toString(cfri_qty_rint*120);
				cfri_price_r_double=cfri_qty_rint*120;
				
				cfri_qty_l_ins=lar_qty_c_fries.getValue().toString();
				cfri_qty_lint=Double.parseDouble(cfri_qty_l_ins);
				cfri_price_l=Double.toString(cfri_qty_lint*160);
				cfri_price_l_double=cfri_qty_lint*160;
				//--------------------------
				pw_qty_r_ins= reg_qty_pw.getValue().toString();
				pw_qty_rint=Double.parseDouble(pw_qty_r_ins);
				pw_price_r=Double.toString(pw_qty_rint*100);
				pw_price_r_double=pw_qty_rint*100;
				
				pw_qty_l_ins=lar_qty_pw.getValue().toString();
				pw_qty_lint=Double.parseDouble(pw_qty_l_ins);
				pw_price_l=Double.toString(pw_qty_lint*140);
				pw_price_l_double=pw_qty_lint*140;
				//--------------------------
				ccb_qty_r_ins= reg_qty_ccb.getValue().toString();
				ccb_qty_rint=Double.parseDouble(ccb_qty_r_ins);
				ccb_price_r=Double.toString(ccb_qty_rint*120);
				ccb_price_r_double=ccb_qty_rint*120;
				
				ccb_qty_l_ins=lar_qty_ccb.getValue().toString();
				ccb_qty_lint=Double.parseDouble(ccb_qty_l_ins);
				ccb_price_l=Double.toString(ccb_qty_lint*210);
				ccb_price_l_double=ccb_qty_lint*210;
				//--------------------------
				nwb_qty_r_ins= reg_qty_nwb.getValue().toString();
				nwb_qty_rint=Double.parseDouble(nwb_qty_r_ins);
				nwb_price_r=Double.toString(nwb_qty_rint*170);
				nwb_price_r_double=nwb_qty_rint*170;
				
				nwb_qty_l_ins=lar_qty_nwb.getValue().toString();
				nwb_qty_lint=Double.parseDouble(nwb_qty_l_ins);
				nwb_price_l=Double.toString(nwb_qty_lint*310);
				nwb_price_l_double=nwb_qty_lint*310;
				//--------------------------
				cc_qty_r_ins= reg_qty_cc.getValue().toString();
				cc_qty_rint=Double.parseDouble(cc_qty_r_ins);
				cc_price_r=Double.toString(cc_qty_rint*50);
				cc_price_r_double=cc_qty_rint*50;
				
				cc_qty_l_ins=lar_qty_cc.getValue().toString();
				cc_qty_lint=Double.parseDouble(cc_qty_l_ins);
				cc_price_l=Double.toString(cc_qty_lint*70);
				cc_price_l_double=cc_qty_lint*70;
				//--------------------------
				s_qty_r_ins= reg_qty_s.getValue().toString();
				s_qty_rint=Double.parseDouble(s_qty_r_ins);
				s_price_r=Double.toString(s_qty_rint*50);
				s_price_r_double=s_qty_rint*50;
				
				s_qty_l_ins=lar_qty_s.getValue().toString();
				s_qty_lint=Double.parseDouble(s_qty_l_ins);
				s_price_l=Double.toString(s_qty_lint*70);
				s_price_l_double=s_qty_lint*70;
				//--------------------------
				fa_qty_r_ins= reg_qty_f.getValue().toString();
				fa_qty_rint=Double.parseDouble(fa_qty_r_ins);
				fa_price_r=Double.toString(fa_qty_rint*50);
				fa_price_r_double=fa_qty_rint*50;
				
				fa_qty_l_ins=lar_qty_f.getValue().toString();
				fa_qty_lint=Double.parseDouble(fa_qty_l_ins);
				fa_price_l=Double.toString(fa_qty_lint*70);
				fa_price_l_double=fa_qty_lint*70;
				//--------------------------
				mw_qty_r_ins= reg_qty_mw.getValue().toString();
				mw_qty_rint=Double.parseDouble(mw_qty_r_ins);
				mw_price_r=Double.toString(mw_qty_rint*25);
				mw_price_r_double=mw_qty_rint*25;
				//--------------------------
				ca_qty_r_ins= reg_qty_ca.getValue().toString();
				ca_qty_rint=Double.parseDouble(ca_qty_r_ins);
				ca_price_r=Double.toString(ca_qty_rint*90);
				ca_price_r_double=ca_qty_rint*90;
				
				ca_qty_l_ins=lar_qty_ca.getValue().toString();
				ca_qty_lint=Double.parseDouble(ca_qty_l_ins);
				ca_price_l=Double.toString(ca_qty_lint*170);
				ca_price_l_double=ca_qty_lint*170;
				//--------------------------
				ch_qty_r_ins= reg_qty_ch.getValue().toString();
				ch_qty_rint=Double.parseDouble(ch_qty_r_ins);
				ch_price_r=Double.toString(ch_qty_rint*85);
				ch_price_r_double=ch_qty_rint*85;
				
				ch_qty_l_ins=lar_qty_ch.getValue().toString();
				ch_qty_lint=Double.parseDouble(ch_qty_l_ins);
				ch_price_l=Double.toString(ch_qty_lint*160);
				ch_price_l_double=ch_qty_lint*160;
				//--------------------------
				ha_qty_r_ins= reg_qty_ha.getValue().toString();
				ha_qty_rint=Double.parseDouble(ha_qty_r_ins);
				ha_price_r=Double.toString(ha_qty_rint*80);
				ha_price_r_double=ha_qty_rint*80;
				
				ha_qty_l_ins=lar_qty_ha.getValue().toString();
				ha_qty_lint=Double.parseDouble(ha_qty_l_ins);
				ha_price_l=Double.toString(ha_qty_lint*150);
				ha_price_l_double=ha_qty_lint*150;
				//--------------------------
				st_qty_r_ins= reg_qty_st.getValue().toString();
				st_qty_rint=Double.parseDouble(st_qty_r_ins);
				st_price_r=Double.toString(st_qty_rint*75);
				st_price_r_double=st_qty_rint*75;
				
				st_qty_l_ins=lar_qty_st.getValue().toString();
				st_qty_lint=Double.parseDouble(st_qty_l_ins);
				st_price_l=Double.toString(st_qty_lint*140);
				st_price_l_double=st_qty_lint*140;
				//--------------------------
				//--------------------------
				//--------------------------
				//--------------------------
				//--------------------------
				//--------------------------
				
				subtotal=bb_price_m_double+bb_price_h_double+bb_price_s_double+
						bbc_price_m_double+bbc_price_h_double+bbc_price_s_double+
						cb_price_m_double+cb_price_h_double+cb_price_s_double+
						cbc_price_m_double+cbc_price_h_double+cbc_price_s_double+
						bbqbb_price_m_double+bbqbb_price_h_double+bbqbb_price_s_double+
						bbqcb_price_m_double+bbqcb_price_h_double+bbqcb_price_s_double+
						fri_price_r_double+fri_price_l_double+
						cfri_price_r_double+cfri_price_l_double+
						pw_price_r_double+pw_price_l_double+
						ccb_price_r_double+ccb_price_l_double+
						nwb_price_r_double+nwb_price_l_double+
						cc_price_r_double+cc_price_l_double+
						s_price_r_double+s_price_l_double+
						fa_price_r_double+fa_price_l_double+
						mw_price_r_double+
						ca_price_r_double+ca_price_l_double+
						ch_price_r_double+ch_price_l_double+
						ha_price_r_double+ha_price_l_double+
						st_price_r_double+st_price_l_double;
				
				//--------------------------
				subtotal_str=Double.toString(subtotal)+" tk";
				Sub_total_cost.setText(subtotal_str);
				//--------------------------
				 ser_cha=subtotal*0.1;
				 ser_cha_str=Double.toString(ser_cha)+" tk";
				 txtServiceCharge_str.setText(ser_cha_str);
				//--------------------------
				total=subtotal+ser_cha;
				total_str=Double.toString(total)+" tk";
				 txttotal_str.setText(total_str);
				
				
				}}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTotal.setBounds(147, 172, 107, 30);
		panel_7.add(btnTotal);
		
		txtBurgerName = new JTextField();
		txtBurgerName.setEditable(false);
		txtBurgerName.setText("Burger Name");
		txtBurgerName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		txtBurgerName.setBackground(new Color(255, 204, 255));
		txtBurgerName.setBounds(85, 30, 152, 30);
		contentPane.add(txtBurgerName);
		txtBurgerName.setColumns(10);
		
		txtQty = new JTextField();
		txtQty.setEditable(false);
		txtQty.setBackground(new Color(255, 204, 255));
		txtQty.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		txtQty.setText("Qty");
		txtQty.setBounds(357, 30, 41, 30);
		contentPane.add(txtQty);
		txtQty.setColumns(10);
		
		txtRate = new JTextField();
		txtRate.setHorizontalAlignment(SwingConstants.CENTER);
		txtRate.setText("Rate");
		txtRate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		txtRate.setEditable(false);
		txtRate.setColumns(10);
		txtRate.setBackground(new Color(255, 204, 255));
		txtRate.setBounds(405, 31, 80, 30);
		contentPane.add(txtRate);
		
		txtItem = new JTextField();
		txtItem.setText("Item Name");
		txtItem.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		txtItem.setEditable(false);
		txtItem.setColumns(10);
		txtItem.setBackground(new Color(255, 204, 255));
		txtItem.setBounds(590, 29, 152, 30);
		contentPane.add(txtItem);
		
		textField_1 = new JTextField();
		textField_1.setText("Qty");
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 204, 255));
		textField_1.setBounds(862, 29, 41, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Rate");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(255, 204, 255));
		textField_2.setBounds(910, 30, 80, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/Images/763529.jpg")));
		lblNewLabel.setBounds(0, 0, 1731, 813);
		contentPane.add(lblNewLabel);
		
		}
}
