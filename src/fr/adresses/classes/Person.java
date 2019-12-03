package fr.adresses.classes;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty sex;
    private final StringProperty weight;
    
    public Person() {
        this(null, null, null, null);
    }
    
    public Person(String firstName, String lastName, String sex, String weight) {
    	this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.sex = new SimpleStringProperty(sex);
        this.weight = new SimpleStringProperty(weight);
    }

	//FirstName
	public String getFirstName() {
		return firstName.get();
	}
	public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
	public StringProperty firstNameProperty() {
		return firstName;
	}
	
	//LastName
	public String getLastName() {
		return lastName.get();
	}
	public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }
    public StringProperty lastNameProperty() {
        return lastName;
    }
    
    //sex
	public String getSex() {
		return sex.get();
	}
	public void setSex(String sex) {
		this.sex.set(sex);
	}
	public StringProperty sexProperty() {
		return sex;
	}
	
	//Weight
	public String getWeight() {
		return weight.get();
	}
	public void setWeight(String weight) {
		this.weight.set(weight);
	}
	public StringProperty weightProperty() {
		return weight;
	}
}
