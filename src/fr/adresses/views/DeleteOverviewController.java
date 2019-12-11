package fr.adresses.views;

import fr.adresses.classes.Alcool;
import fr.adresses.classes.Person;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class DeleteOverviewController {
	private boolean okClicked=false;
	private Stage dialogStage;
	
	/*
	 * 
	 * à faire avec les tableau selectionnées 
	 * sinon cela ne marche pas
	 * --> tableview...
	 * 
	 * 
	 */
	
	private Person person;
	private Alcool alcool;
	
	
	
	@FXML
	private void handleOk(){
		okClicked=true;
		dialogStage.close();
		
	}
	
	@FXML
	private void handleNo(){
		dialogStage.close();
		
	}
	
	public boolean isOkClicked() {
        return okClicked;
    }
	
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
	
	/*
	 * 
	 * public void selectedAlcool(Alcool alcool) {
			this.alcool = alcool;
		}
	
		public void selectedPerson(Person person) {
			this.person = person;
		}
	 * 
	 * 
	 */
	
}
