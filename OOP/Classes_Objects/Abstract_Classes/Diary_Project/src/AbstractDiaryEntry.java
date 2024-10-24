//Author: Kariny Oliveira

import java.time.LocalDate;

//abstract class that implements the interface declared
public abstract class AbstractDiaryEntry<T> implements DiaryEntry<T> {
	//Common attribute date using LocalDate type
	private LocalDate date;
	
	//Constructor
	public AbstractDiaryEntry(LocalDate date) {
		this.date = date;
	}
	
	//Implements the interface methods
	@Override
	public LocalDate getDate() {
		return date;
	}
	
	@Override
	public abstract String getEntryType();

}



