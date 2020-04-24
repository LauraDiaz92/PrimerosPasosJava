package poo;

public class Uso_Vehiculo {

	// ESTA VA A SER LA CLASE PRINCIPAL PORQUE ES LA QUE CONTIENE EL MÉTODO MAIN

	public static void main(String[] args) {
		// Ahora vamos a crear objetos que van a pertenecer a la clase COCHE.
//
//		Coche renault = new Coche(); // Esto es UNSTANCIAR UNA CLASE. Renault es el EJEMPLAR DE CLASE
//
//		System.out.println("Este coche tiene " + renault.getLargo() + " cm de largo");

		Coche fiat = new Coche();
		fiat.setColor("azul");
		fiat.setLargo(111);
		//System.out.println(fiat.toString());
		
		Coche opel = new Coche(false, true);
		opel.setColor("Amarillo");
		opel.recalculaPesoTotal();
		//System.out.println(opel.toString());
		
		Coche c3 = new Coche();
		//System.out.println(c3.toString());
		
		Furgoneta mi_furgoneta = new Furgoneta (3, 10);
		mi_furgoneta.setColor("rojo");
		mi_furgoneta.setAncho(565);
		//System.out.println(mi_furgoneta.getPesoTotal());
		mi_furgoneta.setClimatizador(true);
		//System.out.println(mi_furgoneta.getPesoTotal());
		System.out.println(mi_furgoneta.getNumeroDeVehiculos());

		
	
		//System.out.println(mi_furgoneta.toString());
		
		
		Furgoneta mi_furgoneta2 = new Furgoneta (3, 10, true, true);
		//System.out.println(mi_furgoneta2.toString());

	}

}
