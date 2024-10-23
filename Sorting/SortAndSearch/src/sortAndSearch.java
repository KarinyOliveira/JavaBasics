import java.util.Random;
import java.util.Scanner;

public class sortAndSearch {
    public static void main(String[] args) {
        // Create an integer array named numbers that will hold 50 values
        int[] numbers = new int[50];

        // Fill the array with random integer values between 0 and 100
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(101); // Generates a random number between 0 and 100
        }

        // Display the contents of the array under the heading “Unordered list”
        System.out.println("Unordered list:");
        displayArray(numbers);

        // Get the number to be searched for from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search for: ");
        int searchNumber = scanner.nextInt();

        // Use a sequential/linear search to identify if the value is in the array
        int position = linearSearch(numbers, searchNumber);

        // Display the result of the search
        if (position != -1) {
            System.out.println("Number " + searchNumber + " found at position: " + position);
        } else {
            System.out.println("Number " + searchNumber + " not found.");
        }

        // Sort the array using a bubble sort
        bubbleSort(numbers);

        // Display the contents of the array under the heading “Ordered list”
        System.out.println("Ordered list:");
        displayArray(numbers);

        // Use a sequential/linear search to identify if the value is in the array after sorting
        position = linearSearch(numbers, searchNumber);

        // Display the result of the search
        if (position != -1) {
            System.out.println("Number " + searchNumber + " found at position: " + position);
        } else {
            System.out.println("Number " + searchNumber + " not found.");
        }

        scanner.close();
    }

    // Method to display the array
    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to perform a linear search
    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Method to perform bubble sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }
}
