import java.util.*;

public class Bucles_AdivinaN�mero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// El programa va a generar un n�mero entero aleatorio entre 0 y 100 y vamos a
		// adivinarlo
		// Se usa Math.random y devuelve un Double entre 0 y 1
		// Por lo tanto, tenemos que desplazar la coma dos posiciones a la derecha
		int aleatorio = (int) (Math.random() * 100);
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		
		while (numero != aleatorio) {
			intentos++;
			System.out.println("Introduce un n�mero, por favor");
			numero = scan.nextInt();
			
			if (numero > aleatorio) {
				System.out.println("M�s bajo");
			} else if (numero < aleatorio) {
				System.out.println("M�s alto");
			} else {
				System.out.println("Correcto en " + intentos + " intentos");
				
			}
		}
		
		scan.close();
		

	}

}
