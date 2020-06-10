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
import javax.swing.Timer;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AgentDashBoard extends JFrame {

	private JPanel contentPane;
	private JTextField newpassword;
	private JPanel ov = new JPanel();
	private JPanel mc = new JPanel();
	private JPanel c = new JPanel();
	private JPanel st = new JPanel();
	private String current_panel = "overview";
	private JPanel overview = new JPanel();
	private JPanel changepass = new JPanel();
	private JPanel applications = new JPanel();
	private double current_page = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgentDashBoard frame = new AgentDashBoard(null, 0);
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
		setBounds(100, 100, 886, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255,255,255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(252, 0, 616, 494);
		layeredPane.setBackground(new Color(199,0,57));
		contentPane.add(layeredPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 616, 88);
		panel.setBackground(new Color(199,0,57));;
		
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JLabel timer = new JLabel("");
		timer.setForeground(Color.BLACK);
		timer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		timer.setBounds(45, 25, 290, 34);
		panel.add(timer);
		
		
		overview.setBounds(1000, 87, 616, 407);
		layeredPane.add(overview);
		overview.setBackground(new Color(57,62,70));
		overview.setLayout(null);
		
		
		applications.setBounds(0, 87, 616, 407);
		layeredPane.add(applications);
		applications.setBackground(new Color(48,57,96));
		applications.setLayout(null);
		
		JLabel size = new JLabel("");
		size.setForeground(Color.WHITE);
		size.setFont(new Font("Tahoma", Font.PLAIN, 15));
		size.setBounds(270, 345, 97, 25);
		
		applications.add(size);
		JButton next = new JButton("NEXT");
		next.setForeground(Color.DARK_GRAY);
		next.setBounds(400, 345, 97, 25);
		next.setFocusPainted(false);
		JButton back = new JButton("BACK");
		back.setForeground(Color.DARK_GRAY);
		back.setBounds(126, 345, 97, 25);
		back.setFocusPainted(false);
JLabel fn = new JLabel("First Name");
		fn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fn.setBounds(25, 46, 92, 16);
		applications.add(fn);
		
		JLabel lblNewLabel_11 = new JLabel("Last Name");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(150, 47, 92, 16);
		applications.add(lblNewLabel_11);
		
				back.setVisible(false);
		applications.add(back);
		
			
		applications.add(next);
		
		
		
		changepass.setBounds(800, 87, 616, 407);
		layeredPane.add(changepass);
		changepass.setBackground(new Color(57,62,70));
		changepass.setVisible(false);
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
		
		
		ov.setBounds(0, 236, 252, 49);
		ov.setBackground(new Color(130,115,151));
		contentPane.add(ov);
		ov.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setIcon(new ImageIcon(AgentDashBoard.class.getResource("/img/overview.png")));
		lblNewLabel_2.setBounds(0, 0, 61, 49);
		ov.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Overview");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelChange(current_panel);
				ov.setBackground(new Color(130,115,151));
				current_panel = "overview";
				overview.setVisible(true);
			}
		});
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBackground(Color.BLACK);
		lblNewLabel_3.setBounds(73, 0, 181, 49);
		ov.add(lblNewLabel_3);
		
		
		mc.setBounds(0, 286, 252, 52);
		mc.setBackground(new Color(255,255,255));
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
		
		double pages = Math.ceil(newclient.size()/5);
		size.setText(current_page + "/" +pages);
		
		if(current_page > 1) {
			back.setVisible(true);
		}
		
		
		
		st.setBounds(0, 386, 252, 52);
		st.setBackground(new Color(255,255,255));
		contentPane.add(st);
		st.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(AgentDashBoard.class.getResource("/img/settings.png")));
		lblNewLabel_8.setBounds(0, 0, 63, 55);
		st.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Change Password");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelChange(current_panel);
				st.setBackground(new Color(130,115,151));
				current_panel = "settings";
				changepass.setVisible(true);
				
			}
		});
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(75, 0, 179, 55);
		st.add(lblNewLabel_9);
		
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
		if(current_panel.equals("overview")) {
			ov.setBackground(new Color(255,255,255));
			overview.setVisible(false);
		}
		else if(current_panel.equals("customers")) {
			c.setBackground(new Color(255,255,255));
		}
		else if(current_panel.equals("clients")) {
			mc.setBackground(new Color(255,255,255));
		}
		else if(current_panel.equals("settings")) {
			st.setBackground(new Color(255,255,255));
			changepass.setVisible(false);
		}
	}
}
