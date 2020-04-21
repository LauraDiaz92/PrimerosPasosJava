package miEjercicio;
import java.util.*;

// extends Persona se refiere a la clase de la que hereda
public class Empleados extends Persona {

	private double salario;
	private String fechaAlta;
	private String puesto;
	
	private static final double SALARIO_DEF = 25000;
	private static final String PUESTO_DEF = "Empleaso base";
	private static final String FECHA_ALTA_DEF = "20/12/2010";
	
	
	
	public Empleados(String nombre, String direccion, int edad) {
		this(SALARIO_DEF, FECHA_ALTA_DEF, nombre, direccion, edad, PUESTO_DEF);
	}
	
	public Empleados(double salario, String fechadealta, String nombre, String direccion, int edad, String puesto) {
		
		// Las variables nombre direccion y edad vienen heredadas de persona, por lo tanto, se meten dentro del
		//SUPER en el orden en el que estén en la otra clase
		super(nombre, direccion, edad);
		this.salario = salario;
		this.fechaAlta = fechadealta;
		this.puesto = puesto;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}


	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	/**
	 * @return the fechaAlta
	 */
	public String getFechaAlta() {
		return fechaAlta;
	}

	@Override
	public String toString() {
		return "Empleados [salario=" + salario + ", fechaAlta=" + fechaAlta + ", puesto=" + puesto + ", toString()="
				+ super.toString() + "]";
	}

	
}
