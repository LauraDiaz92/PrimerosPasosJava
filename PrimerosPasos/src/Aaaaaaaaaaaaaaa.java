import java.util.*;

public class Aaaaaaaaaaaaaaa {

	public static void main(String[] args) {

		System.out.println("Empezamos");
		int aleatorio = (int) (Math.random() * 100);
		System.out.println(aleatorio);
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int intentos = 0;

		while (num != aleatorio) {
			intentos++;
			System.out.println("Introduce un número");
			num = scan.nextInt();
			if (num > aleatorio) {
				System.out.println("Más bajo");

			} else if (num < aleatorio) {
				System.out.println("Más alto");

			} else {
				System.out.println("Correcto " + " en " + intentos + " intentos");
			}
		}
		
		scan.close();
	}

}
