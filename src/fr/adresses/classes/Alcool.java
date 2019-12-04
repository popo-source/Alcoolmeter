package fr.adresses.classes;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Alcool {
	private final StringProperty alcoolName;
	private final IntegerProperty dose;
	
	 public Alcool() {
	        this(null, null);
	    }
	 
	public Alcool(String alcoolName, String dose) {

		this.alcoolName = new SimpleStringProperty("rhum");
		this.dose = new SimpleIntegerProperty(3);
	}

	 public String getAlcoolName() {
	        return alcoolName.get();
	    }

	    public void setAlcoolName(String alcoolName) {
	        this.alcoolName.set(alcoolName);
	    }
	    
	    public StringProperty alcoolNameProperty() {
	        return alcoolName;
	    }

	    public int getDose() {
	        return dose.get();
	    }

	    public void setDose(int dose) {
	        this.dose.set(dose);
	    }
	    
	    public IntegerProperty doseProperty() {
	        return dose;
	    }
}
