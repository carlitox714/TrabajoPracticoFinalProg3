package Productos;

import java.io.Serializable;
import java.sql.Date;


public class Producto implements Serializable
{
	
	
	private int ID;
	private String nombre;
	private String categoria;
	private int precio; 
	private int calorias;
	private boolean isVegano;
	private boolean isCeliaco;
	private boolean azucar;
	private int stock; 
	private int stockMinimo;
	
	
	
	
	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

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
		this.calorias = calorias;
		this.isVegano = isVegano;
		this.isCeliaco = isCeliaco;
		this.azucar = azucar;
		this.stock = stock;
	}
	
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + (azucar ? 1231 : 1237);
		result = prime * result + calorias;
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
			if(this.nombre == prod.nombre)
				return true;
			else
				return false;
			
		}
		else return false;
		
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

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public boolean isVegano() {
		return isVegano;
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
		return azucar;
	}

	public void setAzucar(boolean azucar) {
		this.azucar = azucar;
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
	
	public void setStock(int id,int stock)
	{
		this.stock = stock;
	}

	
	@Override
	public String toString()
	{
		return nombre  + ", precio=" + precio
				+ ", calorias=" + calorias + ", stock=" + stock + "]\n" ;
	}
	
	

}
