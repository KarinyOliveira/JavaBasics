import java.io.*;

public class AutoCloseResourceExample {
	public static void main(String[] args) {
	
		String filename = "/Users/karinyoliveira/Documents/CCTB/ISM107_Java_2/"
				+ "workspace/Class5.Exceptions/resources/Example.txt";
				
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line;
			 while ((line = reader.readLine()) != null) {
				 System.out.println(line);
			 }
		} catch (FileNotFoundException e) {
			System.err.println("Error: File not found - " + filename);
		} catch (IOException e) {
			System.err.println("Error reading the file: " + e.getMessage());
		} 
		
		
	}

}
