public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
        return arr;
    }

    // Main method for manual testing
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int[] sortedArr = bubbleSort(arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
