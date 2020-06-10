import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 318);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IT Administration");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(135, 13, 135, 19);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 220, 432, 51);
		contentPane.add(panel);
		panel.setBackground(new Color(54,54,54));
		
		JButton create = new JButton("Create Agent");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CreateAgent newagent = null;
				try {
					newagent = new CreateAgent();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				newagent.setVisible(true);
			}
		});
		create.setFont(new Font("Tahoma", Font.PLAIN, 15));
		create.setBackground(new Color(245, 255, 250));
		create.setBounds(135, 50, 135, 35);
		contentPane.add(create);
		create.setFocusPainted(false);
		
		JButton display = new JButton("Display Agents");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayAgents display = new DisplayAgents();
				display.setVisible(true);
			}
		});
		display.setFont(new Font("Tahoma", Font.PLAIN, 15));
		display.setBounds(135, 100, 135, 35);
		contentPane.add(display);
		display.setBackground(new Color(245, 255, 250));
		display.setFocusPainted(false);
		
		JButton find = new JButton("Find/Edit Agent");
		find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FindAgent agent = new FindAgent();
				agent.setVisible(true);				
			}
		});
		find.setFont(new Font("Tahoma", Font.PLAIN, 15));
		find.setBounds(135, 150, 135, 35);
		contentPane.add(find);
		find.setBackground(new Color(245, 255, 250));
		find.setFocusPainted(false);
	}

}
