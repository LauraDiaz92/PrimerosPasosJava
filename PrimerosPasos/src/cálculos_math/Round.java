package cálculos_math;


public class Round {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1=5.85;
		
		long resultado=Math.round(num1);
		
		// existen 2 métodos en Math para redondear, pero ambos darían error
				
		// primero: round(float a): int - Math
		// da error porque num 1 no es un float, sino un double
				
		//Segundo: round(double a): long - Math
		// da error porque, a pesar de que num1 es double, nos da como resultado un
		//long, y no se puede obtener un long desde una variable int
		
		// por ejemplo, si yo hago un casting y le digo que confie en mi, que va a ser
		// int (aunque me de un long), se hace lo siguiente: 
		// int resultado=(int)Math.round(num1)
		
				
		System.out.println(resultado);
		
	
			
			
		}
		
		
	}

