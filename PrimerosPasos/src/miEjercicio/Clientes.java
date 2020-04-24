package miEjercicio;

public class Clientes extends Persona{

	// Atributos: nombre, edad, direccion, sexo
	
	private String sexo;

	/**
	 * @param nombre {String} Nombre de la persona
	 * @param direccion {String} Dirección de la persona
	 * @param edad {int} Edad de la persona
	 * @param sexo {String} Sexo del cliente
	 */
	public Clientes(String nombre, String direccion, int edad, String sexo) {
		super(nombre, direccion, edad);
		this.sexo = sexo;
	}

	/**
	 * @return the sexo {String} Sexo del cliente
	 */
	public String getSexo() {
		return sexo;
	}

	@Override
	public String toString() {
		return "Clientes [sexo=" + sexo + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
}
