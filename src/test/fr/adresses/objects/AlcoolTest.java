package test.fr.adresses.objects;

import static org.junit.Assert.*;

import org.junit.Before;

import classes.fr.adresses.objects.*;

import org.junit.Test;

public class AlcoolTest {
	private Alcool randomAlcool;
	
	@Before
	public void setRandomAlcool() {
		randomAlcool = new Alcool("beer", 100.0);
		randomAlcool.setQuantity(100);
	}
	
	@Test
	public void testGettersAndSettersAndConstructors() throws Exception {
		Alcool beer = new Alcool();
		beer.setAlcoolName("beer");
		beer.setDegree(100);
		beer.setQuantity(100);
		
		Alcool testBeer = new Alcool(beer.getAlcoolName(), beer.getDegree());
		testBeer.setQuantity(beer.getQuantity());
		
		assertEquals(beer.alcoolNameProperty().get(), testBeer.alcoolNameProperty().get());
		assertEquals(beer.degreeProperty().get(), testBeer.degreeProperty().get(), 0.0);
		assertEquals(beer.quantityProperty().get(), testBeer.quantityProperty().get(), 0.0);
		
		assertEquals(beer.getClass(), randomAlcool.getClass());
	}
}
