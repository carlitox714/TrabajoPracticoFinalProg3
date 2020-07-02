package Productos;

public class ProductoSuelto extends Producto
{
	public static String categoria = "Suelto";
	
	
	public ProductoSuelto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductoSuelto(int iD, String nombre, int precio, int calorias, boolean isVegano,
			boolean isCeliaco, boolean azucar, int stock,int stockMin) {
		super(iD, nombre, precio, calorias, isVegano, isCeliaco, azucar, stock, stockMin);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString()
	{
		return "Categoria: "+ categoria + super.toString();			
	}
}
