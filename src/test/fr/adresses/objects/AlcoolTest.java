package test.fr.adresses.objects;

import static org.junit.Assert.*;
import classes.fr.adresses.objects.*;

import org.junit.Test;

public class AlcoolTest {
	
	@Test
	public void testNewAlcool() throws Exception {
		Alcool beer = new Alcool("beer", 5.0);
	}
	
	@Test
	public void testGetAndSetDegree() throws Exception {
		Alcool beer = new Alcool("beer", 5.0);

		Alcool testBeer = new Alcool();
		testBeer.setDegree(beer.getDegree());
		
		assertEquals(beer, testBeer);
	}
	
	@Test
	public void testGetAndSetQuantity() throws Exception {
		Alcool beer = new Alcool();
		beer.setQuantity(900);
		
		Alcool testBeer = new Alcool();
		testBeer.setQuantity(beer.getQuantity());

		assertEquals(beer.quantityProperty(), testBeer.quantityProperty());
	}
	
	@Test
	public void testGatAndSetAlcoolName() throws Exception {
		Alcool beer = new Alcool("beer", 5.0);
		
		Alcool testBeer = new Alcool();
		testBeer.setAlcoolName(beer.getAlcoolName());
		
		assertEquals(beer.alcoolNameProperty(), testBeer.alcoolNameProperty());
	}
	
}
