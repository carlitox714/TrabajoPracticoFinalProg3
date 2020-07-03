package Productos;

import java.awt.List;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;

import com.sun.scenario.effect.impl.prism.PrDrawable;

import Archivos.*;
import Contenedores.ContenedorArrayList;
import Exepciones.ProductoReptidoException;
import Interfaces.IABM;

public class ListadoProducto<T> extends ContenedorArrayList<Producto>
{
	
	private static String nombreArchivo = "productos.bin";
	private int idCount = 0;

	/**
	 * 
	 * @return Contador del ID
	 */
	public int getIdcount()
	{
		return this.idCount;
	}
	/**
	 * 
	 * @param idCount, int con el cual setear el contador del ID
	 * @return 
	 */
	public int setIdcount(int idCount)
	{
		return this.idCount = idCount;
	}
	

	public ListadoProducto()
	{
		super();	
	}

	/**
	 * Metodo para agregar un producto a la lista.
	 * @param Recibe un Producto ya cargado.
	 * @throws Falla al agregar un producto que ya se encuentra registrado.
	 */
	
	public void add(Producto prod) throws ProductoReptidoException
	{
		
			if(!existeProducto(prod))
			{
				super.agregar(prod);
				this.idCount++;
			}
			else
				throw new ProductoReptidoException("El producto ya se encuentra registrado");
			
		
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
	/**
	 * Metodo para recibir una Lista en formato correspondiente a la vista.
	 * @return retorna una list en modo de String[] para mostrarla en la vista
	 */
	
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
	
	/**
	 * Metodo para conseguir un producto mandando el nombre
	 * @param recibe el nombre del producto a buscar
	 * @return retorna un producto
	 */

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
	
	/**
	 * 	Método para conseguir el producto mandando el id.
	 * @param id del producto solicitado.
	 * @return Producto solicitado.
	 */
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
	
	/**
	 * Metodo iterar sobre la lista y reemplazar un producto a modificar.
	 * @param recibe el producto modificado.
	 */	
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
	
	/**
	 * Metodo verificar la existencia del producto.
	 * @param recibe el producto.
	 * @return returna verdadero si el producto existe en la lista.
	 */	
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
	
	/**
	 * Método para conseguir la cantidad de productos en en listado.
	 * @return Cantidad de productos en el listado.
	 */
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
	
	
	/**
	 * Metodo para agregar los valores de  una lista de productos a otra
	 * @param recibe el una lista 
	 */
	
	
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
	/**
	 * Metodo para listar de manera que el swing reconozca los diferentes productos
	 * @param recibe el una lista 
	 */

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
	
	/**
	 * Metodo para leer el archivo de productos
	 */
	
	public void leerArchivo() throws Exception
	{
		ArchivoProducto arch = new ArchivoProducto();
		this.lista2lista(arch.levantarArchivo());
	}
	
	/**
	 * Metodo para guardar el archivo de productos
	 */
	 
	public void guardarArchivo() throws CloneNotSupportedException
	{
		ArchivoProducto arch = new ArchivoProducto();
		ListadoProducto<Producto> aux = (ListadoProducto<Producto>) this; 
		arch.guardarArchivo(aux);
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
