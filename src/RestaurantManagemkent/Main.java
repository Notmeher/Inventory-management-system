package RestaurantManagemkent;


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class Main {

	public static String name;
	public static String phone;
	public static String table;
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.setBounds(5, 5,1600,850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Enter Name:");
		label1.setForeground(new Color(0, 0, 0));
		label1.setBackground(new Color(255, 105, 180));
		label1.setOpaque(true);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label1.setBounds(550, 250, 150, 50);
		frame.getContentPane().add(label1);
		
		textField1 = new JTextField();
		textField1.setBorder(new MatteBorder(0, 2, 3, 0, (Color) new Color(139, 0, 0)));
		textField1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField1.setHorizontalAlignment(SwingConstants.LEFT);
		textField1.setBounds(700, 250, 350, 50);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("X");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(1055, 250, 40, 50);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("Restaurant Management");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		label1.setBackground(new Color(255, 105, 180));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 80, 1564, 70);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(0, 2, 3, 0, (Color) new Color(139, 0, 0)));
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num= e.getKeyChar();
				if(!Character.isDigit(num) || (num == KeyEvent.VK_BACK_SPACE) || (num == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(700, 325, 350, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Phone Number:");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(255, 105, 180));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(550, 325, 150, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Table Number:");
		lblNewLabel_2.setBackground(new Color(127, 255, 212));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(550, 400, 150, 50);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select #", "  01", "  02", "  03", "  04", "  05", "  06", "  07", "  08", "  09", "  10", "  11", "  12", "  13", "  14", "  15"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setBounds(700, 410, 111, 33);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(1055, 325, 40, 50);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("X");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_5.setBounds(815, 410, 30, 33);
		frame.getContentPane().add(lblNewLabel_5);
		
		Ex newpage =new Ex();
		Ex1 newpage1 =new Ex1();
		Ex2 newpage2 =new Ex2();
		Ex3 newpage3 =new Ex3();
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(0, 0, 0), null));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField1.getText().equals("")) {
					name=textField1.getText();
					lblNewLabel_4.setVisible(false);
					if(!textField.getText().equals("")) {
						lblNewLabel_3.setVisible(false);
				if(((textField.getText().length()==11) && 
						
						((textField.getText().charAt(0)=='0') && (textField.getText().charAt(1)=='1'))) &&
						
						((textField.getText().charAt(2)=='1') || (textField.getText().charAt(2)=='5') ||
						 (textField.getText().charAt(2)=='6') || (textField.getText().charAt(2)=='7') ||
						 (textField.getText().charAt(2)=='9') || (textField.getText().charAt(2)=='8') ||
						 (textField.getText().charAt(2)=='3') || (textField.getText().charAt(2)=='4'))) {
					
					phone=textField.getText();
					lblNewLabel_3.setVisible(false);
					
					if(comboBox.getSelectedItem().toString()!="Select #") {
					table=comboBox.getSelectedItem().toString();
					lblNewLabel_5.setVisible(false);
					
					FirstPart obj=new FirstPart();
					frame.dispose();
					obj.setVisible(true);
					}
					else {
						newpage2.setVisible(true);
						lblNewLabel_5.setVisible(true);
					}
				}
			
			else {
				newpage.setVisible(true);
				lblNewLabel_3.setVisible(true);
			}}
					else {
						newpage3.setVisible(true);
						lblNewLabel_3.setVisible(true);
					}
				}
				else {
					newpage1.setVisible(true);
					lblNewLabel_4.setVisible(true);
				}
				}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(793, 516, 184, 56);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setForeground(new Color(139, 0, 0));
		lblNewLabel_6.setBackground(new Color(255, 105, 180));
		lblNewLabel_6.setIcon(new ImageIcon(Main.class.getResource("/Images/71068110_2105226412912238_1039205171634110464_o.jpg")));
		lblNewLabel_6.setBounds(-117, -127, 1657, 994);
		frame.getContentPane().add(lblNewLabel_6);
		
	}
}


