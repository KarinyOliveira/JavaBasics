//Author: Kariny Oliveira
//Student Number: CT1004878

import java.time.LocalDate;

//Inherit the methods and attributes from AbstractDiaryEntry class
public class MoodDiaryEntry extends AbstractDiaryEntry<Integer> {
	//moodRating attribute using Integer type
	private Integer rating;
	
	//Constructor to initialize date from parent class and moodRating from current class
    public MoodDiaryEntry(LocalDate date, Integer rating) {
        super(date);
        this.rating = rating;
    }

    //Getter method that implements interface method to moodRating attribute
    @Override
    public Integer getContent() {
        return rating;
    }
    
    //Implements the getEntryType method
    @Override
    public String getEntryType() {
        return "mood";
    }

}
