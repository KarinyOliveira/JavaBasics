import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MobilePhoneTest {

    private MobilePhone phone;

    @Before
    public void setUp() {
        phone = new MobilePhone();
    }

    @Test
    public void testSetAndGetDetails() {
        phone.setDetails("Zwilling", 350.99);
        String expectedOutput = "Brand: Zwilling\nPrice: $350.99";
        assertEquals(expectedOutput, phone.displayDetails());
    }

    @Test
    public void testLongBrandName() {
        String extremelyLongBrandName = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Vivamus in elit et nibh vulputate fringilla in in libero. Maecenas tempus nunc "
				+ "diam, ut accumsan neque venenatis ut. Ut enim libero, bibendum vitae augue vitae, dapibus "
				+ "maximus turpis. In dapibus sodales orci, vitae scelerisque tellus rutrum id. Pellentesque "
				+ "urna tortor, dictum eget magna sit amet, tristique scelerisque nibh. Aliquam non dui ultricies, "
				+ "bibendum dolor nec, vulputate ipsum. Quisque vel suscipit lorem. Donec urna quam, mollis "
				+ "in scelerisque ac, mattis tincidunt nibh. Nullam imperdiet, nunc ac consequat condimentum, "
				+ "nunc nibh ultricies arcu, in tempor massa erat at mauris. Vivamus facilisis accumsan orci, "
				+ "quis gravida ante faucibus non. Vestibulum id mi gravida, rhoncus nisl in, aliquet nisl. In "
				+ "auctor, eros sed convallis ultricies, augue ex consequat velit, et molestie est "
				+ "neque vitae nisl.";
        phone.setDetails(extremelyLongBrandName, 299.99);
        String expectedOutput = "Brand: " + extremelyLongBrandName + "\nPrice: $299.99";
        assertEquals(expectedOutput, phone.displayDetails());
    }

    @Test
    public void testNegativePrice() {
		phone.setDetails("TCL", -500.00);
        String expectedOutput = "Brand: TCL\nPrice: $-500.0";
        assertEquals(expectedOutput, phone.displayDetails());
    }

    @Test
    public void testVeryHighPrice() {
    	phone.setDetails("Zebra", 300000000000000.00);
        String expectedOutput = "Brand: Zebra\nPrice: $300000000000000.00";
        assertEquals(expectedOutput, phone.displayDetails());
    }

    @Test
    public void testUsability() {
    	phone.setDetails("Motorola", 1099.99);
        String expectedOutput = "Brand: Motorola\nPrice: $1099.99";
        assertEquals(expectedOutput, phone.displayDetails());
    }

    @Test
    public void testNullBrand() {
        phone.setDetails(null, 299.99);
        String output = phone.displayDetails();
        assertTrue(output.contains("Brand: null"));
        assertTrue(output.contains("Price: $299.99"));
    }

    @Test
    public void testNullBrandAndNegativePrice() {
        phone.setDetails(null, -299.99);
        String output = phone.displayDetails();
        assertTrue(output.contains("Brand: null"));
        assertTrue(output.contains("Price: $-299.99"));
    }
}
