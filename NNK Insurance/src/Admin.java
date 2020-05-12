import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
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
		setBounds(100, 100, 450, 300);
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
		panel.setBounds(0, 211, 432, 42);
		contentPane.add(panel);
		panel.setBackground(new Color(54,54,54));
		
		JButton create = new JButton("Create Agent");
		create.setFont(new Font("Tahoma", Font.PLAIN, 15));
		create.setBackground(new Color(245, 255, 250));
		create.setBounds(135, 55, 135, 25);
		contentPane.add(create);
		create.setFocusPainted(false);
		
		JButton display = new JButton("Display Agents");
		display.setFont(new Font("Tahoma", Font.PLAIN, 15));
		display.setBounds(135, 93, 135, 25);
		contentPane.add(display);
		display.setBackground(new Color(245, 255, 250));
		display.setFocusPainted(false);
		
		JButton find = new JButton("Find Agent");
		find.setFont(new Font("Tahoma", Font.PLAIN, 15));
		find.setBounds(135, 131, 135, 25);
		contentPane.add(find);
		find.setBackground(new Color(245, 255, 250));
		find.setFocusPainted(false);
		
		JButton edit = new JButton("Edit Agent");
		edit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		edit.setBounds(135, 169, 135, 25);
		contentPane.add(edit);
		edit.setBackground(new Color(245, 255, 250));
		edit.setFocusPainted(false);
	}

}
