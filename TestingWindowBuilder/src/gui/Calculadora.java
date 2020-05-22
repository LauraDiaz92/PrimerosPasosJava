package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Calculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/gui/calculadora.png.png")));
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel resultLabel = new JLabel("0");
		resultLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(resultLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{84, 84, 84, 84, 84, 0};
		gbl_panel.rowHeights = new int[]{39, 39, 39, 39, 39, 39, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewButton = new JButton("MC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_5 = new JButton("MR");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 1;
		gbc_btnNewButton_5.gridy = 0;
		panel.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_1 = new JButton("MS");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 0;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("M+");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 3;
		gbc_btnNewButton_2.gridy = 0;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("M-");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 4;
		gbc_btnNewButton_3.gridy = 0;
		panel.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("<-");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 1;
		panel.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_10 = new JButton("CE");
		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_10.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_10.gridx = 1;
		gbc_btnNewButton_10.gridy = 1;
		panel.add(btnNewButton_10, gbc_btnNewButton_10);
		
		JButton btnNewButton_6 = new JButton("C");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 2;
		gbc_btnNewButton_6.gridy = 1;
		panel.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("+-");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_7.gridx = 3;
		gbc_btnNewButton_7.gridy = 1;
		panel.add(btnNewButton_7, gbc_btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("R");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_8.gridx = 4;
		gbc_btnNewButton_8.gridy = 1;
		panel.add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultLabel.setText(Logic.printLabel(resultLabel.getText(), btn7.getText()));
				//ME DAS EL RESULTADO DE LABEL DE LO QUE HAYA EN (MÉTODO LOGIC.PRINTLABEL (COGER TEXTO POR DEFECTO DE LA ETIQUETA "0", NUEVO TEXTO)
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_9.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_9.gridx = 0;
		gbc_btnNewButton_9.gridy = 2;
		panel.add(btn7, gbc_btnNewButton_9);
		
		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultLabel.setText(Logic.printLabel(resultLabel.getText(), btn8.getText()));
			}
		});
		GridBagConstraints gbc_btnNewButton_15 = new GridBagConstraints();
		gbc_btnNewButton_15.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_15.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_15.gridx = 1;
		gbc_btnNewButton_15.gridy = 2;
		panel.add(btn8, gbc_btnNewButton_15);
		
		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultLabel.setText(Logic.printLabel(resultLabel.getText(), btn9.getText()));
			}
		});
		
		GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
		gbc_btnNewButton_11.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_11.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_11.gridx = 2;
		gbc_btnNewButton_11.gridy = 2;
		panel.add(btn9, gbc_btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("/");
		GridBagConstraints gbc_btnNewButton_12 = new GridBagConstraints();
		gbc_btnNewButton_12.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_12.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_12.gridx = 3;
		gbc_btnNewButton_12.gridy = 2;
		panel.add(btnNewButton_12, gbc_btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("%");
		GridBagConstraints gbc_btnNewButton_13 = new GridBagConstraints();
		gbc_btnNewButton_13.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_13.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_13.gridx = 4;
		gbc_btnNewButton_13.gridy = 2;
		panel.add(btnNewButton_13, gbc_btnNewButton_13);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				resultLabel.setText(Logic.printLabel(resultLabel.getText(), btn4.getText()));
			}
		});
		GridBagConstraints gbc_btnNewButton_20 = new GridBagConstraints();
		gbc_btnNewButton_20.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_20.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_20.gridx = 0;
		gbc_btnNewButton_20.gridy = 3;
		panel.add(btn4, gbc_btnNewButton_20);
		
		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultLabel.setText(Logic.printLabel(resultLabel.getText(), btn5.getText()));
			}
		});
		GridBagConstraints gbc_btnNewButton_14 = new GridBagConstraints();
		gbc_btnNewButton_14.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_14.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_14.gridx = 1;
		gbc_btnNewButton_14.gridy = 3;
		panel.add(btn5, gbc_btnNewButton_14);
		
		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultLabel.setText(Logic.printLabel(resultLabel.getText(), btn6.getText()));
			}
		});
		GridBagConstraints gbc_btnNewButton_16 = new GridBagConstraints();
		gbc_btnNewButton_16.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_16.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_16.gridx = 2;
		gbc_btnNewButton_16.gridy = 3;
		panel.add(btn6, gbc_btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("*");
		GridBagConstraints gbc_btnNewButton_17 = new GridBagConstraints();
		gbc_btnNewButton_17.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_17.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_17.gridx = 3;
		gbc_btnNewButton_17.gridy = 3;
		panel.add(btnNewButton_17, gbc_btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("1/x");
		GridBagConstraints gbc_btnNewButton_18 = new GridBagConstraints();
		gbc_btnNewButton_18.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_18.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_18.gridx = 4;
		gbc_btnNewButton_18.gridy = 3;
		panel.add(btnNewButton_18, gbc_btnNewButton_18);
		
		//JButton btn = new JButton()
		JButton btnNewButton_25 = new JButton("1");
		btnNewButton_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultLabel.setText(Logic.printLabel(resultLabel.getText(), btnNewButton_25.getText()));
			}
		});
		
		GridBagConstraints gbc_btnNewButton_25 = new GridBagConstraints();
		gbc_btnNewButton_25.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_25.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_25.gridx = 0;
		gbc_btnNewButton_25.gridy = 4;
		panel.add(btnNewButton_25, gbc_btnNewButton_25);
		
		JButton btn2 = new JButton("2");
		GridBagConstraints gbc_btnNewButton_19 = new GridBagConstraints();
		gbc_btnNewButton_19.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_19.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_19.gridx = 1;
		gbc_btnNewButton_19.gridy = 4;
		panel.add(btn2, gbc_btnNewButton_19);
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultLabel.setText(Logic.printLabel(resultLabel.getText(), btn2.getText()));
			}
		});
		
		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultLabel.setText(Logic.printLabel(resultLabel.getText(), btn3.getText()));
			}
		});
		GridBagConstraints gbc_btnNewButton_21 = new GridBagConstraints();
		gbc_btnNewButton_21.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_21.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_21.gridx = 2;
		gbc_btnNewButton_21.gridy = 4;
		panel.add(btn3, gbc_btnNewButton_21);
		
		
		JButton btnNewButton_22 = new JButton("-");
		GridBagConstraints gbc_btnNewButton_22 = new GridBagConstraints();
		gbc_btnNewButton_22.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_22.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_22.gridx = 3;
		gbc_btnNewButton_22.gridy = 4;
		panel.add(btnNewButton_22, gbc_btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("=");
		GridBagConstraints gbc_btnNewButton_23 = new GridBagConstraints();
		gbc_btnNewButton_23.gridheight = 2;
		gbc_btnNewButton_23.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_23.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_23.gridx = 4;
		gbc_btnNewButton_23.gridy = 4;
		panel.add(btnNewButton_23, gbc_btnNewButton_23);
		
		JButton btn0 = new JButton("0");
		GridBagConstraints gbc_btnNewButton_24 = new GridBagConstraints();
		gbc_btnNewButton_24.gridwidth = 2;
		gbc_btnNewButton_24.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_24.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_24.gridx = 0;
		gbc_btnNewButton_24.gridy = 5;
		panel.add(btn0, gbc_btnNewButton_24);
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultLabel.setText(Logic.printLabel(resultLabel.getText(), btn0.getText()));
			}
		});
		
		
		JButton btnNewButton_26 = new JButton(",");
		GridBagConstraints gbc_btnNewButton_26 = new GridBagConstraints();
		gbc_btnNewButton_26.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_26.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_26.gridx = 2;
		gbc_btnNewButton_26.gridy = 5;
		panel.add(btnNewButton_26, gbc_btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("+");
		GridBagConstraints gbc_btnNewButton_27 = new GridBagConstraints();
		gbc_btnNewButton_27.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_27.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_27.gridx = 3;
		gbc_btnNewButton_27.gridy = 5;
		panel.add(btnNewButton_27, gbc_btnNewButton_27);
	}

}
