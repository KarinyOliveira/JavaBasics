import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {
    	
    	/*  
		*  •Modify the ChkOddEven.java to implement the following:
		*  −Input a number between 1 and 10
		*  −Use if statements
		*  −Test whether a number is odd or even
		*  • The program should generate the following output:
		*  −Enter a number: 7
		*  −The num is odd 7
    	*/

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter a number: ");
        num = in.nextInt();
        
        if (num < 1 || num > 10) {
        	System.out.println("Insert a number between 1 and 10: ");
        } else {
        	if (num % 2 == 0) {
        		System.out.printf("The number is even: %d \n",num);
        	} else {
        		System.out.printf("The number is odd: %d \n",num);
        	}
        }
        
    }
}
