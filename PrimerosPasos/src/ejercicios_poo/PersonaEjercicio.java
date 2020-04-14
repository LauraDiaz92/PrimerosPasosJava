package ejercicios_poo;
import java.util.Random;

/*Haz una clase llamada Persona que siga las siguientes condiciones:

[x] Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente
 a ellos. Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.

[ ] Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). 
[x]Sexo sera hombre por defecto, usa una constante para ello.
Se implantaran varios constructores:
[x]Un constructor por defecto.
[x]Un constructor con el nombre, edad y sexo, el resto por defecto.
[x]Un constructor con todos los atributos como parámetro.
[x]Los métodos que se implementaran son:
[x]calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve 
[x]un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que esta 
[x]por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene 
[x]sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
[X]esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
[x]comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
[X]toString(): devuelve toda la información del objeto.
[x]generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. 
[x]Este método sera invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil.
[x] No será visible al exterior.
Métodos set de cada parámetro, excepto de DNI.
Ahora, crea una clase ejecutable que haga lo siguiente:

Pide por teclado el nombre, la edad, sexo, peso y altura.
Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
Indicar para cada objeto si es mayor de edad.
Por último, mostrar la información de cada objeto.
Puedes usar métodos en la clase ejecutable, para que os sea mas fácil. */

public class PersonaEjercicio {

	// Atributos de la clase. Todos deben ser privados
	private String nombre;
	private int edad;
	private String dni; // DNI de la persona. Se genera al construir el objeto
	private char sexo; // Solo puede ser H (hombre) o M (mujer)
	private double peso;
	private double alturacm;
	private final static char SEXO_DEF = 'N';

	// LAS CONSTANTES SIEMPRE SE ESCRIBEN EN MAYÚSCULA. Se generan como constantes
	// para poder reutilizarlas
	public static final int INFRAPESO = -1;
	public static final int PESOIDEAL = 0;
	public static final int SOBREPESO = 1;
	public static final int MAYORIA_DE_EDAD = 18;

	/**
	 * Se utiliza para crear personas sin parámetros. Constructor por defecto
	 */
	public PersonaEjercicio() {
		this("", 0, SEXO_DEF, 0, 0);
	}

	/**
	 * Constructor de personas. Todos los parámetros
	 * 
	 * @param nombre   {String} nombre de la persona
	 * @param edad     {int} edad de la persona
	 * @param sexo     {char} sexo de la persona
	 * @param peso     {double} peso de la persona
	 * @param alturacm {double} altura de la persona
	 */
	public PersonaEjercicio(String nombre, int edad, char sexo, int peso, int alturacm) {
		this.nombre = nombre;
		this.edad = edad;
		if (sexo == 'H' || sexo == 'M')  {
			this.sexo = sexo;
		} else {
			this.sexo = SEXO_DEF;
		}
		this.peso = peso;
		this.alturacm = alturacm;
	}

	/**
	 * Constructor sólo para nombre, edad y sexo
	 * 
	 * @param nombre {String} nombre que se le asigna a la persona
	 * @param edad   {int} La edad de la persona
	 * @param sexo   {char} el sexo de la persona
	 */
	public PersonaEjercicio(String nombre, int edad, char sexo) {
		this(nombre, edad, sexo, 0, 0);

	}

	/**
	 * Calcula el indice de masa corporal y devuelve un entero en funcion de si la
	 * persona tiene sobrepeso, tiene un peso idea o esta por debajo del peso ideal. 
	 * @return -1 si el peso esta por debajo del ideal, 0 si el peso es ideal, 1 si 
	 * tiene sobrepeso
	 */
	public double calcularIMC() {
		double pesoactual = (peso / (Math.pow(alturacm, 2)));

		if (pesoactual < 20) {
			return INFRAPESO;
		} else if (pesoactual >= 20 && pesoactual <= 25) {
			return PESOIDEAL;
		} else {
			return SOBREPESO;
		}

	}

	/**
	 * Averigua si la persona es mayor o menor de edad. Devuelve un boolean
	 * @return true si la persona es mayor de edad. False si la persona es menor de edad
	 */
	public boolean mayordeedad() {
		if (edad >= MAYORIA_DE_EDAD) { //Declarar una constante por si alguna vez hay que cambiar la edad
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Genera un numero de dni aleatorio siguiendo el siguiente patron: nnnnnnnX (7 numeros seguidos de una letra)
	 * @return el dni aleatorio generado
	 */
	private String generar_dni() {
		Random rnd = new Random();
		String dni = "";
		
		// rellenar con 8 cifras entre 0 y 9 aleatoriamente
		for (int i = 0; i < 8; i++) {
			// genera un numero aleatorio entre 0 y 9 y lo guarda en la variable n
			int n = (int)Math.round(Math.random()*10); 
			// convierte n de un entero a un String (por que lo queremos añadir a la variable dni y dni es string)
			String s = String.valueOf(n);
			// concatena lo que ya teniamos hasta ahora en dni mas lo que hay en s (el ultimo digito aleatorio que
			// hemos generado
			dni = dni.concat(s);
			
			// lo mismo pero usando la clase Random en lugar del metodo random() de la clase Math
			// dni += rnd.nextInt(9);
		}
		
		// Anadir una letra al final
		/*
		 * Creamos un objeto de la clase Random. Importada al inicio del archivo. El objeto se declara al inicio de
		 * este metodo, junto a la declaracion de la variable DNI (Ver un poco mas arriba)
		 * 
		 * El metodo nextInt(n) devuelve un entero entre 0 y "n" (parametro)
		 * 
		 * Usamos el método RANDOM. (rnd.next.Int(23) + 65); siendo 23 el número de letras de abecedario y 65 la
		 * posición por la que se empieza a contar (A mayúscula en la tabla ASCII)
		 * 
		 * A ese int le hacemos un casting a tipo char y aqui esta el truco:
		 * JAVA va a comprobar a la tabla de codigos ASCII que caracter esta representado por ese entero
		 * y lo transforma. Los caracteres de letras mayusculas se representan por los enteros entre 65 y 88
		 * 
		 * Tabla ASCII para comprobarlo: https://www.ascii-code.com/
		 * 
		 * Por ultimo, concatenamos la letra a lo que ya teniamos en dni. Todo eso se hace en una linea, los pasos
		 * se leen de derecha a izquierda
		 */
		dni += (char)(rnd.nextInt(23) + 65);
		
		return dni;
	}

	@Override
	public String toString() {
		return "PersonaEjercicio [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso="
				+ peso + ", alturacm=" + alturacm + "]";
	}

}
