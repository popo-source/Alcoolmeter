package fr.adresses.views;


import javafx.fxml.FXML;
import fr.adresses.objects.Person;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class graphicOverviewController{
	
	private boolean okClicked = false;
	
	private Stage dialogStage;
	
	//@FXML
	//private LineChart<Number, Number> chart1;
	@FXML 
	private NumberAxis x=new NumberAxis(0,8,0.2);
	
	@FXML
	private NumberAxis y=new NumberAxis(0,16,1);
	@FXML
	private LineChart<Number,Number>Linechart;
	public LineChart<Number,Number> graphempty() 
	{
		return Linechart;
	}
	
	@FXML
	private void handleOk() {
		okClicked = true;
		dialogStage.close();
	}
	
	
	public boolean isOkClicked() {
        return okClicked;
    }
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
}
