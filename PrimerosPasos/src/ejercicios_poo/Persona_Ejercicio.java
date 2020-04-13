package ejercicios_poo;

/*Haz una clase llamada Persona que siga las siguientes condiciones:

Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente
 a ellos. Piensa que modificador de acceso es el m�s adecuado, tambi�n su tipo. Si quieres a�adir alg�n atributo puedes hacerlo.
Por defecto, todos los atributos menos el DNI ser�n valores por defecto seg�n su tipo 
(0 n�meros, cadena vac�a para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.
Se implantaran varios constructores:
Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como par�metro.
Los m�todos que se implementaran son:
calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta f�rmula devuelve 
un valor menor que 20, la funci�n devuelve un -1, si devuelve un n�mero entre 20 y 25 (incluidos), significa que esta 
por debajo de su peso ideal la funci�n devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene 
sobrepeso, la funci�n devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
toString(): devuelve toda la informaci�n del objeto.
generaDNI(): genera un n�mero aleatorio de 8 cifras, genera a partir de este su n�mero su letra correspondiente. 
Este m�todo sera invocado cuando se construya el objeto. Puedes dividir el m�todo para que te sea m�s f�cil.
 No ser� visible al exterior.
M�todos set de cada par�metro, excepto de DNI.
Ahora, crea una clase ejecutable que haga lo siguiente:

Pide por teclado el nombre, la edad, sexo, peso y altura.
Crea 3 objetos de la clase anterior, el primer objeto obtendr� las anteriores variables pedidas por teclado, el segundo objeto obtendr� todos los anteriores menos el peso y la altura y el �ltimo por defecto, para este �ltimo utiliza los m�todos set para darle a los atributos un valor.
Para cada objeto, deber� comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
Indicar para cada objeto si es mayor de edad.
Por �ltimo, mostrar la informaci�n de cada objeto.
Puedes usar m�todos en la clase ejecutable, para que os sea mas f�cil. */

public class Persona_Ejercicio {

	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private int peso;
	private int alturacm;

	public Persona_Ejercicio() {

		nombre = "";
		edad = 0;
		final char sexo = 'H';
		peso = 0;
		alturacm = 0;

	}
	
	public Persona_Ejercicio (String nombre, int edad, char sexo, int peso, int alturacm) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.alturacm = alturacm;
	}

	public Persona_Ejercicio(String nombre, int edad, char sexo) {
		this(nombre, edad, sexo, 0, 0);

	}
	
	public void calcularIMC() {
		int pesoactual = (peso / (int)(Math.pow(alturacm, 2)));
		
		if (pesoactual < 20) {
			peso = -1;
		} else if (pesoactual >= 20 && pesoactual <= 25) {
			peso = 0;
		} else (pesoactual > 20) {
			peso = 1;
		}
		
	}

}
