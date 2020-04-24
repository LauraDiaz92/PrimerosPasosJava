package miEjercicio;

public class Persona {
	
	//Aquí vamos a utilizar la HERENCIA. 
	// La clase EMPLEADOS y la clase CLIENTES comparten atributos comunes por el hecho de ser personas (nombre,
	//edad, y dirección. Estos atributos los van a heredar de esta clase llamada PERSONA. 
	
	private String nombre;
	private String direccion;
	private int edad;
	
	/**
	 * @param nombre {String} Nombre de la persona
	 * @param dirección {String} Dirección de la persona
	 * @param edad  {int} Edad de la persona
	 */
	public Persona(String nombre, String direccion, int edad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
	}

	/**
	 * @return the nombre {String} Nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set {String} Nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion {String} Dirección de la persona
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param dirección the direccion to set {String} Dirección de la persona
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the edad {int} Edad de la persona
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set {int} Edad de la persona
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + "]";
	}
}
