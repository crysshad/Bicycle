/**
 * 
 */
package collection.exercise;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

/**
 * @author Jing
 * @param <T>
 *
 */
public class JingLinkedList<T> implements List<T>,Queue<T> {

	Node3<Object> node;
	T data;
	int index;
	
	
	public JingLinkedList (){
		super();
		this.data = null;
		this.index = 0;
		this.node  = new Node3<Object>();
		
		
		
	}
	@Override
	public boolean add(T arg0) {
	
		System.out.println("Insert index " + index);
		
		node.setData(arg0); // add element
		
		
		System.out.println("New index " + index);
		
		T prevData;
		T nextData;
	
		Node3 newNode;
		
		int prevIndex = index - 1;
		if (prevIndex < 0){
		
			System.out.println("prevIndex " + prevIndex);
			node.setPrev(null);
			/*System.out.println("get prev " + node.getPrev());*/
			
		}
		else {
			prevData = get(prevIndex);
			System.out.println("Prev Data " + prevData);
			node.setPrev(new Node3(prevData));
			/*System.out.println("get prev " + node.getPrev());*/
		}
		
		index++;
		int nextIndex = index;
		/*System.out.println(" next index " + nextIndex);*/
		
		nextData = get(nextIndex);
		if (nextData == null){
			newNode =null;
			
		}
		else {
			
			newNode = new Node3(nextData);
		}
		node.setNext(newNode);
		System.out.println("nextData " + nextData);
		
		
	System.out.println("index " + index);
	System.out.println("get next " + node.getNext());
	System.out.println("get prev " + node.getPrev());
		
	
		return true;
	}

	@Override
	public void add(int arg0, T arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends T> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int arg0) {
	
		
		return (T) node.getData(arg0);
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T set(int arg0, T arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		int listSize = 0;
		
		// if the next node is not null then keep increasing the counter
		/*while(node.getData(listSize) != null){
			listSize ++;
			
		}*/
		
		
	/*	while(node.getPrev() != null){
			listSize ++;
			System.out.println(node.getPrev());
		}*/

	/*	return node.getListSize();*/
		
		return index;
	}

	@Override
	public List<T> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T element() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean offer(T arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T poll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}


}
