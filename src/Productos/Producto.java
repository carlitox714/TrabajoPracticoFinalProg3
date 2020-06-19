package Productos;

import java.io.Serializable;


public class Producto implements  Serializable
{	
	private int ID;
	private String nombre;
	private String categoria;
	private int precio;
	private boolean isVegano;
	private boolean isCeliaco;
	private boolean isAzucar;
	private boolean isVegetariano;
	protected int stock; 
	
	
	
	
	public Producto() 
	{
		super(); 
	}

	public Producto(int iD, String nombre, String categoria, int precio, int calorias, boolean isVegano,
			boolean isCeliaco, boolean azucar, int stock) 
	{
		super();
		ID = iD;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.isVegano = isVegano;
		this.isCeliaco = isCeliaco;
		this.isAzucar = azucar;
		this.stock = stock;
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
	
	public boolean reducirStock(int cant)
	{
		int newStock = this.stock - cant;
		if(newStock >= 0)
		{
			this.stock = newStock;
			return true;
			}
			else 
			{
				return false;
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
		
	public String toStringSimple()
	{
		return this.getNombre()  + "                " + this.getPrecio() + "                " + stock;
	}
	
	@Override
	public String toString()
	{
		return "[ID=" + ID +",nombre=" + nombre  + ",categoria=" + categoria + ",precio=" + precio +  ",stock=" + stock + ",Vegano=" + isVegano + ",Celiaco=" + isCeliaco + ",Azucar=" + isAzucar + ",Vegetariano=" + isVegetariano +"]\n" ;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + (isAzucar ? 1231 : 1237);
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + (isCeliaco ? 1231 : 1237);
		result = prime * result + (isVegano ? 1231 : 1237);
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + precio;
		result = prime * result + stock;
		return result;
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
