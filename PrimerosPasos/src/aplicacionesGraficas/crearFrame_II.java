package aplicacionesGraficas;
import java.awt.*;
import javax.swing.*;

class crearFrame_II {

	public static void main(String[] args) {
		
		marcoCentrado miMarco = new marcoCentrado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
		

		
	}

}

class marcoCentrado extends JFrame {
	
	public marcoCentrado() {
		
		//VAMOS A DETECTAR LA RESOLUCIÓN DE PANTALLA: objeto de tipo toolkit
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		//TAMAÑO DE LA VENTANA: Toolkit.getScreenSize() es un objeto de tipo dimension
		
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		
		//Ya hemos almacenado los datos en tamanoPantalla (ancho y alto) y ahora necesitamos extraerlos
		//Son campos de la clase Dimension (width - ancho   height - alto)
		
		int anchoPantalla = tamanoPantalla.width;
		int altoPantalla = tamanoPantalla.height;
		
		//VAMOS A CREAR UN MARCO CENTRADO QUE TENGA LA MITAD DEL ALTO Y LA MITAD DEL ANCHO 
		setSize(anchoPantalla/2 , altoPantalla/2); //PRIMERO SIEMPRE ES EL ANCHO
		
		/*CENTRARLO: dividir altura y anchura entre 4
		setLocation(anchoPantalla/4 , altoPantalla/4);*/
		
		//¡¡¡CON ESTE METODO SE CENTRA SIEMPRE EN EL CENTRO!! claseJFrame setLocationRelativeTo(null)
		setLocationRelativeTo(null);
		setTitle("Ventana centrada");
		
		//ICONONUEVO: getImage, clase TOOLKIT
		
		Image miIcono = miPantalla.getImage("src\\aplicacionesGraficas\\coronavirus.jpg"); 
		//Empezar por la raiz de la carpeta del proyecto
		
		//ADMITE      GIF, JPEG or PNG
		setIconImage(miIcono);
		
		System.out.println("El fijo \"me voy\"");
		
		
		/*otra forma de cambiar iconos de los JFrame es la siguiente: usando la clase 
		ImageIcon para definir la ruta relativa a la imagen ejemp: 
		ImageIcon icono = new ImageIcon(getClass().getResource("<ruta a  la imagen dentro de un paquete en el directorio src>")).getImage(); 
		setIconImage(icono);*/
		
		
		
		
	}
	
}