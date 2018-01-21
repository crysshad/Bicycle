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
		
		jll.add(2);
		jll.add(57);
		jll.add(82);
		/*jll.add(1);
		jll.add(0);*/
		
		System.out.println("Data is " + jll.get(1));
		System.out.println("Size is " + jll.size());
	
	}

}
