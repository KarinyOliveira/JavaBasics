import java.util.Scanner;

public class AgeChecker {

	public static void main(String[] args) {
		int age = 0;
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter your age: ");
		
		while(!scn.hasNextInt()) {
			if (!scn.hasNextInt()) { 
				System.out.print("Enter your age: ");
				scn.next();
			} else
				age = scn.nextInt();
		}		

		if (age >= 21)
			System.out.println("You are an adult!! T.T");
		else if (age < 21 && age >= 0)
			System.out.println("You are not an adult :3");
		else
			System.out.println("Invalid age buddy!!");

		scn.close();

	}

}
