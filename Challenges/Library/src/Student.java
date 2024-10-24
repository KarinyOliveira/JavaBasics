//Author: Kariny Oliveira

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;
	private int studentID;
	
	//id counter used to generate an unique ID to each Student
	private static int idCounter = 0;
	
	//List of Book checked by the current Student
	private List<Book> checkedOutBooks;

	//Constructor
	public Student(String name) {
		this.name = name;
		//Generating the Student ID automatically
		this.studentID = generateUniqueID();
		//Creating the array of objects of Book type
		this.checkedOutBooks = new ArrayList<>();
	}
	
	//Method to generate the UniqueID using a simple counter
	private int generateUniqueID() {
		return ++idCounter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentID() {
		return studentID;
	}

	//List of checked books by the student
	public List<Book> getCheckedOutBooks() {
		return checkedOutBooks;
	}

	//Add a book to the checked out list
	public void addBook(Book book) {
		checkedOutBooks.add(book);
	}

	//Remove the book from the checked out list
	public void removeBook(Book book) {
		checkedOutBooks.remove(book);
	}

	// toString is overridden to print the student attributes and checked out books parsing from obj reference
	@Override
	public String toString() {
		return "Student{name='" + name + "', studentID=" + studentID + "Checked Out Books=" + checkedOutBooks + "}";
	}

}
