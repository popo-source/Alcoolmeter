package fr.adresses.views;


import javafx.fxml.FXML;
import fr.adresses.classes.Person;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class graphicOverviewController{
	private boolean okClicked = false;
	private Stage dialogStage;
	
	
	public void setChart(XYChart.Series<Number, Number> serie) {
		chart1.getData().add(serie);
	}
	
	@FXML
	private LineChart<Number, Number> chart1;
	
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
