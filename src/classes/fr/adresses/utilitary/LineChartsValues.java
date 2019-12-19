package classes.fr.adresses.utilitary;


import classes.fr.adresses.MainApp;
import classes.fr.adresses.objects.Alcool;
import classes.fr.adresses.objects.Person;
import javafx.collections.ObservableList;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;


public class LineChartsValues {
	
	private Person person;
	private double M;//Gewicht in Kg
	private double C;//Diffusion Konstante
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
			alcoolVolume += ((alcool[i].getDegree()/100) * (alcool[i].getQuantity()*10));
		}
		return alcoolVolume;
	}
	
	public LineChartsValues(Person person) {
		this.person = person;
		this.M = person.getWeight();
		if(person.getSex().toString()=="woman") {
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
		double A= (((getEthanolVolume()*0.789)/(M*C))-(eated()*0.01*(t/60)));
		return A;
	}
	
	public XYChart.Series<Number, Number> getGraph() {
		series1.setName(person.getFirstName().toString());
		double start;
		series1.getData().add(new XYChart.Data<>(0, 0));
		
		if(eat) {
			series1.getData().add(new XYChart.Data<>(1, getAlcoolValue(0)));
			start = 1;
		} else {
			series1.getData().add(new XYChart.Data<>(1, getAlcoolValue(0)));
			start = 0.5;
		}
		
		for(double i=0; i<10000; i++) {
			double alcoolemicValue = getAlcoolValue(i);
			if(alcoolemicValue >= 0) {
				series1.getData().add(new XYChart.Data<>(start + i/60, alcoolemicValue));
			}
	    	
		}
		return series1;
	}
	
	
	public void setLineChart(LineChart<Number,Number> LineChart){

	}
	
}