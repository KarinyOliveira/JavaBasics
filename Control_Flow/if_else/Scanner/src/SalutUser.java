//Author: Kariny Oliveira
//Student Number: CT1004878

import java.util.Scanner;

public class SalutUser {

	public static void main(String[] args) {
		
		/*
		 * Q2.Write a Java program that asks the user for their name and the current hour (in 24-hour format). 
		 * If the hour is between 5 and 12, print "Good morning, [name]!". If the hour is between 13 and 18, print "Good afternoon, [name]!". 
		 * If the hour is between 19 and 4, print "Good night, [name]!"
		 */
		
		Scanner scn = new Scanner(System.in);
		String name = "";
		int hour = 0;
		
		System.out.print("Enter your name: ");
		name = scn.nextLine();
		
		System.out.print("Enter only the hour part in 24-hour format: ");
		hour = scn.nextInt();
		
		
		if (5 <= hour && hour <= 12) 
			System.out.println("Good morning, " + name);
		else if (13 <= hour && hour <= 18)
			System.out.println("Good afternoon, " + name);
		else
			System.out.println("Good night, " + name);
		
		
		scn.close();
		
	}

}
