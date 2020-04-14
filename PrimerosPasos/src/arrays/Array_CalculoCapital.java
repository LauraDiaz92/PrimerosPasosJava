package arrays;

public class Array_CalculoCapital {

	public static void main(String[] args) {

		final double CAPITAL_INICIAL = 10000;
		double capital_acumulado = CAPITAL_INICIAL;
		double interes = 0.1;
		double[][] tabla = new double[6][5];
		// column
		for (int i = 0; i < 6; i++) {

			tabla[i][0] = 10000;

			// row
			for (int j = 1; j < 5; j++) {
				capital_acumulado += (capital_acumulado * interes);
				tabla[i][j] = capital_acumulado;
			}

			interes += 0.01;

		}

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 6; i++) {
				System.out.printf("%1.2f", tabla[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
