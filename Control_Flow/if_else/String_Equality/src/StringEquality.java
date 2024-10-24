//Author: Kariny Oliveira


import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		
		/*
		 * Create File  StringEquality.java
		 * Use an if and an if/else statement:
		 * − Declare a String variable name
		 * − Have the user input a value for the name
		 * − Check whether the name is “Moe,” and then print “You are
		 * the king of rock and roll”
		 * − Otherwise print “You are not the king”
		 * − Don’t use "==""
		 */
		
		Scanner scr = new Scanner(System.in);
		String name = "";
		
		System.out.print("Insert your name: ");
		name = scr.nextLine();
		if (name.equals("Moe")) {
			System.out.println("You are the king of rock and roll!!");
		} else {
			System.out.println("You are not the king!!!");
		}
		
		scr.close();
	}

}
