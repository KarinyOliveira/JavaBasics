
public class Calculator {

	/*
	 * You are required to create a simple Java program that
	 * demonstrates the concept of method overloading. The task is to design
	 * a class named Calculator that has three overloaded methods named multiply.
	 * The first method should multiply two integer numbers.
	 * The second method should multiply three integer numbers.
	 * The third method should multiply two double numbers.
	 * Once you've created the Calculator class, instantiate an object
	 * of this class in the main method and display the result of multiplying
	 * the numbers 5, 6, the numbers 2, 3, 4, and the numbers 1.5, 2.5.
	 */
	
	public int multiply (int num1, int num2) {		
		return (num1 * num2);		
	}
	
	public int multiply (int num1, int num2, int num3) {
		return (num1 * num2 * num3);
	}
	
	public double multiply (double num1, double num2) {
		return (num1 * num2);
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.multiply(5, 6));
		System.out.println(calc.multiply(2, 3, 4));
		System.out.println(calc.multiply(1.5 , 2.5));
		
	}
	
}
