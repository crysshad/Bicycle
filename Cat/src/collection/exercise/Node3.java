/**
 * 
 */
package collection.exercise;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Jing
 * @param <T>
 *
 */
public class Node3<T>{

	/**
	 * 
	 */

	private T data;
	private Node3 next;
	private Node3 prev;
	private int listSize;
	private int index;
	private Queue<T> queue;

	// Initial node
	public Node3() {
		super();
		this.data = null;
		this.next = null;
		this.prev = null;
		this.listSize = 0;
		this.index = 0;
		this.queue = new LinkedBlockingQueue<T>();

	}

	// Current node
	public Node3(T data) {
		this();
		this.data = data;

	}

	/*
	 * Data
	 */

	public T getData(int index) {

		Queue<T> queue2 = new LinkedBlockingQueue<T>();
		Queue<T> queueTemp = new LinkedBlockingQueue<T>();

		queue2 = queue;

		int counter = 0;
		// Keep removing the first item until it reaches index
		while (counter < index) {

			// Store the elements in a temporary queue
			queueTemp.add(queue2.peek());
			queue2.poll();

			counter++;
		}

		queueTemp.addAll(queue2);

		queue = queueTemp;

		System.out.println("Current data is " + data);
		System.out.println("Current queue is " + queue);

		return queue2.peek();
	}

	public void setData(T data) {
		this.data = (T) new Node3(data).data;
		queue.add(data);

	}

	/*
	 * Next
	 */
	public Node3 getNext() {


		return next;
	}

	public void setNext(Node3 next) {

		
		if (next == null){
			
			this.next = null;
		}
		else {
			this.next = next;
		}
	}

	/*
	 * Prev
	 */
	public Node3 getPrev() {
	
		return prev;
	}
	
	public void setPrev(Node3 prev) {
		
		if (prev == null){
			this.prev = null;
		}
	
		else{
		this.prev = prev;
		}
	}




	
	
	/*
	 * List size
	 */
	public int getListSize() {

		listSize = queue.size();
		return listSize;
	}

	
	public void setListSize() {


	}



}
