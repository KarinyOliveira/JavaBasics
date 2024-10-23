import javax.swing.*;

public class MultipleCatchSwingExample {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Enter a whole number: ");
		
		try {
			int number = Integer.parseInt(input);
			JOptionPane.showMessageDialog(null, "You entered: " + number);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "That's not a whole number!", "Wrong format",  
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Something unexpected went wrong!", "Error",  
					JOptionPane.ERROR_MESSAGE);
		} finally { // This block will ALWAYS runs, whether there was an error or not
			JOptionPane.showMessageDialog(null, "Thanks for trying!");
		}

	}

}
