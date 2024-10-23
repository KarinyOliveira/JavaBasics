import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int option =-1;
		
		while (option != 0) {
			System.out.println("----------------------");
			System.out.println("|     Happy Menu     |");
			System.out.println("| 1 - Add User       |");
			System.out.println("| 2 - Edit User      |");
			System.out.println("| 3 - Delete User    |");
			System.out.println("| 0 - Exit           |");
			System.out.println("----------------------");
			System.out.print("Choose your option: ");
			option = scn.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Add User");
				break;
			case 2:
				System.out.println("Edit User");
				break;
			case 3:
				System.out.println("Delete User");
				break;
			case 0:
				System.out.println("Good bye!!");
				break;
			default:
				System.out.println("Invalid option, try again");
				break;
			}
		}
	}
}


