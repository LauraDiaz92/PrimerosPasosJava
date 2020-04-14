package condicionales_y_bucles;
import javax.swing.*;

public class Bucle_DoWhile_PesoIdeal {

	public static void main(String[] args) {
		// Programa que nos diga cual es nuestro peso ideal en función de nuestro género
		// y nuestra altura
		// Se supone que el peso idea se calcula así: hombre = altura en cm - 110 mujer = altura en cm - 120

		String genero = "";

		do {
			genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");

		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		int pesoideal = 0;

		if (genero.equalsIgnoreCase("H")) {
			pesoideal = altura - 110;

		} else if (genero.equalsIgnoreCase("M")) {
			pesoideal = altura - 120;

		}

		System.out.println("Tu peso ideal es " + pesoideal + " kilos");

	}

}
