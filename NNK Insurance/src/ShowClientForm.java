import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.awt.event.ActionEvent;

public class ShowClientForm extends JFrame {

	private JPanel contentPane;
	private JTextField year1;
	private JTextField year2;
	private JTextField make1;
	private JTextField make2;
	private JTextField model1;
	private JTextField model2;
	private JTextField vin1;
	private JTextField vin2;
	private JTextField driver1;
	private JTextField driver2;
	private JTextField not;
	private JTextField cic;
	private JTextField first;
	private JTextField last;
	private JTextField email;
	private JTextField phone;
	private JTextField city;
	private JTextField state;
	private JTextField dob;
	private JTextField ssn;
	private JTextField sex;
	private JTextField ms;
	private JTextField cl;
	private JTextField value;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowClientForm frame = new ShowClientForm(0, null , null, 0);
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
	public ShowClientForm(int idx, ArrayList<NewAgent> newagent, ArrayList<NewClient> newclient, int agent_idx) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 794);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255,255,255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Client Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(436, 194, 122, 23);
		lblNewLabel.setForeground(new Color(67,138,94));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ShowClientForm.class.getResource("/img/nnk logo.png")));
		lblNewLabel_1.setBounds(370, 13, 253, 168);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Vehicle Information");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(120, 243, 168, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Year");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(12, 312, 45, 16);
		contentPane.add(lblNewLabel_3);
		
		year1 = new JTextField();
		year1.setEditable(false);
		year1.setBounds(69, 310, 116, 22);
		contentPane.add(year1);
		year1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Vehicle 1");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(70, 279, 74, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Vehicle 2");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(276, 279, 74, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Year");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(229, 313, 56, 16);
		contentPane.add(lblNewLabel_6);
		
		year2 = new JTextField();
		year2.setEditable(false);
		year2.setBounds(276, 310, 116, 22);
		contentPane.add(year2);
		year2.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Make");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(12, 352, 45, 16);
		contentPane.add(lblNewLabel_3_1);
		
		make1 = new JTextField();
		make1.setEditable(false);
		make1.setColumns(10);
		make1.setBounds(69, 350, 116, 22);
		contentPane.add(make1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Make");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_1.setBounds(229, 353, 56, 16);
		contentPane.add(lblNewLabel_6_1);
		
		make2 = new JTextField();
		make2.setEditable(false);
		make2.setColumns(10);
		make2.setBounds(276, 350, 116, 22);
		contentPane.add(make2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Model");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(12, 395, 45, 16);
		contentPane.add(lblNewLabel_3_1_1);
		
		model1 = new JTextField();
		model1.setEditable(false);
		model1.setColumns(10);
		model1.setBounds(69, 393, 116, 22);
		contentPane.add(model1);
		
		JLabel aw = new JLabel("Model");
		aw.setFont(new Font("Tahoma", Font.PLAIN, 15));
		aw.setBounds(229, 396, 56, 16);
		contentPane.add(aw);
		
		model2 = new JTextField();
		model2.setEditable(false);
		model2.setColumns(10);
		model2.setBounds(276, 393, 116, 22);
		contentPane.add(model2);
		
		JLabel dw = new JLabel("VIN#");
		dw.setFont(new Font("Tahoma", Font.PLAIN, 15));
		dw.setBounds(12, 437, 45, 16);
		contentPane.add(dw);
		
		vin1 = new JTextField();
		vin1.setEditable(false);
		vin1.setColumns(10);
		vin1.setBounds(69, 435, 116, 22);
		contentPane.add(vin1);
		
		JLabel lblVin = new JLabel("VIN#");
		lblVin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVin.setBounds(229, 438, 56, 16);
		contentPane.add(lblVin);
		
		vin2 = new JTextField();
		vin2.setEditable(false);
		vin2.setColumns(10);
		vin2.setBounds(276, 435, 116, 22);
		contentPane.add(vin2);
		
		JLabel lblDriver = new JLabel("Driver (if married)");
		lblDriver.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDriver.setBounds(12, 481, 122, 16);
		contentPane.add(lblDriver);
		
		driver1 = new JTextField();
		driver1.setEditable(false);
		driver1.setBounds(146, 479, 116, 22);
		contentPane.add(driver1);
		driver1.setColumns(10);
		
		JLabel lblDriver_1 = new JLabel("Driver");
		lblDriver_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDriver_1.setBounds(286, 482, 56, 16);
		contentPane.add(lblDriver_1);
		
		driver2 = new JTextField();
		driver2.setEditable(false);
		driver2.setColumns(10);
		driver2.setBounds(333, 479, 116, 22);
		contentPane.add(driver2);
		
		JLabel lblNewLabel_7 = new JLabel("Name on Title");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(12, 519, 103, 16);
		contentPane.add(lblNewLabel_7);
		
		not = new JTextField();
		not.setEditable(false);
		not.setColumns(10);
		not.setBounds(146, 517, 116, 22);
		contentPane.add(not);
		
		JLabel lblNewLabel_7_1 = new JLabel("Current Insurance Company");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7_1.setBounds(12, 559, 194, 20);
		contentPane.add(lblNewLabel_7_1);
		
		cic = new JTextField();
		cic.setEditable(false);
		cic.setColumns(10);
		cic.setBounds(206, 557, 116, 22);
		contentPane.add(cic);
		
		JLabel lblNewLabel_8 = new JLabel("Personal Information");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8.setBounds(649, 246, 180, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_6_2 = new JLabel("First Name");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_2.setBounds(502, 312, 74, 16);
		contentPane.add(lblNewLabel_6_2);
		
		first = new JTextField();
		first.setEditable(false);
		first.setColumns(10);
		first.setBounds(588, 310, 116, 22);
		contentPane.add(first);
		
		JPanel panel = new JPanel();
		panel.setBounds(480, 256, 10, 402);
		panel.setBackground(new Color(0,0,0));
		contentPane.add(panel);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Last Name");
		lblNewLabel_6_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_2_1.setBounds(740, 312, 74, 16);
		contentPane.add(lblNewLabel_6_2_1);
		
		last = new JTextField();
		last.setEditable(false);
		last.setColumns(10);
		last.setBounds(826, 310, 116, 22);
		contentPane.add(last);
		
		JLabel lblNewLabel_6_2_2 = new JLabel("Email");
		lblNewLabel_6_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_2_2.setBounds(502, 371, 74, 16);
		contentPane.add(lblNewLabel_6_2_2);
		
		email = new JTextField();
		email.setEditable(false);
		email.setColumns(10);
		email.setBounds(588, 369, 116, 22);
		contentPane.add(email);
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("Phone");
		lblNewLabel_6_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_2_1_1.setBounds(740, 372, 74, 16);
		contentPane.add(lblNewLabel_6_2_1_1);
		
		phone = new JTextField();
		phone.setEditable(false);
		phone.setColumns(10);
		phone.setBounds(826, 369, 116, 22);
		contentPane.add(phone);
		
		JLabel lblNewLabel_6_2_2_1 = new JLabel("City");
		lblNewLabel_6_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_2_2_1.setBounds(502, 414, 56, 16);
		contentPane.add(lblNewLabel_6_2_2_1);
		
		city = new JTextField();
		city.setEditable(false);
		city.setColumns(10);
		city.setBounds(588, 412, 116, 22);
		contentPane.add(city);
		
		JLabel lbl = new JLabel("State");
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl.setBounds(740, 415, 74, 16);
		contentPane.add(lbl);
		
		state = new JTextField();
		state.setEditable(false);
		state.setColumns(10);
		state.setBounds(826, 412, 116, 22);
		contentPane.add(state);
		
		JLabel lblNewLabel_6_2_2_1_1 = new JLabel("DOB");
		lblNewLabel_6_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_2_2_1_1.setBounds(502, 456, 56, 16);
		contentPane.add(lblNewLabel_6_2_2_1_1);
		
		dob = new JTextField();
		dob.setEditable(false);
		dob.setColumns(10);
		dob.setBounds(588, 454, 116, 22);
		contentPane.add(dob);
		
		JLabel and = new JLabel("SSN");
		and.setFont(new Font("Tahoma", Font.PLAIN, 15));
		and.setBounds(740, 457, 74, 16);
		contentPane.add(and);
		
		ssn = new JTextField();
		ssn.setEditable(false);
		ssn.setColumns(10);
		ssn.setBounds(826, 454, 116, 22);
		contentPane.add(ssn);
		
		JLabel lblNewLabel_6_2_2_1_1_1 = new JLabel("Sex");
		lblNewLabel_6_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_2_2_1_1_1.setBounds(502, 499, 56, 16);
		contentPane.add(lblNewLabel_6_2_2_1_1_1);
		
		sex = new JTextField();
		sex.setEditable(false);
		sex.setColumns(10);
		sex.setBounds(588, 497, 116, 22);
		contentPane.add(sex);
		
		JLabel lblMaritalStatus = new JLabel("Marital Status");
		lblMaritalStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaritalStatus.setBounds(726, 499, 103, 16);
		contentPane.add(lblMaritalStatus);
		
		ms = new JTextField();
		ms.setEditable(false);
		ms.setColumns(10);
		ms.setBounds(826, 497, 116, 22);
		contentPane.add(ms);
		
		JLabel C = new JLabel("Current Liability");
		C.setFont(new Font("Tahoma", Font.PLAIN, 15));
		C.setBounds(12, 603, 122, 20);
		contentPane.add(C);
		
		cl = new JTextField();
		cl.setText((String) null);
		cl.setEditable(false);
		cl.setColumns(10);
		cl.setBounds(120, 603, 116, 22);
		contentPane.add(cl);
		
		
		year1.setText(newclient.get(idx).vehyear);
		year2.setText(newclient.get(idx).vehyear1);
		make1.setText(newclient.get(idx).vehmake);
		make2.setText(newclient.get(idx).vehmake1);
		model1.setText(newclient.get(idx).vehmodel);
		model2.setText(newclient.get(idx).vehmodel1);
		vin1.setText(newclient.get(idx).vehvin);
		vin2.setText(newclient.get(idx).vehvin1);
		driver1.setText(newclient.get(idx).vehdriver);
		driver2.setText(newclient.get(idx).vehdriver1);
		not.setText(newclient.get(idx).vehnot);
		cic.setText(newclient.get(idx).vehcic);
		cl.setText(newclient.get(idx).vehcll);
		first.setText(newclient.get(idx).firstname);
		last.setText(newclient.get(idx).lastname);
		email.setText(newclient.get(idx).client_email);
		phone.setText(newclient.get(idx).client_phone);
		city.setText(newclient.get(idx).client_city);
		state.setText(newclient.get(idx).client_state);
		dob.setText(newclient.get(idx).client_dob);
		ssn.setText(newclient.get(idx).client_ssn);
		sex.setText(newclient.get(idx).client_sex);
		ms.setText(newclient.get(idx).client_marital);
		
		
		value = new JTextField();
		value.setBounds(629, 636, 116, 22);
		contentPane.add(value);
		value.setColumns(10);
		
		JButton btnNewButton = new JButton("Assign Premium");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String file_name = newclient.get(idx).netID;
				
				Properties email_prop = new Properties();
				try{
					System.out.println("I'm here");
					System.out.println(file_name);
					
					// Email database exists
					InputStream input = new FileInputStream(file_name + ".properties");
					
					// load a properties file
					email_prop.load(input);
				}catch(IOException ioe) {
					// Properties file for email database doesn't exists.
					
				}
			
				try {
					OutputStream email_output = new FileOutputStream(file_name + ".properties");
					
					email_prop.setProperty(newagent.get(agent_idx).netid, value.getText());
					
					email_prop.store(email_output, null);
				} catch (IOException e2) {
					System.out.println("Failed to store email to the database");
				}
				
				
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(790, 635, 141, 25);
		btnNewButton.setBackground(new Color(132,169,172));
		btnNewButton.setFocusPainted(false);
		contentPane.add(btnNewButton);
	
		
	}
}
