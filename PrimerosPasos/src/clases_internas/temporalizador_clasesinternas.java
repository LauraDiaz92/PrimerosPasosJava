package clases_internas;

import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class temporalizador_clasesinternas {

	public static void main(String[] args) {
		
		//Vamos a crear una instancia perteneciente a la clase reloj
		
		reloj mireloj = new reloj (3000, true);
		
		//Decirle que ponga en funcionamiento este reloj
		
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "pulsa aceptar para terminar");
		
		System.exit(0);

	}

}

class reloj { 
	
	private int intervalo;
	private boolean sonido;
	
	public reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	//Ademas del constructor, esta clase reloj va a tener otro método que se va a encargar de poner en
	//marcha el programa para que empieze a imprimir por consola, con este método:
	
	public void enMarcha () {
		
		ActionListener oyente = new dameHora();
		//dameHora va a ser la clase interna
		
		Timer miTemporizador = new Timer (intervalo, oyente); //POR QUÉ AHORA NO ESTA DENTRO DEL MAIN??
		miTemporizador.start();
		
		//CLASE INTERNA: PRIVATE SÓLO LO PUEDEN TENER LAS CLASES INTERNAS
		
		private class dameHora implements ActionListener {
			
			public void ActionPerformed(ActionEvent event) {
				
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 segundos: " + ahora);
				
				if (sonido) {
					
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
	}
}
