package Main;

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


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Producto prod1 = new Producto(1, "manzana", null, 15, 0, false, false, false,40);
		Producto prod2 = new Producto(2, "banana", null, 45, 0, false, false, false,22);
		Producto prod3 = new Producto(2, "frutilla", null, 11, 0, false, false, false,60);
		Producto prod4 = new Producto(3, "leche1lt", null, 80, 0, false, false, false,40);
		Producto prod5 = new Producto(4, "barrita de cereal", null, 35, 0, false, false, false,40);
		Producto prod6 = new Producto(5, "Pepas", null, 10, 0, false, false, false,40);
		
		boolean agregarCarrito = false;
<<<<<<< Updated upstream
		RegistroVenta<Integer, Venta> reg = new RegistroVenta<Integer, Venta>();
=======
		RegistroVenta<Venta> reg1 = new RegistroVenta<Venta>();
		RegistroVenta<Venta> reg2 = new RegistroVenta<Venta>();
>>>>>>> Stashed changes
		
			
		Venta aux = new Venta(prod2,5);
		aux =new Venta(prod2,5);
		prod2 = aux.reducirStock(prod2);
<<<<<<< Updated upstream
		reg.agregar(aux.getId(), aux);
=======
		reg1.agregar(aux);
>>>>>>> Stashed changes
		prod2.reducirStock(5);
		
		aux = new Venta(prod1,9);
		aux =new Venta(prod1,9);
		prod1 = aux.reducirStock(prod1);
<<<<<<< Updated upstream
		reg.agregar(aux.getId(), aux);
=======
		reg1.agregar(aux);
>>>>>>> Stashed changes
		prod1.reducirStock(9);
		
		aux = new Venta(prod4,8);
		aux =new Venta(prod4,8);
		prod4 = aux.reducirStock(prod4);
<<<<<<< Updated upstream
		reg.agregar(aux.getId(), aux);
=======
		reg1.agregar( aux);
>>>>>>> Stashed changes
		prod4.reducirStock(8);
		
		aux = new Venta(prod3,4);
		aux =new Venta(prod3,4);
		prod3 = aux.reducirStock(prod3);
<<<<<<< Updated upstream
		reg.agregar(aux.getId(), aux);
=======
		reg1.agregar( aux);
>>>>>>> Stashed changes
		prod3.reducirStock(4);
		
		
		

		aux = new Venta(prod2,5);
		aux =new Venta(prod2,5);
		prod2 = aux.reducirStock(prod2);
		reg2.agregar(aux);
		prod2.reducirStock(5);
		
		aux = new Venta(prod1,9);
		aux =new Venta(prod1,9);
		prod1 = aux.reducirStock(prod1);
		reg2.agregar(aux);
		prod1.reducirStock(9);
		
		aux = new Venta(prod4,8);
		aux =new Venta(prod4,8);
		prod4 = aux.reducirStock(prod4);
		reg2.agregar( aux);
		prod4.reducirStock(8);
		
		aux = new Venta(prod3,4);
		aux =new Venta(prod3,4);
		prod3 = aux.reducirStock(prod3);
		reg2.agregar( aux);
		prod3.reducirStock(4);
		
		
		listadoVentas<Integer,RegistroVenta<Venta>> lista = new listadoVentas<Integer,RegistroVenta<Venta>>();
	
		lista.agregar(reg1);
		lista.agregar(reg2);
		lista.agregar(reg2);
		lista.agregar(reg2);
				
		
				
		
		
		System.out.println(lista.toString());
				
				
			
			
		

		
		
		
		

	}

}
