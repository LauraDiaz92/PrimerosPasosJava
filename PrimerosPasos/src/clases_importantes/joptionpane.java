package clases_importantes;
import javax.swing.*;
public class joptionpane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String respuesta = JOptionPane.showInputDialog("Introduce un n�mero");
        //Ahora vamos a pasar String a Double
		Double numero = Double.parseDouble(respuesta);
		
		
		System.out.print("La ra�z de " + numero + " es ");
		//En lugar de println, hemos usado print porque queremos que el siguiente mensaje
		//lo imprima a continuaci�n de este
		System.out.printf("%1.2f", Math.sqrt(numero));
	}

}
