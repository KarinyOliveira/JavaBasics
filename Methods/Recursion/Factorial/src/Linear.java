import java.util.Scanner;

public class Linear {
	
	public static double factorial(double number) {
		if (number <= 1)
			return 1;
		else
			return number * factorial(number-1);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to calculate the factorial: ");
		double count = scn.nextDouble();
		System.out.println("The factorial of " + count + " is: " + factorial(count));
		scn.close();
	}

}
