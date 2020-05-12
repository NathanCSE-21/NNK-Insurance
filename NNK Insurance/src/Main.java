import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(255,255,255));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/img/nnk logo.png")));
		lblNewLabel.setBounds(604, 13, 235, 151);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 559, 568);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(246,209,152));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Main.class.getResource("/img/umbrella.png")));
		lblNewLabel_1.setBounds(0, 0, 559, 322);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Thank you for choosing NNK Insurance");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(30, 353, 319, 27);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("At NNK We Got You!");
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(238, 401, 203, 27);
		panel.add(lblNewLabel_3);
		
		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.PLAIN, 15));
		username.setBounds(672, 264, 167, 35);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("UserName:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(585, 266, 75, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Password:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(585, 315, 75, 16);
		contentPane.add(lblNewLabel_5);
		
		JButton register = new JButton("Start Quote");
		register.setFont(new Font("Tahoma", Font.PLAIN, 15));
		register.setForeground(Color.BLACK);
		register.setBounds(604, 401, 112, 40);
		contentPane.add(register);
		register.setBackground(new Color(204,175,175));
		register.setFocusPainted(false);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usrname = username.getText();
				String passwrd = password.getText();
				
				if(usrname.equals("admin") && passwrd.equals("password")) {
					dispose();
					Admin frame = new Admin();
					frame.setVisible(true);
				}
			}
		});
		login.setFont(new Font("Tahoma", Font.PLAIN, 15));
		login.setBounds(743, 402, 112, 40);
		contentPane.add(login);
		login.setFocusPainted(false);
		login.setBackground(new Color(132,169,172));
		
		password = new JPasswordField();
		password.setBounds(672, 312, 167, 35);
		contentPane.add(password);
	}
}
