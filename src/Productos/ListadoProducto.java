package Productos;

import java.awt.List;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;

import com.sun.scenario.effect.impl.prism.PrDrawable;

import Archivos.*;
import Exepciones.AgregarProductoException;

public class ListadoProducto<T> extends ContenedorArrayList<Producto> 
{
	
	private static String nombreArchivo = "productos.bin";
	private int idCount = 0;

	
	public int getIdcount()
	{
		return this.idCount;
	}
	
	public int setIdcount(int idCount)
	{
		return this.idCount;
	}
	

	public ListadoProducto()
	{
		super();	
	}

	
	public void add(Producto prod) throws AgregarProductoException
	{
		
			if(!existeProducto(prod))
			{
				super.agregar(prod);
				this.idCount++;
			}
			else
				throw new AgregarProductoException("El producto ya se encuentra registrado");
			
		
	}
	


	public void ordenarId(int id)
	{
		Iterator<Producto> iterator = this.iterator();
	
		while(iterator.hasNext())
		{
			Producto prod = iterator.next();
			prod.setID(id);
			id++;
		}
	
	
	}
	
	
	public DefaultListModel<String> listadoString()
	{
		DefaultListModel<String> srt = new DefaultListModel<String>();
		Iterator<Producto> iterator = this.iterator();
		
		while(iterator.hasNext())
		{
			Producto prod = iterator.next();
			srt.addElement(prod.toStringSimple());
		}
		return srt;		
	}

	public Producto getProducto(String nombre)
	{
		Iterator<Producto> iterator = this.iterator();
	
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
	
	public Producto getProducto(int id)
	{
		Iterator<Producto> iterator = this.iterator();
	
		while(iterator.hasNext())
		{
			Producto prod = iterator.next();
			if(id == prod.getID())
			{
				System.out.println("\n\n"+ prod.toString()+"\n\n");
				return prod;
			}
		}
		return null;	
	}
	
	
	public void modificarProducto(Producto producto)
	{
		Iterator<Producto> iterator = this.iterator();
		
		while(iterator.hasNext())
		{
			Producto prod = iterator.next();
			if(producto.getNombre().equals(prod.getNombre()))
			{
				prod = producto;
			}
		}
		
	}
	

	
	public boolean existeProducto(Producto prod)
	{
		Iterator<Producto> iterator = this.iterator();
	
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
		Iterator<Producto> iterator = this.iterator();
		
		while(iterator.hasNext())
		{
			cont++;
			iterator.next();
		}
		return cont;		
	}
	
	
	public void lista2lista(ContenedorArrayList<Producto> lista2) throws Exception
	{
		Iterator<Producto> iterator = lista2.iterator();
	
		while(iterator.hasNext())
		{ 
			Producto prod = iterator.next();
			add(prod);	
		}		
	}
	

	
	public String[] getNombres()
	{
		int cont = 0;
		int cantProd = cantProd();
		
		String[] str = new String[cantProd];
		
		Iterator<Producto> iterator = this.iterator();
		
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
		int cont = 1;
		int cantProd = cantProd();
		
		String[] str = new String[cantProd +1];
		
		Iterator<Producto> iterator = this.iterator();
		
		str[0] = "";
		while(iterator.hasNext())
		{
			Producto prodcto = iterator.next();
			str[cont] = (String) prodcto.toStringSimple();
			cont++;
			
		}
		return str;
			
	}
	
	
	
	public void leerArchivo() throws Exception
	{
		ArchivoProducto arch = new ArchivoProducto();
		this.lista2lista(arch.levantarArchivo());
	}
	 
	public void guardarArchivo() throws CloneNotSupportedException
	{
		ArchivoProducto arch = new ArchivoProducto();
		arch.guardarArchivo((ContenedorArrayList<Producto>)this.clone());
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
