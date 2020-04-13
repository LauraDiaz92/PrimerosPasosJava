import java.util.Random;

public class Bucle_For {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		String dni = "";
		
		// rellenar con 8 cifras entre 0 y 9 aleatoriamente
		for (int i = 0; i < 8; i++) {
			dni += rnd.nextInt(10);
		}
		
		// anadir una letra al final
		
		// creamos un objeto de la clase random (importada al inicio del archivo "import java.util.Random"
		dni += (char)(rnd.nextInt(23) + 65);
		
		System.out.println(dni);
		

	}

}
