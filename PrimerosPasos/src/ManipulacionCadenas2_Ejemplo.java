
public class ManipulacionCadenas2_Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="Hoy es un estupendo día para aprender a programar en Java";
		
		//las cadenas de caracteres se pueden modificar. A substring se le puede añadir
		//concatenar. Por ejemplo:
		
		String frase_resumen=frase.substring(0, 29) + "irnos a la playa";
		
		System.out.println(frase_resumen);
		
		//Además, se le puede añadir lo siguiente:
		
		String frase_resumen2=frase.substring(0, 29) + "irnos a la playa y " + frase.substring(39,57);
		
		System.out.println(frase_resumen2);
		
		
		

	}

}
