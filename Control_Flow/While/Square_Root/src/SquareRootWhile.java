import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[]){
    
    	Scanner console = new Scanner(System.in);
    	
    	while (true) {
    		System.out.print("Type a non-negative integer: ");
        
    		int number = console.nextInt();
    		if (number >= 0) {    		
    			System.out.printf("Square root of %d is: %.2f", number, Math.sqrt(number));
    			break;
    		}
    		System.out.println("Negative number, try again!!!");
    	}
    	console.close();
    }  
}
