package polimorfismoYCastingDeObjetos;

public class Empleado extends Persona{
	
	private String role;

	/**
	 * @param name
	 * @param birthdate
	 * @param role
	 */
	public Empleado(String name, String birthdate, String role) {
		super(name, birthdate);
		this.role = role;
	}

	
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}


	
	@Override
	public String toString() {
		return "Empleado [role=" + role + ", toString()=" + super.toString() + "]";
	}
	
}
