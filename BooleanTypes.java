
public class BooleanTypes{
	public static void main(String[] args) {
		
		/* Boolean types 
    	 * is a data type that can only have one of two values, like:
    	 * yes/no
    	 * on/off
    	 * true/false 
    	 */
    	
    	//Create the variables
    	
    	boolean isJavaFun = true;
    	boolean isWastingTimeGood = false;
    	
    	// Print variable 
    	
    	System.out.println("Is Java Fun: " + isJavaFun); // output: true
    	System.out.println("Is wasting time good: " + isWastingTimeGood); // Output: false 
    	
    	
    	/* Character data type:
    	 * The char data type is used to store a single character.
    	 * The character must be surrounded by single quotes eg 'A' or 'c'
    	 */
    	
    	// Create the variables 
    	
    	char myVar1 = 'A', myVar2 = 'B', myVar3 = 'C';
    	
    	// Print variable 
    	
    	System.out.println("The first three letters of the Alphabet: " + myVar1 + myVar2 + myVar3);
    	
    	
    	
    	/* String data type:
    	 * The string data type is used to store a sequence of characters(text).
    	 * String values must be surrounded by double quotes
    	 */
    	
    	// Create the variable
    	
    	String myName = "Alex";
    	
    	// Print variable 
    	
    	System.out.println("My name is: " + myName);
    	 
    	
    	
    	
    	/* Data type real life example:
    	 * Here's a real-life example of using different data types,
    	 * to calculate and output the total cost of a number of items:
    	 * Variable: items, costPerItem, totalCost, and currency.
    	 */
    	
    	// Create variables of different data types 
    	
    	int items = 20;
    	float costPerItem = 2.99f;
    	float totalCost = items * costPerItem;
    	char currency = '$';
    	    	
    	//Print variables 
    	
    	System.out.println("Number of items: " + items);  // Output = Number of items: 20
    	System.out.println("The Cost Per Item: " + costPerItem); // Output = The Cost Per Item: 2.99 
    	System.out.println("The total cost: " + totalCost); // Output = The total cost: 59.8
    	System.out.println("The currency used: " + currency + totalCost); // Output = The currency used: $59.8 
    	
    	
    	// More profound way of the program 
    	
    	// Create variables of different data types
    	/*
    	int items = 50;
    	float costPerItem = 9.99f;
    	float totalCost = items * costPerItem;
    	char currency = '$';

    	// Print variables
    	System.out.println("Number of items: " + items); // Output = Number of items: 50
    	System.out.println("Cost per item: " + costPerItem + currency); // Output = Cost per item: 9.99$
    	System.out.println("Total cost = " + totalCost + currency); // Output = Total cost = 499.5$
    	*/
	}
}