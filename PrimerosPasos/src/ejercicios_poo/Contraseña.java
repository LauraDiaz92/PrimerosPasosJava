package ejercicios_poo;
import java.util.*;
/* Haz una clase llamada Password que siga las siguientes condiciones:

[x] Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
   Los constructores serán los siguiente:
[ ] Un constructor por defecto.
[ ] Un constructor con la longitud que nosotros le pasemos. 



Generara una contraseña aleatoria con esa longitud.
   Los métodos que implementa serán:
[ ] esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, 
mas de 1 minúscula y mas de 5 números.

[ ]generarPassword():  genera la contraseña del objeto con la longitud que tenga.
[ ]Método get para contraseña y longitud.
[ ]Método set para longitud.

Ahora, crea una clase clase ejecutable:

Crea un array de Passwords con el tamaño que tu le indiques por teclado.
Crea un bucle que cree un objeto para cada posición del array.
Indica también por teclado la longitud de los Passwords (antes de bucle).
Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
contraseña1 valor_booleano1

contraseña2 valor_bololeano2*/

public class Contraseña {

	//Atributos : longitud y contraseña
	
	private int longitud;
	private String contraseña;	
	
	//TODO Constructor por defecto
	
	public Contraseña() {
		longitud = 8;
		contraseña = "";
	}
	
	/**
	 * Constructor con la longitud que nosotros le pasemos.
	 * Genera una contraseña aleatoria con esa longitud
	 * @param longitud {int} - la longitud de la contraseña
	 */
	public Contraseña(int longitud) {
		Random rnd = new Random();
		
		for (int i = 0; i < longitud; i++) {
			char a = (char)(rnd.nextInt(74) + 48);
			contraseña += a;
		}
		
		this.longitud = longitud;
	}
	
	/**
	 * Calcula si la contraseña es fuerte o debil. 
	 * 
	 * Se considera que una contraseña es fuerte cuando contiene al menos 2 letras mayusculas, 
	 * 1 letra minuscula y 5 numeros
	 * 
	 * @return true si es fuerte, false si es debil
	 */
	public boolean esFuerte() {
		boolean resultado = false;
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		
		for (int i = 0; i < contraseña.length(); i++) {
			
			char character = contraseña.charAt(i);    
			int ascii = (int) character;
			
			
			if (ascii >= 65 && ascii <= 90) {
				mayusculas++;
			} else if (ascii >= 97 && ascii <= 122) {
				minusculas++;
			} else if (ascii >= 48 && ascii <= 57) {
				numeros++;
			}
		}
			
		
		if (mayusculas > 2 && minusculas > 1 && numeros > 5) {
			resultado = true;
		} else {
			resultado = false;
		}
		
		return resultado;
	}
		
	/**
	 * Actualiza la contraseña del objeto con la longitud que tenga
	 */
	public void actualizaContraseña() {
		contraseña = "";
		
		Random rnd = new Random();
		
		for (int i = 0; i < longitud; i++) {
			char a = (char)(rnd.nextInt(74) + 48);
			contraseña += a;
		}
	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}

	
	
}
