package aplicacionesGraficas;
import java.awt.Frame;

import javax.swing.*;

class crearFrame_I {

	public static void main(String[] args) {

		//Vamos a crear una ventana. Vamos a usar dos clases diferentes
		
		miMarco miMarco1 = new miMarco();
		
		miMarco1.setVisible(true); //EN EL MAIN O EN LA OTRA CLASE?????
		//Tambi�n hay que decirle qu� tiene que hacer esta ventana cuando se cierre:
		miMarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EN EL MAIN O EN LA OTRA CLASE?????
		
	}

}

class miMarco extends JFrame {
	
	public miMarco() {
		/*
		//Establecer el tama�o:
		setSize(500, 300); //POR QUE NO PONE MIMARCO1.SETSIZE, AL IGUAL QUE HIZO CON SETVSIBLE????
		
		//Establecer la ubicaci�n:
		
		setLocation(400, 200);
		*/
		//Con el m�todo setBounds (x, y, ancho, largo) se puede prescindir de setSize y de setLocation
		
		setBounds(400, 200, 500, 300);
		
		//Para permitir que el usuario pueda redimensionar el marco o no:
		
		//setResizable(false);
		
		//Para que el marco se abra a pantalla completa:
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		//En la API, MAXIMIZE_BOTH es una constante que tiene valor de INT, si la pulsamos, comprobamos 
		//que su valor es 6. Por lo tanto, Frame.MAXIMIZE_BOTH se podr�a sustituir por 6
		
		//Darle un t�tulo
		
		setTitle("Esta es mi ventana");
		
		//Ahora vamos a colocarlo justo en el centro de la pantalla. Para ello tenemos que averiguar
		//la resoluci�n de nuestro monitor - CLASE TOOLKIT
		
		
		
		
	}
}