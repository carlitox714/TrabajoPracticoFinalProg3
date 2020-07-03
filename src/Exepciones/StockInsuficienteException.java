package Exepciones;

public class StockInsuficienteException extends Exception {

	public StockInsuficienteException(String mensaje) {
		super(mensaje);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	

}
