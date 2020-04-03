import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condicionales_switch {
	public static void main(String[] args) {
		// Crear un programa que nos diga el área de 4 figuras geométricas
		// Vamos a utilizar la consola para escoger la figura geométrica
		// Vamos a utilizar JOptionPane para introducir base, altura y radio
		// En la consola, 1 va a ser cuadrado, 2 rectángulo, 3 triángulo y 4 círculo
		Scanner scan = new Scanner(System.in);
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4:Círculo");
		// \n hace un salto de línea
		int figura = scan.nextInt();
		// Aquí vamos a utilizar switch para ver si el usuario introdujo 1, 2, 3 o 4

		switch (figura) {

			case 1:
				double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado"));
				//System.out.print("El área del cuadrado es " + Math.pow(lado, 2));
				double area = Math.pow(lado, 2);
				System.out.println("El área del cuadrado es " + ((double)Math.round(area * 100d) / 100d));
				//Otra forma de sacar los decimales que queramos 
				//https://es.stackoverflow.com/questions/29408/como-limitar-la-cantidad-de-decimales-de-un-double
				break;
			
			case 2:
				double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base"));
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
				double area_rectangulo = base * altura;
				System.out.println("El área del rectángulo es " + ((double)Math.round(area_rectangulo * 100d) / 100d));
				break;
			
			case 3:
				// vamos a utilizar las variables "base" y "altura" que usamos anteriormente
				base = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado"));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
				double area_triangulo = (base*altura) / 2;
				System.out.println("El área del triángulo es " + ((double)Math.round(area_triangulo * 1000d) / 1000d));
				break;
			
			case 4:
				double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
				System.out.print("El área del círculo es ");
				System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
				break;
	
			default:
				System.out.println("La opción no es correcta");
		}
	}

}
