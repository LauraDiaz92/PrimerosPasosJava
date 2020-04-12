package poo;

public class UsoMiTaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiTaller LauraCoche = new MiTaller("verde", "opel", "123", "lau");
		System.out.println(LauraCoche.toString());
		
		LauraCoche.setPropietario("Alex");
		System.out.println(LauraCoche.getPropietario());

	}

}
