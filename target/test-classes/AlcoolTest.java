package fr.adresses.objects;

import static org.junit.Assert.*;
import fr.adresses.objects.*;

import org.junit.Test;

public class AlcoolTest {
	
	@Test
	public void testAlcool() throws Exception {
		Alcool beer = new Alcool("beer", 5.0);
	}
	
	@Test
	public void testDegree() throws Exception {
		Alcool beer = new Alcool("beer", 5.0);

		Alcool testBeer = new Alcool();
		testBeer.setDegree(beer.getDegree());

		double degreeTest = testBeer.getDegree() - beer.getDegree();
		
		//degree test
		assertEquals(0, degreeTest, 0.01);
	}
	
	@Test
	public void testQuantity() throws Exception {
		Alcool beer = new Alcool();
		beer.setQuantity(900);
		
		Alcool testBeer = new Alcool();
		testBeer.setQuantity(beer.getQuantity());
		
		double quantityTest = testBeer.getQuantity() - beer.getQuantity();
		
		//quantity Test
		assertEquals(0, quantityTest, 0.01);
	}
	
}
