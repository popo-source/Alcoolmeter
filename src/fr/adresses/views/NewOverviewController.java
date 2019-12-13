package fr.adresses.views;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class NewOverviewController {
private int click=0;
private Stage DialogStage;
	@FXML
	private void handlePerson() 
	{
		click=1;
		DialogStage.close();
	}
	@FXML
	private void handleAlcool() 
	{
		click=2;
		DialogStage.close();
		
	}
	@FXML
	private void handleCancel() 
	{
		click=3;
		DialogStage.close();
	}
	public void setDialogStage(Stage dialogStage) {
		this.DialogStage = dialogStage;
	}
}
