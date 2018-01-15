package collection.exercise;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JingArray implements List<Object> {

	int arrayCapacity = 10;
	int currentPosition = 0;
	Object[] array = new Object[arrayCapacity];

	@Override
	public boolean add(Object e) {
		/*
		 * Add element to an array based on the insertion sequence and increase
		 * the capacity of the array when array is full
		 */
		boolean isElementAdded = false; // Return true if the element is added to the array successfully

		array[currentPosition] = e; // Add element to the currently available index
		currentPosition++; // Increase the currentPosition count by 1 after the element is added

		Object[] newArray = null; // Create a new array to store the elements in the array when capacity changed
		if (currentPosition == size()) {

			arrayCapacity = (currentPosition * 3 / 2) + 1;
			newArray = new Object[arrayCapacity]; // Assign the new capacity to the new array
			System.out.println(" Size of the new Array: " + newArray.length);

			// Copy the elements from array to new array then set array = new array
			for (int i = 0; i < array.length; i++) {

				newArray[i] = array[i];
			}
			array = newArray;
			/* System.out.println("current array size is " + array.length); */

		}

		/*
		 * System.out.println("currentPosition: " + currentPosition +
		 * " arrayCapacity: " +arrayCapacity );
		 */

		if (array[currentPosition - 1] != null) {

			isElementAdded = true;
		}

		return isElementAdded;

	}

	@Override
	public void add(int index, Object element) {
		// Add element to an array based on the index specified

		array[index] = element;

	}

	@Override
	public boolean addAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int index) {
		// return array

		return array[index];
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// Returns the size of the array

		return array.length;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
