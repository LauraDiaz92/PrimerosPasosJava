
public class ManipulaCadenas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//METODO EQUALS. DISTINGUE ENTRE MAYUSCULAS Y MINUSCULAS
		String alumno1, alumno2;
		alumno1="David";
		alumno2="david";
	    //Vamos a decirle a Java que nos compare, con el m�todo EQUALS, estas 2 cadenas de caracteres
		//Nos devolvera TRUE si son iguales o FALSE si son diferentes

		System.out.println(alumno1.equals(alumno2));
		//Si, por ejemplo, cambiamos alumno2 "David", por "david" con min�scula, nos devuelve FALSE
		//Tambi�n tenemos EQUALS IGNORE CASE, para ver si dos cadenas son iguales, ignorando 
		//may�sculas o min�sculas, por ejemplo
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
		

	}

}
