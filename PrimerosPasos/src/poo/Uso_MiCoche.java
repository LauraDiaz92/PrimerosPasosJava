package poo;

public class Uso_MiCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiCoche LauraCoche = new MiCoche("verde", "opel", "123", "lau");
		System.out.println(LauraCoche.toString());
		
		LauraCoche.setPropietario("Alex");
		System.out.println(LauraCoche.getPropietario());

	}

}
