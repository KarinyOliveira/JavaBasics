//Author: Kariny Oliveira
//Student Number: CT1004878

//import java.time to use LocalDate type
import java.time.LocalDate;

//Generic Interface to be implementeed
public interface DiaryEntry<T> {
	//Returns the content of the entry.
	T getContent();
	//Returns the date of the entry.
	LocalDate getDate();
	//Returns a string indicating the type of entry (e.g., "text", "mood", "activity").
	String getEntryType();

}