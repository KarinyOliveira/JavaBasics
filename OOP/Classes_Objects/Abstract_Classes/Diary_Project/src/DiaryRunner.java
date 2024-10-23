//Author: Kariny Oliveira
//Student Number: CT1004878

import java.time.LocalDate;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;

//Main class
public class DiaryRunner {

	public static void main(String[] args) {
		// Instantiate the object diary from Diary class of type DiaryEntry
		Diary<DiaryEntry<?>> diary = new Diary<>();

		// Add some entries
		diary.addEntry(new TextDiaryEntry(LocalDate.of(2023, 5, 15),
				"Today is my first day in my new college, I want to make several friends and start playing basketball!!"));
		diary.addEntry(new TextDiaryEntry(LocalDate.of(2023, 5, 16), "Yesterday was awesome, I loved everyone"));
		diary.addEntry(new TextDiaryEntry(LocalDate.of(2024, 6, 20), "Today is my final exam, I'm terrifying"));
		diary.addEntry(new MoodDiaryEntry(LocalDate.of(2024, 5, 16), 10));
		diary.addEntry(new MoodDiaryEntry(LocalDate.of(2024, 6, 20), 6));
		diary.addEntry(new ActivityDiaryEntry(LocalDate.of(2024, 5, 16),
				Arrays.asList("Partying", "Enjoying quality time with friends")));
		diary.addEntry(new ActivityDiaryEntry(LocalDate.of(2024, 6, 19), Arrays.asList("Studying", "Freaking out!!")));
		//To add an image entry we need to check if the file can be located, so we added a try catch to avoid any runtime error
		//Create an img object from class BufferedImage
		BufferedImage img = null;
		try {
			//Get the absolute path from image file
			Path path1 = Paths.get("src/resources/VanCity.jpg");
			//Try to read the image file from path and attributes to img obj
			img = ImageIO.read(new File(path1.toAbsolutePath().toString()));
			//Add the image entry, including the date and image file
			diary.addEntry(new ImageDiaryEntry(LocalDate.of(2024, 6, 15), img));
		} catch (IOException e) {
			//print error if file not foundŒ
			System.out.println(e);
		}

		// Print all entries
		for (DiaryEntry<?> entry : diary.getAllEntries()) {
			System.out.println("Date: " + entry.getDate() + ", Type: " + entry.getEntryType() + ", Content: "
					+ entry.getContent());
		}

		// Search entries by date
		List<DiaryEntry<?>> entriesOn21st = diary.getEntriesByDate(LocalDate.of(2024, 6, 20));
		System.out.println("Entries on 20st June 2024: " + entriesOn21st.size());

		// Delete an entry
		DiaryEntry<?> entryToDelete = diary.getAllEntries().get(0);
		diary.deleteEntry(entryToDelete);
		System.out.println("Entry deleted. Remaining entries: " + diary.getAllEntries().size());
	}

}
