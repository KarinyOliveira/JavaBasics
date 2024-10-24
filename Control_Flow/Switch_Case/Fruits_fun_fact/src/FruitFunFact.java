//Author: Kariny Oliveira

//import Scanner to get the user input
import java.util.Scanner;

public class FruitFunFact {

	public static void main(String[] args) {
		
		//Create an Scanner object to use the methods
		Scanner scr = new Scanner(System.in);
		String fruit = "";
		
		System.out.println("Enter your favorite fruit from the following: Apple | Banana | Cherry | Mango"); 
		
		//Get the user input as String using nextLine
		fruit = scr.nextLine();
		
		//Switch statement to check if the user input is on the list and print the fun fact
		switch(fruit) {
		case "Apple":
			System.out.println("Did you know? Apples float in water because they are 25% air!");
			break;
		case "Banana":
			System.out.println("Fun fact! Bananas are berries, but strawberries are not");
			break;
		case "Cherry":
			System.out.println("Cherries are a member of the rose family");
			break;
		case "Mango":
			System.out.println("Mangoes are known as the 'king of fruits'");
			break;
		//If none of the options are inserted
		default:
			System.out.println("Sorry, we don't have a fun fact for that fruit!");
			break;
		}
		
		scr.close();
		
	}

}
