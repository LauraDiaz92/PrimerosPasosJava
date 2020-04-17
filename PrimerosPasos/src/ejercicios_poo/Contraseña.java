package ejercicios_poo;
import java.util.*;
/* Haz una clase llamada Password que siga las siguientes condiciones:

[x] Que tenga los atributos longitud y contrase�a . Por defecto, la longitud sera de 8.
   Los constructores ser�n los siguiente:
[x] Un constructor por defecto.
[x] Un constructor con la longitud que nosotros le pasemos. 
[x]Generara una contrase�a aleatoria con esa longitud.
   Los m�todos que implementa ser�n:
[x] esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 may�sculas, 
mas de 1 min�scula y mas de 5 n�meros.
[x]generarPassword():  genera la contrase�a del objeto con la longitud que tenga.
[x]M�todo get para contrase�a y longitud.
[x]M�todo set para longitud. */



public class Contrase�a {

	//Atributos : longitud y contrase�a
	
	private int longitud;
	private String contrase�a;	
	
	// Constructor por defecto
	
	public Contrase�a() {
		longitud = 8;
		contrase�a = "";
	}
	
	/**
	 * Constructor con la longitud que nosotros le pasemos.
	 * Genera una contrase�a aleatoria con esa longitud
	 * @param longitud {int} - la longitud de la contrase�a
	 */
	public Contrase�a(int longitud) {
		Random rnd = new Random();
		
		for (int i = 0; i < longitud; i++) {
			char a = (char)(rnd.nextInt(74) + 48); // Caracteres de ASCII
			contrase�a += a;
		}
		
		this.longitud = longitud;
	}
	
	/**
	 * Calcula si la contrase�a es fuerte o debil. 
	 * 
	 * Se considera que una contrase�a es fuerte cuando contiene al menos 2 letras mayusculas, 
	 * 1 letra minuscula y 5 numeros
	 * 
	 * @return true si es fuerte, false si es debil
	 */
	public boolean esFuerte() {
		boolean resultado = false;
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		
		for (int i = 0; i < contrase�a.length(); i++) {
			
			char character = contrase�a.charAt(i);    
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
	 * Actualiza la contrase�a del objeto con la longitud que tenga
	 */
	public void actualizaContrase�a() {
		contrase�a = "";
		
		Random rnd = new Random();
		
		for (int i = 0; i < longitud; i++) {
			char a = (char)(rnd.nextInt(74) + 48); // Caracteres de ASCII
			contrase�a += a;
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
	 * @return the contrase�a
	 */
	public String getContrase�a() {
		return contrase�a;
	}

	
	
}
