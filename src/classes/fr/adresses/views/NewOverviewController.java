package classes.fr.adresses.views;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import classes.fr.adresses.MainApp;

public class NewOverviewController {
private int clickPerson=0;
private boolean clickAlcool=false;
private Stage DialogStage;
	@FXML
	private void handleNewPerson() 
	{
		clickPerson=1;
		DialogStage.close();
		
	}
	@FXML
	private void handleNewAlcool() 
	{
		clickPerson=2;
		
		DialogStage.close();
		
		
	}
	@FXML
	private void handleNewCancel() 
	{
		DialogStage.close();
		
	}
	public void setDialogStage(Stage dialogStage) {
		this.DialogStage = dialogStage;
	}
	public int whatIsClicked()
	{
		return clickPerson;
	}
}
