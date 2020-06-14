package Ventas;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Map;

import Archivos.Archivo;
import Productos.Contenedor;

public class listadoVentas<K,T> extends Contenedor<Integer, RegistroVenta<Venta>>
{
	public static int idCount=0;
	private int id;
	private static String nombreArchivo = LocalDate.now() + ".bin";
	Contenedor<Integer, RegistroVenta<Venta>> cont;
	
	public listadoVentas() {
		super();
		this.cont = new Contenedor<Integer, RegistroVenta<Venta>>();
		this.id=0;

	}

	 
	public listadoVentas(int id, Contenedor<K, T> cont) {
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
	
	public Contenedor leerArchivo()
	{
		Contenedor aux = new Contenedor();
		Archivo arch = new Archivo();
		aux =(Contenedor) arch.leer("/Registro de Ventas/" + nombreArchivo);
		return aux;
	}
	
	public void guardarArchivo(Contenedor cont)
	{
		Archivo arch = new Archivo();
		arch.guardar(cont, "/Registro de Ventas/" + nombreArchivo);
	}
	
	

}



