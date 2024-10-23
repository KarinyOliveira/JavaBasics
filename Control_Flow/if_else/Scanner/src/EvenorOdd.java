//Author: Kariny Oliveira
//Student Number: CT1004878

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		
		/*
		 * Q3.Write a Java program that takes a number as input from the user.
		 *  If the number is even, print "Even Number". Otherwise, print "Odd Number".
		 */
		
		Scanner scn = new Scanner(System.in);
		double num = 0.0;
		
		System.out.print("Enter the number: ");
		num = scn.nextDouble();
		
		if (num % 2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		
		scn.close();
	}

}
