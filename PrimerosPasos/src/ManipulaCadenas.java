
public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String nombre="Laura";
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
		System.out.println("La �ltima letra de " + nombre + " es la " + nombre.charAt(4));
		// �C�mo podemos hacer para que nos diga la �ltima letra pero que valga para cualquier
	    // nombre, tenga la longitud que tenga?
		int ultima_letra=nombre.length();
		//ya que el m�todo leght nos dice cu�ntas letras hay, en la variable
		//ultima_letra, estamos almacenando el valor 5
		System.out.println("La �ltima letra de " + nombre + " es " + nombre.charAt(ultima_letra-1));
		// Hay que poner el -1 porque charAT empieza a contar desde 0
		
		
	}

}
