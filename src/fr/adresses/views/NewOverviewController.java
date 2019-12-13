package fr.adresses.views;

import javafx.stage.Stage;

public class NewOverviewController {
private int click=0;
private Stage DialogStage;
	
	private void handlePerson() 
	{
		click=1;
		DialogStage.close();
	}
	private void handleAlcool() 
	{
		click=2;
		DialogStage.close();
		//
	}
	private void handleCancel() 
	{
		click=3;
		DialogStage.close();
	}
	public void setDialogStage(Stage dialogStage) {
		this.DialogStage = dialogStage;
	}
}
