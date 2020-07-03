package Productos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import Archivos.*;

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


	public void agregar(RegistroVenta<Venta> venta)
	{	
		id = idCount;
		this.agregar(id,venta);
		idCount++;
		
	}
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
	
	public void leerArchivo() throws Exception
	{
		ArchivoVentas arch = new ArchivoVentas();
		
		this.lista2lista(arch.levantarArchivo());
	}
	
	public void guardarArchivo() throws CloneNotSupportedException
	{
		ArchivoVentas arch = new ArchivoVentas();
		arch.guardarArchivo((Contenedor<Integer, RegistroVenta<Venta>>)this.clone());
	}

}



