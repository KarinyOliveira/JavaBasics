import java.util.Random;
import java.util.Scanner;


public class Lottery {
	public static void main(String[] args) {
		
		/*Create a lottery program that lets the user input a series of integers and 
		compares that number to a winning value. A random number is obtained in the range between1 to 10 
		and is compared with the number entered by the user.
		*/
		
		Scanner scanner = new Scanner(System.in);
	    Random random = new Random();

	    // Prompt the user to enter the integer
	    System.out.print("Enter an integer number between 1 and 10: ");
	    int uInput = scanner.nextInt();

	    // Generate a random winning number between 1 and 10
	    int wNumber = random.nextInt(10) + 1;
	    
	    System.out.println("The winning number: " + wNumber);
	    System.out.println("Your number: " + uInput);
	               
	    // Close the scanner
	    scanner.close();
		
	}
}
