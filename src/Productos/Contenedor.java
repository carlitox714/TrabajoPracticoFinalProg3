package Productos;


import java.util.HashMap;


public class Contenedor<K,T>  {
	
	private HashMap<K,T> conjuntoDeElementos;
	
	
	public Contenedor() {
		super();
		conjuntoDeElementos=new HashMap<K,T>();
	}

	/**
	 * @return en forma de arrayList los elementos del contenedor
	 */
	public HashMap<K,T> getElementos(){
		return conjuntoDeElementos;
	}
	
	
	public void agregar(K clave, T objeto) {
		conjuntoDeElementos.put(clave, objeto);
	}

	
	public T remover(K id) {	
		return conjuntoDeElementos.remove(id);
	}

	
	/**
	 * 
	 * @return la cantidad de elementos en el contenedor
	 */
	public int cantElementos() {
		return conjuntoDeElementos.size();
	}
}


