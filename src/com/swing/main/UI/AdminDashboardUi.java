package com.swing.main.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class AdminDashboardUi {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboardUi window = new AdminDashboardUi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminDashboardUi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 627, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 593, 66);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SEGREGATING DEVICE TO RESELL AND RECYCLE WASTE");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(36, 11, 485, 33);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LOGOUT");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(542, 0, 66, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 81, 143, 316);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel productmenu = new JPanel();
		productmenu.setBackground(Color.BLACK);
		productmenu.setBounds(10, 11, 123, 43);
		panel_1.add(productmenu);
		productmenu.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("PRODUCT");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 11, 78, 21);
		productmenu.add(lblNewLabel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(10, 65, 123, 43);
		panel_1.add(panel_2_1);
		
		JLabel productlistmenu = new JLabel("PRODUCT LIST");
		productlistmenu.setForeground(Color.WHITE);
		productlistmenu.setFont(new Font("Tahoma", Font.BOLD, 13));
		productlistmenu.setBounds(10, 11, 103, 21);
		panel_2_1.add(productlistmenu);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(Color.BLACK);
		panel_2_1_1.setBounds(10, 119, 123, 43);
		panel_1.add(panel_2_1_1);
		
		JLabel userlistmenu = new JLabel("USER LIST");
		userlistmenu.setForeground(Color.WHITE);
		userlistmenu.setFont(new Font("Tahoma", Font.BOLD, 13));
		userlistmenu.setBounds(10, 11, 103, 21);
		panel_2_1_1.add(userlistmenu);
	}

}
