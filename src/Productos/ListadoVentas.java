package Productos;

import java.util.Iterator;
import java.util.Map;
import Archivos.*;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class ListadoVentas<K,T> extends Contenedor<Integer, RegistroVenta<Venta>>
{
	public static int idCount=0;
	private int id;
	private Contenedor<Integer, RegistroVenta<Venta>> cont;
	private static String nombreArchivo = "registroVentas.bin";
	
	public ListadoVentas() {
		super();
		this.cont = new Contenedor<Integer, RegistroVenta<Venta>>();
		this.id=0;
	}
	 
	public ListadoVentas(int id, Contenedor<K, T> cont) {
		super();
		this.id = id;
	}
	
	public ListadoVentas<Integer, Venta> getListado()
	{
		return (ListadoVentas<Integer, Venta>) cont;
	}
	
	public int getId()
	{
		return this.id;
	}


	public void agregar(RegistroVenta<Venta> venta)
	{	
		id = idCount;
		cont.agregar(id,venta);
		idCount++;
	}
	
	
	public RegistroVenta<Venta> remover(int id)
	{
		
		return cont.remover(id);
	}
	
	
	public String toString() 
	{
		Map<Integer, RegistroVenta<Venta>> map = cont.getElementos();
		Iterator<Map.Entry<Integer, RegistroVenta<Venta>>> entries = map.entrySet().iterator();
		String aux = "";
		for (Map.Entry<Integer, RegistroVenta<Venta>> entry : map.entrySet()) 
		{
		    aux = aux + "ID REGISTRO: " +  entry.getKey() + "\n" +  entry.getValue().toString() + "\n" ;
		}
		return  aux;
	}
	
	public void leerArchivo()
	{
		ArchivoVentas arch = new ArchivoVentas();
		cont =(Contenedor) arch.levantarArchivo();
	}
	
	public void guardarArchivo()
	{
		ArchivoVentas arch = new ArchivoVentas();
		arch.guardarArchivo(cont);
	}

}


