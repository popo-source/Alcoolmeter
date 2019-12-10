package fr.adresses.views;

import fr.adresses.MainApp;
import fr.adresses.classes.Alcool;
import fr.adresses.classes.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class DeleteOverviewController {
	private boolean okClick=false;
	private boolean noClick=false;
	private Stage dialogStage;
	@FXML
	private void handleOk() 
	
	{
		okClick=true;
		//int selectedIndex = TableColumn.getSelectionModel().getSelectedIndex();
		dialogStage.close();
		
	}
	@FXML
	private void handleNo() 
	{
		noClick=true;
		dialogStage.close();
		
	}
}
