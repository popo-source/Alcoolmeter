package fr.adresses.classes;

import javafx.scene.chart.XYChart;

public class LineChartsValues {
	private Person person;
	private double M;
	private double C;
	
	XYChart.Series<Number, Number> series1 = new XYChart.Series<>();
	
	public LineChartsValues(Person person) {
		this.person = person;
		this.M = Double.parseDouble(person.getWeight());
		if(person.getSex().toString()=="weiblich") {
			this.C = 0.6;
		} else {
			this.C = 0.7;
		}
		
		
	}
	
	public Double getAlcoolValue(double t) {
		final double w = 2.71; //w un coefficient correctif, avec w = 2,71
		final double T = 0.789;//T le titre volumique en alcool, valeur entre 0 et 1
		//double M = 80;//M la masse corporelle (en kg)
		double m = 12;//m la masse d'éthanol pur (en grammes), où m = 0,79 V, où V est le volume en mL ou en centimètres cubes
		//double C = 0.7;//coefficient de diffusion C (qui vaut 0,7 si on est un homme, ou 0,6 si on est une femme),
		
		double A = (w*m*T / (C * M))*t*(Math.exp(-t));
		return A;
	}
	
	public XYChart.Series<Number, Number> getChart() {
		series1.setName(person.getFirstName());
		for(double i=0; i<100; i++) {
	    	series1.getData().add(new XYChart.Data<>((i/10), getAlcoolValue((i/10))));
	    }
		return series1;
	}
	
	
}
