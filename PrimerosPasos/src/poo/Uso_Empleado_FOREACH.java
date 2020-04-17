package poo;

public class Uso_Empleado_FOREACH {

	public static void main(String[] args) {

		/*
		 * Voy a copiar la MATRIZ del ejercicio USO_EMPLEADO, que está resulta con el
		 * bucle FOR. Vamos a convertir un bucle FOR a FOR EACH. Empleado []
		 * misEmpleados = new Empleado [3];
		 */

		Empleado[] misEmpleados = new Empleado[3];

		misEmpleados[0] = new Empleado("Laura Diaz", 85000, 2020, 2, 30);
		misEmpleados[1] = new Empleado("Ana Lopez", 68000, 2010, 12, 3);
		misEmpleados[2] = new Empleado("Jon Snow", 43000, 2018, 10, 3);

		/*
		 * for (int i = 0; i < misEmpleados.length; i++) {
		 * 
		 * misEmpleados[i].subeSueldo(5); 
		 */
		
		//Dentro del FOR tilizamos la clase EMPLEADO y creamos una variable que se va a llamar e. 
		for (Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}

		/*for (int i = 0; i < misEmpleados.length; i++) {

			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo()
					+ " Fecha de alta : " + misEmpleados[i].dameFechaContrato());*/
		
		//Vamos a hacer lo mismo con el segundo bucle FOR
		
		for (Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo()
					+ " Fecha de alta : " + e.dameFechaContrato());
		}

	}

}
