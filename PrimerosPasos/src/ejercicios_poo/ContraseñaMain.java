package ejercicios_poo;
import javax.swing.*;
/*
[X]Crea un array de Passwords con el tama�o que tu le indiques por teclado.
[X]Crea un bucle que cree un objeto para cada posici�n del array.
[x]Indica tambi�n por teclado la longitud de los Passwords (antes de bucle).
[ ]Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte 
(usa el bucle anterior).
[ ]Al final, muestra la contrase�a y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
contrase�a1 valor_booleano1

contrase�a2 valor_bololeano2*/

public class Contrase�aMain {

	public static void main(String[] args) {
		
		
		// crear un array de Passwords con el tama�o que yo quiera (indicarlo por teclado)
		
		Contrase�a [] misContrase�as = new Contrase�a [4];
		
		misContrase�as [0] = new Contrase�a ();
		misContrase�as [1] = new Contrase�a ();
		misContrase�as [2] = new Contrase�a ();
		misContrase�as [3] = new Contrase�a ();
	
		
		//int x = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n� de caracteres de tu contrase�a"));
		
		for (int i = 0; i < misContrase�as.length; i++) {
			// setlongitud con lo que dice el usuario
			misContrase�as[i].setLongitud(x);
			
			misContrase�as[i].actualizaContrase�a();
		}
		
		for (int i = 0; i < misContrase�as.length; i++) {
			
			//System.out.println("Contrase�a " + (i + 1) + ": " + misContrase�as[i].getContrase�a());
		}
		
				
		//Crear un bucle que cree un objeto para cada posici�n del array. ���OTRA FORMA DE HACERLO!!!
		
		//Contrase�a [] misContrase�as = new Contrase�a [4];
		
		for (int i = 0; i < misContrase�as.length; i++) {
			misContrase�as[i] = new Contrase�a();
			misContrase�as[i].actualizaContrase�a();
			System.out.println("Contrase�a " + (i + 1) + ": " + misContrase�as[i].getContrase�a());
		
		
		}
	}

}
