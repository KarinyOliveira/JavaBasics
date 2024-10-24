//Author: Kariny Oliveira

import java.util.Scanner;

public class FavoriteColor {

	public static void main(String[] args) {
		
		/*
		 * Q4.Write a Java program that asks the user for their favorite color and 
		 * then prints a message saying "Your favorite color is: [color]".
		 */
		
		Scanner scn = new Scanner(System.in);
		String color = "";
		
		System.out.print("Enter your favorite color: ");
		color = scn.nextLine();
		
		System.out.println("Your favorite color is: " + color);
		
		scn.close();
	}

}
