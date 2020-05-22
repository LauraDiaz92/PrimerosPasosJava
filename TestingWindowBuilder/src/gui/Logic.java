package gui;

public class Logic {
	
	//  CUANDO UN METODO ES STATIC PERTENECE A LA CLASE,POR LO TANTO NO HACE FALTA CREAR UN OBJETO DE LA CLASE LOGIC
	public static String printLabel(String previous, String current) {
		if (previous == "0") return current;
		else return previous.concat(current);
	}
	

	

}
