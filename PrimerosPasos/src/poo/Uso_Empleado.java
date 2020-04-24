package poo;

import java.util.*;

//vamos a crear 2 clases en un único fichero. Por lo tanto, solo una de estas clases puede ser pública y tener el 
//método main, ya que la ejecución del programa empieza siempre por el main de la clase pública

public class Uso_Empleado {

	public static void main(String[] args) {

		/* HEMOS ESCRITO MUCHO CÓDIGO, POR LO QUE VAMOS A CREAR UN ARRAY PARA ALMACENAR
		 A LOS EMPLEADOS
		  
		  Empleado empleado1 = new Empleado("Laura Diaz", 85000, 2020, 2, 30); 
		  Empleado empleado2 = new Empleado("Ana Lopez", 68000, 2010, 12, 3); 
		  Empleado empleado3 = new Empleado("Jon Snow", 43000, 2018, 10, 3);
		  
		  empleado1.subeSueldo(10); empleado2.subeSueldo(15);
		  
		  System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " +
		  empleado1.dameSueldo() + " fecha de alta: " + empleado1.dameFechaContrato());
		  System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " +
		  empleado2.dameSueldo() + " fecha de alta: " + empleado2.dameFechaContrato());
		  
		 NUEVA FORMA DE HACERLO: CÓDIGO ALTERNATIVO, ARRAY. Este array va a tener 3
		 posiciones para almacenar a los 3 empleados. UN ARRAY DE UNA CLASE CONCRETA
		 */

		Empleado[] misEmpleados = new Empleado[3];

		misEmpleados[0] = new Empleado("Laura Diaz", 85000, 2020, 2, 30);
		misEmpleados[1] = new Empleado("Ana Lopez", 68000, 2010, 12, 3);
		misEmpleados[2] = new Empleado("Jon Snow", 43000, 2018, 10, 3);
		
		 //en JAVA no se puede crear un ARRAY con distintos tipos de datos (todos STRING O TODOS INT, etc).
		 //Sin embargo, lo estamos haciendo porque hemos creado una clase "Empleado" y llamamos a esa clase
		
		 //Ahora vamos a subirles el suelo a todos un 5%. Al estar dentro de un array,
		 //necesitaremos un FOR para que lo recorra empleado por empleado

		for (int i = 0; i < misEmpleados.length; i++) {

			misEmpleados[i].subeSueldo(5);
		}

		// Vamos a usar otro bucle FOR para que nos imprima el pantalla a cada uno de
		// los empleados

		for (int i = 0; i < misEmpleados.length; i++) {

			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + 
			misEmpleados[i].dameSueldo() + " Fecha de alta : " + misEmpleados[i].dameFechaContrato());
		}

	}
}

class Empleado {
	private String nombre;
	private double sueldo;
	private Date altaContrato; // la clase Date pertenece a la clase java.util

	
	public Empleado(String name, double salary, int year, int month, int day) {
		nombre = name;
		sueldo = salary;
		/*
		 * GregorianCalendar construye una fecha con el día, el mes y el año. Pertenece a java.util.
		 * Devuelve un enteros. Para los meses: Enero 0 ; Febrero 1 ...
		 */
		GregorianCalendar calendario = new GregorianCalendar(year, month - 1, day);
		// getTime es uno de los métodos de GregorianCalendar
		altaContrato = calendario.getTime();
		
		public Empleado(String nombre) {
			this(name, 3000, 2000,01,01);
		}
		
		//++IdSiguiente;
		//Id = IdSiguiente;
	}

	public void subeSueldo(double porcentaje) { // SETTER

		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
		// Pasarle un valor de tipo dobule que va a ser PORCENTAJE. Por ejemplo, subeSueldo(5).
		// Ese 5 se almacena en PORCENTAJE. Después creamos una variable: AUMENTO.
		// double aumento = sueldo (ya está establecido en el constructor) * 5 / 100
		// 5 / 100 = 0.05, es decir, el 5 por ciento. TOTAL = MULTIPILCAR EL SUELDO POR 0.05
		// sueldo += aumento = INCREMENTA el aumento al sueldo
	}

	public String dameNombre() { // GETTER

		return nombre;
	}

	public double dameSueldo() { // GETTER

		return sueldo;
	}

	public Date dameFechaContrato() { // GETTER

		return altaContrato;
	}
}
