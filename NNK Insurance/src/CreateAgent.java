
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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.util.Properties;

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
		setBounds(100, 100, 620, 393);
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
		firstname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		firstname.setBounds(52, 76, 116, 22);
		contentPane.add(firstname);
		firstname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(52, 58, 77, 16);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 307, 602, 39);
		contentPane.add(panel_2);
		panel_2.setBackground(new Color(204, 175, 175));
		
		JLabel lblNewLabel_2 = new JLabel("Last Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(388, 57, 84, 19);
		contentPane.add(lblNewLabel_2);
		
		lastname = new JTextField();
		lastname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lastname.setBounds(388, 76, 136, 22);
		contentPane.add(lastname);
		lastname.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Middle Name:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(216, 58, 97, 16);
		contentPane.add(lblNewLabel_3);
		
		middlename = new JTextField();
		middlename.setFont(new Font("Tahoma", Font.PLAIN, 15));
		middlename.setBounds(216, 76, 136, 22);
		contentPane.add(middlename);
		middlename.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Age:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(52, 127, 30, 22);
		contentPane.add(lblNewLabel_4);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 15));
		age.setBounds(52, 150, 116, 22);
		contentPane.add(age);
		age.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Phone Number:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(216, 130, 108, 16);
		contentPane.add(lblNewLabel_5);
		
		phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		phone.setBounds(216, 150, 136, 22);
		contentPane.add(phone);
		phone.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email Address:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(388, 131, 97, 16);
		contentPane.add(lblNewLabel_6);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		email.setBounds(388, 150, 136, 22);
		contentPane.add(email);
		email.setColumns(10);
		
		JButton btnNewButton = new JButton("Generate");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(216, 269, 97, 25);
		contentPane.add(btnNewButton);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(new Color(183, 239, 205));
		
		JLabel loginID = new JLabel("");
		loginID.setBounds(163, 208, 146, 16);
		contentPane.add(loginID);
		
		JLabel lginpss = new JLabel("Login Password:");
		lginpss.setBounds(321, 208, 97, 16);
		contentPane.add(lginpss);
		
		JLabel lginID = new JLabel("LoginID:");
		lginID.setBounds(78, 208, 56, 16);
		contentPane.add(lginID);
		
		JLabel netpass = new JLabel("");
		netpass.setBounds(430, 208, 116, 16);
		contentPane.add(netpass);
		
		JLabel lblNewLabel_8 = new JLabel("Email Address:");
		lblNewLabel_8.setBounds(78, 237, 86, 16);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);
		
		JLabel emailaddr = new JLabel("");
		emailaddr.setBounds(173, 237, 136, 16);
		contentPane.add(emailaddr);
		
		JLabel emailpssrd = new JLabel("Email Password:");
		emailpssrd.setBounds(321, 237, 97, 16);
		contentPane.add(emailpssrd);
		
		JLabel emailpassword = new JLabel("");
		emailpassword.setBounds(430, 237, 116, 16);
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
				
				
				
				Random r = new Random(System.currentTimeMillis());
				String randID = Integer.toString((10000 + r.nextInt(20000)));
				String netID;
				String aemail = frstname.toLowerCase();
				
				// If agent entered in middlename
				// Set the email to firstname.middlenameinitial.lastname@nnk.com
				// Otherwise just firstname.lastname@nnk.com
				if(mdlename.equals("")) {
					netID = String.valueOf(frstname.charAt(0)).toLowerCase()  + String.valueOf(lstname.charAt(0)).toLowerCase();
					aemail += lstname.toLowerCase() + "@nnk.com";
				}
				else{
					netID = String.valueOf(frstname.charAt(0)).toLowerCase()  + String.valueOf(mdlename.charAt(0)).toLowerCase() + String.valueOf(lstname.charAt(0)).toLowerCase();
					aemail+= String.valueOf(mdlename.charAt(0)).toLowerCase() + lstname.toLowerCase() + "@nnk.com";
				}
				
				// fully netID
				String fnetID = netID + randID;
				
				
				// set netID/email address
				loginID.setText(fnetID);
				emailaddr.setText(aemail);
				
				
				//Netpass / Email pass var
				String npass = Integer.toString(10000 + r.nextInt(20000));
				String epass = Integer.toString(10000 + r.nextInt(20000));
				
				// set net/email password
				netpass.setText(npass);
				emailpassword.setText(epass);
				
				
				
				// Load object from existing profile
				String agentfile = "agent";
				
				
				ArrayList <NewAgent> newagent = new ArrayList<>();
			
				// Try to pull the file name "agent"
				try {
					// agent file exists
					FileInputStream fis = new FileInputStream(agentfile);
					ObjectInputStream ois = new ObjectInputStream(fis);
					
					newagent = (ArrayList<NewAgent>) ois.readObject();
					
					fis.close();
					ois.close();
					
				}catch(IOException exception) {
					// agent file doesn't exists.
					System.out.println("Agent File doesn't exists");
					
				}catch(ClassNotFoundException e1) {
					System.out.println("NewAgent Class not Found");
				}
				
				NewAgent agent = new NewAgent(frstname, lstname, mdlename, Age, Phone, Email, fnetID, npass, aemail, epass);
				newagent.add(agent);
				
				try {
					// add to agent file
					FileOutputStream fos = new FileOutputStream(agentfile);
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					
					oos.writeObject(newagent);
					
					oos.flush();
					oos.close();
					fos.close();
				}catch(IOException ioe) {
					System.out.println("Create Profile Failed");
				}
				
				
				// Agent email database.
				Properties email_prop = new Properties();
				try{
					// Email database exists
					InputStream input = new FileInputStream("email.properties");
					
					// load a properties file
					email_prop.load(input);
				}catch(IOException ioe) {
					// Properties file for email database doesn't exists.
					
				}
			
				try {
					OutputStream email_output = new FileOutputStream("email.properties");
					
					email_prop.setProperty(aemail, epass);
					
					email_prop.store(email_output, null);
				} catch (IOException e2) {
					System.out.println("Failed to store email to the database");
				}
				
				// NetID database.
				Properties net_prop = new Properties();
				try {
					InputStream input = new FileInputStream("net.properties");
					
					
					// load net properties file
					net_prop.load(input);
					
					
				}catch(IOException ioe) {
					// Properties file for net database doesn't exists
				}
				
				try {
					OutputStream net_output = new FileOutputStream("net.properties");
					net_prop.setProperty(fnetID, npass);
					
					net_prop.store(net_output, null);
					
				}catch(IOException ioe) {
					System.out.println("Failed to store net to the database");
				}
				
				
			}
		});
	}
}
