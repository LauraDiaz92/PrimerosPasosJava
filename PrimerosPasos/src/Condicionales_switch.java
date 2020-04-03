import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condicionales_switch {
	public static void main(String[] args) {
		// Crear un programa que nos diga el �rea de 4 figuras geom�tricas
		// Vamos a utilizar la consola para escoger la figura geom�trica
		// Vamos a utilizar JOptionPane para introducir base, altura y radio
		// En la consola, 1 va a ser cuadrado, 2 rect�ngulo, 3 tri�ngulo y 4 c�rculo
		Scanner scan = new Scanner(System.in);
		System.out.println("Elige una opci�n: \n1: Cuadrado \n2: Rect�ngulo \n3: Tri�ngulo \n4:C�rculo");
		// \n hace un salto de l�nea
		int figura = scan.nextInt();
		// Aqu� vamos a utilizar switch para ver si el usuario introdujo 1, 2, 3 o 4

		switch (figura) {

			case 1:
				double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado"));
				//System.out.print("El �rea del cuadrado es " + Math.pow(lado, 2));
				double area = Math.pow(lado, 2);
				System.out.println("El �rea del cuadrado es " + ((double)Math.round(area * 100d) / 100d));
				//Otra forma de sacar los decimales que queramos 
				//https://es.stackoverflow.com/questions/29408/como-limitar-la-cantidad-de-decimales-de-un-double
				break;
			
			case 2:
				double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base"));
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
				double area_rectangulo = base * altura;
				System.out.println("El �rea del rect�ngulo es " + ((double)Math.round(area_rectangulo * 100d) / 100d));
				break;
			
			case 3:
				// vamos a utilizar las variables "base" y "altura" que usamos anteriormente
				base = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado"));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
				double area_triangulo = (base*altura) / 2;
				System.out.println("El �rea del tri�ngulo es " + ((double)Math.round(area_triangulo * 1000d) / 1000d));
				break;
			
			case 4:
				double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
				System.out.print("El �rea del c�rculo es ");
				System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
				break;
	
			default:
				System.out.println("La opci�n no es correcta");
		}
	}

}
