package arrays;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int [] mi_matriz = new int[5];
		//También se puede escribir asi : int mi_matriz[] = new int[5];
		
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;
		
		System.out.println(mi_matriz[2]);
		
		//Así se pueden ir imprimiendo todos los elementos de la matriz, pero si hay muchos, se usa el BUCLE FOR*/
		
		// OTRA FORMA DE DECLARARLA : 
		
		int [] mi_matriz = { 5, 38, -15, 92, 71 };
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de índice " + i + " = " + mi_matriz[i]);
		}

	}

}
