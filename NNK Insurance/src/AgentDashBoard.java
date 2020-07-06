import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

import javax.swing.Timer;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AgentDashBoard extends JFrame {

	private JPanel contentPane;
	private JTextField newpassword;
	private JPanel mc = new JPanel();
	private JPanel c = new JPanel();
	private JPanel st = new JPanel();
	private String current_panel = "mc";
	private JPanel changepass = new JPanel();
	private JPanel applications = new JPanel();
	private JPanel myclient = new JPanel();
	

	private int myc_current = 1;
	
	private double current_page = 1;
	private JTextField first1;
	private JTextField last1;
	private JTextField dob1;
	private JTextField make1;
	private JTextField year1;
	private JTextField cl1;
	private JTextField first2;
	private JTextField last2;
	private JTextField dob2;
	private JTextField make2;
	private JTextField year2;
	private JTextField cl2;
	private JTextField first3;
	private JTextField last3;
	private JTextField dob3;
	private JTextField make3;
	private JTextField year3;
	private JTextField cl3;
	private JTextField first4;
	private JTextField last4;
	private JTextField dob4;
	private JTextField make4;
	private JTextField year4;
	private JTextField cl4;
	private JTextField first5;
	private JTextField last5;
	private JTextField dob5;
	private JTextField make5;
	private JTextField year5;
	private JTextField cl5;
	
	private int idx_5 =-1; 
	private int idx_4 =-1; 
	private int idx_3 =-1; 
	private int idx_2 =-1;
	private int idx_1 = -1;
	
	
	private ArrayList <NewClient> newclient = new ArrayList<>();
	private JLabel lblNewLabel_3;
	private JLabel client1;
	private JLabel premium1;
	private JLabel client2;
	private JLabel premium2;
	private JLabel client3;
	private JLabel premium3;
	private JLabel client4;
	private JLabel premium4;
	private JLabel client5;
	private JLabel premium5;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgentDashBoard frame = new AgentDashBoard( null, 0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public AgentDashBoard(ArrayList<NewAgent> newagent, int idx) throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1045, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255,255,255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(252, 0, 775, 494);
		layeredPane.setBackground(new Color(199,0,57));
		contentPane.add(layeredPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 774, 88);
		panel.setBackground(new Color(199,0,57));;
		
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JLabel timer = new JLabel("");
		timer.setForeground(Color.BLACK);
		timer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		timer.setBounds(45, 25, 290, 34);
		panel.add(timer);
		
		
		applications.setBounds(0, 87, 774, 407);
		layeredPane.add(applications);
		applications.setBackground(new Color(48,57,96));
		applications.setLayout(null);
		
		JLabel size = new JLabel("");
		size.setForeground(Color.WHITE);
		size.setFont(new Font("Tahoma", Font.PLAIN, 15));
		size.setBounds(361, 344, 56, 25);
		
		applications.add(size);
		JButton next = new JButton("NEXT");
		next.setForeground(Color.DARK_GRAY);
		next.setBounds(451, 346, 97, 25);
		next.setFocusPainted(false);
		JButton back = new JButton("BACK");
		back.setForeground(Color.DARK_GRAY);
		back.setBounds(203, 345, 97, 25);
		back.setFocusPainted(false);
		JLabel fn = new JLabel("First Name");
		fn.setForeground(new Color(255,132,124));
		fn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fn.setBounds(35, 46, 92, 16);
		applications.add(fn);
		
		JLabel lblNewLabel_11 = new JLabel("Last Name");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		JLabel ln = new JLabel("Last Name");
		ln.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ln.setBounds(165, 47, 62, 16);
		applications.add(ln);
		
		ln.setBounds(150, 47, 92, 16);
		ln.setForeground(new Color(255,132,124));
		applications.add(ln);
		back.setVisible(false);
		applications.add(back);
		
			
		applications.add(next);
		
		
		
		changepass.setBounds(0, 87, 774, 407);
		layeredPane.add(changepass);
		changepass.setBackground(new Color(57,62,70));
		changepass.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Please Enter Your New Password:");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(191, 13, 257, 16);
		changepass.add(lblNewLabel_10);
		
		newpassword = new JTextField();
		newpassword.setBounds(252, 73, 116, 22);
		changepass.add(newpassword);
		newpassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		newpassword.setColumns(10);
		
		JButton update = new JButton("Update");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newpass = newpassword.getText();
				newagent.set(idx, new NewAgent(newagent.get(idx).firstname,
						newagent.get(idx).lastname, newagent.get(idx).middlename,
						newagent.get(idx).age , newagent.get(idx).phone, 
						newagent.get(idx).email, newagent.get(idx).netid,
						newpass, newagent.get(idx).compemail, newagent.get(idx).comppass));
				
				String agentfile = "agent";
				try {
					// add to agent file
					FileOutputStream fos = new FileOutputStream(agentfile);
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					
					oos.writeObject(newagent);
					
					oos.flush();
					oos.close();
					fos.close();
				}catch(IOException ioe) {
					System.out.println("Update Profile Failed");
				}
			}
		});
		update.setFont(new Font("Tahoma", Font.PLAIN, 15));
		update.setBounds(252, 142, 116, 25);
		update.setFocusPainted(false);
		update.setBackground(new Color(209,234,163));
		changepass.add(update);
		
		JLabel name = new JLabel("");
		name.setForeground(Color.BLACK);
		name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name.setBounds(98, 203, 139, 26);
		name.setText(newagent.get(idx).lastname);
		contentPane.add(name);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AgentDashBoard.class.getResource("/img/nnk logo.png")));
		lblNewLabel.setBounds(12, 13, 228, 127);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome Agent,");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(12, 173, 150, 26);
		
		contentPane.add(lblNewLabel_1);
		
		
		mc.setBounds(0, 286, 252, 52);
		mc.setBackground(new Color(130,115,151));
		contentPane.add(mc);
		mc.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(AgentDashBoard.class.getResource("/img/myclient .png")));
		lblNewLabel_4.setBounds(0, 0, 59, 49);
		mc.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("My Clients");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(71, 0, 183, 49);
		mc.add(lblNewLabel_5);
		
		
		c.setBounds(0, 337, 252, 52);
		c.setBackground(new Color(255,255,255));
		contentPane.add(c);
		c.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(AgentDashBoard.class.getResource("/img/customer.png")));
		
		
		
		lblNewLabel_6.setBounds(0, 0, 61, 49);
		c.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Applications");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(73, 0, 181, 49);
		c.add(lblNewLabel_7);
		
		
		
		// Pull Client DataBase
		String client_file = "client";
		
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
		
		int pages = (int) Math.ceil(newclient.size()/5) + 1;
		size.setText(current_page + "/" +pages);
		
		JLabel dob = new JLabel("DOB");
		dob.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dob.setBounds(295, 46, 56, 16);
		dob.setForeground(new Color(255,132,124));
		
		
		JLabel make = new JLabel("Make");
		make.setFont(new Font("Tahoma", Font.PLAIN, 16));
		make.setBounds(406, 46, 56, 16);
		make.setForeground(new Color(255,132,124));
		applications.add(make);
		
		JLabel year = new JLabel("Year");
		year.setFont(new Font("Tahoma", Font.PLAIN, 16));
		year.setBounds(492, 46, 56, 16);
		year.setForeground(new Color(255,132,124));
		JLabel cl = new JLabel("Current Liability");
		cl.setForeground(new Color(255,132,124));
		cl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cl.setBounds(570, 46, 124, 16);
		applications.add(cl);
		applications.add(year);
		applications.add(dob);
		
		first1 = new JTextField();
		first1.setEditable(false);
		first1.setBounds(25, 89, 97, 22);
		applications.add(first1);
		first1.setColumns(10);
		
		last1 = new JTextField();
		last1.setEditable(false);
		last1.setBounds(150, 89, 108, 22);
		applications.add(last1);
		last1.setColumns(10);
		
		dob1 = new JTextField();
		dob1.setEditable(false);
		dob1.setBounds(270, 89, 97, 22);
		applications.add(dob1);
		dob1.setColumns(10);
		
		make1 = new JTextField();
		make1.setEditable(false);
		make1.setBounds(391, 89, 71, 22);
		applications.add(make1);
		make1.setColumns(10);
		
		year1 = new JTextField();
		year1.setEditable(false);
		year1.setBounds(474, 89, 81, 22);
		applications.add(year1);
		year1.setColumns(10);
		
		cl1 = new JTextField();
		cl1.setEditable(false);
		cl1.setBounds(570, 89, 116, 22);
		applications.add(cl1);
		cl1.setColumns(10);
		
		JButton view1 = new JButton("View");
		
		view1.setBounds(698, 88, 71, 25);
		applications.add(view1);
		
		first2 = new JTextField();
		first2.setEditable(false);
		first2.setColumns(10);
		first2.setBounds(25, 144, 97, 22);
		applications.add(first2);
		
		last2 = new JTextField();
		last2.setEditable(false);
		last2.setColumns(10);
		last2.setBounds(150, 144, 108, 22);
		applications.add(last2);
		
		dob2 = new JTextField();
		dob2.setEditable(false);
		dob2.setColumns(10);
		dob2.setBounds(270, 144, 97, 22);
		applications.add(dob2);
		
		make2 = new JTextField();
		make2.setEditable(false);
		make2.setColumns(10);
		make2.setBounds(391, 144, 71, 22);
		applications.add(make2);
		
		year2 = new JTextField();
		year2.setEditable(false);
		year2.setColumns(10);
		year2.setBounds(474, 144, 81, 22);
		applications.add(year2);
		
		cl2 = new JTextField();
		cl2.setEditable(false);
		cl2.setColumns(10);
		cl2.setBounds(570, 144, 116, 22);
		applications.add(cl2);
		
		JButton view2 = new JButton("View");
		view2.setBounds(698, 143, 71, 25);
		applications.add(view2);
		
		first3 = new JTextField();
		first3.setEditable(false);
		first3.setColumns(10);
		first3.setBounds(25, 193, 97, 22);
		applications.add(first3);
		
		last3 = new JTextField();
		last3.setEditable(false);
		last3.setColumns(10);
		last3.setBounds(150, 193, 108, 22);
		applications.add(last3);
		
		dob3 = new JTextField();
		dob3.setEditable(false);
		dob3.setColumns(10);
		dob3.setBounds(270, 193, 97, 22);
		applications.add(dob3);
		
		make3 = new JTextField();
		make3.setEditable(false);
		make3.setColumns(10);
		make3.setBounds(391, 193, 71, 22);
		applications.add(make3);
		
		year3 = new JTextField();
		year3.setEditable(false);
		year3.setColumns(10);
		year3.setBounds(474, 193, 81, 22);
		applications.add(year3);
		
		cl3 = new JTextField();
		cl3.setEditable(false);
		cl3.setColumns(10);
		cl3.setBounds(570, 193, 116, 22);
		applications.add(cl3);
		
		JButton view3 = new JButton("View");
		view3.setBounds(698, 192, 71, 25);
		applications.add(view3);
		
		first4 = new JTextField();
		first4.setEditable(false);
		first4.setColumns(10);
		first4.setBounds(25, 240, 97, 22);
		applications.add(first4);
		
		last4 = new JTextField();
		last4.setEditable(false);
		last4.setColumns(10);
		last4.setBounds(150, 240, 108, 22);
		applications.add(last4);
		
		dob4 = new JTextField();
		dob4.setEditable(false);
		dob4.setColumns(10);
		dob4.setBounds(270, 240, 97, 22);
		applications.add(dob4);
		
		make4 = new JTextField();
		make4.setEditable(false);
		make4.setColumns(10);
		make4.setBounds(391, 240, 71, 22);
		applications.add(make4);
		
		year4 = new JTextField();
		year4.setEditable(false);
		year4.setColumns(10);
		year4.setBounds(474, 240, 81, 22);
		applications.add(year4);
		
		cl4 = new JTextField();
		cl4.setEditable(false);
		cl4.setColumns(10);
		cl4.setBounds(570, 240, 116, 22);
		applications.add(cl4);
		
		JButton view4 = new JButton("View");
		view4.setBounds(698, 239, 71, 25);
		applications.add(view4);
		
		first5 = new JTextField();
		first5.setEditable(false);
		first5.setColumns(10);
		first5.setBounds(25, 281, 97, 22);
		applications.add(first5);
		
		last5 = new JTextField();
		last5.setEditable(false);
		last5.setColumns(10);
		last5.setBounds(150, 281, 108, 22);
		applications.add(last5);
		
		dob5 = new JTextField();
		dob5.setEditable(false);
		dob5.setColumns(10);
		dob5.setBounds(270, 281, 97, 22);
		applications.add(dob5);
		
		make5 = new JTextField();
		make5.setEditable(false);
		make5.setColumns(10);
		make5.setBounds(391, 281, 71, 22);
		applications.add(make5);
		
		year5 = new JTextField();
		year5.setEditable(false);
		year5.setColumns(10);
		year5.setBounds(474, 281, 81, 22);
		applications.add(year5);
		
		cl5 = new JTextField();
		cl5.setEditable(false);
		cl5.setColumns(10);
		cl5.setBounds(570, 281, 116, 22);
		applications.add(cl5);
		
		JButton view5 = new JButton("View");
		view5.setBounds(698, 280, 71, 25);
		applications.add(view5);
		
		view1.setBackground(new Color(255,189,105));
		view2.setBackground(new Color(255,189,105));
		view3.setBackground(new Color(255,189,105));
		view4.setBackground(new Color(255,189,105));
		view5.setBackground(new Color(255,189,105));
		
		applications.add(view1);
		
		applications.add(cl);
		applications.add(year);
		applications.add(dob);
		
		
		myclient.setBackground(Color.WHITE);
		myclient.setBounds(0, 87, 774, 407);
		layeredPane.add(myclient);
		myclient.setLayout(null);
		
		
		// Pull agent with clients from property file.
		Properties net_prop = new Properties();
		String netid = newagent.get(idx).netid;
		
		try {
			InputStream input = new FileInputStream(netid + ".properties");
			net_prop.load(input);
		}
		catch(IOException ioe){
			//perhaps it failed
		}
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Total Applications Viewed:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(67, 50, 242, 25);
		lblNewLabel_2.setBackground(new Color(79,138,139));
		myclient.add(lblNewLabel_2);
		
		JLabel tav = new JLabel("");
		tav.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tav.setBackground(new Color(155,222,172));
		tav.setBounds(321, 48, 81, 25);
		
		tav.setText((String) net_prop.get("Total"));
		myclient.add(tav);
		
		lblNewLabel_3 = new JLabel("My Current Clients:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(67, 124, 142, 25);
		myclient.add(lblNewLabel_3);
		
		client1 = new JLabel("");
		client1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		client1.setBounds(95, 162, 169, 25);
		myclient.add(client1);
		
		premium1 = new JLabel("");
		premium1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		premium1.setBounds(306, 162, 96, 25);
		myclient.add(premium1);
		
		client2 = new JLabel("");
		client2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		client2.setBounds(95, 200, 169, 25);
		myclient.add(client2);
		
		premium2 = new JLabel("");
		premium2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		premium2.setBounds(306, 200, 96, 25);
		myclient.add(premium2);
		
		client3 = new JLabel("");
		client3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		client3.setBounds(95, 238, 169, 25);
		myclient.add(client3);
		
		premium3 = new JLabel("");
		premium3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		premium3.setBounds(306, 238, 96, 25);
		myclient.add(premium3);
		
		client4 = new JLabel("");
		client4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		client4.setBounds(95, 276, 169, 25);
		myclient.add(client4);
		
		premium4 = new JLabel("");
		premium4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		premium4.setBounds(306, 276, 96, 25);
		myclient.add(premium4);
		
		client5 = new JLabel("");
		client5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		client5.setBounds(95, 314, 169, 25);
		myclient.add(client5);
		
		premium5 = new JLabel("");
		premium5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		premium5.setBounds(306, 314, 96, 25);
		myclient.add(premium5);
		
		JButton nextbtn = new JButton("Next");
		nextbtn.setBounds(321, 369, 97, 25);
		nextbtn.setVisible(false);
		
		JButton backbtn = new JButton("Back");
		backbtn.setBounds(29, 369, 97, 25);
		backbtn.setVisible(false);
		backbtn.setFocusPainted(false);
		backbtn.setBackground(new Color(241,120,8));
		myclient.add(backbtn);
		
		nextbtn.setFocusPainted(false);
		nextbtn.setBackground(new Color(252,157,157));
		myclient.add(nextbtn);
		
		if(current_page == pages) {
			next.setVisible(false);
		}
		if(current_page == 1) {
			back.setVisible(false);
		}
		if(current_page > 1) {
			back.setVisible(true);
		}
		
		// To increment and assign to TextField.
		int clientdb_size = newclient.size();
		int max_idx = (int) ((current_page * 5) - 5);
		
		for(int i = 0; i<5; i++) {
			if(clientdb_size == max_idx) {
				break;
			}
			else {
			switch(i) {
			case 0:
				idx_1 = max_idx;
				first1.setText(newclient.get(idx_1).firstname);
				last1.setText(newclient.get(idx_1).lastname);
				dob1.setText(newclient.get(idx_1).client_dob);
				make1.setText(newclient.get(idx_1).vehyear);
				year1.setText(newclient.get(idx_1).vehyear);
				cl1.setText(newclient.get(idx_1).vehcic);
				max_idx++;
				break;
				
			case 1:
				idx_2 = max_idx;
				first2.setText(newclient.get(idx_2).firstname);
				last2.setText(newclient.get(idx_2).lastname);
				dob2.setText(newclient.get(idx_2).client_dob);
				make2.setText(newclient.get(idx_2).vehyear);
				year2.setText(newclient.get(idx_2).vehyear);
				cl2.setText(newclient.get(idx_2).vehcic);
				max_idx++;
				break;
				
			case 2:
				idx_3 = max_idx;
				first3.setText(newclient.get(idx_3).firstname);
				last3.setText(newclient.get(idx_3).lastname);
				dob3.setText(newclient.get(idx_3).client_dob);
				make3.setText(newclient.get(idx_3).vehyear);
				year3.setText(newclient.get(idx_3).vehyear);
				cl3.setText(newclient.get(idx_3).vehcic);
				max_idx++;
				break;
				
			case 3:
				idx_4 = max_idx;
				first4.setText(newclient.get(idx_4).firstname);
				last4.setText(newclient.get(idx_4).lastname);
				dob4.setText(newclient.get(idx_4).client_dob);
				make4.setText(newclient.get(idx_4).vehyear);
				year4.setText(newclient.get(idx_4).vehyear);
				cl4.setText(newclient.get(idx_4).vehcic);
				max_idx++;
				break;
				
			case 4:
				idx_5 = max_idx;
				first5.setText(newclient.get(idx_5).firstname);
				last5.setText(newclient.get(idx_5).lastname);
				dob5.setText(newclient.get(idx_5).client_dob);
				make5.setText(newclient.get(idx_5).vehyear);
				year5.setText(newclient.get(idx_5).vehyear);
				cl5.setText(newclient.get(idx_5).vehcic);
				max_idx++;
				break;
				
			}
			}
		
		}
		applications.setVisible(false);
		changepass.setVisible(false);
		
		
		
		// Pull the properties file.
		String file_name = newagent.get(idx).netid;
		Properties agent_prop = new Properties();
		Set<Object> keys = null;
		double total_keys = -1 ;
		int myc_pages = -1;
		try {
			//Client database exists
			InputStream input = new FileInputStream(file_name + ".properties");
			
			//load a properties file
			agent_prop.load(input);
			
			keys = agent_prop.keySet();
			// Sort the Set of Objects and remove the "Total" object.
			
			
			for(Object k: keys) {
				String key = (String) k;
				if(key == "Total") {
					keys.remove(k);
					break;
				}
			}
			
			total_keys = keys.size()-1;
			myc_pages = (int) (Math.ceil(total_keys/5));
		}catch(IOException ioe) {
			// Failed
		}
		
		
		if(myc_pages > myc_current ) {
			nextbtn.setVisible(true);
		}
		if(myc_current ==myc_pages) {
			nextbtn.setVisible(false);
		}
		if(myc_current > 1) {
			backbtn.setVisible(true);
		}
		else {
			backbtn.setVisible(false);
		}
		
		int maxc_idx = (int) ((myc_pages * 5) - 5);
		String nclient_file = newagent.get(idx).netid;
		ArrayList <NewClient> client = null;
		// Try to pull the name of "agentID"
		try {
			// agent file exists
			FileInputStream fis = new FileInputStream(nclient_file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			client = (ArrayList<NewClient>) ois.readObject();
			
			fis.close();
			ois.close();
		}catch(IOException exception) {
			// agent file doesn't exists.
			//System.out.println("Agent File doesn't exists");
			
		}catch(ClassNotFoundException e1) {
			System.out.println("NewClient Class not Found");
		}
		
		
		for(int i = 0; i<5; i++) {
			if(total_keys == maxc_idx || client ==null ) {
				break;
			}
			else {
			switch(i) {
			case 0:
				client1.setText(client.get(maxc_idx).firstname + " " + client.get(maxc_idx).lastname);
				premium1.setText(agent_prop.getProperty(client.get(maxc_idx).netID));
				maxc_idx++;
				break;
				
			case 1:
				client2.setText(client.get(maxc_idx).firstname + " " + client.get(maxc_idx).lastname);
				premium2.setText(agent_prop.getProperty(client.get(maxc_idx).netID));
				maxc_idx++;
				break;
				
			case 2:
				client3.setText(client.get(maxc_idx).firstname + " " + client.get(maxc_idx).lastname);
				premium3.setText(agent_prop.getProperty(client.get(maxc_idx).netID));
				maxc_idx++;
				break;
				
			case 3:
				client4.setText(client.get(maxc_idx).firstname + " " + client.get(maxc_idx).lastname);
				premium4.setText(agent_prop.getProperty(client.get(maxc_idx).netID));
				maxc_idx++;
				break;
				
			case 4:
				client5.setText(client.get(maxc_idx).firstname + " " + client.get(maxc_idx).lastname);
				premium5.setText(agent_prop.getProperty(client.get(maxc_idx).netID));
				maxc_idx++;
				break;
				
			}
			}
		}
		
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myc_current--;
			}
		});
		nextbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myc_current++;
			}
		});
		
		view1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Do something
				ShowClientForm scf = new ShowClientForm(idx_1, newagent, newclient, idx);
				scf.setVisible(true);
			}
		});
		
		view2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Do something
				ShowClientForm scf = new ShowClientForm(idx_2, newagent, newclient, idx);
				scf.setVisible(true);
			}
		});
		
		view3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Do something
				ShowClientForm scf = new ShowClientForm(idx_3, newagent, newclient, idx);
				scf.setVisible(true);
			}
		});
		
		view4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Do something
				ShowClientForm scf = new ShowClientForm(idx_4, newagent, newclient, idx);
				scf.setVisible(true);
			}
		});
		
		view5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Do something
				ShowClientForm scf = new ShowClientForm(idx_5, newagent, newclient, idx);
				scf.setVisible(true);
			}
		});
		
		
		st.setBounds(0, 386, 252, 52);
		st.setBackground(new Color(255,255,255));
		contentPane.add(st);
		st.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(AgentDashBoard.class.getResource("/img/settings.png")));
		lblNewLabel_8.setBounds(0, 0, 63, 55);
		st.add(lblNewLabel_8);
		
		// Change Client Panel
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelChange(current_panel);
				mc.setBackground(new Color(130,115,151));
				current_panel = "mc";
				myclient.setVisible(true);
			}
		});
		
		// Change Applications Panel
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelChange(current_panel);
				c.setBackground(new Color(130,115,151));
				current_panel = "c";
				applications.setVisible(true);
			}
		});
		
		// Change Password Panel
		JLabel lblNewLabel_9 = new JLabel("Change Password");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(75, 0, 179, 55);
		st.add(lblNewLabel_9);
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelChange(current_panel);
				st.setBackground(new Color(130,115,151));
				current_panel = "st";
				changepass.setVisible(true);
			}
		});
		
		// Update the time every second
		ActionListener updateClockAction = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.setText(new Date().toString());
			}
		};
		
		Timer t = new Timer(1000,updateClockAction);
		t.start();
	}
	
	private void panelChange(String current_panel) {
		if(current_panel.equals("c")) {
			c.setBackground(new Color(255,255,255));
			applications.setVisible(false);
		}
		else if(current_panel.equals("mc")) {
			mc.setBackground(new Color(255,255,255));
			myclient.setVisible(false);
		}
		else if(current_panel.equals("st")) {
			st.setBackground(new Color(255,255,255));
			changepass.setVisible(false);
		}
	}
}
