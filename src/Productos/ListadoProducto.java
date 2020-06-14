package Productos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
		
			if(! existeProducto(prod))
				contenedor.agregar(prod);
			else
				throw new IOException("El producto ya se encuentra registrado");
	}
	
	
	public Producto getProducto(String nombre)
	{
		Iterator<Producto> iterator = contenedor.iterator();
	
		while(iterator.hasNext())
		{
			Producto prod = iterator.next();
			if(nombre.equals(prod.getNombre()))
			{
				return prod;
			}
		}
		return null;	
	}
	

	
	public boolean existeProducto(Producto prod)
	{
		Iterator<Producto> iterator = contenedor.iterator();
	
		while(iterator.hasNext())
		{
			if(iterator.next().equals(prod))
			{
				return true;
			}
		}
		return false;
	}
	
	
	public int cantProd()
	{
		int cont = 0;
		
		Iterator<Producto> iterator = contenedor.iterator();
		
		while(iterator.hasNext())
		{
			cont++;
			iterator.next();
		}
		return cont;
			
	}
	
	
	
	
	
	public String[] getNombres()
	{
		int cont = 0;
		int cantProd = cantProd();
		
		String[] str = new String[cantProd];
		
		Iterator<Producto> iterator = contenedor.iterator();
		
		while(iterator.hasNext())
		{
			Producto prodcto = iterator.next();
			str[cont] = (String) prodcto.getNombre();
			cont++;
			
		}
		return str;
			
	}
	

	public String[] listaSimple()
	{
		int cont = 0;
		int cantProd = cantProd();
		
		String[] str = new String[cantProd];
		
		Iterator<Producto> iterator = contenedor.iterator();
		
		while(iterator.hasNext())
		{
			Producto prodcto = iterator.next();
			str[cont] = (String) prodcto.toStringSimple();
			cont++;
			
		}
		return str;
			
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
