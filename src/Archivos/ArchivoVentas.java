package Archivos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Contenedores.Contenedor;
import Contenedores.ContenedorArrayList;
import Productos.Producto;
import Ventas.ListadoVentas;
import Ventas.RegistroVenta;
import Ventas.Venta;

public class ArchivoVentas
{
private static String nombreArchivo = "Resgistro de Ventas.bin";
	
	/**
	 * M�todo que levanta losdatos del archivo registroventas.bin
	 * @return Listado de Ventas presentes en el archivo
	 */
	public ListadoVentas<Integer,RegistroVenta<Venta>> levantarArchivo()
	{
		ObjectInputStream arch = null;
		ListadoVentas<Integer,RegistroVenta<Venta>> aux = new ListadoVentas<Integer,RegistroVenta<Venta>>();
		
		try 
		{
			arch = new ObjectInputStream(new FileInputStream(nombreArchivo));
			try 
			{
				aux =  (ListadoVentas<Integer,RegistroVenta<Venta>>) arch.readObject();
			} 
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
			arch.close();
		}
		catch(EOFException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return aux;
	}
	
	/**
	 * M�todo que guarda el listado de ventas en el archivo registroventas.bin
	 * @param ListadoVentas a guardar
	 */
	public void guardarArchivo(ListadoVentas<Integer, RegistroVenta<Venta>> venta)
	{
		try{
		    ObjectOutputStream arch = new ObjectOutputStream(new FileOutputStream(nombreArchivo));

		    arch.writeObject(venta);
		    arch.flush();
		    arch.close();

		}catch (IOException e) {
		    e.printStackTrace();
		}
		
	}
}
