package condicionales_y_bucles;
import javax.swing.*;
public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vamos a crear el acceso a una aplicación que nos pide una contraseña con JOptionPane
		String clave = "laura123";
		String contraseña = "";
		
		
		while (!clave.equals(contraseña)) {
			contraseña = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if (clave.equals(contraseña)==false) {
				System.out.println("Contraseña incorrecta");
				JOptionPane.showMessageDialog(null,"Incorrecta");
			}
		}
		
		System.out.println("Contraseña correcta, acceso permitido");
		
	}

}
