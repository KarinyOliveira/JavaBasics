//Author: Kariny Oliveira
//Student Number: CT1004878

import java.util.ArrayList;

public class VehicleSimulator {
	public static void main(String[] args) {
		// Create the array of movable objects
		ArrayList<Movable> movable = new ArrayList<Movable>();

		// add the objects
		movable.add(new Car());
		movable.add(new Airplane());
		movable.add(new Car());
		movable.add(new Airplane());
		movable.add(new Car());
		movable.add(new Airplane());

		// print the move method for every object under the list
		for (Movable m1 : movable)
			System.out.println(m1.move());

	}

}
