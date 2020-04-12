import java.util.Scanner;
public class Condicionales_ifelse_muchascondiciones {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu edad, por favor");
        int n = scan.nextInt();
        
        //Vamos a decirle que nos imprima diferentes mensajes dependiendo de la edad
        if (n < 18) {
        	System.out.println("Eres un niño, adolescente");
        
        } else if (n>18 && n<40) {
        	System.out.println("Eres adulto");
        
        } else if (n < 65) {
        	System.out.println("Eres maduro");
       
        } else {
        	System.out.println("Eres anciano");
        }
        scan.close();
	}
}
