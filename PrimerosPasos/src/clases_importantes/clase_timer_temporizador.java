package clases_importantes;
import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class clase_timer_temporizador {

	public static void main(String[] args) {

		//Vamos a crear un programa que imprime por pantalla la hora que es cada x tiempo.
		//Para crear un temporizador se utiliza la CLASE TIMER
		
		dameLaHora oyente = new dameLaHora();
		
		//También funcionaría esto : crear una instancia de tipo ActionListener (interfaz), pero a la hora de
		//llamar al constructor le decimos que es de tipo dameLaHora (clase de la interfaz)
		//ActionListener oyente = new dameLaHora()
		
		//Construtor: 
				//primer parámetro: cuánto tiempo va a tardar la acción en repetirse(en milisegundos)
				//segundo parámetro: objeto de tipo interfaz. (Ver siguiente clase)
		Timer mi_temporizador = new Timer (5000, oyente);
		
		//Método: START() es de la clase TIMER. Para que comienze a ejecutar el temporizador
		
		mi_temporizador.start();
		
		//Vamos a decirle ahora durante cuando tiempo queremos que este programa esté en ejecución. 
		// En JOptionPane hay un método que, en vez de pedir información por pantalla, muestra
		// información por pantalla. Se llama showMessageDialog(). Vamos a tener que pararlo manualmente
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		System.exit(0); //DETIENE LA EJECUCIÓN DEL PROGRAMA
		
		
	}

}

	// La interfaz se llama ActionListener (java.awt.event)
		// y el método de esta interfaz es actionPerformed(ActionEvent e)

class dameLaHora implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		//Queremos que salga en consola la hora cada 5 segundos
		
		Date ahora = new Date();
		System.out.println("Te pongo lo hora cada 5 segundos " + ahora);
		
		//Ahora además de imprimir, vamos a usar TOOLIK para que haga un beep en cada impresión
		
		Toolkit.getDefaultToolkit().beep();
	}
	
}