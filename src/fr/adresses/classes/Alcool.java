package fr.adresses.classes;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Alcool {
	private final StringProperty alcoolName;
	private IntegerProperty quantity;
	private final IntegerProperty degree;
	
	 public Alcool() {
	        this(null, null);
	    }
	 
	public Alcool(String alcoolName, String dose) {

		this.alcoolName = new SimpleStringProperty("rhum");
		this.degree = new SimpleIntegerProperty(3);
		this.quantity = new SimpleIntegerProperty(0);
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
	        return degree.get();
	    }

	    public void setDose(int dose) {
	        this.degree.set(dose);
	    }
	    
	    public IntegerProperty doseProperty() {
	        return degree;
	    }
}
