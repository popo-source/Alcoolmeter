package fr.adresses.classes;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Alcool {
	private final StringProperty alcoolName;
	private final IntegerProperty degree;
	private final DoubleProperty quantity;
	
	 public Alcool() {
	        this(null, 0);
	    }
	 
	public Alcool(String alcoolName, int degree) {
		this.alcoolName = new SimpleStringProperty(alcoolName);
		this.degree = new SimpleIntegerProperty(degree);
		this.quantity = new SimpleDoubleProperty(0);
		
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

	public int getDegree() {
		return degree.get();
	}

	public void setDegree(int dose) {
	    this.degree.set(dose);
	}
	    
	public IntegerProperty degreeProperty() {
		return degree;
	}
	
	public double getQuantity() {
		return quantity.get();
	}

	public void setQuantity(double dose) {
	    this.quantity.set(dose);
	}
	    
	public DoubleProperty quantityProperty() {
		return quantity;
	}
	
	
}
