
// Just a recap of what I have learnt so far as I progress in the Java programming language 

// How to accept user input in the console using Scanner Class and the Java package java.util.Scanner.

// Write a Java program to print the area and perimeter of a circle.

// Test Data:
// Radius = 7.5

// Expected Output
// Perimeter is = 47.12388980384689
// Area is = 176.71458676442586

// Formula Perimeter P = 2πr
// Formula Area A = πr²

import static java.lang.Math.PI; // used as a java package for math 

import java.util.Scanner;

public class Main1{
	public static void main(String[] args) {
		
		// Declare the object and initialize it with the predefined object standard stream
		Scanner in = new Scanner(System.in);
		
		// Promt the user to enter the values 
		System.out.print("What is the Radius: ");
		
		// hasNextXYZ to read the value in the console.
		double radius = in.nextDouble();
		
		// Create the variable to calculate the perimeter
		double perimeter = 2 * PI * radius; 
		
		// Print Calculation of perimeter
		System.out.println("Perimeter is = " + perimeter);
		
		
		 
		// Calculate the Area of the Circle 
		double area = PI * radius * radius;
		
		// Print the solution 
		System.out.println("Area is = " + area);
		
		
		
	}
}