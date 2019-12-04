package fr.adresses.views;


import javafx.fxml.FXML;
import fr.adresses.classes.Person;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class graphicOverviewController{
	private boolean okClicked = false;
	private Stage dialogStage;
	
	@FXML
	private Label FirstName;
	@FXML
	private Label LastName;
	@FXML
	private Label Sex;
	@FXML
	private Label Weight;
	
	public void setChart(XYChart.Series<Number, Number> serie) {
		chart1.getData().add(serie);
	}
	
	@FXML
	private LineChart<Number, Number> chart1;
	
	public boolean isOkClicked() {
        return okClicked;
    }
	
	public void setPerson(Person person) {
		FirstName.setText(person.getFirstName());
		LastName.setText(person.getLastName());
		Sex.setText(person.getSex());
		Weight.setText(person.getWeight());
    }
	
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
	@FXML
	private void handleOk() {
		okClicked = true;
		dialogStage.close();
	}
	
	
	
}
