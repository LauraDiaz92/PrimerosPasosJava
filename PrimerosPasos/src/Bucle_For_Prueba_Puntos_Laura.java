import javax.swing.*;

public class Bucle_For_Prueba_Puntos_Laura {

	public static void main(String[] args) {

		int arroba = 0;

		boolean punto = false;
		
		boolean puntoprincipio = false;
		boolean puntofinal = false;

		String email = JOptionPane.showInputDialog("Introduce tu email");

		for (int i = 0; i < email.length(); i++) {
			
			/*System.out.println("caracter " + i + " es " + email.charAt(i));
			System.out.println("length devuelve " + email.length());
			 */
			if (email.charAt(i) == '@') {
				arroba++;

				//System.out.println(email.length() - 1);
			}

			if (email.charAt(i) == '.') {
				punto = true;
			}
			
			//Que de error si el punto se encuentra en la última posición del email
			if (email.charAt(email.length()-1) == '.') {
				puntofinal = true;
			}
			
			//	Que de error si el punto se encuentra en la primera posición del email
			if (email.charAt(0) == '.') {
				puntoprincipio = true;
				
			}
			
		}
		

		if (arroba == 1 && punto == true && puntofinal != true && puntoprincipio != true) {
			System.out.println("Es correcto");
		} else {
			System.out.println("No es corecto");
		}
	}

}
