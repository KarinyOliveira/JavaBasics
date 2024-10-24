//Author: Kariny Oliveira

//Class Car that implements the Movable interface
public class Car implements Movable {

	// Override to indicates that the interface method should be not called
	@Override
	public String move() {
		return "The car drives on the road.";
	}

}
