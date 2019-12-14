package fr.adresses.utilitary;

import fr.adresses.MainApp;
import fr.adresses.objects.Alcool;
import fr.adresses.objects.Person;
import javafx.collections.ObservableList;
import javafx.scene.chart.XYChart;

public class LineChartsValues {
	
	private Person person;
	private double M;
	private double C;
	private boolean eat = true;
	private ObservableList<Alcool> selectedAlcoolData;
	
	
	
	private XYChart.Series<Number, Number> series1 = new XYChart.Series<>();
	
	public void setMainApp(MainApp mainApp) {
		this.selectedAlcoolData = mainApp.getSelectedAlcoolData();
	}
	
	public double getEthanolVolume(){
		Alcool[] alcool = new Alcool[selectedAlcoolData.size()];
		alcool = selectedAlcoolData.toArray(alcool);
		double alcoolVolume = 0;
		for(int i=0; i<alcool.length;i++) {
			alcoolVolume += (alcool[i].getDegree() * alcool[i].getQuantity());
		}
		alcoolVolume *= 0.789;
		return alcoolVolume;
	}
	
	public LineChartsValues(Person person) {
		this.person = person;
		this.M = person.getWeight();
		if(person.getSex().toString()=="weiblich") {
			this.C = 0.6;
		} else {
			this.C = 0.7;
		}
	}
	
	public void setEat(boolean eat) {
		this.eat = eat;
	}
	
	public int eated() {
		int eated = 0;
		if(eat) {
			eated = 15;
		} else {
			eated = 10;
		}
		return eated;
	}
	
	public Double getAlcoolValue(double t) {
		final double w = 2.71; //w un coefficient correctif, avec w = 2,71
		//final double T = 0.789;//T le titre volumique en alcool, valeur entre 0 et 1
		//double M = 80;//M la masse corporelle (en kg)
		//double m = 12;//m la masse d'éthanol pur (en grammes), où m = 0,79 V, où V est le volume en mL ou en centimètres cubes
		//double C = 0.7;//coefficient de diffusion C (qui vaut 0,7 si on est un homme, ou 0,6 si on est une femme),
		
		
		
		double A= ((getEthanolVolume()/M*C)-eated()*M*8*t/10000);
		//double A = (eated()*w*getEthanolVolume() / (C * M))*t*(Math.exp(-t*eated()));
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
