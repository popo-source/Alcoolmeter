package classes.fr.adresses.views;


import javafx.fxml.FXML;
import classes.fr.adresses.objects.Person;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class graphicOverviewController{
	
	private boolean okClicked = false;
	
	private Stage dialogStage;
	
	@FXML
	private LineChart<Number, Number> chart1;
	
	@FXML
	private void handleOk() {
		okClicked = true;
		dialogStage.close();
	}
	
	public void setChart(XYChart.Series<Number, Number> serie) {
		chart1.getData().add(serie);
	}
	
	public boolean isOkClicked() {
        return okClicked;
    }
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
}
