package Ventas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import Archivos.*;
import Contenedores.Contenedor;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class ListadoVentas<K,T> extends Contenedor<Integer, RegistroVenta<Venta>> implements Cloneable
{
	public static int idCount=0;
	private int id;

	private static String nombreArchivo = "registroVentas.bin";
	
	public ListadoVentas() {
		super();
		this.id=0;
	}
	 
	public ListadoVentas(int id, Contenedor<K, T> cont) {
		super();
		this.id = id;
	}
	

	public int getId()
	{
		return this.id;
	}
	/**
	 * Metodo para agregar una venta a la lista
	 * @param recibe una venta con los productos previamente creada
	 */

	public void agregar(RegistroVenta<Venta> venta)
	{	
		id = idCount;
		this.agregar(id,venta);
		idCount++;
		
	}
	
	/**
	 * Metodo para agregar los valores de  una lista de ventas a otra
	 * @param recibe el una lista 
	 */
	
	public void lista2lista(Contenedor<Integer, RegistroVenta<Venta>> lista2) throws Exception
	{
		
		Map<Integer, RegistroVenta<Venta>> map = (Map<Integer, RegistroVenta<Venta>>) lista2.getElementos();
		Iterator<Map.Entry<Integer, RegistroVenta<Venta>>> entries = map.entrySet().iterator();

		
		for (Map.Entry<Integer, RegistroVenta<Venta>> entry : map.entrySet()) 
		{
		    this.agregar((RegistroVenta<Venta>)entry.getValue());
		}
	}
	
		
	

	
	

	public String toString() 
	{
		Map<Integer, RegistroVenta<Venta>> map = this.getElementos();
		Iterator<Map.Entry<Integer, RegistroVenta<Venta>>> entries = map.entrySet().iterator();
		String aux = "";
		for (Map.Entry<Integer, RegistroVenta<Venta>> entry : map.entrySet()) 
		{
		    aux = aux + "ID REGISTRO: " +  entry.getKey() + "\n" +  entry.getValue().toString() + "\n" ;
		}
		return  aux;
	}
	
	/**
	 * Metodo para leer el archivo de ventas
	 */
	
	
	public void leerArchivo() throws Exception
	{
		ArchivoVentas arch = new ArchivoVentas();
		
		this.lista2lista(arch.levantarArchivo());
	}
	
	/**
	 * Metodo para guardar el archivo de ventas
	 */
	
	public void guardarArchivo() 
	{
		ArchivoVentas arch = new ArchivoVentas();
		ListadoVentas<Integer, RegistroVenta<Venta>> aux = (ListadoVentas<Integer,RegistroVenta<Venta>>) this;
		arch.guardarArchivo(aux);
	}

}



