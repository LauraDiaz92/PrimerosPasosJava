package polimorfismoYCastingDeObjetos;

public class Persona {
	
	private String name;
	private String birthdate;
	
	/**
	 * @param name
	 * @param birthdate
	 */
	public Persona(String name, String birthdate) {
		this.name = name;
		this.birthdate = birthdate;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the birthdate
	 */
	public String getBirthdate() {
		return birthdate;
	}
	
	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	@Override
	public String toString() {
		return "Persona [name=" + name + ", birthdate=" + birthdate + "]";
	}

}
