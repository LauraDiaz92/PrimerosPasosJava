package condicionales_y_bucles;
import javax.swing.*;

public class Bucle_For_Ejercicio_Email {

	public static void main(String[] args) {
		
		// Vamos a comprobar si la dirección de un email tiene más de una arroba

			//boolean arroba = false;  Vamos a cambiar el boolean por un int
			int arroba = 0;
		// Ahora vamos a ver si el email tiene al menos un punto. Para eso creamos otra variable
			boolean punto = false;
		
				String email = JOptionPane.showInputDialog("Introduce tu email");
				
				for ( int i = 0; i < email.length(); i++) {
					// VAMOS A LLEVAR LA VARIABLE DESDE 0 HASTA EL FINAL DEL EMAIL
					
					if (email.charAt(i) == '@') {
						
			//arroba = true;   Vamos a cambiarlo para que vaya sumando 1 cada vez que vea un @
			// sino hay ningún @, se queda con el valor 0 que le dimos al principio
					arroba++;
					
					}
			//Vamos a construir otro IF para ver si tiene un punto
					if (email.charAt(i) == '.') {
						punto = true;
					}
				}
					
					if (arroba == 1 && punto == true) {
						System.out.println("Es correcto");
					} else {
						System.out.println("No es corecto");
					}
				}
		

}


