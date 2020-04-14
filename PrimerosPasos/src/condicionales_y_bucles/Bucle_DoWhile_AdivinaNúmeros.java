package condicionales_y_bucles;
import java.util.*;

public class Bucle_DoWhile_AdivinaNúmeros {

	public static void main(String[] args) {

		int aleatorio = (int) (Math.random() * 100);
		//Imaginemos que random nos da 0,00000232. Aunque desplacemos la coma dos lugares, seguiría siendo 0,00032
		//Si pasamos este valor a entero nos quedamos con el número 0. Hay escasas posibilidades, pero puede ocurrir
		//Por lo tanto, en el WHILE no llegaría a ejecutarse. while numero != aleatorio
		//La solución es transformar el WHILE en DO WHILE
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;

		do {
			intentos++;
			System.out.println("Introduce un número, por favor");
			numero = scan.nextInt();

			if (numero > aleatorio) {
				System.out.println("Más bajo");
			} else if (numero < aleatorio) {
				System.out.println("Más alto");
			} else {
				System.out.println("Correcto en " + intentos + " intentos");

			}
		} while (numero != aleatorio);

		scan.close();

	}

}
