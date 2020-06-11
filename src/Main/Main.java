package Main;

import java.util.HashMap;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Productos.Venta;
import Productos.Producto;
import Productos.RegistroVenta;
import Productos.Contenedor;
import Usuarios.Usuario;
import Productos.ContenedorArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Producto prod1 = new Producto(0, "manzana", null, 15, 0, false, false, false,40);
		Producto prod2 = new Producto(1, "banana", null, 45, 0, false, false, false,22);
		Producto prod3 = new Producto(2, "frutilla", null, 11, 0, false, false, false,60);
		Producto prod4 = new Producto(3, "leche1lt", null, 80, 0, false, false, false,40);
		Producto prod5 = new Producto(4, "barrita de cereal", null, 35, 0, false, false, false,40);
		Producto prod6 = new Producto(5, "Pepas", null, 10, 0, false, false, false,40);
		
		boolean agregarCarrito = false;
		RegistroVenta<Venta> reg = new RegistroVenta<Venta>();
		
		
		Venta aux = new Venta(prod2,5);
		aux =new Venta(prod2,5);
		prod2 = aux.reducirStock(prod2);
		reg.agregar(aux);
		prod2.reducirStock(5);
		
		aux = new Venta(prod1,9);
		aux =new Venta(prod1,9);
		prod1 = aux.reducirStock(prod1);
		reg.agregar(aux);
		prod1.reducirStock(9);
		
		aux = new Venta(prod4,8);
		aux =new Venta(prod4,8);
		prod4 = aux.reducirStock(prod4);
		reg.agregar( aux);
		prod4.reducirStock(8);
		
		aux = new Venta(prod3,4);
		aux =new Venta(prod3,4);
		prod3 = aux.reducirStock(prod3);
		reg.agregar( aux);
		prod3.reducirStock(4);
		
		
		System.out.println(reg.toString());
				
				
			
			
		

		
		
		
		

	}

}
