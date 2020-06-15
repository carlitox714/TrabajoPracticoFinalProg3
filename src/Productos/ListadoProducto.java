package Productos;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import Archivos.*;

public class ListadoProducto<T> extends ContenedorArrayList<Producto>
{
	
	private ContenedorArrayList<Producto> contenedor;
	private static String nombreArchivo = "productos.bin";
	private int idCount = 0;


	public ListadoProducto(ContenedorArrayList<Producto> contenedor) {
		super();
		this.contenedor = contenedor;
	}
	
	public int getIdcount()
	{
		return this.idCount;
	}
	
	public int setIdcount(int idCount)
	{
		return this.idCount;
	}
	

	public ListadoProducto() {
		super();
		contenedor = new ContenedorArrayList<Producto>();	
	}
	
	@Override
	public void agregar(Producto prod) throws Exception
	{
		
			if(!existeProducto(prod))
			{
				contenedor.agregar(prod);
				this.idCount++;
			}
			else
				throw new IOException("El producto ya se encuentra registrado");
			
		
	}
	
	@Override
	public Producto remover(int id)
	{
		return contenedor.remover(id);
		
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
	
	
	
	public void leerArchivo()
	{
		ArchivoProducto arch = new ArchivoProducto();
		contenedor = arch.levantarArchivo();
	}
	
	public void guardarArchivo()
	{
		ArchivoProducto arch = new ArchivoProducto();
		arch.guardarArchivo(contenedor);
	}
	
	

	@Override
	public String toString() {
		return contenedor.toString();
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
