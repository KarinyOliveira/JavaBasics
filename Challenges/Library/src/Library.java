import java.util.ArrayList;
import java.util.List;

public class Library {
	// List of all books
	private List<Book> books;
	// List of all students
	private List<Student> students;
	// List of checked out books
	private Book[] checkedOutBooks;
	//Number of books checked out
	private int checkedOutBooksCount;

	//Constructor
	public Library(int maxCheckedOutBooks) {
		// Create the list of Books
		this.books = new ArrayList<>();
		// Create the list of students
		this.students = new ArrayList<>();
		// We have a max number of books that can be checked out
		this.checkedOutBooks = new Book[maxCheckedOutBooks];
		// The number of books checked out is 0 in the beginning
		checkedOutBooksCount = 0;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void removeBook(Book book) {
		books.remove(book);
	}

	public void listBooks() {
		//Check the book list and print all the elements
		for (Book book : books) {
			System.out.println(book);
		}
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void removeStudent(Student student) {
		students.remove(student);
	}

	public void listStudents() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	//To check out a book we need to receive the student obj and the book obj
	//Then we check if the book is under the book list, if the status if available
	//And if the student is under the student list
	//After that we add the book to the checked out list, change the status
	//And increment the checked out book count
	public void checkoutBook(Student student, Book book) {
		if (books.contains(book) && book.getStatus() == Book.Status.AVAILABLE && students.contains(student)) {
			for (int i = 0; i < checkedOutBooks.length; i++) {
				if (checkedOutBooks[i] == null) {
					checkedOutBooks[i] = book;
					book.setStatus(Book.Status.CHECKED_OUT);
					student.addBook(book);
					System.out.println("Book checked out: " + book + " by " + student);
					checkedOutBooksCount++;
					return;
				}
			}
			System.out.println("No more books can be checked out. Maximum capacity reached.");
		} else {
			System.out.println("Book not available in the library.");
		}
	}

	//To return a book we will need the book obj
	//I verify if the book status is checked out
	//I change the book status to available, remove from checked out list
	//And decrement the checked out book count
	public void returnBook(Book book) {
		if (book.getStatus() == Book.Status.CHECKED_OUT) {
			book.setStatus(Book.Status.AVAILABLE);
			for (int i = 0; i < checkedOutBooksCount; i++) {
				if (checkedOutBooks[i] == book) {
					checkedOutBooks[i] = checkedOutBooks[--checkedOutBooksCount];
					checkedOutBooks[checkedOutBooksCount] = null;
					checkedOutBooksCount--;
					break;
				}
			}
		} else {
			System.out.println("Book is not checked out.");
		}
	}

	public void listAvailableBooks() {
		for (Book book : books) {
			if (book.getStatus() == Book.Status.AVAILABLE) {
				System.out.println(book);
			}
		}
	}

	public void listCheckedOutBooks() {
		if (checkedOutBooksCount == 0) {
			System.out.println("No books are currently checked out.");
		} else {
			for (int i = 0; i < checkedOutBooksCount; i++) {
				System.out.println(checkedOutBooks[i]);
			}
		}
	}
	
	//I created two methods to get all the Books and all the students
	//To make the search more quickly
	public List<Book> getBooks() {
		return books;
	}

	public List<Student> getStudents() {
		return students;
	}
}
