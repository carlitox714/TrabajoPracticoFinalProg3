package Contenedores;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Contenedor<K,T> implements Serializable  {
	
	private HashMap<K,T> conjuntoDeElementos;
	
	public Contenedor() 
	{
		super();
		conjuntoDeElementos=new HashMap<K,T>();
	}	

	/**
	 * @return en forma de arrayList los elementos del contenedor
	 */
	public HashMap<K,T> getElementos()
	{
		return conjuntoDeElementos;
	}

	/**
	 * Método para agregar elementos al contenedor.
	 * @param K clave, id.
	 * @param T valor, objeto.
	 */
	public void agregar(K id, T objeto) 
	{
		conjuntoDeElementos.put(id, objeto);
	}
	
	/**
	 * Método para remover elementos al contenedor.
	 * @param K clave, id.
	 * @return T valor, objeto removido.
	 */
	public T remover(K id) 
	{	 
		return conjuntoDeElementos.remove(id);
	}

	/**
	 * Método para conseguir la cantidad de elementos en el contenedor.
	 * @return la cantidad de elementos en el contenedor.
	 */	
	public int cantElementos() 
	{
		return conjuntoDeElementos.size();
	}
	
	
	
	
}

	
	

