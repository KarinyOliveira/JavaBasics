import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
    	double[] testScore = new double[5];
    	double average = 0.0;
    	
    	Scanner scn = new Scanner(System.in);
    	
    	System.out.println("---------- Enter the Scores [1..100] ---------------");
    	for (int i = 0; i < testScore.length; i++) {
        	System.out.print("Enter the test score " + (i+1) + ": ");
    		testScore[i] = scn.nextDouble();
    		average = average + testScore[i];
    	}
    	
    	System.out.println("Student Scores: ");
    	for (int z = 0; z < testScore.length; z++)
    		System.out.print(testScore[z] + " ");
    	
    	System.out.printf("\nThe average is: %.2f", (average / testScore.length));
    	 	
    	scn.close();
   
    }

}
