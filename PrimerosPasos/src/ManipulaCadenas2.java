
public class ManipulaCadenas2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String frase="Hoy es un estupendo día para aprender a programar en Java";
	//Como ejemplo, vaoms a decirle que queremos extraer la "o" y la "y" de la palabra
	//"Hoy". Dentro de substring nos pide dos caracteres (el de inicio y el de final)

	//El de inicio sería la "o", entonces le pedimos el caracter 1 (empieza a contar desde 0),
	// con la letra "o" incluida
		
	//El final sería la y, y le pedimos el caracter 3 ¡¡no el 2!! ya que, al finalizar, hay que
	//decirle LA PRIMERA POSICIÓN QUE NO QUEREMOS EXTRAER. En este caso, ya que 
    //queremos terminar en el carácter 2 "y" incluido, hay que decirle que termine en el
	//carácter 3 (el espacio)
		
		String frase_resumen=frase.substring(1, 3);
		System.out.println(frase_resumen);
		//Ahora vamos a extraer solamente "aprender a programar en Java"
		
		String frase_resumen2=frase.substring(29, 57);
		System.out.println(frase_resumen2);
		//ahora vamos a pedirle que nos devuelva la "a" de "aprender"
		
		String frase_resumen3=frase.substring(29, 30);
		System.out.println(frase_resumen3);
		

	}

}
