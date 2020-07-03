package JSON;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.*;

import Exepciones.AgregarProductoException;
import Productos.ListadoProducto;
import Productos.Producto;
import Productos.ProductoEnvasado;
import Productos.ProductoSuelto;

public class ProductoJSON 
{
	private static String nombreArchivo = "productos.json";
	
	
	public JSONObject crearOBJJSON(Producto prod)
	{
		JSONObject obj = new JSONObject();
		try
		{
			obj.put("ID",prod.getID());
			obj.put("nombre",prod.getNombre());
			obj.put("precio",prod.getPrecio());
			obj.put("vegano",prod.isVegano());
			obj.put("celiaco",prod.isCeliaco());
			obj.put("azucar",prod.isAzucar());
			obj.put("vegetariano",prod.isVegetariano());
			obj.put("stock",prod.getStock());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		return obj;
	}
	
	public JSONArray lista2JSON(ListadoProducto<Producto> list)
	{
		JSONArray arr = new JSONArray();
		int i = 0;
		while(list.getIdcount() > i)
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
	
	public ListadoProducto<Producto> levantarJSON()
	{
		ListadoProducto<Producto> list = new ListadoProducto<Producto>();
		JSONObject jsonobj = new JSONObject();
		int i = 0;
		
		try
		{
			JSONArray arr =  new JSONArray(leerJSON());
			while(true)
			{
				jsonobj = arr.getJSONObject(i);
				try 
				{
					list.add(JSONtoProducto(jsonobj));
				} 
				catch (AgregarProductoException e) 
				{
					e.printStackTrace();
				}
				i++;
			}
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	public Producto JSONtoProducto(JSONObject obj)
	{
		ProductoEnvasado prod = new ProductoEnvasado();
		try
		{
			prod.setID(obj.getInt("ID"));
			prod.setNombre(obj.getString("nombre"));
			prod.setPrecio(obj.getInt("precio"));
			prod.setVegano(obj.getBoolean("isVegano"));
			prod.setAzucar(obj.getBoolean("isAzucar"));
			prod.setCeliaco(obj.getBoolean("isCeliaco"));
			prod.setVegetariano(obj.getBoolean("isVegetariano"));
			prod.setStock(obj.getInt("stock"));			
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return prod;
	}
	
	
}
