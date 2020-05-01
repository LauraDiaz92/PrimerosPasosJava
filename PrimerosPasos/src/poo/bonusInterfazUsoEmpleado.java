package poo;

public interface bonusInterfazUsoEmpleado {
	
	//Interfaz que comparten tanto los jefes como los empleados. Todos van a tener que implementar el
	//siguiente método:
	
	public abstract double estableceBonus(double bonus);

	//El bonus va a tener que ser una cantidad mínima, por lo que vamos a crear una constante dentro de 
	//esta interfaz
	
	public static final double bonus_base = 1500;
	
	//Ahora vamos a crear una jerarquía de interfaces. En la interfaz JEFES le vamos a decir que hereda de 
	//la interfaz BONUS
}
