package test.fr.adresses.objects;

import static org.junit.Assert.*;

import org.junit.Before;

import classes.fr.adresses.objects.*;

import org.junit.Test;

public class PersonTest {
	private Person randomPerson;
	
	@Before
	public void setRandomPerson() {
		randomPerson = new Person("name", "last name", "sex", 0.0);
	}
	
	
	@Test
	public void testPersonProperties(){
		String name = "name";
		String lastName = "last name";
		String sex = "sex";
		int weight = 0;
		
		assertEquals(name, randomPerson.firstNameProperty().get());
		assertEquals(lastName, randomPerson.lastNameProperty().get());
		assertEquals(sex, randomPerson.sexProperty().get());
		assertEquals(weight, randomPerson.weightProperty().get(), 0);
	}
	
	@Test
	public void testPersonGetters() {
		String name = "name";
		String lastName = "last name";
		String sex = "sex";
		int weight = 0;
		
		assertEquals(name, randomPerson.getFirstName());
		assertEquals(lastName, randomPerson.getLastName());
		assertEquals(sex, randomPerson.getSex());
		assertEquals(weight, randomPerson.getWeight(), 0);
	}
	
	@Test
	public void testPersonSetters() {
		Person testPerson = new Person();
		
		testPerson.setFirstName("name");
		testPerson.setLastName("lastName");
		testPerson.setSex("sex");
		testPerson.setWeight(0.0);
		
		assertEquals(testPerson.getFirstName(), randomPerson.getFirstName());
		assertEquals(testPerson.getLastName(), randomPerson.getLastName());
		assertEquals(testPerson.getSex(), randomPerson.getSex());
		assertEquals(testPerson.getWeight(), randomPerson.getWeight(), 0);
	}

}
