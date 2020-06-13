package Productos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class ContenedorArrayList<T> implements Iterator<T>
{

	private ArrayList<T> conjuntoDeElementos;
	
	
	

	public ContenedorArrayList() {
		this.conjuntoDeElementos = new ArrayList<T>();
		// TODO Auto-generated constructor stub
	}


	public ContenedorArrayList(ArrayList<T> conjuntoDeElementos) {
		super();
		this.conjuntoDeElementos = conjuntoDeElementos;
	}


	
	public ArrayList<T> getElementos()
	{
		return conjuntoDeElementos;
	}
	
	
	public void agregar(T obj) throws Exception 
	{
		conjuntoDeElementos.add(obj);
	}

	
	public T remover(int indice) 
	{	
		return conjuntoDeElementos.remove(indice);
	}

	
	public Iterator<T> iterator() 
	{		
		return conjuntoDeElementos.iterator();
	}
	@Override
	public String toString() 
	{	
		
		Iterator<T> it = conjuntoDeElementos.iterator();
		String aux = "";
		while(it.hasNext())
			  aux = aux + (it.next().toString());
		return aux;
		//la tengo como un elefante
		
	}

	/**
	 * 
	 * @return la cantidad de elementos en el contenedor
	 */
	public int cantElementos() {
		return conjuntoDeElementos.size();
	}


	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}
}

