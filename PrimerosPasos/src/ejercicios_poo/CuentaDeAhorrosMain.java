package ejercicios_poo;

public class CuentaDeAhorrosMain {

	public static void main(String[] args) {
		
		CuentaDeAhorros Laura = new CuentaDeAhorros("Lau", 50.50);
		System.out.println(Laura.toString());
		
		CuentaDeAhorros Alex = new CuentaDeAhorros("alex");
		System.out.println(Alex.toString());
		
		CuentaDeAhorros Anonimo = new CuentaDeAhorros(1000);
		System.out.println(Anonimo.toString());
		

		CuentaDeAhorros uno = new CuentaDeAhorros ("Titular de la cuenta 1"); //Va al método donde tiene el atributo "propietario"
		CuentaDeAhorros dos = new CuentaDeAhorros ("Titular de la cuenta 2");
		
		uno.ingresar(550);
		dos.ingresar(200);
		
		uno.retirar(200);
		dos.retirar (400);
		
		System.out.println(uno);
		System.out.println(dos);
	}

}
