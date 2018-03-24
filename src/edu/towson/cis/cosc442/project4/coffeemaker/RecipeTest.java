package edu.towson.cis.cosc442.project4.coffeemaker;
import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

public class RecipeTest {
	Recipe r1;

	@Before
	public void setUp() throws Exception {

		r1 = new Recipe();

	}
	
	@Test
	public void testSetCoffee() {
		r1.setAmtCoffee(10);
		assertEquals("Wrong amount of coffee set", 10, r1.getAmtCoffee());
	}
	
	@Test
	public void setInvalidCoffee() {
		r1.setAmtCoffee(-99);
		assertEquals("Invalid amount of coffee", 0, r1.getAmtCoffee());
	}
	
	@Test
	public void testSetMilk() {
		r1.setAmtMilk(10);
		assertEquals("Wrong amount of Milk set", 10, r1.getAmtMilk());
	}
	
	@Test
	public void setInvalidMilk() {
		r1.setAmtMilk(-99);
		assertEquals("Invalid amount of Milk", 0, r1.getAmtMilk());
	}
	
	@Test
	public void testSetSugar() {
		r1.setAmtSugar(10);
		assertEquals("Wrong amount of Sugar set", 10, r1.getAmtSugar());
	}
	
	@Test
	public void setInvalidSugar() {
		r1.setAmtSugar(-99);
		assertEquals("Invalid amount of coffee", 0, r1.getAmtSugar());
	}
	
	@Test
	public void testSetChocolate() {
		r1.setAmtChocolate(10);
		assertEquals("Wrong amount of coffee set", 10, r1.getAmtChocolate());
	}
	
	@Test
	public void setInvalidChocolate() {
		r1.setAmtChocolate(-99);
		assertEquals("Invalid amount of coffee", 0, r1.getAmtChocolate());
	}
	
	@Test
	public void testSetName() {
		r1.setName("Chocolate");
		assertEquals("New Name", "Chocolate", r1.getName());
	}
	
	@Test
	public void testSetPrice() {
		r1.setPrice(25);
		assertNotEquals("New Price for recipe", 15, r1.getPrice());
	}
	
	@Test
	public void testSetPriceZero() {
		r1.setPrice(0);
		assertEquals("THIS IS FREE", 0, r1.getPrice());
	}
	
	@Test
	public void testSetPriceInvalid() {
		r1.setPrice(-99);
		assertNotEquals("THIS IS WRONG", -99, r1.getPrice());
	}
	
	@Test
	public void testEqualsName() {
		r1.setName("Coffee");
		final Recipe r2 = new Recipe();
		r2.setName("Chocolate");
		assertFalse("Recipes were equal", r1.equals(r2));
	}
	
	@Test
	public void testEqualsNull() {
		final Recipe r2 = new Recipe();
		r2.setName("Coffee");
		assertFalse("Recipes were equal", r1.equals(r2));
	}
	
	@Test
	public void testToString() {
		r1.setName("Coffee");
		assertEquals("Incorrect Name", "Coffee", r1.toString());
	}
	
	
	
}