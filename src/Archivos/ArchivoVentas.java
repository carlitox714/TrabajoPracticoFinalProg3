package Archivos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Productos.Contenedor;
import Productos.ContenedorArrayList;
import Productos.Producto;
import Productos.RegistroVenta;
import Productos.Venta;

public class ArchivoVentas
{
private static String nombreArchivo = "Resgistro de Ventas.bin";
	
	
	public Contenedor<Integer, Venta> levantarArchivo()
	{
		ObjectInputStream arch = null;
		Contenedor<Integer, Venta> aux = new Contenedor<Integer, Venta>();
		
		try 
		{
			arch = new ObjectInputStream(new FileInputStream(nombreArchivo));
			try {
				aux = (Contenedor<Integer, Venta>) arch.readObject();
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
	
	public void guardarArchivo(Contenedor<Integer, RegistroVenta<Venta>> prod)
	{
		try{
		    ObjectOutputStream arch = new ObjectOutputStream(new FileOutputStream(nombreArchivo));

		    arch.writeObject(prod);
		    arch.flush();
		    arch.close();

		}catch (IOException e) {
		    e.printStackTrace();
		}
		
	}
}
