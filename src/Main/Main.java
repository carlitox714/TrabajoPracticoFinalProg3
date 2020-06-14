package Main;

import java.io.IOException;
import java.util.HashMap;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Productos.Venta;
import Productos.listadoVentas;
import Productos.Producto;
import Productos.RegistroVenta;
import Productos.Contenedor;
import Usuarios.Usuario;
import Productos.ListadoProducto;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		Producto prod1 = new Producto(0, "manzana", null, 15, 0, false, false, false,490);
		Producto prod2 = new Producto(1, "banana", null, 45, 0, false, false, false,292);
		Producto prod3 = new Producto(2, "ayauasca", null, 11, 0, false, false, false,609);
		Producto prod4 = new Producto(3, "leche1lt", null, 80, 0, false, false, false,940);
		Producto prod5 = new Producto(4, "barrita de cereal", null, 35, 0, false, false, false,490);
		Producto prod6 = new Producto(5, "Pepas", null, 10, 0, false, false, false,490);
		
		ListadoProducto<Producto> listProd = new ListadoProducto<Producto>();
		
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
		/*
		listProd.guardarArchivo();
		listProd.leerArchivo();
		System.out.println(listProd.toString());
	
		
		
		boolean agregarCarrito = false;
	
		RegistroVenta<Venta> reg1 = new RegistroVenta<Venta>();
		RegistroVenta<Venta> reg2 = new RegistroVenta<Venta>();
		
		
		System.out.println(listProd.toString());
		
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
		
		*/
		listadoVentas<Integer,RegistroVenta<Venta>> lista = new listadoVentas<Integer,RegistroVenta<Venta>>();
	/*
		lista.agregar(reg1);
		lista.agregar(reg2);
		lista.agregar(reg2);
		lista.agregar(reg2);
		
		lista.guardarArchivo();
		*/
		lista.leerArchivo();
		System.out.println(lista.toString());
		
			
				
		
		
		//System.out.println(lista.toString());
				
				
			
			
		

		
		
		
		

	}

}
