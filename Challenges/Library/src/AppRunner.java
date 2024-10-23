import java.util.Scanner;

public class AppRunner {
	public static void main(String[] args) {
		// Create the new obj from Library class responsible to handle most of the
		// actions
		Library lb = new Library(100);
		// Initialize the option menu as -1
		int option = -1;
		Scanner scn = new Scanner(System.in);

		// Start the while to always print the menu until the user press 0
		while (option != 0) {
			System.out.println(" ------------- Menu ------------ ");
			System.out.println("|  1  - Add Books               |");
			System.out.println("|  2  - Remove Books            |");
			System.out.println("|  3  - List Books              |");
			System.out.println("|  4  - Add Student             |");
			System.out.println("|  5  - Remove Student          |");
			System.out.println("|  6  - List Students           |");
			System.out.println("|  7  - Check Out Book          |");
			System.out.println("|  8  - Return Book             |");
			System.out.println("|  9  - List Available Books    |");
			System.out.println("|  10 - List Checked Out Books  |");
			System.out.println("|  0  - Exit                    |");
			System.out.println(" ------------------------------- ");
			System.out.print("Enter the option desired: ");
			option = scn.nextInt();
			scn.nextLine(); // Consume the line after the option to avoid mistakes

			switch (option) {
			case 1: // Add Book
				System.out.print("Enter the book title: ");
				String title = scn.nextLine();
				System.out.print("Enter the book author: ");
				String author = scn.nextLine();
				lb.addBook(new Book(title, author));
				break;
			case 2: // Remove Book
				System.out.print("Enter the book title to remove: ");
				String titleR = scn.nextLine();
				Book bookToRemove = null;
				// Check every book until the title is the same
				for (Book book : lb.getBooks()) {
					if (book.getTitle().equals(titleR)) {
						bookToRemove = book;
						break;
					}
				}
				// If we found the book the obj is removed from the list
				if (bookToRemove != null) {
					lb.removeBook(bookToRemove);
				} else {
					System.out.println("Book not found.");
				}
				break;
			case 3: // List All Books
				lb.listBooks();
				break;
			case 4: // Add New Student
				System.out.print("Enter the student name: ");
				String name = scn.nextLine();
				lb.addStudent(new Student(name));
				break;
			case 5: // Remove the desired student
				// We are using the same logic explained in Books case 2
				System.out.print("Enter the student name to remove: ");
				String nameR = scn.nextLine();
				Student studentToRemove = null;
				for (Student student : lb.getStudents()) {
					if (student.getName().equals(nameR)) {
						studentToRemove = student;
						break;
					}
				}
				if (studentToRemove != null) {
					lb.removeStudent(studentToRemove);
				} else {
					System.out.println("Student not found.");
				}
				break;
			case 6: // List Students
				lb.listStudents();
				break;
			case 7: // Check Out Book
				System.out.print("Enter student Name: ");
				name = scn.nextLine();
				System.out.print("Enter book title to check out: ");
				title = scn.nextLine();
				Student student = null;
				Book bookToCheckOut = null;
				// We search all the students and books until we find the desired entries
				// So we will store the obj of each one in a variable
				for (Student s : lb.getStudents()) {
					if (s.getName().equals(name)) {
						student = s;
						break;
					}
				}
				for (Book book : lb.getBooks()) {
					if (book.getTitle().equals(title)) {
						bookToCheckOut = book;
						break;
					}
				}
				// After that we will call the checkoutbook method
				if (student != null && bookToCheckOut != null) {
					lb.checkoutBook(student, bookToCheckOut);
				} else {
					System.out.println("Student or book not found.");
				}
				break;
			case 8: // Return Book from checked out list to available
				System.out.print("Enter book title to return: ");
				title = scn.nextLine();
				Book bookToReturn = null;
				// Search for the book obj similar to case 7
				for (Book book : lb.getBooks()) {
					if (book.getTitle().equals(title)) {
						bookToReturn = book;
						break;
					}
				}
				// If found we start returning the book and change the status to AVAILABLE
				if (bookToReturn != null) {
					lb.returnBook(bookToReturn);
				} else {
					System.out.println("Book not found.");
				}
				break;
			case 9: // List All available Books
				lb.listAvailableBooks();
				break;
			case 10: // List All Checked Out Books
				lb.listCheckedOutBooks();
				break;
			case 0: // Exit the program
				System.out.println("Good Bye!!!!");
				break;
			default: // If the option is not available on the menu
				System.out.println("Option not available");
				break;
			}

		}
		scn.close();
	}

}
