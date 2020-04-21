package miEjercicio;

public class Clientes extends Persona{

	// Atributos: nombre, edad, direccion, sexo
	
	private String sexo;

	/**
	 * @param nombre
	 * @param direccion
	 * @param edad
	 * @param sexo
	 */
	public Clientes(String nombre, String direccion, int edad, String sexo) {
		super(nombre, direccion, edad);
		this.sexo = sexo;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	@Override
	public String toString() {
		return "Clientes [sexo=" + sexo + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
}
