package Archivos;

import java.io.*;

public class Archivo<T> 
{
	public static void guardar(Object o, String nombreArchivo)
	{
		ObjectOutputStream arch = null;
		try
		{
			arch = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public Object leer(String nombreArchivo)
	{
		ObjectInputStream arch = null;
		try
		{
			arch = new ObjectInputStream(new FileInputStream(nombreArchivo));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return arch;
	}
}
