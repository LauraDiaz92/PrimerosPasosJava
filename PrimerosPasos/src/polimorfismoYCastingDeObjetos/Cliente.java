package polimorfismoYCastingDeObjetos;

public class Cliente extends Persona {
	private int bill;

	/**
	 * @param bill
	 */
	public Cliente(String name, String birthdate, int bill) {
		super(name, birthdate);
		this.bill = bill;
	}
	
	
}
