public enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

	// Method to check if a day is a weekend
	public boolean isWeekend() {
		return this == SATURDAY || this == SUNDAY;
	}

	// Method to return the type of day
	public String typeOfDay() {
		switch (this) {
		case SATURDAY:
		case SUNDAY:
			return "Weekend";
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			return "Weekday";
		default:
			return "Invalid Day";
		}
	}
}
