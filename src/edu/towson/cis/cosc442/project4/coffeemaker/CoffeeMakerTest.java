package edu.towson.cis.cosc442.project4.coffeemaker;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;

	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory();

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
	}
/**
 *Test Cases recorded in the Acceptance Tests
 */
	
	
	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}

	public void testDeleteRecipe1() {
		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
	}

	public void testEditRecipe1() {
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	public void testAddInventory1() {
			cm.addInventory(5, 4, 3, 2);
		assertEquals("New amount", 20, cm.checkInventory().getCoffee());
		assertEquals("New amount", 19, cm.checkInventory().getMilk());
		assertEquals("New amount", 18, cm.checkInventory().getSugar());
		assertEquals("New amount", 17, cm.checkInventory().getChocolate());
		}
	
	public void testCheckinventory1() {
		assertEquals(15, cm.checkInventory().getCoffee());
		assertEquals(15, cm.checkInventory().getMilk());
		assertEquals(15, cm.checkInventory().getSugar());
		assertEquals(15, cm.checkInventory().getChocolate());
		
	}
	public void testCheckinventory2() {
	testAddInventory1();
		assertNotNull("Lets check this stuff", cm.checkInventory() );
	}
	public void testMakeCoffee1() {
		cm.addRecipe(r1);
		assertEquals("No change for you", 0, cm.makeCoffee(r1, 50));
	}
	public void testCheckInventory3() {
		testMakeCoffee1();
		assertEquals("New amount", 9, cm.checkInventory().getCoffee());
		assertEquals("New amount", 14, cm.checkInventory().getMilk());
		assertEquals("New amount", 14, cm.checkInventory().getSugar());
		assertEquals("New amount", 15, cm.checkInventory().getChocolate());
		
		assertNotNull("Totals should be 9,14,14,15", cm.checkInventory());
	}
	
	
	
	/**
	 * Extra tests Used for Completion
	 */
	public void testGetRecipies() {
		assertNotNull(cm.getRecipes());
	}
	
	public void testGetRecipeForName() {
		cm.addRecipe(r1);
		assertEquals("Got incorrect recipe", "Coffee", cm.getRecipeForName("Coffee").getName());
	}
	
	public void testAddInvalidInventory1() {
		cm.addInventory(-5, 4, 3, 2);
	assertNotSame(10, cm.checkInventory().getCoffee());
	}
	
	public void testAddInvalidInventory2() {
		cm.addInventory(5, -4, 3, 2);
	assertNotSame(11, cm.checkInventory().getMilk());
	}
	
	public void testAddInvalidInventory3() {
		cm.addInventory(5, 4, -3, 2);
	assertNotSame(12, cm.checkInventory().getSugar());
	}
	
	public void testAddInvalidInventory4() {
		cm.addInventory(5, 4, 3, -2);
	assertNotSame(13, cm.checkInventory().getChocolate());
	}
	
	public void testAddInventory5() {
		cm.addInventory(0, 0, 0, 0);
	assertEquals("New amount", 15, cm.checkInventory().getCoffee());
	assertEquals("New amount", 15, cm.checkInventory().getMilk());
	assertEquals("New amount", 15, cm.checkInventory().getSugar());
	assertEquals("New amount", 15, cm.checkInventory().getChocolate());
	}
	
}