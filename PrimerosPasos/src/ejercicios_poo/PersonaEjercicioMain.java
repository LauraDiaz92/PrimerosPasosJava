package ejercicios_poo;
import javax.swing.*;

/*
 * Pide por teclado el nombre, la edad, peso y altura.
 * Crea 3 objetos de la clase anterior:
 * [x] El primer objeto obtendrá las anteriores variables pedidas por teclado 
 * [x] El segundo objeto obtendrá todos los anteriores menos el peso y la altura
 * [x] El tercero usara el constructor por defecto
 * [x] Para este último utiliza los métodos set para darle a los atributos un valor.
 * [x] Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o 
 * por debajo de su peso ideal con un mensaje.
 * [x] Indicar para cada objeto si es mayor de edad.
 * [x] Mostrar la información de cada objeto.
 */

public class PersonaEjercicioMain {

	public static void main(String[] args) {

		String nombre = (JOptionPane.showInputDialog("Introduce tu nombre"));

		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));

		double peso = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu peso"));

		double alturacm = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu altura en cm"));

		System.out.println(nombre + " " + edad + " " + peso + " " + alturacm);

		// primer objeto con las variables pedidas por teclado
		PersonaEjercicio p1 = new PersonaEjercicio(nombre, edad, 'x', peso, alturacm);

		// segundo objeto con nombre, edad y sexo
		PersonaEjercicio p2 = new PersonaEjercicio(nombre, edad, 'x');

		// tercer objeto con el constructor por defecto (sin parametros)
		PersonaEjercicio p3 = new PersonaEjercicio();

		// Actualizar los atributos del objeto p3 con los metodos setXXXX()
		p3.setNombre("Laura");
		p3.setEdad(21);
		p3.setSexo('M');
		p3.setPeso(53.50);
		p3.setAlturacm(155);

		// Comprobar para cada objeto el IMC (tenemos una funcion calcularIMC())
		// n1 es lo que devuelve el IMC para persona p1
		int n1 = p1.calcularIMC();
		if (n1 == -1) {
			System.out.println(p1.getNombre() + " esta por debajo de su peso ideal");
		} else if (n1 == 0) {
			System.out.println(p1.getNombre() + " esta en su peso ideal");
		} else {
			System.out.println(p1.getNombre() + " tiene sobrepeso");
		}
		
		// n2 es lo que devuelve el IMC para persona p2
		int n2 = p2.calcularIMC();
		if (n2 == -1) {
			System.out.println(p2.getNombre() + " esta por debajo de su peso ideal");
		} else if (n2 == 0) {
			System.out.println(p2.getNombre() + " esta en su peso ideal");
		} else {
			System.out.println(p2.getNombre() + " tiene sobrepeso");
		}
		
		// n3 es lo que devuelve el IMC para persona p3
		int n3 = p3.calcularIMC();
		if (n3 == -1) {
			System.out.println(p3.getNombre() + " esta por debajo de su peso ideal");
		} else if (n3 == 0) {
			System.out.println(p3.getNombre() + " esta en su peso ideal");
		} else {
			System.out.println(p3.getNombre() + " tiene sobrepeso");
		}

		// Comprobar para cada objeto si es mayor de edad (tenemos una funcion
		// mayordeedad())
		
		//Nos devuelve si la persona1 es mayor o menor de edad
		if (p1.mayordeedad()) {
			System.out.println(p1.getNombre() + " es mayor de edad");
		} else {
			System.out.println(p1.getNombre() + " es menor de edad");
		}
		
		// Nos devuelve si la persona2 es mayor o menor de edad
		if (p2.mayordeedad()) {
			System.out.println(p2.getNombre() + " es mayor de edad");
		} else {
			System.out.println(p2.getNombre() + " es menor de edad");
		}
		
		// Nos devuelve si la persona3 es mayor o menor de edad
		if (p3.mayordeedad()) {
			System.out.println(p3.getNombre() + " es mayor de edad");
		} else {
			System.out.println(p3.getNombre() + " es menor de edad");
		}

		// Mostrar la informacion de cada objeto (metodo toString())
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

		

	}

}
