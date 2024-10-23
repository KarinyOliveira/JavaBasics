import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(queue.remove());
        }
    }
}
