
import java.util.*;

public class EntradaDeDatos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Ya tenemos la variable o el objeto creado - "entrada"
		// Ya tenemos el CONSTRUCTOR - Scanner (System.in)
		// Ahora tenemos que especificarle qu� tipo de dato es el que vamos a introducir
		// en consola (System.in)
		// para poder almacenarlo en una variable. Es aqui donde entran en juego los
		// m�todos
		// nextLine(), nextInt() y nextDouble()
		System.out.println("Introduce tu nombre");
		String s = scan.nextLine();
		// Con esta instrucci�n conseguimos que la consola del sistema se quede a la
		// espera de que
		// utilicemos un valor de tipo String y cuando lo introduzcamos lo almacenar�
		// detro de nombre_usuario
		System.out.println("Introduce edad");
		int n = scan.nextInt();
		// Con esto conseguimos que la consola (entrada) se quede a la espera de que el
		// usuario introduzca
		// un entero, y cuando lo introduzca lo almacenar� dentro de la variable "edad"
		System.out.println("Hola, " + s + ". El a�o que viene tendr�s " + (n + 1) + " a�os.");

	}

}
