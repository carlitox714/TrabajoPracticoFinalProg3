package Productos;

import java.sql.Date;

public class ProductoEnvasado extends Producto
{
	public static String categoria = "Envasado";
	
	public ProductoEnvasado() {
		super();
	}
	public ProductoEnvasado(int iD, String nombre, int precio, int calorias, boolean isVegano,
			boolean isCeliaco, boolean azucar,boolean isVegetariano, int stock, int stockMin) {
		super(iD, nombre, precio, calorias, isVegano, isCeliaco, azucar,isVegetariano, stock, stockMin);
	}


	
	@Override
	public String toString()
	{
		return "Categoria: "+ categoria + super.toString();			
	}
}
