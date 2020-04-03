import java.util.*;


public class Condicional_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//vamos a decirle que nos pida la edad por consola, importar java.util
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu edad, por favor");
		int n = scan.nextInt();
		//Según la edad que le digamos, nos va a decir si somos menores o mayores de edad
		if(n>=18){
			//El código que introduzcamos en este if será ejecutado por el intérprete
			// de Java SIEMPRE Y CUANDO edad>=18 sea cierta. Si es falsa, ignorará lo que
			//hay dentro de if y continuará la ejecucón del programa
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
	}

}
