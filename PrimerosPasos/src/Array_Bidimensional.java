
public class Array_Bidimensional {

	public static void main(String[] args) {
		
		//Vamos a declarar una matriz bidimensional con 20 posiciones: 4 en una dimensión y 5 en otra
		// Se escriben tantos corchetes como dimensiones tenga la matriz
		
		int [][] mi_matriz = new int [3] [4];
		
		mi_matriz[0][0] = 15;
		mi_matriz[0][1] = 64;
		mi_matriz[0][2] = 7;
		mi_matriz[0][3] = 12;
		
		mi_matriz[1][0] = 99;
		mi_matriz[1][1] = 36;
		mi_matriz[1][2] = 81;
		mi_matriz[1][3] = 10;
		
		mi_matriz[2][0] = 16;
		mi_matriz[2][1] = 15;
		mi_matriz[2][2] = 22;
		mi_matriz[2][3] = 80;
		
		// Para recorrer la matriz hay que usar dos bucles FOR, uno para cada dimensión FOR ANIDADOS
		
		for (int i = 0; i < 3; i++) {
			System.out.println();  // es un salto de línea vacío para que lo imprima en forma de tabla
			for (int j = 0; j < 4; j++) {
				
				System.out.print(mi_matriz[i] [j] + " ");
				
			}
		}
		
		
		
		
		
 		
		
	}

}
