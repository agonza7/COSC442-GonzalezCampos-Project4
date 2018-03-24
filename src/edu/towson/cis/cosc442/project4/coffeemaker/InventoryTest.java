package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



public class InventoryTest {
	Inventory inventory = new Inventory();

	@Before
	public void setUp() {
		inventory = new Inventory();
	}
	
	@Test
	public void testSetCoffee1() {
		inventory.setCoffee(5);
		assertEquals("Cant set coffee", 5, inventory.getCoffee());
	}
	
	@Test
	public void setInvalidCoffee() {
		inventory.setCoffee(-99);
		assertEquals("Invalid amount of coffee", 0, inventory.getCoffee());
	}
	
	@Test
	public void setCoffeeZero() {
		inventory.setCoffee(0);
		assertEquals("Invalid amount of coffee", 0, inventory.getCoffee());
	}
	
	@Test
	public void testSetMilk1() {
		inventory.setMilk(7);
		assertEquals("Cant set Milk", 7, inventory.getMilk());
	}
	
	@Test
	public void setInvalidMilk() {
		inventory.setMilk(-99);
		assertEquals("Invalid amount of Milk", 0, inventory.getMilk());
	}
	
	@Test
	public void testSetMilkZero() {
		inventory.setMilk(0);
		assertEquals("Cant set Milk", 0, inventory.getMilk());
	}
	
	@Test
	public void testSetSugar1() {
		inventory.setSugar(9);
		assertEquals("Cant set Sugar", 9, inventory.getSugar());
	}
	
	@Test
	public void setInvalidSugar() {
		inventory.setSugar(-99);
		assertEquals("Invalid amount of Sugar", 0, inventory.getSugar());
	}
	
	@Test
	public void testSetSugarZero() {
		inventory.setSugar(0);
		assertEquals("Cant set Sugar", 0, inventory.getSugar());
	}
	
	@Test
	public void testSetChocolate1() {
		inventory.setChocolate(3);
		assertEquals("Cant set Chocolate", 3, inventory.getChocolate());
	}
	
	@Test
	public void setInvalidChocolate() {
		inventory.setChocolate(-99);
		assertEquals("Invalid amount of chocolate", 0, inventory.getChocolate());
	}
	
	@Test
	public void testSetChocolateZero() {
		inventory.setChocolate(0);
		assertEquals("Cant set Chocolate", 0, inventory.getChocolate());
	}
	
	@Test
	public void testSetCoffee2() {
		inventory.setMilk(15);
		assertEquals("Cant set Milk", 15, inventory.getMilk());
	}
	
	@Test
	public void testEnoughCoffee() {
		final Recipe r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(16);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(1);
		assertFalse("Not enough Coffee for order", inventory.enoughIngredients(r1));

	}
	
	@Test
	public void testEnoughMilk() {
		final Recipe r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(1);
		r1.setAmtMilk(16);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(1);
		assertFalse("Not enough Milk for order", inventory.enoughIngredients(r1));
	}
	
	@Test
	public void testEnoughSugar() {
		final Recipe r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(1);
		r1.setAmtMilk(1);
		r1.setAmtSugar(16);
		r1.setAmtChocolate(1);
		assertFalse("Not enough Sugar for order", inventory.enoughIngredients(r1));
	}
	
	@Test
	public void testEnoughChocolate() {
		final Recipe r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(1);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(16);
		assertFalse("Not enough Chocolate for order", inventory.enoughIngredients(r1));
	}
	
	@Test
	public void testToString() {
		final String expectedMessage = "Coffee: " + 99 + System.getProperty("line.separator") +
				"Milk: " + 99 + System.getProperty("line.separator") +
				"Sugar: " + 99 + System.getProperty("line.separator") +
				"Chocolate: " + 99 + System.getProperty("line.separator");
		assertNotEquals("toString messages not the same", expectedMessage, inventory.toString());

	}
	

}
