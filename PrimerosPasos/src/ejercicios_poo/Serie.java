package ejercicios_poo;

/*Crearemos una clase llamada Serie con las siguientes características:
[x]Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
[x]Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de atributos serán 
valores por defecto según el tipo del atributo.
Los constructores que se implementaran serán:
[x]Un constructor por defecto.
[x]Un constructor con el titulo y creador. El resto por defecto.
[x]Un constructor con todos los atributos, excepto de entregado.
Los métodos que se implementara serán:
[x]Métodos get de todos los atributos, excepto de entregado.
[x]Métodos set de todos los atributos, excepto de entregado.
[x]Sobrescribe los métodos toString.
*/

public class Serie {
	
	// Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
	// Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de atributos serán 
	//valores por defecto según el tipo del atributo.
	private String titulo;
	private int numero_de_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	
	private final static String TITULO_DEF = "";
	private final static int TEMPORADAS_DEF = 3;
	private final static boolean ENTREGADO_DEF = false;
	private final static String GENERO_DEF = "";
	private final static String CREADOR_DEF = "";
	
	
	/**
	 * Contructor sin parametros
	 */
	public Serie () {
		this(TITULO_DEF, TEMPORADAS_DEF, GENERO_DEF, CREADOR_DEF, ENTREGADO_DEF);
		//ESTE CONSTRUCOR ESTA LLAMADO AL OTRO QUE ALMACENA TODOS LOS PARÁMETROS, ASÍ NO HAY QUE 
		//ESCRIBIRLOS EN TODOS
	}
	
	/**
	 * Un constructor con el titulo y creador. El resto por defecto.
	 * @param titulo {String} Titulo de la serie
	 * @param creador {String} Creador de la serie
	 */
	public Serie (String titulo, String creador) {
		this(titulo, TEMPORADAS_DEF, GENERO_DEF, creador, ENTREGADO_DEF);
	}
	
	/**
	 * Un constructor con todos los atributos.
	 * @param titulo {String} Titulo de la serie
	 * @param numero_de_temporadas {int} numero de temporadas
	 * @param genero {String} genero de la serie
	 * @param creador {String} Creador de la serie
	 * @param entregado {boolean} Si esta emtregado
	 */
	public Serie (String titulo, int numero_de_temporadas, String genero, String creador, boolean entregado) {	
		this.titulo = titulo;
		this.numero_de_temporadas = numero_de_temporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;		
	}
	
	// Métodos get de todos los atributos, excepto de entregado.

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the numero_de_temporadas
	 */
	public int getNumero_de_temporadas() {
		return numero_de_temporadas;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}

	
	// Métodos set de todos los atributos, excepto de entregado.
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @param numero_de_temporadas the numero_de_temporadas to set
	 */
	public void setNumero_de_temporadas(int numero_de_temporadas) {
		this.numero_de_temporadas = numero_de_temporadas;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	
	// Sobrescribe los métodos toString.
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numero_de_temporadas=" + numero_de_temporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
