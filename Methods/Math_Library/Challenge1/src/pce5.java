//Author: Kariny Oliveira

import java.lang.Math;
import java.util.Scanner;

public class pce5 {

	public static void main(String[] args) {
		
		/*
		 * Requirements:
		 * User Input: Your program should prompt the user to:
		 	* Enter a number to calculate its square root.
		 	* Enter a number to calculate its absolute value.
		 	* Enter two numbers to find the larger one.
		 * Utilize Math Class: Use the appropriate methods from Java's Math class to solve the given problems.
		 	* For square root, use Math.sqrt().
		 	* For absolute value, use Math.abs().
		 	* To find the larger number, use Math.max().
		 * Display Results: After getting the input from the user, the program should display the results for all three operations.
		 */
		float number = 0;
		float aux = 0;
		Scanner scn = new Scanner(System.in);
		
		
		System.out.print("Enter a number to calculate the square root: ");
		number = scn.nextFloat();
		System.out.printf("Square root of %.2f is %.2f \n", number, Math.sqrt(number));
		
		System.out.print("Enter a number to calculate the absolute value: ");
		number = scn.nextFloat();
		System.out.printf("Absolute value of %.2f is %.2f \n", number, Math.abs(number));
		
		System.out.print("Enter the first number to verify which one is the larger: ");
		number = scn.nextFloat();
		System.out.print("Enter the second number to verify which one is the larger: ");
		aux = scn.nextFloat();
		System.out.printf("The larger one between %.2f and %.2f is %.2f \n", number, aux, Math.max(number,aux));

		scn.close();
		
	}

}
