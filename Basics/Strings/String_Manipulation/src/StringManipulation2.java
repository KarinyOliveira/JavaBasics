import java.util.Arrays;

public class StringManipulation2 {
	public static void main(String[] args) {
		String originalString = "Parse String This";
		String[] words = originalString.split("\\s");
		int wordCount = words.length;

		System.out.println(originalString);
		System.out.println("There are " + wordCount + " words in the Original String");

		// Print words in the desired format
		System.out.println(Arrays.toString(words));
	}

}
