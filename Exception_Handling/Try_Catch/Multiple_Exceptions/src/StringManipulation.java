import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;

public class StringManipulation {
	
	static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
	
	static boolean specialCharacters(String s) {
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(s);
		boolean special = m.find();
		
		if (special)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		String name;
		
		try {
			do {
				name = JOptionPane.showInputDialog("Enter your name: ");
			} while ((isNumber(name)) || (specialCharacters(name)) || 
					(name == null) || (name.isBlank()) || (name.length() < 10)); 										
			JOptionPane.showMessageDialog(null, "Full Name: " + 
					name.toUpperCase() + "\nLength: " + name.length());
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "You pressed cancel button", "Cancel",  
					JOptionPane.ERROR_MESSAGE);		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Oops, something went wrong!!", "Error",  
					JOptionPane.ERROR_MESSAGE);
		} finally {
			JOptionPane.showMessageDialog(null, "Goodbye!!");
		}
		
		
	}

}
