//Author: Kariny Oliveira
//Student Number: CT1004878

//Class Airplane that implements interface Movable
public class Airplane implements Movable {

	// Override notation to explicit not call the interface method
	@Override
	public String move() {
		return "The airplane flies in the sky.";
	}

}