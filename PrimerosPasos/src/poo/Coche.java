package poo;

public class Coche {

	// Ya hemos creado la clase COCHE y ahora hay que especificar las
	// características COMUNES que van a tener todos los objetos de la clase
	

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor; // centímetros cúbicos que va a tener el motor
	private int peso_plataforma;

	// Ahora vamos a indicar las propiedades que pueden variar dependiendo del coche

	private String color;
	private int pesototal;
	private boolean asientosCuero, climatizador;

	// Hay que recurrir a los métodos setters para establecer el valor de estas
	// variables

	// Ahora vamos a usar un MÉTODO CONSTRUCTOR para especificar cuántas ruedas
	// tiene, cuánto de largo...
	// Se encarga de dar un estado inicial a nuestro objeto. Tiene que tener EL
	// MISMO NOMBRE QUE LA CLASE

	public Coche() {

		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
		asientosCuero = true;
		climatizador = true;

	}
	
	public Coche(boolean asientosCuero, boolean climatizador) {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
		this.asientosCuero = asientosCuero;
		this.climatizador = climatizador;
	}
	
	public Coche(int largo, int ancho, int motor, int peso_plataforma, boolean asientosCuero, boolean climatizador) {
		ruedas = 4;
		this.largo = largo;
		this.ancho = ancho;
		this.motor = motor;
		this.peso_plataforma = peso_plataforma;
		this.asientosCuero = asientosCuero;
		this.climatizador = climatizador;
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
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas." + " Mide " + largo/1000 +
				" metros con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kilos"; 
		
	}
	
	//public void setAsientoscuero() {

	public void setRuedas(int nuevas_ruedas) {

		if (nuevas_ruedas > 0 && nuevas_ruedas < 9) {
			ruedas = nuevas_ruedas;
		}
	}

	@Override
	public String toString() {
		return "Coche [ruedas=" + ruedas + ", largo=" + largo + ", ancho=" + ancho + ", motor=" + motor
				+ ", peso_plataforma=" + peso_plataforma + ", color=" + color + ", pesototal=" + pesototal
				+ ", asientosCuero=" + asientosCuero + ", climatizador=" + climatizador + "]";
	}

	public int getRuedas() {
		return ruedas;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
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

}
