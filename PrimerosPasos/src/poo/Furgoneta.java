package poo;

public class Furgoneta extends Coche {

	// Características propias que no va a heredar de la clase Coche:

	private int capacidad_extra;
	private int plazas_extra;

	public Furgoneta(int plazas_extra, int capacidad_extra) {

		super(); // Llama al constructor de la clase padre para darle el ESTADO INICIAL a este
					// objeto

		this.plazas_extra = plazas_extra;
		this.capacidad_extra = capacidad_extra;
	}

	public Furgoneta(int plazas_extra, int capacidad_extra, boolean asientos, boolean climatizador) {

		super(asientos, climatizador); // Llama al constructor de la clase padre para darle el ESTADO INICIAL a este
										// objeto

		this.plazas_extra = plazas_extra;
		this.capacidad_extra = capacidad_extra;
	}

	/**
	 * @return the capacidad_extra {int} devuelve la capacidad extra de carga en el
	 *         vehículo
	 */
	public int getCapacidad_extra() {
		return capacidad_extra;
	}

	/**
	 * @return the plazas_extra {int} devuelve la capacidad extra de plazas en el
	 *         vehículo
	 */
	public int getPlazas_extra() {
		return plazas_extra;
	}

	@Override
	public String toString() {
		return "Furgoneta [capacidad_extra=" + capacidad_extra + ", plazas_extra=" + plazas_extra + ", toString()="
				+ super.toString() + "]";
	}

	

}
