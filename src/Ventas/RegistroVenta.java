package Ventas;

import java.io.Serializable;
import java.util.Calendar;

import Contenedores.ContenedorArrayList;



public class RegistroVenta<T> extends ContenedorArrayList<Venta> implements Serializable
{
	
	private Calendar date;
	private ContenedorArrayList<Venta> contenedor;	
	
	public RegistroVenta()
	{
		this.contenedor = new ContenedorArrayList<Venta>();
		this.date = Calendar.getInstance();
	}

	public RegistroVenta(ContenedorArrayList<Venta> contenedor) {
		this.contenedor = contenedor;
		this.date = Calendar.getInstance();
	}

	/**
	 * Método para agregar una venta al registro
	 * @param venta a agregar.
	 */
	@Override
	public void agregar(Venta venta)
	{
		contenedor.agregar(venta);		
	}
	
	/**
	 * Método para remover una venta del registro
	 * @param id de la venta a remover.
	 */
	public Venta removerVenta(int id)
	{
		return contenedor.remover(id);
	}
	
	/**
	 * Método que devuelve el toString
	 * @return String resultante.
	 */
	@Override
	public String toString() 
	{
		return (contenedor.toString() + this.date.getTime() + "\n");
	}
}
