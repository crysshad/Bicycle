/**
 * 
 */
package collection.exercise;

import java.util.List;

/**
 * @author Jing
 *
 */
public class JingLinkedListTryOut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> jll = new JingLinkedList<Integer>();
		
		int index = 3;
		
		jll.add(2);
		jll.add(57);
		jll.add(82);
		jll.add(1);
		jll.add(0);
	
		System.out.println("Data in index " + index + " is " + jll.get(index));
		System.out.println("Size is " + jll.size());
		/*jll.add(1);
		jll.add(0);*/
		
		
	
	}

}
