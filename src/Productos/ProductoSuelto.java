package Productos;

public class ProductoSuelto extends Producto
{
	private float peso;
	private float stockMinimo;
	
	
	
	public ProductoSuelto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductoSuelto(int iD, String nombre, String categoria, int precio, int calorias, boolean isVegano,
			boolean isCeliaco, boolean azucar, int stock) {
		super(iD, nombre, categoria, precio, calorias, isVegano, isCeliaco, azucar, stock);
		// TODO Auto-generated constructor stub
	}

	public float getPeso() 
	{
		return peso;
	}
	
	public void setPeso(float peso) 
	{
		this.peso = peso;
	}
	
	public float getStockMinimo() 
	{
		return stockMinimo;
	}
	
	public void setStockMinimo(float stockMinimo) 
	{
		this.stockMinimo = stockMinimo;
	}
	
	public boolean stockPorAgotarse()
	{
		if(stock < stockMinimo)
		{
			return true;
		}
		return false;
	}
}
