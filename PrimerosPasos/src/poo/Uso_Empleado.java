package poo;

import java.util.*;

//vamos a crear 2 clases en un único fichero. Por lo tanto, solo una de estas clases puede ser pública y tener el 
//método main, ya que la ejecución del programa empieza siempre por el main de la clase pública

public class Uso_Empleado {

	public static void main(String[] args) {

		//en JAVA no se puede crear un ARRAY con distintos tipos de datos (todos STRING O TODOS INT, etc).
		//Sin embargo, lo estamos haciendo porque hemos creado una clase "Empleado" y llamamos a esa clase
		
		Empleado[] misEmpleados = new Empleado[3];
		
		misEmpleados[0] = new Empleado("Laura Diaz", 85000, 2020,2,30);
		misEmpleados[2] = new Empleado("Jon Snow", 43000, 2018,10,3);
		misEmpleados[1] = new Empleado("Ana Lopez", 68000, 2010,12,3);
		
		//PRINCIPIO DE SUSTITUCIÓN
		Empleado director_comercial = new Jefatura("Lau", 40000, 2018,6,14);
		
		//Una vez hecho esto se puede utilizar la instrucción INSTANCEOF (comprobar si una instancia pertenece
		//a una clase o no).
		if (director_comercial instanceof Empleado) {
			
			System.out.println("Es de tipo Jefatura");
		}
		
		////Ahora vamos a llamar al método de la interfaz estableceBonus
		System.out.println("El empleado " + misEmpleados[1].dameNombre() + " tiene un bonus de " +
		misEmpleados[1].estableceBonus(250.60));
		
		
				
		//ORDENAR LA MATRIZ:
		
		int control = 0;
		do {
			for (int i =  1; i < misEmpleados.length; i++) {
				control = 0;
				if (misEmpleados[i-1].dameSueldo() > misEmpleados[i].dameSueldo()) {
					Empleado x = misEmpleados[i-1];
					misEmpleados[i-1] = misEmpleados[i];
					misEmpleados[i] = x;
					control++;
				}
			}
		} while (control != 0);
	
		 //Ahora vamos a subirles el suelo a todos un 5%. FOR para recorrer el Array

		for (int i = 0; i < misEmpleados.length; i++) {

			misEmpleados[i].subeSueldo(5);
		}

		// Vamos a usar otro bucle FOR para que nos imprima el pantalla a cada uno de
		// los empleados

		for (int i = 0; i < misEmpleados.length; i++) {

			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + 
			misEmpleados[i].dameSueldo() + " Fecha de alta : " + misEmpleados[i].dameFechaContrato());
		}
		
		
		Jefatura jefe_RRHH = new Jefatura("Laura", 25000, 1992, 10, 04);
		
		jefe_RRHH.estableceIncentivo(200.50);
		
		System.out.println(jefe_RRHH.toString());
		
		//Ahora vamos a llamar al método de la interfaz jefes (tomar decisiones)
		System.out.println(jefe_RRHH.tomarDecisiones("Contratar personal"));
		//Ahora vamos a llamar al método de la interfaz estableceBonus
		System.out.println("El jefe de RRHH: " + jefe_RRHH.dameNombre() + " tiene un bonus de " 
		+ jefe_RRHH.estableceBonus(432));
		

	}
}



class Empleado implements bonusInterfazUsoEmpleado {
	private String nombre;
	private double sueldo;
	private Date altaContrato; // construye una fecha con el día, el mes y el año. Pertenece a java.util.

	public double estableceBonus(double bonus) {
		
		return bonusInterfazUsoEmpleado.bonus_base + bonus;
		
	}
	
	public Empleado(String name, double salary, int year, int month, int day) {
		nombre = name;
		sueldo = salary;
		GregorianCalendar calendario = new GregorianCalendar(year, month - 1, day);
		// getTime es uno de los métodos de GregorianCalendar
		altaContrato = calendario.getTime();
		
	}

	public Empleado(String nombre) { 
			this(nombre, 3000, 2000, 01, 01);
	}
	
	
	public void subeSueldo(double porcentaje) { 

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




class Jefatura extends Empleado implements jefesInterfazUsoEmpleado {
	
	//IMPLEMENTAMOS EL MÉTODO DE LA INTERFAZ JEFES
	public String tomarDecisiones(String decision) { //?????????
		
		return "Un miembro de la dirección ha tomado la decisión de: " + decision; //??????
	}
	
	public double estableceBonus(double bonus) {  //?????????
		double prima = 2000;
		return bonusInterfazUsoEmpleado.bonus_base + bonus + prima; //???????
		//bonus base = 1500 + bonus que le pasemos por parámetro + prima
		
	}
	
	
	public Jefatura (String name, double salary, int year, int month, int day) {
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
	public double dameSueldo() {  //El mismo nombre que el otro método dameSueldo. En este caso. 
		//lo sobreescribe. Es decir, para jefatura, invalida el método anterior de dameSueldo y se
		//queda con este
		double sueldojefe = super.dameSueldo(); //Llama al método de la clase padre
		return sueldojefe + incentivo;
		
	}

	@Override
	public String toString() {
		return "Jefatura [incentivo=" + incentivo + "]";
	}

}





