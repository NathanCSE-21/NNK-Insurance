import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pending extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private String key = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pending frame = new Pending(null, 0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param counter 
	 */
	public Pending(NewClient client, int counter) {
		NewClient newclient = client;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(255,255,255));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pending Application");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(165, 13, 127, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(82, 90, 66, 16);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 15));
		name.setEditable(false);
		name.setBounds(157, 87, 116, 22);
		contentPane.add(name);
		name.setColumns(10);
		
		name.setText(newclient.lastname);
		
		JLabel lblNewLabel_2 = new JLabel("Thank you for choosing NNK.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(128, 127, 207, 22);
		contentPane.add(lblNewLabel_2);
		
		
		
		
		
		// Pull the properties file if it exist check the price 
		String file_name = newclient.netID;
		
		Properties email_prop = new Properties();
		try {
			//Email database exists
			InputStream input = new FileInputStream(file_name + ".properties");
			
			//load a properties file
			email_prop.load(input);
			
			Set<Object> keys = email_prop.keySet();
			
			
			for(Object k: keys) {
				key = (String) k;
			}
			
			String premium_price = email_prop.getProperty(key);
			
			JLabel price = new JLabel("");
			price.setFont(new Font("Tahoma", Font.PLAIN, 16));
			price.setBounds(206, 191, 245, 16);
			contentPane.add(price);
			
			JButton accept = new JButton("Accept");
			accept.setBounds(257, 236, 97, 25);
			accept.setFocusPainted(false);
			accept.setBackground(new Color(207,246,207));
			contentPane.add(accept);
			
			JButton reject = new JButton("Reject");
			reject.setBounds(387, 236, 97, 25);
			reject.setFocusPainted(false);
			reject.setBackground(new Color(199,0,57));
			contentPane.add(reject);
			
			
			
			price.setText("Your Premium is: " + premium_price);
			
			accept.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Properties net_prop = new Properties();
					
					// Pul agentID.properties to see if it exists
					try {
						InputStream input = new FileInputStream(key + ".properties");
						
						net_prop.load(input);
					}catch(IOException ioe) {
						// agentID.properties doesn't exists
					}
					
					try {
						OutputStream output = new FileOutputStream(key +".properties");
						net_prop.setProperty(newclient.netID, premium_price);
					
						net_prop.store(output , null);
					}catch(IOException ioe) {
						System.out.println("Failed to add this client into agent property.");
					}
				}
			});
			
			
			String client_file = "client";
			ArrayList <NewClient> updateclient = new ArrayList<>();
			
			// Try to pull the file name "client"
			try {
				// agent file exists
				FileInputStream fis = new FileInputStream(client_file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				updateclient = (ArrayList<NewClient>) ois.readObject();
				
				fis.close();
				ois.close();
			}catch(IOException exception) {
				// agent file doesn't exists.
				//System.out.println("Agent File doesn't exists");
				
			}catch(ClassNotFoundException e1) {
				System.out.println("NewClient Class not Found");
			}
			
			NewClient new_client = new NewClient(newclient.firstname, newclient.lastname,  newclient.client_email,  newclient.client_phone,  newclient.client_city ,
					 newclient.client_state,  newclient.client_dob,  newclient.client_sex,
					 newclient.client_marital,  newclient.client_ssn,
					 newclient.vehyear,  newclient.vehyear1,  newclient.vehmake,
					 newclient.vehmake1,
					 newclient.vehmodel,
					 newclient.vehmodel1,
					 newclient.vehvin,
					 newclient.vehvin1,
					 newclient.vehdriver,
					 newclient.vehdriver1,
					 newclient.vehnot,
					 newclient.vehci,
					 newclient.vehcic,
					 newclient.vehcll,  newclient.netID,  newclient.netpass , "Accepted - Agent" + key);
			
			updateclient.add(new_client);
			
			try {
				// add to client file
				FileOutputStream fos = new FileOutputStream(client_file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(updateclient);
				
				oos.flush();
				oos.close();
				fos.close();
			}catch(IOException ioe) {
				System.out.println("Create Profile Failed");
			}
			
			
		}catch(IOException ioe) {
			// Properties file doesn't exists
			
			JLabel lblNewLabel_3 = new JLabel("Your application is still Pending");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_3.setBounds(230, 162, 207, 19);
			contentPane.add(lblNewLabel_3);
		}
		
		
		
	}
}
