package Contenedores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ContenedorArrayList<T> implements Iterator<T>, Serializable
{
	private ArrayList<T> conjuntoDeElementos;
	
	public ContenedorArrayList()
	{
		this.conjuntoDeElementos = new ArrayList<T>();
	}

	public ContenedorArrayList(ArrayList<T> conjuntoDeElementos)
	{
		super();
		this.conjuntoDeElementos = conjuntoDeElementos;
	}
	
	public ArrayList<T> getElementos()
	{
		return conjuntoDeElementos;
	}
	
	/**
	 * Método para editar un elemento del Arraylist, conociendo su índice.
	 * @param pord
	 * @param id
	 */
	public void editar(T pord, int id)
	{
		conjuntoDeElementos.remove(id);
		conjuntoDeElementos.add(id, pord);
	}
	
	/**
	 * Método para agregar un objeto al Arraylist.
	 * @param obj a agregar.
	 */
	public void agregar(T obj)  
	{
		conjuntoDeElementos.add(obj);
	}
	
	/**
	 * Método para remover elemento en el Arraylist mandando el índice.
	 * @param el indice del elemento a eliminar
	 * @return el elemento eliminado
	 */
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
	
	public void sort(Comparator<? super T> c)
	{
		conjuntoDeElementos.sort(c);
		
	}
	
	/**
	 * Método para conseguir la catidad de elementos en el Arraylist.
	 * @return cantidad de elementos.
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


	

