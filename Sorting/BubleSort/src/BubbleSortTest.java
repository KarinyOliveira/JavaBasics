import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testRandomOrderArray() {
        int[] arr = {5, 1, 4, 2, 8};
        int[] sortedArr = {1, 2, 4, 5, 8};
        assertArrayEquals(sortedArr, BubbleSort.bubbleSort(arr));
    }

    @Test
    public void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] sortedArr = {1, 2, 3, 4, 5};
        assertArrayEquals(sortedArr, BubbleSort.bubbleSort(arr));
    }

    @Test
    public void testDescendingOrderArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] sortedArr = {1, 2, 3, 4, 5};
        assertArrayEquals(sortedArr, BubbleSort.bubbleSort(arr));
    }

    @Test
    public void testArrayWithDuplicateValues() {
        int[] arr = {5, 1, 4, 2, 8, 4};
        int[] sortedArr = {1, 2, 4, 4, 5, 8};
        assertArrayEquals(sortedArr, BubbleSort.bubbleSort(arr));
    }

    @Test
    public void testArrayWithEdgeCaseValues() {
        int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0, 1, -1};
        int[] sortedArr = {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE};
        assertArrayEquals(sortedArr, BubbleSort.bubbleSort(arr));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] sortedArr = {};
        assertArrayEquals(sortedArr, BubbleSort.bubbleSort(arr));
    }
}
