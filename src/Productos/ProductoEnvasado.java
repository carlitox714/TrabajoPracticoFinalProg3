package Productos;

import java.sql.Date;

public class ProductoEnvasado extends Producto
{
	private int peso;
	private Date fechaVencimiento;
	
	public ProductoEnvasado(int peso, Date fechaVencimiento, int stockMinimo) {
		super();
		this.peso = peso;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
	
	
	
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
}
