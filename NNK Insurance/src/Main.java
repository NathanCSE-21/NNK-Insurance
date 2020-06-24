import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
	
	private ArrayList <NewClient> newclient = new ArrayList<>(); 
	private ArrayList <NewAgent> newagent = new ArrayList<>(); 

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
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ClientForm cf = new ClientForm();
				cf.setVisible(true);
			}
		});
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
				
				// admin login
				if(usrname.equals("admin") && passwrd.equals("password")) {
					dispose();
					Admin frame = new Admin();
					frame.setVisible(true);
				}
				
				// Agent or Client login
				else {
					// Client
					if(usrname.charAt(0) == 'C') {
						// Pull from Client file
						String client_file = "client";
						try {
							FileInputStream fis = new FileInputStream(client_file);
							ObjectInputStream ois = new ObjectInputStream(fis);
						
							
							newclient = (ArrayList) ois.readObject();
							ois.close();
							fis.close();
							
						}catch(IOException ioe) {
							// client file does not exist
							// do nothing for now 
							// assuming that data will be populated by the time we test this.
							
						}
						catch(ClassNotFoundException cne) {
							// Do nothing for now
							JOptionPane.showMessageDialog(null, "NewClient Class is not Found");
						}
						
						int counter = 0;
						for(NewClient client: newclient) {
							// usrname and password matched.
							if(client.netID.equals(usrname) && client.netpass.equals(passwrd)) {
								if(client.status.equals("Pending")) {
									dispose();
									Pending pending = new Pending(client, counter);
									pending.setVisible(true);
								}
								else {
									// Something else
									
								}
							}
						}
					}
					
					// Agent
					else {
						String filename = "agent";
						
						try {
							FileInputStream fis = new FileInputStream(filename);
							ObjectInputStream ois = new ObjectInputStream(fis);
						
							
							newagent = (ArrayList) ois.readObject();
							ois.close();
							fis.close();
							
						}catch(IOException ioe) {
							// agent file does not exist
							// do nothing for now 
							// assuming that data will be populated by the time we test this.
							
						}
						catch(ClassNotFoundException cne) {
							// Do nothing for now
							JOptionPane.showMessageDialog(null, "NewClient Class is not Found");
						}
						
						int idx =0;
						for(NewAgent agent: newagent) {
							// usrname and password matched.
							if(agent.netid.equals(usrname) && agent.netpassword.equals(passwrd)) {
								// Found
								break;
							}
							idx++;
						}
						
						try {
							AgentDashBoard adb = new AgentDashBoard(newagent, idx);
							dispose();
							adb.setVisible(true);
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
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
