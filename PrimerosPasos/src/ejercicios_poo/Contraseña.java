package ejercicios_poo;
import java.util.*;
/* Haz una clase llamada Password que siga las siguientes condiciones:

[x] Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
   Los constructores serán los siguiente:
[x] Un constructor por defecto.
[x] Un constructor con la longitud que nosotros le pasemos. 
[x]Generara una contraseña aleatoria con esa longitud.
   Los métodos que implementa serán:
[x] esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, 
mas de 1 minúscula y mas de 5 números.
[x]generarPassword():  genera la contraseña del objeto con la longitud que tenga.
[x]Método get para contraseña y longitud.
[x]Método set para longitud. */



public class Contraseña {

	//Atributos : longitud y contraseña
	
	private int longitud;
	private String contraseña;	
	
	// Constructor por defecto
	
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
			char a = (char)(rnd.nextInt(74) + 48); // Caracteres de ASCII
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
			char a = (char)(rnd.nextInt(74) + 48); // Caracteres de ASCII
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
	public boolean setLongitud(int longitud) {
		if (longitud > 0) {
			this.longitud = longitud;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}

	
	
}
