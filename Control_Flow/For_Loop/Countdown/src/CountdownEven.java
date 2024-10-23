public class CountdownEven {

    public static void main(String[] args) {
        
        System.out.println("Countdown Even Number: ");

        for(int i = 0; i <= 20; i++) {
        	if (i % 2 == 0)
        		System.out.print(i +" "); 
        }

        System.out.println("\nAll even numbers from 0 to 20");
    }
}
