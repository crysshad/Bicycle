/**
 * 
 */
package collection.exercise;

import java.util.ArrayList;

/**
 * @author Jing
 *
 */
public class Node<T> {

	private T data;
	private Node next;
	private Node prev;
	private int index;
	private Object[] array;

	public Node() {

		this.data = null;
		this.next = null;
		this.prev = null;
		this.index = 0;
		this.array = new Object[10];

	}

	public Node(T data) {

		this();
		this.data = data;

	}

	/*
	 * data
	 */
	public T getData(int index) {

		return (T) array[index];
	}

	public void setData(T data) {
		array[index] = data;
		this.data = (T) array[index];
		System.out.println("Data added " + "in index " + index + " is " + this.data);

		index++;
	}

	/*
	 * next
	 */
	public Node getNext() {

		return next;
	}

	public void setNext(Node next) {

		if (index == 0) {

			next = null;
		}

		else {
			next = new Node(getData(index));
		}
		
		this.next = next;
	}

	/*
	 * previous
	 */
	public Node getPrev() {

		return prev;
	}

	public void setPrev(Node prev) {

		if (index == 0) {

			prev = null;
		}

		else {
			
			prev = new Node(getData(index--));
		}

		this.prev = prev;

	}

}
