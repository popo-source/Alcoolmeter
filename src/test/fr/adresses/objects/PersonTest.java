package test.fr.adresses.objects;

import static org.junit.Assert.*;
import classes.fr.adresses.objects.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testGettersAndSetters() throws Exception {
		Person person = new Person();
		person.setFirstName("name");
		person.setLastName("last name");
		person.setSex("sex");
		person.setWeight(0.0);
		
		Person testPerson = new Person(person.getFirstName(), person.getLastName(), person.getSex(), person.getWeight());
		
		assertEquals(person.firstNameProperty().get(), testPerson.firstNameProperty().get());
		assertEquals(person.lastNameProperty().get(), testPerson.lastNameProperty().get());
		assertEquals(person.sexProperty().get(), testPerson.sexProperty().get());
		assertEquals(person.weightProperty().get(), testPerson.weightProperty().get(), 0.0);
	}

}
