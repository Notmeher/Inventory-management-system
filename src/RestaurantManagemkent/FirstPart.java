package RestaurantManagemkent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class FirstPart extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPart frame = new FirstPart();
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
	public FirstPart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 5,1600,850);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setText("Hello "+Main.name+",");
		lblNewLabel.setBounds(10, 245, 1564, 95);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 31));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\"[Click 'Menu' to see our items]\"");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 380, 1564, 43);
		contentPane.add(lblNewLabel_1);
		
		JButton Menubutton = new JButton("Menu");
		Menubutton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Menubutton.setForeground(Color.BLACK);
		Menubutton.setBackground(new Color(255, 160, 122));
		Menubutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Menu obj1=new Menu();
				obj1.setVisible(true);
			}
		});
		Menubutton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		Menubutton.setBounds(695, 561, 207, 75);
		contentPane.add(Menubutton);
		
		JLabel lblNewLabel_2 = new JLabel("\"Welcome to our restaurant\"");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel_2.setBounds(10, 288, 1564, 90);
		contentPane.add(lblNewLabel_2);
		
	}
}
