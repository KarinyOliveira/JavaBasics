import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
    	Random random = new Random();
    	int turn = random.nextInt(3);
    	
    	if (turn == 0) {
    		System.out.println("Rock!!");
    	} else if (turn == 1) {
    		System.out.println("Paper!!");
    	} else {
    		System.out.println("Scissor!!");
    	}
    	
    }
}
