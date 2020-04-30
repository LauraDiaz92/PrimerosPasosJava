package polimorfismoYCastingDeObjetos;

public class Main {

	public static void main(String[] args) {
		
		// polimorfismo -> 	se puede utilizar un objeto de la clase hija siempre que el programa espere
		// 					un objeto de la superclase
		
		// objeto de la clase hija
		Empleado e1 = new Empleado("Laura", "1992", "Puta ama");
		Cliente c1 = new Cliente("Roco", "2015", 500);
		
		// objeto de la clase padre -> entra uno de la clase hija?
		Persona p0 = new Persona("Carlos", "1994");
		
		// la siguiente linea da error por que cuando tu intentas copiar en una clase padre
		// un objeto de una clase hija, JAVA no sabe que hacer con esos atributos que la clase
		// hija tiene y no ha heredado de la padre
		//Empleado e2 = p0;
		
		Persona p1 = e1;
		Persona p2 = c1;
		
		Persona[] humanidad = new Persona[3];
		humanidad[0] = e1;
		humanidad[1] = c1;
		humanidad[2] = p0;
		
		// casting de objetos
		((Empleado) humanidad[0]).getRole();

	}

}
