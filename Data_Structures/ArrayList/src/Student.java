import java.util.ArrayList;
import java.util.Collections;

public class Student {
	public static void main(String[] args) {
		ArrayList<String> studentNames = new ArrayList<String>();
		addStudents(studentNames);
		displayStudents(studentNames);
		Collections.sort(studentNames);
		System.out.println("\n------ Sorted Names ---------\n");
		displayStudents(studentNames);
	}

	public static void addStudents(ArrayList<String> studentNames) {
		studentNames.add("Ivete Sangalo");
		studentNames.add("Wanessa Camargo");
		studentNames.add("Zeca Pagodinho");
		studentNames.add("Florence Welch");
		studentNames.add("Isabela Lima");

	}

	public static void displayStudents(ArrayList<String> studentNames) {
		for (String student : studentNames)
			System.out.println("Student Name: " + student);

	}
}