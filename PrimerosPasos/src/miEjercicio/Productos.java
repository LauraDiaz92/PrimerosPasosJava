package miEjercicio;

public class Productos {
	
	private double precio;
	private boolean tienedescuento;
	private double descuento;
	private int cantidad;
	private String marca;
	
	private static final double PRECIO_DEF = 0.00;
	private static final double DESCUENTO_DEF = 0.00;
	private static final boolean TIENEDESCUENTO_DEF = false;
	private static final int CANTIDAD_DEF = 0;
	private static final String MARCA_DEF = "";
	
	
	/**
	 * 
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
		
	
		public Productos (boolean tienedescuento, double descuento) {
			
	}
		
		
	}
	
	

}
