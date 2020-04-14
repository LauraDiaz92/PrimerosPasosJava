package condicionales_y_bucles;
import javax.swing.JOptionPane;

public class Bucle_For_Prueba_Puntos_Alex {

	public static void main(String[] args) {

		int arroba = 0;

		boolean punto = false;

		boolean puntosInicioFin = false;

		String email = JOptionPane.showInputDialog("Introduce tu email");

		for (int i = 0; i < email.length(); i++) {

			if (email.charAt(i) == '@') {
				arroba++;

			}

			if (email.charAt(i) == '.') {
				punto = true;
			}

			if (email.charAt(email.length() - 1) == '.') {
				puntosInicioFin = true;
			}

			if (email.charAt(0) == '.') {
				puntosInicioFin = true;

			}

		}

		if (arroba == 1 && punto == true && !puntosInicioFin) {
			System.out.println("Es correcto");
		} else {
			System.out.println("No es corecto");
		}
	}

}
