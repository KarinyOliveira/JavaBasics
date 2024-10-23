import java.util.Scanner;

public class StringManipulationBasic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your full name: ");
		String name = input.nextLine();
		
		System.out.println("Your name in uppercase is: " + name.toUpperCase());
		System.out.println("Your name has " + name.length() + " characters");
		
		input.close();

	}

}
