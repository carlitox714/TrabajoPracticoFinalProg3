package Exepciones;

public class StockInsuficienteException extends Exception
{
	/**
	 * Excepción que se dá cuando se quiere vender más productos de los que hay disponibles.
	 * @param mensaje
	 */
	public StockInsuficienteException(String mensaje)
	{
		super(mensaje);
	}
	
	@Override
	public String getMessage()
	{
		return super.getMessage();
	}
	

}
