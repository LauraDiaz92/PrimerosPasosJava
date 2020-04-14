package arrays;

public class Array_bidimensional_ForEach {

	public static void main(String[] args) {

		int[][] matriz = { { 10, 11, 12, 13, }, { 15, 16, 17, 18, }, { 19, 20, 21, 22, } };

		/*
		 * for (int i = 0; i < 3; i++) { System.out.println(); // es un salto de línea
		 * vacío para que lo imprima en forma de tabla for (int j = 0; j < 4; j++) {
		 * 
		 * System.out.print(mi_matriz[i][j] + " ");
		 */

		for (int[] fila : matriz) {

			System.out.println();

			for (int z : fila) {

				System.out.print(z + " ");

			}
		}
	}

}
