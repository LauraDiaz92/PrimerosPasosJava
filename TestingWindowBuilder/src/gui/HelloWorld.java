
// WINDOWS BUILDER

package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JTextPane;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.ScrollPane;

public class HelloWorld {

	private JFrame frmHello;
	/**
	 * @wbp.nonvisual location=529,149
	 */
	private final ScrollPane scrollPane = new ScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorld window = new HelloWorld();
					window.frmHello.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloWorld() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHello = new JFrame();
		frmHello.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 12));
		frmHello.setTitle("Creando ventanas en Java");
		frmHello.setBounds(100, 100, 560, 381);
		frmHello.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHello.getContentPane().setLayout(new BoxLayout(frmHello.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		frmHello.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel_1.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		JLabel lblNewLabel = new JLabel("Presiona un botón");
		panel_2.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BOTON 1");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setText("Dentro del boton");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setText("Salgo del boton");
			}
		});
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("¿Crees que significa algo este boton?");
				
			}
		});
		btnNewButton.setActionCommand("Boton 1");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BOTON 2");
		btnNewButton_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Esto es sólo una prueba");
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BOTON 3");
		btnNewButton_2.setBackground(new Color(64, 224, 208));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("No va a suceder nada porque presiones el botón 3");
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("BOTON 4");
		btnNewButton_3.setBackground(new Color(224, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("¿qué esperabas con el número 4?");
			}
		});
		panel.add(btnNewButton_3);
		
		JMenuBar menuBar = new JMenuBar();
		frmHello.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Abrir");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cerrar");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("y muchos mas");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Editar");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Vamos a editarlo");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Pues eso");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem(":)");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_2 = new JMenu("Propiedades");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("colore");
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("y m\u00E1s");
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_3 = new JMenu("Apariencia");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Siempre");
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("que est\u00E9");
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("bonito");
		mnNewMenu_3.add(mntmNewMenuItem_10);
		
		JMenu mnNewMenu_4 = new JMenu("Configuracion");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("pues m\u00E1s");
		mnNewMenu_4.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_5 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("TE LA BUSCAS T\u00DA");
		mnNewMenu_5.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("HAHAHA");
		mnNewMenu_5.add(mntmNewMenuItem_13);
		
		
		
		frmHello.setVisible(true);
	}
}
