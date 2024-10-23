import java.util.Arrays;

public class StringManipulation {
    private String string;

    public StringManipulation(String string) {
        this.string = string;
    }

    public void parseString() {
        // Split the string into words
        String[] words = string.split("\\s+");
        
        // Count the number of words
        int wordCount = words.length;

        // Print each word
        System.out.println("Parse this String");
        System.out.println("There are " + wordCount + " words in the Original String");

        // Print words in the desired format
        System.out.println(Arrays.toString(words));
    }

    public static void main(String[] args) {
        StringManipulation stringManipulator = new StringManipulation("Parse this String");
        stringManipulator.parseString();
    }
}
