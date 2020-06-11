package Usuarios;

import java.io.Serializable;

public class Usuario implements Serializable {
	
	private String usuario;
	private String pass;
	private String nombreCompleto;
	private boolean isAdmin;
	
	public Usuario(String usuario, String pass, String nombreCompleto, boolean isAdmin) 
	{
		super();
		this.usuario = usuario;
		this.pass = pass;
		this.nombreCompleto = nombreCompleto;
		this.isAdmin = isAdmin;
	}
	

	
	
	

}
