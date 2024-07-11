/* Date: 7.11.2024
 * Author: Chirwa Alex Joshua
 * Topic: Multi-Dimensional arrays
 * 
 * Multi-dimensional arrays is an array of arrays 
 * syntax:
 * int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
 */


public class MultiArrays3{
	public static void main(String[] args) {
		
		// looping through a multi-dimensional array
		
		// declare and initialize variables
		int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
		
		for (int i = 0; i < myNumbers.length; ++i) {
			for (int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println(myNumbers[i][j]);
			}
		}
		
	}
}