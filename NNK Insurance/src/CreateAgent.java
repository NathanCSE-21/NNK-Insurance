

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.util.Random;
import java.awt.event.ActionEvent;

public class CreateAgent extends JFrame {

	private JPanel contentPane;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField middlename;
	private JTextField age;
	private JTextField phone;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAgent frame = new CreateAgent();
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
	public CreateAgent() throws Exception{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(248, 243, 235));
		
		JLabel lblNewLabel = new JLabel("Create Agent");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(229, 13, 108, 22);
		contentPane.add(lblNewLabel);
		
		firstname = new JTextField();
		firstname.setBounds(52, 76, 116, 22);
		contentPane.add(firstname);
		firstname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(52, 58, 77, 16);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 307, 569, 39);
		contentPane.add(panel_2);
		panel_2.setBackground(new Color(204, 175, 175));
		
		JLabel lblNewLabel_2 = new JLabel("Last Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(388, 57, 84, 19);
		contentPane.add(lblNewLabel_2);
		
		lastname = new JTextField();
		lastname.setBounds(388, 76, 116, 22);
		contentPane.add(lastname);
		lastname.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Middle Name:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(216, 58, 97, 16);
		contentPane.add(lblNewLabel_3);
		
		middlename = new JTextField();
		middlename.setBounds(216, 76, 116, 22);
		contentPane.add(middlename);
		middlename.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Age:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(52, 127, 30, 22);
		contentPane.add(lblNewLabel_4);
		
		age = new JTextField();
		age.setBounds(52, 150, 116, 22);
		contentPane.add(age);
		age.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Phone Number:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(216, 130, 108, 16);
		contentPane.add(lblNewLabel_5);
		
		phone = new JTextField();
		phone.setBounds(216, 150, 116, 22);
		contentPane.add(phone);
		phone.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email Address:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(388, 131, 97, 16);
		contentPane.add(lblNewLabel_6);
		
		email = new JTextField();
		email.setBounds(388, 150, 116, 22);
		contentPane.add(email);
		email.setColumns(10);
		
		JButton btnNewButton = new JButton("Generate");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(216, 269, 97, 25);
		contentPane.add(btnNewButton);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(new Color(183, 239, 205));
		
		JLabel loginID = new JLabel("");
		loginID.setBounds(163, 208, 117, 16);
		contentPane.add(loginID);
		
		JLabel lginpss = new JLabel("Login Password:");
		lginpss.setBounds(292, 208, 97, 16);
		contentPane.add(lginpss);
		
		JLabel lginID = new JLabel("LoginID:");
		lginID.setBounds(78, 208, 56, 16);
		contentPane.add(lginID);
		
		JLabel netpass = new JLabel("");
		netpass.setBounds(401, 208, 116, 16);
		contentPane.add(netpass);
		
		JLabel lblNewLabel_8 = new JLabel("Email Address:");
		lblNewLabel_8.setBounds(78, 237, 86, 16);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);
		
		JLabel emailaddr = new JLabel("");
		emailaddr.setBounds(173, 237, 107, 16);
		contentPane.add(emailaddr);
		
		JLabel emailpssrd = new JLabel("Email Password:");
		emailpssrd.setBounds(292, 240, 97, 16);
		contentPane.add(emailpssrd);
		
		JLabel emailpassword = new JLabel("");
		emailpassword.setBounds(401, 240, 116, 16);
		contentPane.add(emailpassword);
		emailpssrd.setVisible(false);
		lginID.setVisible(false);
		lginpss.setVisible(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lginpss.setVisible(true);
				lginID.setVisible(true);
				lblNewLabel_8.setVisible(true);
				emailpssrd.setVisible(true);
				
				String frstname = firstname.getText();
				String lstname = lastname.getText();
				String mdlename = middlename.getText();
				String Age = age.getText();
				String Phone = phone.getText();
				String Email = email.getText();
				
				String emailfile = "email_list";
				
				Random r = new Random(System.currentTimeMillis());
				String randID = Integer.toString((10000 + r.nextInt(20000)));
				String netID;
				if(mdlename.equals("")) {
					netID = String.valueOf(frstname.charAt(0))  + String.valueOf(lstname.charAt(0));
				}
				else{
					netID = String.valueOf(frstname.charAt(0))  + String.valueOf(mdlename.charAt(0))+String.valueOf(lstname.charAt(0));
				}
				
				
				// set netID/email address
				loginID.setText(netID + randID);
				emailaddr.setText(netID);
				
				// set net/email password
				netpass.setText(Integer.toString(10000 + r.nextInt(20000)));
				emailpassword.setText(Integer.toString(10000 + r.nextInt(20000)));
				
				
				
				// Load object from existing profile
				
				
				
			}
		});
	}
}
