import java.util.*;


public class Condicional_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//vamos a decirle que nos pida la edad por consola, importar java.util
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu edad, por favor");
		int n = scan.nextInt();
		//Seg�n la edad que le digamos, nos va a decir si somos menores o mayores de edad
		if(n>=18){
			//El c�digo que introduzcamos en este if ser� ejecutado por el int�rprete
			// de Java SIEMPRE Y CUANDO edad>=18 sea cierta. Si es falsa, ignorar� lo que
			//hay dentro de if y continuar� la ejecuc�n del programa
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
	}

}
