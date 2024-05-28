/* Java has several conditional statements.
 * 
 * - The use of (if) to specify a block of code to be executed if the statement is true.
 * - The use of (else) to specify a block of code to executed if the same statement is false.
 * - The use of (else if) to specify a new condition if the first condition is false.
 * - Java short-hand version of (if..else) statement which is called ternary operator, because it only consists of 3 operators:
 * - The use of (switch) to specify many alternative blocks of code to be executed.
 * 
 * point to remember is that when passing conditions we use Comparison Operators(Relational Operators). 
 */


public class ConditionalStatements{
	public static void main(String[] args) {
		
		/* The use of the (if) condition:
		 * 
		 * Syntax:
		 * if(condition){
		 * **block of code to executed if the condition is true
		 * }
		 */
		
		int x = 10, y = 13;
		
		if(x != y) {
			System.out.println("The value of " + x + " is not equal to the value of  " + y); // Output: The value of 10 is not equal to the value of  13.
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
		/* The use of (else):
		 * 
		 * Syntax:
		 * if(condition){
		 * ** block of code to be executed if the condition is true
		 *  }else{
		 * ** block to be executed if the same condition is false
		 *  }
		 * } 
		 */
	
		int num1 = 50, num2 = 55;
		
		if(num1 > num2) {
			System.out.println("The value " + num1 + " is greater than " + num2); // Output: empty
		}else {
			System.out.println("The value " + num1 + " is not greater than " + num2); // Output: The value 50 is not greater than 55
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
		/* The use of (else if):
		 * - else if is used to specify a new condition if the first condition is false 
		 * 
		 * Syntax:
		 * if(condition){
		 *    ** block of code to be executed if the condition is true
		 * }else if(condition 2){
		 *     ** block of code to be executed if the first condition is false
		 * }else{
		 *      ** block of code to be executed if condition2 is false
		 * }    
		 */
		
		int v1 = 4, v2 = 4;
		
		if(v1 != v2) {
			System.out.println("The value " + v1 + " is not equal to the value " + v2);
		}else if(v1 >= v2) {
			System.out.println("The value " + v1 + " greater or equal to " + v2); // Output: The value 4 greater or equal to 4.
		}else {
			System.out.println("The values are not compatible");
		}
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/* Java short-hand version of (if..else) statement
		 * - The shorthand version of if else statement is called ternary operator, because it only consists of 3 operators:
		 * 
		 *  Syntax:
		 *  Variable = (condition) ? expression true : expression false;
		 */
		
		// finding the smallest value 
		int var1 = 10, var2 = 20, var3 = 15, result;
		
		// (Condition) ? expression true : expression false;
		result = ((var1 < var2) ? (var2 < var3) ? var1 : var3 :  (var1 < var3) ? var1 : var3); // Output: 15
		
		// Print variable
		System.out.println(result);
		
		/* Explanation for he above code 
		 * - result variable is assigned the ternary operator for it to work (A variable should be assigned the ternary operator)
		 * - The first condition acts as the if statement(var1 < var2), the second condition is the else if statement (var2 < var3) and the last condition is the else statement (var1 < var3). 
		 */
		
	}
}
