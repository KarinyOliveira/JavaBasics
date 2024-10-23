public class ArrayEx1 {

    public static void main(String args[]) {
        /*
         * −Declare a one-dimensional array named score of type int that 
         * can hold 9 values 
         * −Declare and initialize a one-dimensional byte array 
         * named values of size 10 so that all entries contain 1 
         * −Uncomment the two lines that are commented out and then 
         * resolve the syntax errors
         */
    	
    	long[] primeNum = new long[20];
       	int[] even = new int[5];
    	int[] score = new int[9];
    	byte[] values = new byte[10];
    	
    	for (int i = 0; i < values.length; i++)
    		values[i] = 1;
    	
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);

    }

}
