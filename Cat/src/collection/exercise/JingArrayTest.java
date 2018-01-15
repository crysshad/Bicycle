/**
 * 
 */
package collection.exercise;

/**
 * @author Jing
 *
 */
public class JingArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * size()
		 */
		JingArray jingArray = new JingArray();
		System.out.println("The size of the array is " + jingArray.size()); // Find the size of the array
		
		/*
		 * add(int index, object element)
		 * get(int index)
		 */
		int index = 0;
		jingArray.add(index,"Java"); // Add element 
		System.out.println("The elment added in position " + index + " is " + jingArray.get(index)); // Get element
		
		
		jingArray.add("1"); // 1
		jingArray.add("2"); // 2
		jingArray.add("3"); // 3
		jingArray.add("4"); // 4
		jingArray.add("5"); // 5
		jingArray.add("6"); // 6
		jingArray.add("7"); // 7
		jingArray.add("8"); // 8
		jingArray.add("9"); // 9
		jingArray.add("10");// 10
		jingArray.add("11");// 11
		jingArray.add("12");// 12
		jingArray.add("13");// 13
		jingArray.add("14");// 14
		jingArray.add("15");// 15
		jingArray.add("16");// 16
		jingArray.add("17");// 17

		System.out.println(jingArray.add("11"));
		System.out.println("The current size of the array is: " + jingArray.size());
		System.out.println("The element in index " + " 15 is: " + jingArray.get(15));
	
		
		
	
	}

}
