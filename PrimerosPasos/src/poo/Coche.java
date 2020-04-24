package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor; // centímetros cúbicos que va a tener el motor
	private int peso_plataforma;
	private String color;
	private int pesototal;
	private boolean asientosCuero, climatizador;
	private static int numeroDeVehiculos;

	// FINAL: NO SE PUEDE CAMBIAR  STATIC: EL ATRIBUTO PERTENECE A LA CLASE, NO AL OBJETO
	private final static int RUEDAS_DEF = 4;
	private final static int LARGO_DEF = 2000;
	private final static int ANCHO_DEF = 300;
	private final static int MOTOR_DEF = 1600;
	private final static int PESO_PLATAFORMA_DEF = 500;
	private final static String COLOR_DEF = "";
	private final static int PESOTOTAL_DEF = 0;
	private final static boolean ASIENTOSCUERO_DEF = false;
	private final static boolean CLIMATIZADOR_DEF = false;

	// Hay que recurrir a los métodos setters para establecer el valor de estas
	// variables

	public Coche() {
		this(RUEDAS_DEF, LARGO_DEF, ANCHO_DEF, MOTOR_DEF, PESO_PLATAFORMA_DEF, ASIENTOSCUERO_DEF, CLIMATIZADOR_DEF,
				PESOTOTAL_DEF, COLOR_DEF);
	}

	public Coche(boolean asientosCuero, boolean climatizador) {
		this(RUEDAS_DEF, LARGO_DEF, ANCHO_DEF, MOTOR_DEF, PESO_PLATAFORMA_DEF, asientosCuero, climatizador,
				PESOTOTAL_DEF, COLOR_DEF);

	}

	private Coche(int ruedas, int largo, int ancho, int motor, int peso_plataforma, boolean asientosCuero,
			boolean climatizador, int pesototal, String color) {
		this.ruedas = ruedas;
		this.largo = largo;
		this.ancho = ancho;
		this.motor = motor;
		this.peso_plataforma = peso_plataforma;
		this.asientosCuero = asientosCuero;
		this.climatizador = climatizador;
		this.pesototal = pesototal;
		this.color = color;
		this.numeroDeVehiculos++;
	}

	public void setColor(String color_coche) {

		color = color_coche;

		// Vamos a decirle a setter que va a recibir un parámetro (para elegir el color
		// que se quiera) dentro de los paréntesis
	}

	public String getColor() {

		return "El color del coche es " + color;
	}

	public String getDatosgenerales() {

		return "La plataforma del vehículo tiene " + ruedas + " ruedas." + " Mide " + largo / 1000
				+ " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kilos";

	}

	public void setRuedas(int nuevas_ruedas) {

		if (nuevas_ruedas > 0 && nuevas_ruedas < 9) {
			ruedas = nuevas_ruedas;
		}
	}

	/**
	 * Recalcula el peso total del vehiculo si se le aniaden extras como
	 * climatizador o asientos de cuero. Este metodo es llamado desde los metodos
	 * set para los atributos asientos de cuero y climatizador
	 */
	public void recalculaPesoTotal() {
		if (asientosCuero == true) {
			pesototal = peso_plataforma + 50;
		}

		if (climatizador == true) {
			pesototal = peso_plataforma + 20;
		}

	}

	public int getPesoTotal() {
		return pesototal;
	}

	public int getRuedas() {
		return ruedas;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		if (largo > 0) {
			this.largo = largo;
		}
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getPeso_plataforma() {
		return peso_plataforma;
	}

	public void setPeso(int peso_plataforma) {
		this.peso_plataforma = peso_plataforma;
	}

	@Override
	public String toString() {
		return "Coche [ruedas=" + ruedas + ", largo=" + largo + ", ancho=" + ancho + ", motor=" + motor
				+ ", peso_plataforma=" + peso_plataforma + ", color=" + color + ", pesototal=" + pesototal
				+ ", asientosCuero=" + asientosCuero + ", climatizador=" + climatizador + "]";
	}

	/**
	 * @return the asientosCuero
	 */
	public boolean isAsientosCuero() {
		return asientosCuero;
	}

	/**
	 * @param asientosCuero the asientosCuero to set
	 */
	public void setAsientosCuero(boolean asientosCuero) {
		this.asientosCuero = asientosCuero;
	}

	/**
	 * @return the climatizador
	 */
	public boolean isClimatizador() {
		return climatizador;
	}

	/**
	 * @param climatizador the climatizador to set
	 */
	public void setClimatizador(boolean climatizador) {
		this.climatizador = climatizador;
		recalculaPesoTotal();
	}
	
	public int getNumeroDeVehiculos() {
		return numeroDeVehiculos;
	}

}
