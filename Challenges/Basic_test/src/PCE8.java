//Author: Kariny Oliveira
//Student Number: CT1004878

public class PCE8 {

	public static void main(String[] args) {
		
		MobilePhone phone = new MobilePhone();
		
		System.out.println("============= Functional Testing ===============");

		phone.setDetails("Zwilling", 350.99);
		System.out.println(phone.displayDetails());
		
		System.out.println("============= Boundary Testing =================");
		
		//Extremely long brand name
		phone.setDetails("Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Vivamus in elit et nibh vulputate fringilla in in libero. Maecenas tempus nunc "
				+ "diam, ut accumsan neque venenatis ut. Ut enim libero, bibendum vitae augue vitae, dapibus "
				+ "maximus turpis. In dapibus sodales orci, vitae scelerisque tellus rutrum id. Pellentesque "
				+ "urna tortor, dictum eget magna sit amet, tristique scelerisque nibh. Aliquam non dui ultricies, "
				+ "bibendum dolor nec, vulputate ipsum. Quisque vel suscipit lorem. Donec urna quam, mollis "
				+ "in scelerisque ac, mattis tincidunt nibh. Nullam imperdiet, nunc ac consequat condimentum, "
				+ "nunc nibh ultricies arcu, in tempor massa erat at mauris. Vivamus facilisis accumsan orci, "
				+ "quis gravida ante faucibus non. Vestibulum id mi gravida, rhoncus nisl in, aliquet nisl. In "
				+ "auctor, eros sed convallis ultricies, augue ex consequat velit, et molestie est "
				+ "neque vitae nisl.", 299.99);
		System.out.println(phone.displayDetails());
		
		// Negative price
		phone.setDetails("TCL", -500.00);
		System.out.println(phone.displayDetails());

		// Very high price
		phone.setDetails("Zebra", 300000000000000.00);
		System.out.println(phone.displayDetails());
		
		System.out.println("============= Usability Testing =================");
		
		phone.setDetails("Motorola", 1099.99);
		System.out.println(phone.displayDetails());
		
		// Null brand
		phone.setDetails(null, 299.99);
		System.out.println(phone.displayDetails());

		// Null brand and negative price
		phone.setDetails(null, -299.99);
		System.out.println(phone.displayDetails()); 

	}

}
