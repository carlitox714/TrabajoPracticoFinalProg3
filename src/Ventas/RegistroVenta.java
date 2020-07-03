package Ventas;

import java.io.Serializable;
import java.util.Calendar;

import Contenedores.ContenedorArrayList;



public class RegistroVenta<T> extends ContenedorArrayList<Venta> implements Serializable
{
	
	private Calendar date;
	private ContenedorArrayList<Venta> contenedor;	
	
	
	public RegistroVenta() {
		this.contenedor = new ContenedorArrayList<Venta>();
		this.date = Calendar.getInstance();
	}

	public RegistroVenta(ContenedorArrayList<Venta> contenedor) {
		this.contenedor = contenedor;
		this.date = Calendar.getInstance();
	}

	
	@Override
	public void agregar(Venta venta)
	{
		contenedor.agregar(venta);
		
	}
	

	
	public Venta removerVenta(int id)
	{
		return contenedor.remover(id);
	}
	
	
	@Override
	public String toString() 
	{
		return (contenedor.toString() + this.date.getTime() + "\n");
	}
	
	
	
	
}
