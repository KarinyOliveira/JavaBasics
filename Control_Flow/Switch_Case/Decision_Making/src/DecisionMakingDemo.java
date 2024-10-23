import java.util.Scanner;

public class DecisionMakingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Basic if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // if-else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // Nested if statement
        if (number > 0) {
            if (number < 10) {
                System.out.println("The number is a positive single digit.");
            } else {
                System.out.println("The number is positive and has multiple digits.");
            }
        } else {
            System.out.println("The number is zero or negative.");
        }

        // switch-case statement
        switch (number) {
            case 1:
                System.out.println("The number is one.");
                break;
            case 2:
                System.out.println("The number is two.");
                break;
            case 3:
                System.out.println("The number is three.");
                break;
            default:
                System.out.println("The number is not one, two, or three.");
        }

        // Ternary operation
        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println("The number is " + result + ".");

        // Logical AND (&&) and OR (||) operations
        if (number > 0 && number % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("The number is positive and odd.");
        }

        if (number < 0 || number == 0) {
            System.out.println("The number is either negative or zero.");
        }

        // Closing the scanner
        scanner.close();
    }
}
