package Productos;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


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
	
	
	public void agregar(K id, T objeto) {
		conjuntoDeElementos.put(id, objeto);
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
	
	
	
	public String toString() 
	{	
		Map<K, T> map = getElementos();
		String aux = "";
		for (T value : map.values()) {
		    aux = aux + value.toString();
		}
		return aux;
	}

	public String toString(Contenedor<K, T> cont) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}


