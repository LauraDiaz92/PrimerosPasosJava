import javax.swing.*;

public class EntradaDeDatos2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		String s2 = JOptionPane.showInputDialog("Introduce tu edad, por favor");
		// El método showInputDialog nos devuelve un String, de modo que no podemos
		// almacenar la
		// variable como int, asi, que, aunque sea un numero, la almacenamos como
		// String, pero eso nos
		// va a dar un error a continuación

		int n = Integer.parseInt(s2);
		System.out.println("Hola, " + s + ". El año que viene tendrás " + (n + 1) + " años.");
		// Este es el error: (s2+1), ya que hemos declarado la variable como String
		// (la que hace referencia a la edad). Por lo tanto, al interpretarlo como un
		// texto,
		// concatena (s2+1), en lugar de sumarlo.

		// Por lo tanto, lo que hay que hacer es convertir el String a un valor
		// numérico, esto se hace con
		// el método parseInt ();, perteneciente a la clase Integer (java.lang). Al ser
		// un método estático,
		// hay que escribir el nombre de la clase delante del método
		// Integer.parseIint();

		// también podemos declarar la variable s2++; y quitar el +1 a n. Así, está
		// sumándole uno antes
		// de imprimirlo
	}

}
