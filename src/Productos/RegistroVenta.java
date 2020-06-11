package Productos;

import java.util.Calendar;



public class RegistroVenta<T> extends ContenedorArrayList<Venta> 
{
	
	Calendar date;
	ContenedorArrayList<Venta> contenedor;	
	
	
	public RegistroVenta() {
		this.contenedor = new ContenedorArrayList<Venta>();
		this.date = Calendar.getInstance();
	}

	public RegistroVenta(ContenedorArrayList<Venta> contenedor) {
		this.contenedor = contenedor;
		this.date = Calendar.getInstance();

	}

	

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
