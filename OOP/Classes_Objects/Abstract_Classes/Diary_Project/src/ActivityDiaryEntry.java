//Author: Kariny Oliveira

import java.time.LocalDate;
import java.util.List;

public class ActivityDiaryEntry extends AbstractDiaryEntry<List <String>> {
	//activities String list attribute
	private List<String> activities;

	//Constructor to initialize date and activities attributes
    public ActivityDiaryEntry(LocalDate date, List<String> activities) {
        super(date);
        this.activities = activities;
    }

    //Get content method implemented from the interface
    @Override
    public List<String> getContent() {
        return activities;
    }

    //Get method to retrieve the Entry Type
    @Override
    public String getEntryType() {
        return "activity";
    }

}
