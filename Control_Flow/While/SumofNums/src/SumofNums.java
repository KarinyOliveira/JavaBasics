import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int count =0;
        int sum = 0;
        int number =0;

        do {
            System.out.print("Enter the number " + (count+1) + ": ");
            number = console.nextInt();
            sum = sum + number;     // moved to top of loop
            count++;
        } while (count <10);

        System.out.println("The sum is " + sum);
        console.close();
    }
}
