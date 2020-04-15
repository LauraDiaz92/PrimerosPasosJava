package poo;

import java.util.*;

//vamos a crear 2 clases en un �nico fichero. Por lo tanto, solo una de estas clases puede ser p�blica y tener el 
//m�todo main, ya que la ejecuci�n del programa empieza siempre por el main de la clase p�blica

public class Uso_Empleado {

	public static void main(String[] args) {

		// Ahora vamos a construir una clase que nos construya al empleado
		// Propiedades que va a tener el objeto empleado son: Nombre, Sueldo y Fecha de alta

		class Empleado {
			private String nombre;
			private double sueldo;
			private Date altaContrato; // la clase Date pertenece a la clase java.util

			// Vamos a crear un m�todo constructor con par�metros. El m�todo constructor tiene que tener siempre el
			//  modificador de acceso public para que sea accesible desde otras clases.
			public Empleado(String name, double salary, int year, int month, int day) {
				nombre = name;
				sueldo = salary;
				/* GregorianCalendar construye una fecha con el d�a, el mes y el a�o. Pertenece a java.util 
				 Es de tipo int, por lo tanto, devuelve un enteros. Para los meses empieza a
				 contar desde 0. Por ejemplo, Enero 0 ; Febrero 1 .....
				 Este es el constructor de tipo GregorianCalendar:*/
				GregorianCalendar calendario = new GregorianCalendar(year, month - 1, day);
				// getTime es uno de los m�todos de GregorianCalendar
				altaContrato = calendario.getTime();
			}
			
			//Vamos a crear un m�todo  SETTER  que suba un % el sueldo:
			public void subeSueldo(double pocentaje) {
				
			}
			
			

			
			public String dameNombre() {  //GETTER
				
				return nombre;
			}
			
			public double dameSueldo() {  //GETTER
				
				return sueldo;
			}
			
			public Date dameFechaContrato() {  //GETTER
				
				return altaContrato;
			}
		}
	}
}
