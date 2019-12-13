package fr.adresses.views;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class NewOverviewController {
private int click=0;
private Stage DialogStage;
	@FXML
	private int handleNewPerson() 
	{//
		click=1;
		DialogStage.close();
		return click;
	}
	@FXML
	private int handleNewAlcool() 
	{
		click=2;
		DialogStage.close();
		return click;
	}
	@FXML
	private int handleNewCancel() 
	{
		click=3;
		DialogStage.close();
		return click;
	}
	public void setDialogStage(Stage dialogStage) {
		this.DialogStage = dialogStage;
	}
}
