package Main;

import Productos.Producto;
import Ventas.ListadoVentas;
import Ventas.RegistroVenta;
import Ventas.Venta;
import Vistas.VistaLogin;
import JSON.ProductoJSON;
import Productos.ListadoProducto;


public class Main {

	public static void main(String[] args) throws Exception
	{
		
		ListadoProducto<Producto> listProd = new ListadoProducto<Producto>();
		ProductoJSON son = new ProductoJSON();
		ListadoVentas<Integer,RegistroVenta<Venta>> listVentas = new ListadoVentas<Integer,RegistroVenta<Venta>>();

		listProd.leerArchivo();
		listVentas.leerArchivo();		
		
		//System.out.println(listVentas.toString());
		
		System.out.println(listProd.toString());
		//
		VistaLogin login = new VistaLogin(listProd, listVentas);
		login.setVisible(true);
		
		/*
		Producto prod1 = new Producto(0, "manzana", null, 15, 0, false, false, false,490);
		Producto prod2 = new Producto(1, "banana", null, 45, 0, false, false, false,292);
		Producto prod3 = new Producto(2, "ayauasca", null, 11, 0, false, false, false,609);
		Producto prod4 = new Producto(3, "leche1lt", null, 80, 0, false, false, false,940);
		Producto prod5 = new Producto(4, "barrita de cereal", null, 35, 0, false, false, false,490);
		Producto prod6 = new Producto(5, "Pepas", null, 10, 0, false, false, false,490);

		try 
		{
		listProd.agregar(prod1);
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try 
		{
		listProd.agregar(prod2);
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try 
		{
		listProd.agregar(prod3);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try 
		{
		listProd.agregar(prod4);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
		try 
		{
		listProd.agregar(prod5);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		listProd.guardarArchivo();
		
		//listProd.leerArchivo();
	//	System.out.println(listProd.toString());
	
	
	
		RegistroVenta<Venta> reg1 = new RegistroVenta<Venta>();
		RegistroVenta<Venta> reg2 = new RegistroVenta<Venta>();
		
		
/*
		
		Venta aux;
		aux = new Venta(prod1,2);
		reg1.agregar(aux);
		prod2.reducirStock(4);
		
		
		aux =new Venta(prod1,5);
		reg1.agregar(aux);
		prod4.reducirStock(9);
		
		aux = new Venta(prod1,2);
		reg1.agregar(aux);
		prod2.reducirStock(5);
		
		
		aux =new Venta(prod1,14);
		reg1.agregar(aux);
		prod3.reducirStock(9);
		
		aux = new Venta(prod1,9);
		reg2.agregar(aux);
		prod2.reducirStock(5);
		
		
		aux =new Venta(prod1,5);
		reg2.agregar(aux);
		prod4.reducirStock(9);
		
		aux = new Venta(prod1,2);
		reg2.agregar(aux);
		prod2.reducirStock(5);
		
		
		aux =new Venta(prod1,14);
		reg2.agregar(aux);
		prod3.reducirStock(9);	

		listVentas.agregar(reg1);
		listVentas.agregar(reg2);
		listVentas.agregar(reg2);
		listVentas.agregar(reg2);
		*/
	//	listVentas.guardarArchivo();
		
	//	lista.leerArchivo();
	//	System.out.println(lista.toString());
		
		/*
		son.guardarJSON(son.lista2JSON(listProd));
		listProd = son.levantarJSON();
		System.out.println(listProd.toString());
		*/
	}

}
