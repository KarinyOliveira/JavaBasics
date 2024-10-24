//Author: Kariny Oliveira

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Diary<T extends DiaryEntry<?>> {
	private List<T> dEntries;

	// Contructor to initialize the diary entries
	public Diary() {
		this.dEntries = new ArrayList<>();
	}

	// Adds a new entry to the diary.
	public void addEntry(T entry) {
		dEntries.add(entry);
	}

	// Retrieves entries for a specific date.
	public List<T> getEntriesByDate(LocalDate date) {
		return dEntries.stream().filter(entry -> entry.getDate().equals(date)).collect(Collectors.toList());
	}

	// Searches entries based on a predicate (e.g., search by mood rating or
	// activity type)
	public List<T> searchEntries(Predicate<T> predicate) {
		return dEntries.stream().filter(predicate).collect(Collectors.toList());
	}

	// Deletes a specific entry.
	public void deleteEntry(T entry) {
		dEntries.remove(entry);
	}

	// Returns all entries in the diary.
	public List<T> getAllEntries() {
		return new ArrayList<>(dEntries);
	}

	// Sort entries by date, following the logic of a diary
	public List<T> sortEntriesByDate() {
		return dEntries.stream().sorted((e1, e2) -> e1.getDate().compareTo(e2.getDate())).collect(Collectors.toList());
	}

}
