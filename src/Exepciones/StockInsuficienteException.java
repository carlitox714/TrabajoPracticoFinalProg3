package Exepciones;

public class StockInsuficienteException extends Exception
{
	/**
	 * Excepci�n que se d� cuando se quiere vender m�s productos de los que hay disponibles.
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
