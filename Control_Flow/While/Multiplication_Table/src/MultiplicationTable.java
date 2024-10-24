//Author: Kariny Oliveira

import java.util.Scanner;


public class MultiplicationTable {

	public static void main(String[] args) {
		
		//Create an object from Scanner class to receive the keyboard input
		Scanner scn = new Scanner(System.in);
		int number;
		
		System.out.println("Please enter an integer number!");
		//While loop to check if the number inserted is an integer, using the Scanner class to validate
		while (!scn.hasNextInt()) {
			System.out.println("That's not an integer number!");
			scn.next();
		}
		//If the number is validated as integer the number will receive the value
		number = scn.nextInt();
		
		//For loop to create the Multiplication Table, using the counter i as iterator
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d X %d = %d \n", number, i, (number*i));
		}
		
		scn.close();
		
	}

}
