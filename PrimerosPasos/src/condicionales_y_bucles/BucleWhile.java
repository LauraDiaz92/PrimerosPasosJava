package condicionales_y_bucles;
import javax.swing.*;
public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vamos a crear el acceso a una aplicaci�n que nos pide una contrase�a con JOptionPane
		String clave = "laura123";
		String contrase�a = "";
		
		
		while (!clave.equals(contrase�a)) {
			contrase�a = JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			
			if (clave.equals(contrase�a)==false) {
				System.out.println("Contrase�a incorrecta");
				JOptionPane.showMessageDialog(null,"Incorrecta");
			}
		}
		
		System.out.println("Contrase�a correcta, acceso permitido");
		
	}

}
