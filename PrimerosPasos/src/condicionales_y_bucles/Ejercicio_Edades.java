package condicionales_y_bucles;
import java.util.*;
public class Ejercicio_Edades {

	public static void main(String[] args) {
		System.out.println("Introduce una edad");
		Scanner scan = new Scanner(System.in);
		int edad = scan.nextInt();
		int paga = 30;
		
		if (edad < 18) {
			System.out.println("A estudiar, te toca " + paga);
			
			
		} else if (edad<65) {
			paga += 50;
			System.out.println("A currar, te toca " + paga);
			
		} else {
			System.out.println("A vivir");
		}
			scan.close();
	}

}
