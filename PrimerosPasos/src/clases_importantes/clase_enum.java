package clases_importantes;

import java.util.*;

public class clase_enum {

	/*
	 * Cuando creemos un tipo enumerado no podemos hacerlo dentro del main.
	 * 
	 * enum talla {MINI, MEDIANO, GRANDE, MUY_GRANDE}; Almacenar valores en una
	 * variable, pero no queremos que en el futuro se almacenen más valores o se
	 * cambien los existentes
	 * 
	 * String talla; talla = "pequeña"; talla = "mediana"; talla = "grande"; talla =
	 * "azul"; ???? Hay que crear una variable donde nos aseguremos de que sólo se
	 * pueden almacenar un único tipo de valores
	 * 
	 * talla s = talla.MINI; talla m = talla.MEDIANO;
	 */
	// EJEMPLO con un CONSTRUCTOR:

	enum talla {

		MINI("S"), MEDIANO("M"), GRANDE("L"), EXTRAGRANDE("XL");

		private String abreviatura;
		
		private talla(String abreviatura) {  //Aquí ya hemos llamado al constructor enum talla
			this.abreviatura = abreviatura;
		
		//Hemos puesto el constructor como PRIVATE porque los enumerados no permiten la creación de objetos
		//No se puede crear una instancia de un enumerado (talla mitalla = new talla ...) NO LO ADMITE.
		//Entonces, el constructor debe ser private para que no se pueda invocar desde fuera

		}
		
		public String dame_abreviatura() { //el GETTER si tiene que ser publico
			return abreviatura;
			
		}

	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe una talla : MINI, MEDIANO, GRANDE, MUY GRANDE");
		String entradadatos = scan.next().toUpperCase(); //Metodo para pasar a mayusculas
		
		//Ahora vamos a usar el metodo VAUEOF de la clase enum
		
		talla latalla = Enum.valueOf(talla.class, entradadatos);
		
		System.out.println("Talla = " + latalla);
		
		//Ahora para obtener la abreviatura vamos a usar el método GETTER
		System.out.println("Abreviatura = " + latalla.dame_abreviatura());

		scan.close();
	}
	

}
