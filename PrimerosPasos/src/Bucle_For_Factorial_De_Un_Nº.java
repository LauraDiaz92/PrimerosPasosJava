import javax.swing.*;
public class Bucle_For_Factorial_De_Un_Nº {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//El factorial de un número se representa asi = 6!  4!  9!
		// Es el número multiplicado por todos los que le preceden   4! = 4*3 = 12 * 2 =24 *1 = 24

		
		int resultado = 1;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		
		for (int i = numero; i > 0; i--) {
			resultado = resultado * i;
			
			// int resultado = 1 porque la primera vez que ejecute el bucle, el número que obtenga lo va a multiplicar
			//por 1, y ese numero pasara a ser la variable resultado en esa primera vuelta
		}
		
		System.out.println("El factorial de " + numero + " es " + resultado);
		
		//Si le pedimos el factorial de un número grande va a hacer cosas extrañas, por ejemplo, poner el número en
		//negativo o en 0, ya que la variable int no puede con números tan grandes. Eesto se puede solucionar
		//declarando la variable resultado como long
		}

}
