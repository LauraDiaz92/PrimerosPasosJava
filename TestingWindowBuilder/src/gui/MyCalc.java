package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyCalc extends JFrame {

	private JPanel contentPane;
	private JTextField given1_field;
	private JTextField given2_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc frame = new MyCalc();
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
	public MyCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		given1_field = new JTextField();
		given1_field.setToolTipText("Give a number");
		GridBagConstraints gbc_given1_field = new GridBagConstraints();
		gbc_given1_field.insets = new Insets(0, 0, 5, 0);
		gbc_given1_field.anchor = GridBagConstraints.WEST;
		gbc_given1_field.gridx = 1;
		gbc_given1_field.gridy = 1;
		contentPane.add(given1_field, gbc_given1_field);
		given1_field.setColumns(10);
		
		given2_field = new JTextField();
		given2_field.setText("Give a number");
		GridBagConstraints gbc_given2_field = new GridBagConstraints();
		gbc_given2_field.insets = new Insets(0, 0, 5, 0);
		gbc_given2_field.anchor = GridBagConstraints.WEST;
		gbc_given2_field.gridx = 1;
		gbc_given2_field.gridy = 2;
		contentPane.add(given2_field, gbc_given2_field);
		given2_field.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 3;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblTOTAL = new JLabel("TOTAL");
		lblTOTAL.setForeground(new Color(128, 0, 0));
		lblTOTAL.setFont(new Font("Vrinda", Font.BOLD, 39));
		GridBagConstraints gbc_lblTOTAL = new GridBagConstraints();
		gbc_lblTOTAL.gridx = 1;
		gbc_lblTOTAL.gridy = 5;
		contentPane.add(lblTOTAL, gbc_lblTOTAL);
		
		btnNewButton.addMouseListener(new MouseAdapter() {  //AÑADIDO AL BOTÓN ADD
			@Override
			public void mouseClicked(MouseEvent e) {
				int given1 = Integer.parseInt(given1_field.getText());
				int given2 = Integer.parseInt(given2_field.getText());
				
				int answer = given1 + given2;
				lblTOTAL.setText(Integer.toString(answer));
			}
		});
	}

}
