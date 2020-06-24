

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import java.awt.event.ActionEvent;

public class ClientForm extends JFrame {

	private JPanel contentPane;
	private JTextField first;
	private JTextField last;
	private JTextField email;
	private JTextField phone;
	private JTextField city;
	private JTextField ssn;
	private JTextField dob;
	private JTextField year;
	private JTextField make;
	private JTextField model;
	private JTextField VIN;
	private JTextField year1;
	private JTextField make1;
	private JTextField model1;
	private JTextField VIN1;
	private JTextField driver;
	private JTextField driver1;
	private JTextField not;
	private JTextField cic;
	private JTextField cll;
	
	private String firstname;
	private String lastname;
	private String client_email;
	private String client_phone;
	private String client_city;
	private String client_state;
	private String client_dob;
	private String client_sex;
	private String client_marital;
	private String client_ssn;
	
	private String vehyear;
	private String vehyear1;
	private String vehmake;
	private String vehmake1;
	private String vehmodel;
	private String vehmodel1;
	private String vehvin;
	private String vehvin1;
	private String vehdriver;
	private String vehdriver1;
	private String vehnot;
	private String vehci;
	private String vehcic;
	private String vehcll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientForm frame = new ClientForm();
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
	public ClientForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(255,255,255));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 353, 324);
		contentPane.add(panel);
		panel.setBackground(new Color(255,255,255));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-186, 5, 725, 322);
		lblNewLabel.setIcon(new ImageIcon(ClientForm.class.getResource("/img/umbrella.png")));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 324, 353, 285);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(255,253,249));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("You're matters to us!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(63, 60, 142, 16);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("We're here to help you saves.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(135, 106, 206, 16);
		panel_1.add(lblNewLabel_2);
		//contentPane.add(lblNewLabel_9);
		
		String states[] = {"Alabama", 
				"Alaska",
				"American Samoa",
				"Arizona",
				"Arkansas", 
				"California", 
				"Colorado", 
				"Connecticut", 
				"Delaware", 
				"District of Columbia", 
				"Florida",
				"Georgia", 
				"Guam", 
				"Hawaii", 
				"Idaho",
				"Illinois",
				"Indiana",
				"Iowa",
				"Kansas",
				"Kentucky",
				"Louisiana",
				"Maine",
				"Maryland", "Massachusetts", "Michigan", "Minnesota", "Minor Outlying Islands",
				"Mississippi", "Missouri", "Montana", "Nebraska", 
				"Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", 
				"North Dakota", "Northern Mariana Islands", "Ohio", "Oklahoma", "Oregon", "Pennsylvania",
				"Puerto Rico", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", 
				"U.S. Virgin Islands", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
		//contentPane.add(lblNewLabel_12);
		
		String sexes[] = {"Male", "Female"};
		//contentPane.add(lblNewLabel_13);
		
		String maritals[] = {"Single", "Married"};
		//contentPane.add(marital);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(352, 0, 620, 609);
		contentPane.add(layeredPane);
		
		JPanel vehiclelayer = new JPanel();
		vehiclelayer.setBounds(0, 0, 620, 500);
		vehiclelayer.setBackground(new Color(255,255,255));
		layeredPane.add(vehiclelayer);
		vehiclelayer.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("Vehicle Information");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_14.setBounds(233, 32, 156, 16);
		vehiclelayer.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Year");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_15.setBounds(34, 124, 56, 16);
		vehiclelayer.add(lblNewLabel_15);
		
		year = new JTextField();
		year.setFont(new Font("Tahoma", Font.PLAIN, 15));
		year.setBounds(89, 122, 116, 22);
		vehiclelayer.add(year);
		year.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Make");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_16.setBounds(34, 177, 44, 16);
		vehiclelayer.add(lblNewLabel_16);
		
		make = new JTextField();
		make.setFont(new Font("Tahoma", Font.PLAIN, 15));
		make.setBounds(89, 175, 116, 22);
		vehiclelayer.add(make);
		make.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Model");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_17.setBounds(34, 233, 56, 16);
		vehiclelayer.add(lblNewLabel_17);
		
		model = new JTextField();
		model.setFont(new Font("Tahoma", Font.PLAIN, 15));
		model.setBounds(89, 231, 116, 22);
		vehiclelayer.add(model);
		model.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Vehicle 1");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_18.setBounds(79, 83, 77, 16);
		vehiclelayer.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("VIN#");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_19.setBounds(34, 283, 56, 16);
		vehiclelayer.add(lblNewLabel_19);
		
		VIN = new JTextField();
		VIN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		VIN.setBounds(89, 281, 116, 22);
		vehiclelayer.add(VIN);
		VIN.setColumns(10);
		
		JLabel lblNewLabel_18_1 = new JLabel("Vehicle 2");
		lblNewLabel_18_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_18_1.setBounds(387, 83, 77, 16);
		vehiclelayer.add(lblNewLabel_18_1);
		
		JLabel lblNewLabel_15_1 = new JLabel("Year");
		lblNewLabel_15_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_15_1.setBounds(327, 125, 56, 16);
		vehiclelayer.add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("Make");
		lblNewLabel_16_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_16_1.setBounds(327, 178, 44, 16);
		vehiclelayer.add(lblNewLabel_16_1);
		
		JLabel lblNewLabel_17_1 = new JLabel("Model");
		lblNewLabel_17_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_17_1.setBounds(327, 234, 56, 16);
		vehiclelayer.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel_19_1 = new JLabel("VIN#");
		lblNewLabel_19_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_19_1.setBounds(327, 284, 56, 16);
		vehiclelayer.add(lblNewLabel_19_1);
		
		year1 = new JTextField();
		year1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		year1.setColumns(10);
		year1.setBounds(399, 122, 116, 22);
		vehiclelayer.add(year1);
		
		make1 = new JTextField();
		make1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		make1.setColumns(10);
		make1.setBounds(399, 175, 116, 22);
		vehiclelayer.add(make1);
		
		model1 = new JTextField();
		model1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		model1.setColumns(10);
		model1.setBounds(399, 231, 116, 22);
		vehiclelayer.add(model1);
		
		VIN1 = new JTextField();
		VIN1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		VIN1.setBounds(399, 281, 116, 22);
		vehiclelayer.add(VIN1);
		VIN1.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Driver (if married)");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_20.setBounds(34, 328, 124, 22);
		vehiclelayer.add(lblNewLabel_20);
		
		driver = new JTextField();
		driver.setFont(new Font("Tahoma", Font.PLAIN, 15));
		driver.setBounds(163, 329, 116, 22);
		vehiclelayer.add(driver);
		driver.setColumns(10);
		
		JLabel lblNewLabel_20_1 = new JLabel("Driver (if married)");
		lblNewLabel_20_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_20_1.setBounds(327, 328, 124, 22);
		vehiclelayer.add(lblNewLabel_20_1);
		
		driver1 = new JTextField();
		driver1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		driver1.setBounds(452, 329, 116, 22);
		vehiclelayer.add(driver1);
		driver1.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Name on Title:");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_21.setBounds(34, 363, 103, 16);
		vehiclelayer.add(lblNewLabel_21);
		
		not = new JTextField();
		not.setFont(new Font("Tahoma", Font.PLAIN, 15));
		not.setBounds(163, 361, 116, 22);
		vehiclelayer.add(not);
		not.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("Currently Insured?");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_22.setBounds(34, 405, 122, 22);
		vehiclelayer.add(lblNewLabel_22);
		
		String option[] = {"YES", "NO"};
		JComboBox ci = new JComboBox(option);
		ci.setBounds(163, 406, 56, 22);
		vehiclelayer.add(ci);
		
		
		
		
		JLabel lblNewLabel_23 = new JLabel("Current Insurance Company");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23.setBounds(272, 405, 191, 22);
		vehiclelayer.add(lblNewLabel_23);
		
		cic = new JTextField();
		cic.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cic.setBounds(464, 406, 116, 22);
		vehiclelayer.add(cic);
		cic.setColumns(10);
		
		JLabel lblNewLabel_24 = new JLabel("Current Liability Limits");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_24.setBounds(34, 440, 146, 20);
		vehiclelayer.add(lblNewLabel_24);
		
		cll = new JTextField();
		cll.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cll.setBounds(192, 441, 116, 22);
		vehiclelayer.add(cll);
		cll.setColumns(10);
		
		JButton submit = new JButton("Submit");
		submit.setBackground(Color.CYAN);
		submit.setBounds(474, 441, 106, 34);
		submit.setBackground(new Color(195,237,234));
		vehiclelayer.add(submit);
		
		JLabel username = new JLabel("");
		username.setFont(new Font("Tahoma", Font.PLAIN, 15));
		username.setBounds(192, 471, 87, 16);
		vehiclelayer.add(username);
		
		JLabel password = new JLabel("");
		password.setFont(new Font("Tahoma", Font.PLAIN, 15));
		password.setBounds(327, 471, 87, 16);
		vehiclelayer.add(password);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(ClientForm.class.getResource("/img/nnk logo.png")));
		lblNewLabel_3.setBounds(216, 13, 235, 161);
		//contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("First Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(38, 213, 80, 16);
		//contentPane.add(lblNewLabel_4);
		
		first = new JTextField();
		first.setFont(new Font("Tahoma", Font.PLAIN, 15));
		first.setBounds(130, 211, 116, 22);
		//contentPane.add(first);
		first.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Last Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(326, 213, 75, 16);
		//contentPane.add(lblNewLabel_5);
		
		last = new JTextField();
		last.setFont(new Font("Tahoma", Font.PLAIN, 15));
		last.setBounds(413, 211, 116, 22);
		//contentPane.add(last);
		last.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(38, 261, 45, 16);
		//contentPane.add(lblNewLabel_6);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		email.setBounds(130, 259, 116, 22);
		//contentPane.add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Phone");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(326, 261, 56, 16);
		//contentPane.add(lblNewLabel_7);
		
		phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		phone.setBounds(413, 259, 116, 22);
		//contentPane.add(phone);
		phone.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("City");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(38, 308, 56, 20);
		//contentPane.add(lblNewLabel_8);
		
		city = new JTextField();
		city.setFont(new Font("Tahoma", Font.PLAIN, 15));
		city.setBounds(90, 308, 116, 22);
		//contentPane.add(city);
		city.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("State");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(235, 310, 56, 16);
		JComboBox state = new JComboBox(states);
		state.setBounds(284, 308, 80, 22);
		state.setBackground(new Color(198,203,239));
		//contentPane.add(state);
		
		JLabel lblNewLabel_10 = new JLabel("SSN");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(413, 310, 45, 16);
		//contentPane.add(lblNewLabel_10);
		
		ssn = new JTextField();
		ssn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ssn.setBounds(492, 308, 116, 22);
		//contentPane.add(ssn);
		ssn.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("DOB");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(38, 358, 56, 16);
		//contentPane.add(lblNewLabel_11);
		
		dob = new JTextField();
		dob.setFont(new Font("Tahoma", Font.PLAIN, 15));
		dob.setBounds(90, 356, 116, 22);
		//contentPane.add(dob);
		dob.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Sex");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(235, 358, 56, 16);
		JComboBox sex = new JComboBox(sexes);
		sex.setBackground(new Color(198,203,239));
		sex.setBounds(284, 356, 80, 22);
		//contentPane.add(sex);
		
		JLabel lblNewLabel_13 = new JLabel("Marital Status");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_13.setBounds(413, 358, 104, 16);
		JComboBox marital = new JComboBox(maritals);
		marital.setBackground(new Color(198,203,239));
		marital.setBounds(516, 356, 80, 22);
		
		JPanel initlayer = new JPanel();
		initlayer.setBounds(0, 0, 620, 500);
		//vehiclelayer.add(initlayer);
		layeredPane.add(initlayer);
		initlayer.setBackground(new Color(255,255,255));
		initlayer.setLayout(null);
		initlayer.add(lblNewLabel_3);
		initlayer.add(lblNewLabel_4);
		initlayer.add(lblNewLabel_5);
		initlayer.add(first);
		initlayer.add(last);
		initlayer.add(lblNewLabel_6);
		initlayer.add(email);
		initlayer.add(lblNewLabel_7);
		initlayer.add(phone);
		initlayer.add(lblNewLabel_8);
		initlayer.add(city);
		initlayer.add(lblNewLabel_9);
		initlayer.add(state);
		initlayer.add(lblNewLabel_10);
		initlayer.add(ssn);
		initlayer.add(lblNewLabel_11);
		initlayer.add(dob);
		initlayer.add(lblNewLabel_12);
		initlayer.add(sex);
		initlayer.add(lblNewLabel_13);
		initlayer.add(marital);
		

		vehiclelayer.setVisible(false);
		
		JButton next = new JButton("Next");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstname = first.getText();
				lastname = last.getText();
				client_email = email.getText();
				client_phone = phone.getText();
				client_city = city.getText();
				client_state = state.getSelectedItem().toString();
				client_dob = dob.getText();
				client_sex = sex.getSelectedItem().toString();
				client_marital = marital.getSelectedItem().toString();
				client_ssn = ssn.getText();
				
				initlayer.setVisible(false);
				vehiclelayer.setVisible(true);
			}
		});
		next.setFont(new Font("Tahoma", Font.PLAIN, 16));
		next.setBounds(492, 447, 97, 25);
		next.setBackground(new Color(64,191,193));
		initlayer.add(next);
		
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vehyear = year.getText();
				vehyear1 = year1.getText();
				vehmake = make.getText();
				vehmake1 = make1.getText();
				vehmodel = model.getText();
				vehmodel1 = model1.getText();
				vehvin = VIN.getText();
				vehvin1 = VIN1.getText();
				vehdriver = driver.getText();
				vehdriver1 = driver1.getText();
				vehnot = not.getText();
				vehci = ci.getSelectedItem().toString();
				vehcic = cic.getText();
				vehcll = cll.getText();
				
				Random r = new Random(System.currentTimeMillis());
				String randID = Integer.toString((10000 + r.nextInt(20000)));
				
				String netID = "C";
				netID += String.valueOf(firstname.charAt(0)).toLowerCase()  + String.valueOf(lastname.charAt(0)).toLowerCase() + randID;
				String netpass = Integer.toString(10000 + r.nextInt(20000));
				
				String status = "Pending";
				
				clientToDatabase( firstname,  lastname,  client_email,  client_phone,  client_city ,
						 client_state,  client_dob,  client_sex,
						  client_marital,  client_ssn,
						 vehyear,  vehyear1,  vehmake,
						 vehmake1,
						  vehmodel,
						 vehmodel1,
						 vehvin,
						 vehvin1,
						 vehdriver,
						  vehdriver1,
						  vehnot,
						  vehci,
						  vehcic,
						  vehcll,  netID,  netpass ,  status);
				
				username.setText(netID);
				password.setText(netpass);
			}
		});	
	}
	
	
	private void clientToDatabase(String firstname, String lastname, String client_email, String client_phone, String client_city ,
	String client_state, String client_dob, String client_sex,
	 String client_marital, String client_ssn,
	String vehyear, String vehyear1, String vehmake,
	String vehmake1,
	 String vehmodel,
	String vehmodel1,
	String vehvin,
	String vehvin1,
	String vehdriver,
	 String vehdriver1,
	 String vehnot,
	 String vehci,
	 String vehcic,
	 String vehcll, String netID, String netpass , String status) {
		
		String client_file = "client";
		

		ArrayList <NewClient> newclient = new ArrayList<>();
		// Try to pull the file name "client"
				try {
					// agent file exists
					FileInputStream fis = new FileInputStream(client_file);
					ObjectInputStream ois = new ObjectInputStream(fis);
					
					newclient = (ArrayList<NewClient>) ois.readObject();
					
					fis.close();
					ois.close();
					
				}catch(IOException exception) {
					// agent file doesn't exists.
					//System.out.println("Agent File doesn't exists");
					
				}catch(ClassNotFoundException e1) {
					System.out.println("NewClient Class not Found");
				}
				
				NewClient client = new NewClient( firstname,  lastname,  client_email,  client_phone,  client_city ,
						 client_state,  client_dob,  client_sex,
						  client_marital,  client_ssn,
						 vehyear,  vehyear1,  vehmake,
						 vehmake1,
						  vehmodel,
						 vehmodel1,
						 vehvin,
						 vehvin1,
						 vehdriver,
						  vehdriver1,
						  vehnot,
						  vehci,
						  vehcic,
						  vehcll,  netID,  netpass , status);
				newclient.add(client);
				
				try {
					// add to client file
					FileOutputStream fos = new FileOutputStream(client_file);
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					
					oos.writeObject(newclient);
					
					oos.flush();
					oos.close();
					fos.close();
				}catch(IOException ioe) {
					System.out.println("Create Profile Failed");
				}
		
	}
	
	private void netdatabase(String netID, String netpass) {
		Properties net_prop = new Properties();
		try {
			InputStream input = new FileInputStream("client_net.properties");
			
			
			// load net properties file
			net_prop.load(input);
			
			
		}catch(IOException ioe) {
			// Properties file for net database doesn't exists
		}
		
		try {
			OutputStream net_output = new FileOutputStream("client_net.properties");
			net_prop.setProperty(netID, netpass);
			
			net_prop.store(net_output, null);
			
		}catch(IOException ioe) {
			System.out.println("Failed to store net to the database");
		}
	}
	
}
