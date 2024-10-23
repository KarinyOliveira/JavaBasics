import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileException {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a file name and path: ");
		String filename = scn.nextLine();
				
		try {
			File file = new File(filename);
			Scanner sc = new Scanner(file);
			 
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not found " + e);
		}
		
		scn.close();
		
	}
}
