package Productos;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.*;

public class ProductoJSON 
{
	private static String nombreArchivo = "productos.json";
	
	
	public JSONObject crearOBJJSON(Producto prod)
	{
		JSONObject obj = new JSONObject();
		String id = Integer.toString(prod.getID());
		try
		{
			obj.put(id,prod);
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		return obj;
	}
	
	public JSONArray listatoJSON(ListadoProducto<Producto> list)
	{
		JSONArray arr = new JSONArray();
		int i = 0;
		while(list.getIdcount() < i)
		{
			arr.put(crearOBJJSON(list.getProducto(i)));
			i++;
		}
		return arr;
	}
	
	public void guardarJSON(JSONArray arr)
	{
		try
		{
			FileWriter arch = new FileWriter(nombreArchivo);
			arch.write(arr.toString());
			arch.flush();
			arch.close();
		}
		catch(IOException c)
		{
			c.printStackTrace();
		}
	}
	
	public String leerJSON()
	{
		String contenido = "";
		try
		{
			contenido = new String(Files.readAllBytes(Paths.get(nombreArchivo)));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return contenido;
	}
}
