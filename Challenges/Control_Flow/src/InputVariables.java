import java.util.Scanner;

public class InputVariables {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the int value: ");
		int intValue = scn.nextInt();
		
		System.out.print("Enter the boolean value: ");
		boolean boolValue = scn.nextBoolean();
		
		System.out.print("Enter the Byte value: ");
		byte byteValue = scn.nextByte();
		
		System.out.print("Enter the Short value: ");
		short shortValue = scn.nextShort();
		
		System.out.print("Enter the Long value: ");
		long longValue = scn.nextLong();
		
		System.out.print("Enter the Float value: ");
		float floatValue = scn.nextFloat();
		
		System.out.print("Enter the Double value: ");
		double doubleValue = scn.nextDouble();
		
		System.out.print("Enter the Char value: ");
		char charValue =  scn.next().charAt(0);
		
		System.out.println();
		System.out.println("Int Value: " + intValue);
		System.out.println("Boolean Value: " + boolValue);
		System.out.println("Byte Value: " + byteValue);
		System.out.println("Short Value: " + shortValue);
		System.out.println("Long Value: " + longValue);
		System.out.println("Float Value: " + floatValue);
		System.out.println("Double Value: " + doubleValue);
		System.out.println("Char Value: " + charValue);
		
		scn.close();

	}

}
