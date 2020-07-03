package Exepciones;

public class ProductoReptidoException extends Exception 
{
	/**
	 * Excepcion que se d� cuando se quiere agregar un producto que ya existe.
	 * @param mensaje
	 */
	public ProductoReptidoException(String mensaje) {
		super(mensaje);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	

}
