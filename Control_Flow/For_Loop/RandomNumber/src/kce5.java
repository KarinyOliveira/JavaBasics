//Author: Kariny Oliveira

import java.util.Random;

public class kce5 {

	public static void main(String[] args) {

		/*
		 * Set the seed of the randomGenerator object to a value of 42L.
		 * Generate and print three random integers in the range of 0 to 99 (inclusive).
		 * Reset the seed of the randomGenerator to 42L again.
		 * Generate and print another three random integers in the same range.
		 * Expected Output: Your program should print six integers in total. The first three integers should be repeated in the next three because of the seed reset.
		 */
		
		Random randomGenerator = new Random();
		
		randomGenerator.setSeed(42L);
		
		for (int i = 0; i < 3; i++) {
            int randomInt = randomGenerator.nextInt(100); // nextInt(100) generates a number between 0 and 99
            System.out.println(randomInt);
        }
		
		randomGenerator.setSeed(42L);

		for (int i = 0; i < 3; i++) {
            int randomInt = randomGenerator.nextInt(100); // nextInt(100) generates a number between 0 and 99
            System.out.println(randomInt);
        }
		
	}

}
