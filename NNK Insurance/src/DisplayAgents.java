import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JButton;

public class DisplayAgents extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JPanel panel_1;
	private JButton backBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayAgents frame = new DisplayAgents();
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
	public DisplayAgents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1328, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(59,105,120));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(97, 79, 1213, 417);
		contentPane.add(scrollPane);
		
		
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
			//System.out.println("Agent File doesn't exists");
			
		}catch(ClassNotFoundException e1) {
			System.out.println("NewAgent Class not Found");
		}
		
		String[] col = {
				"First Name", "Last Name", "Middle Name", "Age", "Phone", "Email", "NETID", "Net Password", "Work Email", "Email Password"
			};
		
		DefaultTableModel tableModel = new DefaultTableModel(col,0);
		
		
		
		for(int i =0 ; i< newagent.size(); i++) {
			String firstname = newagent.get(i).firstname;
			String lastname = newagent.get(i).lastname;
			String middlename = newagent.get(i).middlename;
			String age = newagent.get(i).age;
			String phone = newagent.get(i).phone;
			String email = newagent.get(i).email;
			String netid = newagent.get(i).netid;
			String netpass = newagent.get(i).netpassword;
			String compemail = newagent.get(i).compemail;
			String comppass = newagent.get(i).comppass;
			
			Object rowData[] = {firstname , lastname , middlename , age, phone, email, netid, netpass , compemail, comppass};
			tableModel.addRow(rowData);
		}
		
		
		table = new JTable(tableModel);
		table.setRowSelectionAllowed(false);
				
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(30);
		table.getColumnModel().getColumn(2).setPreferredWidth(30);
		table.getColumnModel().getColumn(3).setPreferredWidth(15);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(120);
		table.getColumnModel().getColumn(6).setPreferredWidth(40);
		table.getColumnModel().getColumn(7).setPreferredWidth(30);
		table.getColumnModel().getColumn(8).setPreferredWidth(120);
		table.getColumnModel().getColumn(9).setPreferredWidth(30);
		scrollPane.setViewportView(table);
		table.setBackground(new Color(52,116,116));
		table.setForeground(new Color(255,255,255));
		table.setShowGrid(false);
		table.setBorder(null);
		table.getTableHeader().setReorderingAllowed(false);
		table.setEnabled(false);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(32, 0, 64, 496);
		contentPane.add(panel);
		panel.setBackground(new Color(63,63,68));
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 32, 496);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(27,27,47));
		
		
		backBtn = new JButton("Back");
		backBtn.setBounds(105, 14, 80, 25);
		backBtn.setFocusPainted(false);
		backBtn.setBackground(new Color(255,255,255));
		contentPane.add(backBtn);
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Admin admin = new Admin();
				admin.setVisible(true);
				
			}
		});
		
			
	}
	

	
}
