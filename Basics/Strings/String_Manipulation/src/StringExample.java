public class StringExample {

	public static void main(String[] args) {

		String str = "Sample String";

		displayString(str);

		displayStringBackward(str);

	}

	static void displayString(String str) {
		System.out.println(str);
	}

	static void displayStringBackward(String str) {

		String strBackwards = "";

		for (int i = str.length() - 1; i >= 0; i--)
			strBackwards += str.substring(i, i + 1);

		System.out.println(strBackwards);

	}
}
