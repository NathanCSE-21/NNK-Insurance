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
import java.awt.event.ActionEvent;

public class FindAgent extends JFrame {

	private JPanel contentPane;
	private JTextField first;
	private JTextField last;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindAgent frame = new FindAgent();
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
	public FindAgent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("Find Agent");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(215, 13, 77, 24);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 37, 240);
		contentPane.add(panel);
		panel.setBackground(new Color(50,50,50));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(37, 0, 54, 240);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(59,105,120));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 240, 432, 33);
		contentPane.add(panel_2);
		panel_2.setBackground(new Color(132,169,172));
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(121, 73, 77, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(121, 122, 77, 16);
		contentPane.add(lblNewLabel_2);
		
		first = new JTextField();
		first.setFont(new Font("Tahoma", Font.PLAIN, 15));
		first.setBounds(215, 71, 116, 22);
		contentPane.add(first);
		first.setColumns(10);
		
		last = new JTextField();
		last.setFont(new Font("Tahoma", Font.PLAIN, 15));
		last.setBounds(215, 120, 116, 22);
		contentPane.add(last);
		last.setColumns(10);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstname = first.getText();
				String lastname = last.getText();
				
				dispose();
				DisplayAgent agent = new DisplayAgent(firstname, lastname);
				agent.setVisible(true);
			}
		});
		submit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		submit.setBounds(215, 175, 97, 24);
		contentPane.add(submit);
		submit.setBackground(new Color(236,251,252));
		submit.setFocusPainted(false);
		
	}
}
