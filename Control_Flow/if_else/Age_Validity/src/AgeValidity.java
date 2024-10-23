import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {

       /*
        * Have users to enter their age
		* Declare a boolean variable,drivingUnderAge
		* Initialize it to false
		* Write a boolean expression to check if the age entered 
		* by the user is less than or equal to 18, and then set 
		* drivingUnderAge to true
		* Print the value of drivingUnderAge
        */
    	
    	Scanner scr = new Scanner(System.in);
    	System.out.println("Enter your age: ");
    	int age = scr.nextInt();
    	
    	boolean drivingUnderAge = false;
    	//can use implicit comparison
    	//drivingUnderAge = age <= 18;
    	
    	if (age <= 18) {
    		drivingUnderAge = true;
    	}
    	System.out.println("Driving under age? " + drivingUnderAge);
    	
    	scr.close();
    }
}
