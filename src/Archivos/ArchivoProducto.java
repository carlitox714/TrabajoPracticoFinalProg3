package Archivos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import Contenedores.ContenedorArrayList;
import Productos.ListadoProducto;
import Productos.Producto;

public class ArchivoProducto
{
	private static String nombreArchivo = "productos.bin";
	
	
	public ListadoProducto<Producto> levantarArchivo()
	{
		ObjectInputStream arch = null;
		ListadoProducto<Producto> aux = new ListadoProducto<Producto>();
		
		try 
		{
			arch = new ObjectInputStream(new FileInputStream(nombreArchivo));
			try {
				aux = (ListadoProducto<Producto>) arch.readObject();
			} catch (ClassNotFoundException e) {
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
	
	public void guardarArchivo(ListadoProducto<Producto> listadoProducto)
	{
		try{
		    ObjectOutputStream arch = new ObjectOutputStream(new FileOutputStream(nombreArchivo));

		    arch.writeObject(listadoProducto);
		    arch.flush();
		    arch.close();

		}catch (IOException e) {
		    e.printStackTrace();
		}
		
	}
}
