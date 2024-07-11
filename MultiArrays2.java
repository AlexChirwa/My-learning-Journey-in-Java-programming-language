/* Date: 7.11.2024
 * Author: Chirwa Alex Joshua
 * Topic: Multi-Dimensional arrays
 * 
 * Multi-dimensional arrays is an array of arrays 
 * syntax:
 * int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
 */

public class MultiArrays2{
	public static void main(String[] args) {
		// changing an array element in a multi-dimensional array
		
		// declare and initialize variables 
		int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
		// re assigning and element 
		myNumbers[1][2] = 10; // the first index represents the array element and the second one represents the element in the second array of the muti-dimensional array. 
		
		//Print statement
		System.out.println(myNumbers[1][2]); // Output: 10 instead of 7
	}
}