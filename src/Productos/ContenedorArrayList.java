package Productos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ContenedorArrayList<T> implements Iterator<T>, Serializable , Cloneable
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
	
	public void editar(T pord, int id)
	{
		conjuntoDeElementos.remove(id);
		conjuntoDeElementos.add(id, pord);
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
	}

	/**
	 * 
	 * @return la cantidad de elementos en el contenedor
	
	 *
	 */
	
	public void sort(Comparator<? super T> c)
	{
		conjuntoDeElementos.sort(c);
		
	}
	
	
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


	

