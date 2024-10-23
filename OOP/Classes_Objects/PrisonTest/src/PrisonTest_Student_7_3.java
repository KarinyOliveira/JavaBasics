//Section 7, Lesson 3 Starter for Exercise 1 - Slide 6

public class PrisonTest_Student_7_3 {

    public static void main(String[] args) {
    	
    	Cell cell1 = new Cell("Cell1", false);
    	Cell cell2 = new Cell("Cell2", true);
    	Prisoner_Student_7_3 prisoner1 = new Prisoner_Student_7_3("Prisoner 1",160.5, 10, cell1);
    	Prisoner_Student_7_3 prisoner2 = new Prisoner_Student_7_3("Prisoner 2",170.5, 5, cell2);
    	
    	
    	prisoner1.display();
    	prisoner2.display();
    	
    	for (int i = 0; i < 5; i++) {
    		prisoner1.openDoor();
    	   	prisoner2.openDoor();    	
    	}
    } 
}
