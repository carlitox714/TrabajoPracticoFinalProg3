package Productos;

import java.sql.Date;

public class ProductoEnvasado extends Producto
{
	private Date fechaVencimiento;
	private String informacionNutricional;
	private int stockMinimo;
	
	public ProductoEnvasado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductoEnvasado(int iD, String nombre, String categoria, int precio, int calorias, boolean isVegano,
			boolean isCeliaco, boolean azucar, int stock) {
		super(iD, nombre, categoria, precio, calorias, isVegano, isCeliaco, azucar, stock);
		// TODO Auto-generated constructor stub
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getInformacionNutricional() {
		return informacionNutricional;
	}
	public void setInformacionNutricional(String informacionNutricional) {
		this.informacionNutricional = informacionNutricional;
	}
	public int getStockMinimo() {
		return stockMinimo;
	}
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	
	public boolean stockPorAgotarse()
	{
		if(stock < stockMinimo)
		{
			return false;
		}
		return true;
	}
	
}
