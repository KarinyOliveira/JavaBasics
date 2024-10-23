
public class Test {

	public static void main(String[] args) {
			int num = 5;
			
			// IF ELSE Statement
			if (num < 0)
				System.out.println("Less than 0");
			else if (num > 0)
				System.out.println("Greater than 0");
			else
				System.out.println("Zero");
			
			//SWITCH CASE Statement
			switch (num){
				case 0:
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("One");
					break;
				case 5:
					System.out.println(5);
					break;
				default:
					System.out.println("Anything else");
					break;
			}
			
			//Nested IF
			if (num > 0)
				if (num > 5)
					System.out.println("Bla bla");
				else
					System.out.println("Greater than 0 and less than 5");
			
			//Ternary operator
			int x = (num > 0) ? num+1:num-1;
			
			if (num > 0)
				x = num+1;
			else
				x = num-1;
			
			
	}

}
