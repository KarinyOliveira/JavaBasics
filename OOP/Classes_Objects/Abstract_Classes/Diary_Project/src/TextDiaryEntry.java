//Author: Kariny Oliveira
//Student Number: CT1004878

import java.time.LocalDate;

//TextDiaryEntry inherit the methods and attributes from AbstractDiaryEntry class
public class TextDiaryEntry extends AbstractDiaryEntry<String> {
	//Content of the diary
	private String content;
	
	//Constructor that initializes the date and diary content
    public TextDiaryEntry(LocalDate date, String content) {
    	//initialize date attribute from parent class
        super(date);
        this.content = content;
    }

    //Get method from interface to return the content value
    @Override
    public String getContent() {
        return content;
    }

    //Implements the getEntryType method from parentclass / interface
    @Override
    public String getEntryType() {
        return "text";
    }
}
