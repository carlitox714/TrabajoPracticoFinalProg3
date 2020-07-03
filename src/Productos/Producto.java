package Productos;

import java.io.Serializable;

import Exepciones.StockInsuficienteException;


public abstract class Producto implements  Serializable
{	
	private int ID;
	private String nombre;
	private int precio;
	private boolean isVegano;
	private boolean isCeliaco;
	private boolean isAzucar;
	private boolean isVegetariano;
	protected int stock;
	protected int stockMin; 
	
	
	
	
	public Producto() 
	{
		super(); 
	}

	public Producto(int iD, String nombre, int precio, int calorias, boolean isVegano,
			boolean isCeliaco,boolean isVegetariano, boolean azucar, int stock, int stockMin) 
	{
		super();
		ID = iD;
		this.nombre = nombre;
		this.precio = precio;
		this.isVegano = isVegano;
		this.isCeliaco = isCeliaco;
		this.isAzucar = azucar;
		this.isVegetariano = isVegetariano;
		this.stock = stock;
		this.stockMin = stockMin;
	}
	
	
	
	

	
	public int getID() {
		return ID;
	}

	public void setID(int id) {
		ID = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isVegano() {
		return isVegano;
	}
	
	public boolean isVegetariano() {
		return isVegetariano;
	}

	public void setVegano(boolean isVegano) {
		this.isVegano = isVegano;
	}

	public boolean isCeliaco() {
		return isCeliaco;
	}

	public void setCeliaco(boolean isCeliaco) {
		this.isCeliaco = isCeliaco;
	}

	public boolean isAzucar() {
		return isAzucar;
	}

	public void setAzucar(boolean azucar) {
		this.isAzucar = azucar;
	}

	public void setVegetariano(boolean vegetariano) {
		this.isVegetariano = vegetariano;
	}
	
	
	/**
	 * Metodo para verificar y reducir stock de un producto
	 * @param recibe la cantidad de productos a reducir
	 * @exception Si no se puede reducr se lanza una exepecion
	 */
	
	public void reducirStock(int cant) throws StockInsuficienteException
	{
		int newStock = this.stock - cant;
		if(newStock >= 0)
		{
			this.stock = newStock;
		}
		else 
		{
			throw new StockInsuficienteException("No hay Stock suficiente");
		}
	}
	
	public void aumentarStock(int cant)
	{
		this.stock = this.stock + cant;
	}
	
	public int getStock()
	{
		return this.stock;
	}

	public void setStock(int stock)
	{
		this.stock = stock;
	}
	
	
		
	public int getStockMin() {
		return stockMin;
	}

	public void setStockMin(int stockMin) {
		this.stockMin = stockMin;
	}
	
	/**
	 * Metodo para recibir un string con menos datos
	 * @return devuelve un string con los datos seleccionados
	 */

	public String toStringSimple()
	{
		return this.getNombre()  + "       " + this.getPrecio() + "$        Stock: " + stock;
	}
	
	@Override
	public String toString()
	{
		String vegano;
		String vegetariano;
		String celiaco;
		String azucar;
		
		if(isVegano())
			vegano = "Si";
		else
			vegano = "No";
		
		if(isAzucar())
			azucar = "Si";
		else
			azucar = "No";
		
		if(isCeliaco())
			celiaco = "Si";
		else
			celiaco = "No";
		
		if(isVegetariano())
			vegetariano = "Si";
		else
			vegetariano = "No";
		
		return " ID=" + ID +",nombre=" + nombre  + ",precio=" + precio +  ",stock=" + stock + ",Vegano=" + vegano + ",Celiaco=" + celiaco + ",Azucar=" + azucar  + ",Vegetariano=" + vegetariano +"\n" ;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Producto)
		{
				
			Producto prod = (Producto) obj;
			if(this.nombre.equals(prod.nombre))
				return true;
			else
				return false;
			
		}
		else return false;
		
	}
}
