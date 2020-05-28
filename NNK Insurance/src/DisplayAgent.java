import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DisplayAgent extends JFrame {

	private JPanel contentPane;
	private JTextField first;
	private JTextField last;
	private JTextField middle;
	private JTextField age;
	private JTextField phone;
	private JTextField email;
	private JTextField netid;
	private JTextField netpass;
	private JTextField nnkmail;
	private JTextField nnkmailpass;
	private String tempnet = null;
	private String tempnetpass = null;
	private String tempnnkmail = null;
	private String tempnnkmpass = null;
	private ArrayList <NewAgent> newagent = new ArrayList<>(); 
	private int counter = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayAgent frame = new DisplayAgent(null, null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 */
	public DisplayAgent(String firstname, String lastname) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 360);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(255,255,255));
		
		JLabel lblNewLabel = new JLabel("Display Agent");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(325, 13, 88, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(52, 64, 76, 16);
		contentPane.add(lblNewLabel_1);
		
		first = new JTextField();
		first.setEditable(false);
		first.setBounds(31, 85, 129, 22);
		contentPane.add(first);
		first.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(207, 64, 76, 16);
		contentPane.add(lblNewLabel_2);
		
		last = new JTextField();
		last.setEditable(false);
		last.setBounds(184, 85, 129, 22);
		contentPane.add(last);
		last.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Middle Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(357, 64, 88, 16);
		contentPane.add(lblNewLabel_3);
		
		middle = new JTextField();
		middle.setEditable(false);
		middle.setBounds(340, 85, 129, 22);
		contentPane.add(middle);
		middle.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Age");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(552, 63, 38, 19);
		contentPane.add(lblNewLabel_4);
		
		age = new JTextField();
		age.setEditable(false);
		age.setBounds(509, 85, 121, 22);
		contentPane.add(age);
		age.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Phone");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(679, 64, 49, 16);
		contentPane.add(lblNewLabel_5);
		
		phone = new JTextField();
		phone.setEditable(false);
		phone.setBounds(656, 85, 116, 22);
		contentPane.add(phone);
		phone.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(79, 155, 49, 16);
		contentPane.add(lblNewLabel_6);
		
		email = new JTextField();
		email.setEditable(false);
		email.setBounds(31, 173, 141, 22);
		contentPane.add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("NETID");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(207, 154, 56, 19);
		contentPane.add(lblNewLabel_7);
		
		netid = new JTextField();
		netid.setEditable(false);
		netid.setBounds(184, 173, 129, 22);
		contentPane.add(netid);
		netid.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Net Password");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(357, 156, 99, 16);
		contentPane.add(lblNewLabel_8);
		
		netpass = new JTextField();
		netpass.setEditable(false);
		netpass.setBounds(340, 173, 129, 22);
		contentPane.add(netpass);
		netpass.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("NNK Email");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(525, 155, 76, 16);
		contentPane.add(lblNewLabel_9);
		
		nnkmail = new JTextField();
		nnkmail.setEditable(false);
		nnkmail.setBounds(489, 173, 155, 22);
		contentPane.add(nnkmail);
		nnkmail.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("NNK Email Password");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(655, 155, 138, 16);
		contentPane.add(lblNewLabel_10);
		
		nnkmailpass = new JTextField();
		nnkmailpass.setEditable(false);
		nnkmailpass.setBounds(656, 173, 116, 22);
		contentPane.add(nnkmailpass);
		nnkmailpass.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 283, 846, 30);
		contentPane.add(panel);
		panel.setBackground(new Color(45,19,44));
		
		boolean found = false;
		String filename = "agent";
		
		// Pull data from agent file
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
			JOptionPane.showMessageDialog(null, "NewAgent Class is not Found");
		}
		
		
		for(NewAgent agent: newagent) {
			if(agent.lastname.equals(lastname) && agent.firstname.equals(firstname)) {
				found = true;
				first.setText(agent.firstname);
				last.setText(agent.lastname);
				middle.setText(agent.middlename);
				age.setText(agent.age);
				phone.setText(agent.phone);
				email.setText(agent.email);
				netid.setText(agent.netid);
				netpass.setText(agent.netpassword);
				nnkmail.setText(agent.compemail);
				nnkmailpass.setText(agent.comppass);
				tempnet = agent.netid;
				tempnetpass = agent.netpassword;
				tempnnkmail = agent.compemail;
				tempnnkmpass = agent.comppass;
				break;
			}
			
			this.counter++;
		}
		
		if(!found) {
			JOptionPane.showMessageDialog(null, "Profile Not Found!");
			dispose();
		}
		
		
		JButton EditBtn = new JButton("Edit");
		EditBtn.setForeground(Color.WHITE);
		EditBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		EditBtn.setBounds(568, 245, 97, 25);
		contentPane.add(EditBtn);
		EditBtn.setFocusPainted(false);
		EditBtn.setBackground(new Color(70,88,129));
		
		JButton UpdateBtn = new JButton("Update");
		UpdateBtn.setForeground(Color.WHITE);
		UpdateBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		UpdateBtn.setBounds(677, 245, 97, 25);
		contentPane.add(UpdateBtn);
		UpdateBtn.setFocusPainted(false);
		UpdateBtn.setBackground(new Color(70,88,129));
		UpdateBtn.setVisible(false);
		
		
		
		EditBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditBtn.setVisible(false);
				UpdateBtn.setVisible(true);
				first.setEditable(true);
				last.setEditable(true);
				middle.setEditable(true);
				age.setEditable(true);
				phone.setEditable(true);
				email.setEditable(true);
			}
		});
		
		UpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditBtn.setVisible(true);
				UpdateBtn.setVisible(false);
				String firstname = first.getText();
				String lastname = last.getText();
				String middlename = middle.getText();
				String aage = age.getText();
				String aphone = phone.getText();
				String aemail = email.getText();
				
				first.setEditable(false);
				last.setEditable(false);
				middle.setEditable(false);
				age.setEditable(false);
				phone.setEditable(false);
				email.setEditable(false);
				
				
				NewAgent agent = new NewAgent(firstname, lastname, middlename , aage, aphone, aemail, tempnet, tempnetpass, tempnnkmail ,tempnnkmpass );
				newagent.set(counter, agent);
				
				try {
					FileOutputStream fos = new FileOutputStream(filename);
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            
		            oos.writeObject(newagent);
		            oos.flush();
		            oos.close();
		            fos.close();
		            
		            
				}catch(IOException ioe) {
					// Do nothing for now because
					// we assume file exists.
				}
				
				
			}
		});
	}

}
