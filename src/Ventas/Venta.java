package Ventas;

import java.io.IOException;
import java.io.Serializable;

import Exepciones.StockInsuficienteException;
import Productos.Producto;

public class Venta implements Serializable
{
	private int id;
	private String nombre;
	private int precio;
	private int cantidad;
	private int precioTotal;
	
	public Venta()
	{
		this.cantidad = 0;
		this.nombre = "";
		this.precio = 0 ;
		this.precioTotal = 0;
	}
	
	/**
	 * Método para cargar una venta
	 * @param prod
	 * @param cantidad
	 * @throws StockInsuficienteException
	 */
	public void cargarVenta(Producto prod, int cantidad) throws StockInsuficienteException
	{		
		try
		{
			prod.reducirStock(cantidad);
			this.nombre = prod.getNombre();
			this.precio = prod.getPrecio();
			this.cantidad = cantidad;
			this.setPrecioTotal(precio * cantidad);
		
		}
		catch (StockInsuficienteException e) 
		{
			throw new StockInsuficienteException(e.getMessage());
		}
	}

	/**
	 * Método que devuelve el toString
	 * @return String resultante.
	 */
	@Override
	public String toString() {
		return  nombre + ", cantidad=" + cantidad + ", Total=" + precioTotal + "\n";
	}

	/**
	 * Método para conseguir la cantidad vendida.
	 * @return cantidad.
	 */
	public int getCantidad() {
		return cantidad;
	}
	
	/**
	 * Método para conseguir el id de la venta.
	 * @return id
	 */
	public int getId()
	{
		return this.id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidad;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + precio;
		result = prime * result + precioTotal;
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		if (cantidad != other.cantidad)
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (precio != other.precio)
			return false;
		if (precioTotal != other.precioTotal)
			return false;
		return true;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
