package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class Practica extends JFrame {

	private JPanel mainContentPane;
	private JTextField txtFirstName;
	private JLabel lblNewLabel;
	private JButton btnOrder;
	private final ButtonGroup btGroupGender = new ButtonGroup();
	private final ButtonGroup btGroupMeal = new ButtonGroup();
	private JCheckBox jCheckSauce;
	private JCheckBox jCheckFries;
	private JCheckBox jCheckSalad;
	private JRadioButton rbChicken;
	private JRadioButton rbLamb;
	private JRadioButton rbPork;
	private JComboBox cBoxCustomerName;
	private JLabel lblCustomerTittle;
	private JLabel lblCustomersList;
	private JList listCustomers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practica frame = new Practica();
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
	public Practica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 477);
		mainContentPane = new JPanel();
		mainContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainContentPane);
		
		lblNewLabel = new JLabel("First name:");
		
		//SI QUEREMOS CAMBIAR LA ETIQUETA EN UN FUTURO. BOTON COVERT LOCAL TO FIELD, HA CREADO UNA INSTANCIA (MAS ARRIBA)
		//GRACIAS A LA INSTANCIA PODEMOS ACCEDER A SU CONTENIDO. pOR EJEMPLO, COGER SU INFORMACION A TRAVES DE UN BOTON
		//LOCAL VARIABLE - SI SE CAMBIA A INSTANCE VARIABLES (FIELD) SE PUEDE ACCEDER A ELLOS DESDE TODAS PARTES
		// HACERLAS PUBLICAS)
		txtFirstName = new JTextField();
		txtFirstName.setColumns(10);
		
		btnOrder = new JButton("Order");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, txtFirstName.getText());
				txtFirstName.setText(txtFirstName.getText() + " the best");
			}
		});
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, txtFirstName.getText());
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Meal");
		
		rbChicken = new JRadioButton("Chicken");
		rbChicken.setSelected(true);
		btGroupMeal.add(rbChicken);
		
		rbPork = new JRadioButton("Pork");
		btGroupMeal.add(rbPork);
		
		rbLamb = new JRadioButton("Lamb");
		btGroupMeal.add(rbLamb);
		
		JLabel lblNewLabel_3 = new JLabel("Extras");
		
		jCheckSauce = new JCheckBox("Sauce");
		
		jCheckFries = new JCheckBox("Fries");
		
		jCheckSalad = new JCheckBox("Salad");
		
		JLabel lblInstructions = new JLabel("Special Instructions");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Customers", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		GroupLayout gl_mainContentPane = new GroupLayout(mainContentPane);
		gl_mainContentPane.setHorizontalGroup(
			gl_mainContentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainContentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mainContentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnOrder)
							.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_mainContentPane.createSequentialGroup()
									.addGap(30)
									.addGroup(gl_mainContentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_3))
									.addGap(11)
									.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_mainContentPane.createSequentialGroup()
											.addComponent(rbChicken)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(rbLamb)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(rbPork))
										.addGroup(gl_mainContentPane.createSequentialGroup()
											.addComponent(jCheckSauce)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(jCheckFries)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(jCheckSalad))))
								.addGroup(gl_mainContentPane.createSequentialGroup()
									.addComponent(lblInstructions)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_mainContentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE))))
						.addComponent(btnNewButton))
					.addGap(18)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_mainContentPane.setVerticalGroup(
			gl_mainContentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainContentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mainContentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_mainContentPane.createSequentialGroup()
							.addGroup(gl_mainContentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(btnNewButton)
							.addGap(18)
							.addGroup(gl_mainContentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(rbChicken)
								.addComponent(rbPork)
								.addComponent(rbLamb))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_mainContentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(jCheckSauce)
								.addComponent(jCheckFries)
								.addComponent(jCheckSalad))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_mainContentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblInstructions)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnOrder)
							.addGap(15))))
		);
		
		cBoxCustomerName = new JComboBox();
		cBoxCustomerName.setModel(new DefaultComboBoxModel(new String[] {"Person", "Superhero"}));
		cBoxCustomerName.setSelectedIndex(0);
		
		cBoxCustomerName.addActionListener(new ActionListener() {  //POR QUE PUEDE USAR ELEMENTOS DE LA JLIST AQUI? DENTRO DEL ACTIONLISTENER DE COMBOBOX??
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, cBoxCustomerName.getSelectedIndex()); //Muestra 0 o 1 dependeiendo del item que seleccionemos (MODEL)
				JOptionPane.showMessageDialog(null, cBoxCustomerName.getSelectedItem()); //Muestra el propio nonmbre del item seleccionado
				
				//Para devolver los detalles del comboBox model y poder modificarlos (poner o quitar)
				DefaultComboBoxModel customerTypeModel = (DefaultComboBoxModel) cBoxCustomerName.getModel(); //casting
				//Ahora ya podemos empezar a añadir a partir de aqui
				customerTypeModel.addElement("chicken"); //Ahora aparece también CHICKEN en el ComboBox después de presionar cualquier opción (cuando se ejecuta)
	//          customerTypeModel.removeAllElements();     Después de seleccionar el elemento, ya no vuelven a aparecer más
				
			
			}
			
		});
		
		lblCustomerTittle = new JLabel("Title:");
		
		lblCustomersList = new JLabel("Customers List:");
		
		JScrollPane scrollPaneCustomerList = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCustomersList)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPaneCustomerList, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCustomerTittle)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cBoxCustomerName, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCustomerTittle)
						.addComponent(cBoxCustomerName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCustomersList)
						.addComponent(scrollPaneCustomerList, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
					.addGap(85))
		);
		
		listCustomers = new JList();
		listCustomers.setModel(new AbstractListModel() {
			String[] values = new String[] {"Jon O", "Clarke M", "Anne J", "Dany A"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
	
		
		
		
		scrollPaneCustomerList.setViewportView(listCustomers);
		panel.setLayout(gl_panel);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		mainContentPane.setLayout(gl_mainContentPane);
	}
}
