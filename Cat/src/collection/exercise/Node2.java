/**
 * 
 */
package collection.exercise;

/**
 * @author Jing
 * @param <T>
 *
 */
public class Node2<T> {

	/**
	 * 
	 */

	private T data;
	private Node2 next;
	private Node2 prev;
	private int index;
	private Object[] array;

	public Node2() {
		super();
		this.data = null;
		this.next = null;
		this.prev = null;
		this.index = 0;
		array = new Object[10];
	}

	public Node2(T data) {
		this();
		this.data = data;
	
	}

	
	/*
	 * Data
	 */
	public T getData(int index) {
		data = (T) array[index];
		System.out.println("getData " + index + " " +data);
		return data;
		
		
	}

	public void setData(T data) {
		System.out.println("Data is set as = "+ data);
		array[index] = data;
		this.data = (T) array[index];
		index++;
		System.out.println("index is now " + index);
	}

	
	/*
	 * Next
	 */
	public Node2 getNext() {
		return next;
	}

	public void setNext(Node2 next) {
		
		next = new Node2(getData(index));
		this.next = next;
	}

	
	/*
	 * Prev
	 */
	public Node2 getPrev() {
		return prev;
	}

	public void setPrev(Node2 prev) {
		prev = new Node2(getData(index-2));
		this.prev = prev;
	}
	
	
}
