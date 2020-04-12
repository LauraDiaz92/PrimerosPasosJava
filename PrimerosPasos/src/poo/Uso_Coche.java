package poo;

public class Uso_Coche {

	// ESTA VA A SER LA CLASE PRINCIPAL PORQUE ES LA QUE CONTIENE EL MÉTODO MAIN

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ahora vamos a crear objetos que van a pertenecer a la clase COCHE.
//
//		Coche renault = new Coche(); // Esto es UNSTANCIAR UNA CLASE. Renault es el EJEMPLAR DE CLASE
//
//		System.out.println("Este coche tiene " + renault.getLargo() + " cm de largo");

		
		Coche fiat = new Coche();
		System.out.println(fiat.toString());
		
		Coche opel = new Coche(false, true);
		System.out.println(opel.toString());
		opel.setColor("Amarillo");
		System.out.println(opel.toString());
		
		Coche c3 = new Coche(400, 500, 600,700,true,true);
		System.out.println(c3.toString());
		
//		System.out.println(fiat.getDatosgenerales());
//
//		fiat.set_color("rojo");
//
//		System.out.println(fiat.getColor());

	}

}
