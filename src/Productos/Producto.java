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
	
	
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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

	public void setStock(int stock) {
		this.stock = stock;
	}

	//private Date vencimiento; 
	public Producto(int iD, String nombre, String categoria, int precio, int calorias, boolean isVegano,
			boolean isCeliaco, boolean azucar) 
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
	
	public int getStock()
	{
		return this.stock;
	}
	
	public void setStock(int id,int stock)
	{
		this.stock = stock;
	}
	
	public void addStock(int id,int stock)
	{
		this.stock = this.stock + stock;
	}
	
	public void removeStock(int id,int stock)
	{
		this.stock = this.stock - stock;
	}
	
	
	
	

}
