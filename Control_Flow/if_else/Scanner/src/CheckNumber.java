//Author: Kariny Oliveira
//Student Number: CT1004878

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		
		/*
		 * Q1.Write a Java program that asks the user to enter a number. 
		 * If the number is positive, print "Positive Number". If the number is negative, print "Negative Number". 
		 * If the number is zero, print "Zero".
		 */
		
		Scanner scn = new Scanner(System.in);
		int num = 0;
		
		System.out.print("Enter a number: ");
		num = scn.nextInt();
		
		if (num < 0) 
			System.out.println("Negative number");
		 else if (num > 0) 
			System.out.println("Positive number");
		 else
			System.out.println("Zero");
		
		scn.close();

	}

}
