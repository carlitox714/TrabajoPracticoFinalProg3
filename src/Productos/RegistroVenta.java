package Productos;

import java.util.Calendar;
import java.util.Date;

import sun.security.jca.GetInstance;

public class RegistroVenta<K,T> extends Contenedor<Integer,Venta>
{
	
	Calendar date;
	Contenedor<Integer,Venta> contenedor;	
	
	
	public RegistroVenta() {
		this.contenedor = new Contenedor<Integer,Venta>();
		this.date = Calendar.getInstance();
	}

	public RegistroVenta(Contenedor<Integer, Venta> contenedor) {
		this.contenedor = contenedor;
		this.date = Calendar.getInstance();

	}

	public void agregar(int id, Venta venta)
	{
		Integer integer = new Integer(id);
		contenedor.agregar(integer,venta);
	}
	
	public Venta removerVenta(int id)
	{
		return contenedor.remover(id);
	}
	
	public RegistroVenta<K,T> getCarrito()
	{
		return (RegistroVenta<K,T>)contenedor;
	}
	
	@Override
	public String toString() 
	{
		return (contenedor.toString() + this.date.getTime() + "\n");
	}
	
	
	public Contenedor<Integer,Venta> getCompra()
	{
		return contenedor;
		
	}
	
	
}
