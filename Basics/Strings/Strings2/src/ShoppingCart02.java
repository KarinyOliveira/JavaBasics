public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        
        double price = 10.5;
        double tax = 2.5;
        int quantity = 3;
        
        
        // Declare and assign a calculated totalPrice
        
        double totalPrice;
        totalPrice = (price * quantity);
        totalPrice = totalPrice + ((totalPrice*tax)/100);
        
        // Modify message to include quantity 

        message = custName+" wants to purchase " + quantity + " " +itemDesc;

        System.out.println(message);
        
        // Print another message with the total cost
        
        System.out.println("Total cost with tax is: $"+ totalPrice);
        
    }    
}
