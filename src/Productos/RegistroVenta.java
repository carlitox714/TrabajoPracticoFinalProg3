package Productos;


public class RegistroVenta<K,T> extends Contenedor<Integer,Venta>
{
	Contenedor<Integer,Venta> contenedor = new Contenedor<Integer,Venta>();	
	
	public void agregar(int id, Venta venta)
	{
		Integer integer = new Integer(id);
		contenedor.agregar(integer,venta);
	}
	
	public Venta removerVenta(int id)
	{
		return contenedor.remover(id);
	}
	
	public RegistroVenta<K, T> getCarrito()
	{
		return (RegistroVenta<K, T>)contenedor;
	}
	
		
		

	public Contenedor<Integer,Venta> getCompra()
	{
		return contenedor;
		
	}
	
	
}
