// Date: 5.27.2024

// Switch Statements:

/*
 * instead of writing many if--else statements we use the switch statement,
 * The switch statement selects one of many code blocks to be executed.
 * 
 * Syntax:
 * switch(expression){
 *       case x:
 *       // code block
 *        break;
 *      case y:
 *      // code block
 *         break;
 *       default:
 *       // code block
 * }
 */

public class ConditionalStatements2{
	public static void main(String[] args) {
		
		//Example of a switch statement
		
		// create variables 
		int day = 5;
		
		switch(day) {
		case 1:
			System.out.print("Monday" + day);
			break;
		case 2:
			System.out.print("Tuesday " + day);
			break;
		case 3:
			System.out.print("Wednseday " + day);
			break;
		case 4:
			System.out.print("Thursday " + day);
			break;
		case 5:
			System.out.print("Friday " + day);
			break;
		default:
			System.out.print("Looking forward to the weekend"); 
		}
		
		// Output: Friday 5
		
		/*
		 * The break keyword:
		 * - When java reaches a break keyword, it breaks out of the switch block.
		 * - This will stop the executing of , more code and case testing inside the block
		 * - When a match is found the job is done, it's time for a break. There is no need for more testing
		 * 
		 * The default keyword:
		 * - The default keyword specifies some code to run if there is no case match.
		 * - if the default statement is used as the last statement in a switch block, it doesn't need a block.
		 */
		
	}
}

