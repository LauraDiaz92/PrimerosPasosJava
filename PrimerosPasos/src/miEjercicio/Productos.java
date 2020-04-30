package miEjercicio;

public class Productos {
	
	private double precio;
	private boolean tienedescuento;
	private double descuento;
	private int cantidad;
	private String marca;
	
	private final static double PRECIO_DEF = 0.00;
	private final static double DESCUENTO_DEF = 0.00;
	private final static boolean TIENEDESCUENTO_DEF = false;
	private final static int CANTIDAD_DEF = 0;
	private final static String MARCA_DEF = "";
	
	/**
	 * @param precio {double} precio del producto
	 * @param descuento {double} cuánto descuento en % tiene el producto
	 * @param tienedescuento {boolean} si el producto tiene descuento o no
	 * @param cantidad {int} cantidad de producto en la tienda
	 * @param marca {String} marca del producto
	 */
	
	public Productos (double precio,  boolean tienedescuento, double descuento, int cantidad, String marca) {
		
		this.precio = precio;
		this.descuento = descuento;
		this.tienedescuento = tienedescuento;
		this.cantidad = cantidad;
		this.marca = marca;
		
	}
	
	public Productos (boolean tienedescuento, double descuento) {
		
		this(PRECIO_DEF, tienedescuento, descuento, CANTIDAD_DEF, MARCA_DEF);
		
	}
	
		public Productos (double precio, int cantidad, String marca) {
		this(precio, TIENEDESCUENTO_DEF, DESCUENTO_DEF, cantidad, marca);
	}
			
}
