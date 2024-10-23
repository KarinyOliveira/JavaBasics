//Author: Kariny Oliveira
//Student Number: CT1004878

public class MobilePhone {
	
	private String brand;
	private double price;

	public void setDetails(String brand, double price) {
		this.brand = brand;
	    this.price = price;
	}

	public String displayDetails() {
        return "Brand: " + this.brand + "\nPrice: $" + this.price;
    }
}
