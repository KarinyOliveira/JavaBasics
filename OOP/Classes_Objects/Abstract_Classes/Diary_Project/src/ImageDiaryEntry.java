//Author: Kariny Oliveira
//Student Number: CT1004878

import java.awt.Image;
import java.time.LocalDate;

public class ImageDiaryEntry extends AbstractDiaryEntry<Image> {

	private Image content;

	// Get method from interface to return the content value
	@Override
	public Image getContent() {
		return content;
	}

	// Implements the getEntryType method from parentclass / interface
	@Override
	public String getEntryType() {
		return "image";
	}
	
	//Constructor to initialize the parent attribute date and content
	public ImageDiaryEntry(LocalDate date, Image content) {
		super(date);
		this.content = content;
	}

}
