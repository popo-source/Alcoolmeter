package classes.fr.adresses.utilitary;

import classes.fr.adresses.MainApp;
import classes.fr.adresses.objects.Alcool;
import classes.fr.adresses.objects.Person;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class LineChartsValues {
	
	private Person person;
	private double M;//en kilos 
	private double C;//constante
	private boolean eat = true;
	private double t=0;
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
		alcoolVolume *= 0.789;//en grammes
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
	
	public Double getAlcoolValue() {
		//final double w = 2.71; //w un coefficient correctif, avec w = 2,71
		//final double T = 0.789;//T le titre volumique en alcool, valeur entre 0 et 1
		//double M = 80;//M la masse corporelle (en kg)
		//double m = 12;//m la masse d'éthanol pur (en grammes), où m = 0,79 V, où V est le volume en mL ou en centimètres cubes
		//double C = 0.7;//coefficient de diffusion C (qui vaut 0,7 si on est un homme, ou 0,6 si on est une femme),
		
		//
		
		double A= ((getEthanolVolume()/M*C)-eated()*M*8*t/600000);
		//double A = (eated()*w*getEthanolVolume() / (C * M))*t*(Math.exp(-t*eated()));
		return A;
	}
	public void graph(Stage stage)
	{
		//stage.setTitle("Alcool im Blutt Graph");
		//defining the axes
		final NumberAxis xAxis= new NumberAxis(0,8,0.2);
		final NumberAxis yAxis = new NumberAxis(0,16,0);
		xAxis.setLabel("Number of hours");
		yAxis.setLabel("Alcool im Blutt (g)");
		
		//creating the chart
		LineChart<Number,Number> lineChart = 
				new LineChart<Number,Number>(xAxis,yAxis);

		lineChart.setTitle("Alcool");
		XYChart.Series series = new XYChart.Series();
		for (int i = 0;i<480;i++)
		{
		series.getData().add(new XYChart.Data(getAlcoolValue(),t/480));
		}
		Scene scene  = new Scene(lineChart,800,600);
		lineChart.getData().add(series);

		stage.setScene(scene);
		stage.show();
		}
}

/*public XYChart.Series<Number, Number> getChart() {
		series1.setName(person.getFirstName());
		for(double i=0; i<200; i++) {
	    	series1.getData().add(new XYChart.Data<>((i/10), getAlcoolValue((i/10))));
	    }
		return series1;
	}}


	 /*public XYChart.Series<Number, Number>Linechart=new Linechart<Number,Number>(xAxis,yAxis) 
	 
	 
		series1.setName(person.getFirstName());
		//for(double i=0; i<100; i++) {
	   // 	series1.getData().add(new XYChart.Data<>((i/10), getAlcoolValue((i/10))));
	    for (double j=0; j<480;j++)
	    {
	    	series1.getData().add(new XYChart.Data<>(t/480, getAlcoolValue()));
	    	t=j/60;
	    }
	    
		return series1;
	}
	 
}
	*/


