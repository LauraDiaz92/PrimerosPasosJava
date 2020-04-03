import javax.swing.*;

public class EntradaDeDatos2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		String s2 = JOptionPane.showInputDialog("Introduce tu edad, por favor");
		// El m�todo showInputDialog nos devuelve un String, de modo que no podemos
		// almacenar la
		// variable como int, asi, que, aunque sea un numero, la almacenamos como
		// String, pero eso nos
		// va a dar un error a continuaci�n

		int n = Integer.parseInt(s2);
		System.out.println("Hola, " + s + ". El a�o que viene tendr�s " + (n + 1) + " a�os.");
		// Este es el error: (s2+1), ya que hemos declarado la variable como String
		// (la que hace referencia a la edad). Por lo tanto, al interpretarlo como un
		// texto,
		// concatena (s2+1), en lugar de sumarlo.

		// Por lo tanto, lo que hay que hacer es convertir el String a un valor
		// num�rico, esto se hace con
		// el m�todo parseInt ();, perteneciente a la clase Integer (java.lang). Al ser
		// un m�todo est�tico,
		// hay que escribir el nombre de la clase delante del m�todo
		// Integer.parseIint();

		// tambi�n podemos declarar la variable s2++; y quitar el +1 a n. As�, est�
		// sum�ndole uno antes
		// de imprimirlo
	}

}
