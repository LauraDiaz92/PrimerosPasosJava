package clases_importantes;

import java.util.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class clase_Arrays {

	public static void main(String[] args) {
		
		// Vamos a ordenar un array con esta clase - método array sort
		// Nuestro array no es de tipo String, ni int, ni double ni char... es de tipo EMPLEADO. Por lo 
		//tanto, hay que buscar un tipo sort que nos permita ordenar objetos
		//En la API : All elements in the array must implement the Comparable interface.   ESTÁ OBLIGANDO A
		//QUE LA CLASE EMPLEADO IMPLEMENTE LA INTERFAZ COMPARABLE. Es una interfaz predefinida. En esta
		//interfaz hay un método: compare to(T o). T = tipo de objeto que se incluye en la comparación
		//compare to = Compares this object with the specified object for order. Returns a negative integer, 
		//zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
		
		Emple[] misEmpleados = new Emple[4];

		misEmpleados[0] = new Emple("Laura Diaz", 85000, 2020, 2, 30);
		misEmpleados[1] = new Emple("Ana Lopez", 68000, 2010, 12, 3);
		misEmpleados[2] = new Emple("Jon Snow", 43000, 2018, 10, 19);
		misEmpleados[3] = new Emple("Jon Snow", 84333, 2011, 17, 8);
		
		//PRINCIPIO DE SUSTITUCIÓN CON LA INTERFAZ: creamos una instancia (ejemplo) perteneciente a la interfaz
		//pero a la hora de instanciarla hay que decirle que es de tipo empleado
		Comparable ejemplo= new Emple("Ana", 27000, 2006,11,8);
		
		//Una vez hecho esto se puede utilizar la instrucción INSTANCEOF (comprobar si una instancia pertenece
		//a una interfaz o no).
		
		if (ejemplo instanceof Comparable) {
			
			System.out.println("La interfaz ejemplo es de tipo Comparable");
		}		
		
		System.out.println("---------" + misEmpleados[0].compareTo(misEmpleados[1]));
		
		for (int i = 0; i < misEmpleados.length; i++) {

			misEmpleados[i].subeSueldo(5);
		}

		//ANTES DE IMPRIMIRLO VAMOS A DECIRLE QUE LO ORDENE
		
		Arrays.sort(misEmpleados);
		
		for (int i = 0; i < misEmpleados.length; i++) {

			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + 
			misEmpleados[i].dameSueldo() + " Fecha de alta : " + misEmpleados[i].dameFechaContrato());
		}
		
		
		Jefe jefe_RRHH = new Jefe("Laura", 25000, 1992, 10, 04);
		
		jefe_RRHH.estableceIncentivo(200.50);
		
		System.out.println(jefe_RRHH.toString());

	}
}
	
	class Emple implements Comparable{
		
		//Al implementar la intefaz comparable tenemos que implementar también su método: compare to:
		
		public int compareTo(Object miObjeto) {
			//En lugar de esrcibir compareTO(Emple, otroEmple) es mejor utilizar la clase cósmica 
			//compareTo(Object, miObjeto) y luego hacer un casting.
			//Va a recibir un parámetro de tipo objeto, pero hay que hacer un casting ya que queremos un
			//objeto de tipo empleado
			Emple otroEmple = (Emple) miObjeto;
			if(this.sueldo < otroEmple.sueldo) {
				return -1;
			} else if(this.sueldo > otroEmple.sueldo) {
				return 1;
			} else  {
				return 0;
			}
		}
		
		private String nombre;
		private double sueldo;
		private Date altaContrato; // la clase Date pertenece a la clase java.util

		
		public Emple(String name, double salary, int year, int month, int day) {
			nombre = name;
			sueldo = salary;
			GregorianCalendar calendario = new GregorianCalendar(year, month - 1, day);
			altaContrato = calendario.getTime();
			
		}

		public Emple(String nombre) { 
				this(nombre, 3000, 2000, 01, 01);
		}

		
		
		public void subeSueldo(double porcentaje) { 

			double aumento = sueldo * porcentaje / 100;
			sueldo += aumento;
			
		}

		public String dameNombre() { 

			return nombre;
		}

		public double dameSueldo() { 

			return sueldo;
		}

		public Date dameFechaContrato() { 

			return altaContrato;
		}
		
	}

	class Jefe extends Emple {
		
		public Jefe (String name, double salary, int year, int month, int day) {
			super(name, salary, year, month, day);
		}
		
		private double incentivo;
		
		public void estableceIncentivo(double d) {
			incentivo = d;
		}
		
		/**
		 * @return the incentivo
		 */
		@Override
		public double dameSueldo() {  
			double sueldojefe = super.dameSueldo(); 
			return sueldojefe + incentivo;
			
		}

		@Override
		public String toString() {
			return "Jefe [incentivo=" + incentivo + "]";
		}

	}


