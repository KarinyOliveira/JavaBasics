public class EnumTest {
	public static void main(String[] args) {
		// Test the isWeekend method
		for (Day day : Day.values()) {
			System.out.println(day + " is weekend? " + day.isWeekend());
		}

		// Test the typeOfDay method
		for (Day day : Day.values()) {
			System.out.println(day + " is a " + day.typeOfDay());
		}
	}
}
