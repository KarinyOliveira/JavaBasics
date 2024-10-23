import java.util.Scanner;

public class Fibonacci {

	public static void calculate(int first, int second,int count) {
		if (count >= 1) {			
			System.out.print(first+second + ", ");
			calculate(second, first+second, count-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int x = scn.nextInt();
		System.out.print("Fibonacci sequence " + x + " elements: 1, ");
		calculate(0, 1, x-1);
		scn.close();
	}
	
	
}
