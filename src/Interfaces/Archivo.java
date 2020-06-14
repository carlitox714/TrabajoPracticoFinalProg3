package Interfaces;

import java.io.*;

import Productos.Contenedor;
import Productos.ContenedorArrayList;

public class Archivo<T> implements Serializable
{
	public static void guardar(Object o, String nombreArchivo)
	{
		ObjectOutputStream arch = null;
		try
		{
			arch = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
			arch.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public ContenedorArrayList<T> leer(String nombreArchivo) throws ClassNotFoundException
	
	{
		ObjectInputStream arch = null;
		Object obj = new Object();
		try
		{
			arch = new ObjectInputStream(new FileInputStream(nombreArchivo));
			obj = arch.readObject();
		
			arch.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return (ContenedorArrayList<T>)obj;
	}
}
