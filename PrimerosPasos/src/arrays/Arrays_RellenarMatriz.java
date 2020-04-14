package arrays;
import javax.swing.*;
public class Arrays_RellenarMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Vamos a rellenar la matriz con JOptionPane
		
		String [] paises = new String [8];
		
		for (int i = 0; i < 8; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce país " + (i+1) );
		}
		for (String elementos : paises) {
			System.out.println("País: " + elementos);
		}

	}

}
