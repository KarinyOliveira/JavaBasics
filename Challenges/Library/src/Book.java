//Author: Kariny Oliveira

public class Book {
	// enum with the status accepted by Book class
	public enum Status {
		AVAILABLE, CHECKED_OUT
	}

	// private attributes
	private String title;
	private String author;
	private Status status;

	// Constructor book to create the objects
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.status = Status.AVAILABLE;
	}

	// General Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	//Method to print the Book information as String parsing from Obj reference
	@Override
	public String toString() {
		return "Book{title='" + title + "', author='" + author + "', status=" + status + "}";
	}

}
