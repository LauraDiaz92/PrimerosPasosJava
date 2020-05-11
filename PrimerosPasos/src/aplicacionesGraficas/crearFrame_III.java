package aplicacionesGraficas;
import javax.swing.*;
import java.awt.*;
public class crearFrame_III {

	public static void main(String[] args) {

		//VAMOS A CREAR UNA L�MINA PARA ESCRIBIR EN EL FRAME CON LA CLASE JPANEL, M�TODO PAINTCOMPONENT  (GRAPHICS G)
		//                                                          CLASE GRAPHICS, M�TODO DRAWSTRING()      
		
		marcoConTexto miMarco = new marcoConTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marcoConTexto extends JFrame {
	
	public marcoConTexto() {
		
		setVisible(true);
		setBounds(350, 150, 600, 500);
		setTitle("Hola que tal");
		//UNA VEZ CONSTRUIDA LA LAMINA, LA VAMOS A AGREGAR A NUESTRO MARCO:
		lamina miLamina = new lamina();
		add(miLamina);
		
		
	}
	
}

//AHORA VAMOS A CREAR UNA L�MINA. CLASE QUE HEREDE DE DE JPANEL. en este ejemplo no vamos a crear constructor, asi que va a 
// usar el CONSTRUCTOR POR DEFECTO

class lamina extends JPanel{
	
	//Vamos a sobreescribir el m�todo PAINTCOMPONENT para pintar lo que nosotros queramos. Es decir, el m�todo tiene
	//dibujos por defecto, pero al sobreescribirlo podemos crear los nuestros propios
	
	public void paint(Graphics g) {
		
		super.paintComponent(g); //DECIRLE QUE HAGA SU TRABAJO
		g.drawString("Este es mi primer texto aprendendo swing", 100, 100); // DECIRLE QUE A�ADA LO QUE NOSOTROS QUERAMOS
		
		//Si lo dejamos asi, le estamos diciendo que nos escriba el texto pero no le estamos diciendo que realice las funciones
		//para las que fue programado, por lo tanto tenemos que invocarlo (al m�todo de la clase padre) con SUPER
	}
	
	
}