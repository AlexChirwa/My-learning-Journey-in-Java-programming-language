/* Date: 7.11.2024
 * Author: Chirwa Alex Joshua
 * Topic: Multi-Dimensional arrays
 * 
 * Multi-dimensional arrays is an array of arrays 
 * syntax:
 * int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
 */

import java.util.Arrays;

public class MultiArrays{
	public static void main(String[] args) {
		
		// declare and initialize variables
		int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
		
		//output
		System.out.println(Arrays.deepToString(myNumbers)); //output: [[1, 2, 3, 4], [5, 6, 7]]
		
		// to print out multi-dimensional arrays we use the deepToString() method
		// to print a single array with it's elements we use toString() method 
		
	}
}