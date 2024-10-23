import java.lang.Math;

public class methodsMath {
	public static void main(String[] args) {
		
		/*
		 * evaluate the following Java statements and record the results: 
		 * −Math.abs(-1.23) −Math.pow(3, 2) −Math.sqrt(169.0) - Math.sqrt(256.0) 
		 * −Math.abs(Math.min(-3, -5))
		 */
		
		System.out.println("Result of Math.abs(-1.23): " + Math.abs(-1.23));
		System.out.println("Result of Math.pow(3, 2): " + Math.pow(3, 2));
		System.out.println("Result of Math.sqrt(169.0): " + Math.sqrt(169.0));
		System.out.printf("Result of Math.sqrt(169.0) - Math.sqrt(256.0): %f \n",
				(Math.sqrt(169.0) - Math.sqrt(256.0)));
		double res = Math.sqrt(169.0) - Math.sqrt(256.0);
		System.out.println("Result res: " + res);
		System.out.println("Result of Math.sqrt(256.0): " + Math.sqrt(256.0));
		System.out.println("Result of Math.abs(Math.min(-3, -5)):" 
		+ Math.abs(Math.min(-3, -5)));
		
	}
}
