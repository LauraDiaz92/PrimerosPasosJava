package ejercicios_poo;
import javax.swing.*;
/*
[X]Crea un array de Passwords con el tamaño que tu le indiques por teclado.
[X]Crea un bucle que cree un objeto para cada posición del array.
[x]Indica también por teclado la longitud de los Passwords (antes de bucle).
[ ]Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte 
(usa el bucle anterior).
[ ]Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
contraseña1 valor_booleano1

contraseña2 valor_bololeano2*/

public class ContraseñaMain {

	public static void main(String[] args) {
		
		
		// crear un array de Passwords con el tamaño que yo quiera (indicarlo por teclado)
		
		Contraseña [] misContraseñas = new Contraseña [4];
		
		misContraseñas [0] = new Contraseña ();
		misContraseñas [1] = new Contraseña ();
		misContraseñas [2] = new Contraseña ();
		misContraseñas [3] = new Contraseña ();
	
		
		//int x = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nº de caracteres de tu contraseña"));
		
		for (int i = 0; i < misContraseñas.length; i++) {
			// setlongitud con lo que dice el usuario
			misContraseñas[i].setLongitud(x);
			
			misContraseñas[i].actualizaContraseña();
		}
		
		for (int i = 0; i < misContraseñas.length; i++) {
			
			//System.out.println("Contraseña " + (i + 1) + ": " + misContraseñas[i].getContraseña());
		}
		
				
		//Crear un bucle que cree un objeto para cada posición del array. ¡¡¡OTRA FORMA DE HACERLO!!!
		
		//Contraseña [] misContraseñas = new Contraseña [4];
		
		for (int i = 0; i < misContraseñas.length; i++) {
			misContraseñas[i] = new Contraseña();
			misContraseñas[i].actualizaContraseña();
			System.out.println("Contraseña " + (i + 1) + ": " + misContraseñas[i].getContraseña());
		
		
		}
	}

}
