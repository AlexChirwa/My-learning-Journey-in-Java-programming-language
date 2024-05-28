// Date: 5.28.24

/* For-each-loop
 * - It is used exclusively to loop through elements in an array
 * 
 * Syntax:
 * for(type variableName : arrayName){
 *    ** code block to be executed 
 *}
 * 
 */

public class FlowControl7{
	public static void main(String[] args) {
		
		// Example of a for each loop 
		
		String[] cars = {"Volov", "BMW", "Bens", "Porche"};
		
		for(String i : cars) {
			System.out.println(i);
		}
		
	}
}