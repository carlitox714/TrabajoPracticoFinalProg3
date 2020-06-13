package Productos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ListadoProducto<T> extends ContenedorArrayList<Producto>{
	
	private ContenedorArrayList<Producto> contenedor;


	public ListadoProducto(ContenedorArrayList<Producto> contenedor) {
		super();
		this.contenedor = contenedor;
	}

	public ListadoProducto() {
		super();
		contenedor = new ContenedorArrayList<Producto>();	
	}
	
	@Override
	public void agregar(Producto prod) throws Exception
	{
		
			if(!existeProducto(prod))
			contenedor.agregar(prod);
			else
				throw new IOException("El producto ya se encuentra registrado");
			
		
	}
	
	
	
	public boolean existeProducto(Producto prod) 
	{
		
		Iterator<Producto> iterator = contenedor.iterator();
	
		if(buscarProducto(prod) != null)
			return true;
		else
			return false;	
	
	}
	
	
	public Producto buscarProducto(Producto prod)
	{
		
		Iterator<Producto> iterator = contenedor.iterator();
	
		if(iterator.hasNext())
		{
			if(iterator.next().equals(prod))
			{
				System.out.println("caca");
				return prod;
			}
		}
		return null;
			
	}
	
	
	
	

	@Override
	public String toString() {
		return contenedor.toString();
	}

	public void remover(Producto prod)
	{
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Producto next() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
