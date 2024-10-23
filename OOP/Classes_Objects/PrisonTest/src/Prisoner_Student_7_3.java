//Section 7, Lesson 3 Starter for Exercise 1 - Slide 6

public class Prisoner_Student_7_3 {

    //Fields 
    public String name;
    public double height;
    public int sentence;
    private Cell cell;
    
    //Constructor
    public Prisoner_Student_7_3(String name, double height, int sentence, Cell cell) {
		super();
		this.name = name;
		this.height = height;
		this.sentence = sentence;
		this.cell = cell;
	}
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }   
    
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Height: " + height);
		System.out.println("Sentence: " + sentence);
    	System.out.println("Cell name: " + cell.getCellName());
    }
	
	public void openDoor() {
		cell.setDoorOpen(!cell.getisDoorOpen());
		
		if (cell.getisDoorOpen()) {
			System.out.println(name + " opened the cell door!");
		} else {
			System.out.println(name + " closed the cell door.");
		}
	}
	
}
