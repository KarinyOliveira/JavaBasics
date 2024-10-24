//Author: Kariny Oliveira

import java.util.Scanner;

public class Raincover {

	public static void main(String[] args) {
		
		/*
		 * Q5.Write a Java program that declares a boolean variable named isRaining and assigns it a value (either true or false). 
		 * Then, print a message indicating whether it is raining or not based on the value of the variable.
		 */
		
		Scanner scn = new Scanner(System.in);
		boolean isRaining = true;
		
		System.out.println("Is it raining today? true | false");
		isRaining = scn.nextBoolean();
		
		if (isRaining == true)
			System.out.println("It's always raining in Vancouver!!!");
		else
			System.out.println("Great day!! Go and do some outdoor exercise =)");
		
		scn.close();
	}

}
