package fr.adresses.views;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import fr.adresses.MainApp;


public class EditPersonDialogController {

	private MainApp mainApp;
	private Stage personEditDialogStage;
	private boolean okClicked = false;

	
	@FXML
	private TextField firstNameField;
	@FXML
	private TextField lastNameField;
	@FXML
	private TextField weightField;
	@FXML
	private CheckBox womanCheckbox;
	@FXML
	private CheckBox manCheckbox;

	
	private void {
	if (womanCheckbox!=null){
	}
	if (manCheckbox!=null) {
	}
	if (manCheckbox==null && womanCheckbox==null ) {
		Alert alertnothingselect = new Alert(AlertType.ERROR);
		alertnothingselect.initOwner(personEditDialogStage);
		alertnothingselect.setTitle("Invalid Fields");
		alertnothingselect.setHeaderText("Please select sex");
		alertnothingselect.setContentText(errorMessage);
		alertnothingselect.showAndWait();
		return false;
	}
	if (manCheckbox!=null && womanCheckbox!=null ) {
		Alert alertallselect = new Alert(AlertType.ERROR);
		alertallselect.initOwner(personEditDialogStage);
		alertallselect.setTitle("Invalid Fields");
		alertallselect.setHeaderText("Please select just woman or man");
		alertallselect.setContentText(errorMessage);
		alertallselect.showAndWait();
		return false;
	}
}
	public EditPersonDialogController() {
	}

	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	public void setPersonEditDialogStage(Stage personEditDialogStage) {
		this.personEditDialogStage = personEditDialogStage;
	}
	
	public boolean isOkClicked() {
        return okClicked;
    }
	
	
	@FXML
	private void handleOk() {
		if(isInputValid()) {
			
			/*
			 * mettre a jour la person ici
			 * 
			 * 
			 */
			
			
			okClicked = true;
			personEditDilogStage.close();
		}
		
	}
	
	@FXML
	private void handleCancel() {
		dialogStage.close();
	}
	
	private boolean isInputValid() {
		String errorMessage = "";

		if (firstNameField.getText() == null || firstNameField.getText().length() == 0) {
			errorMessage += "No valid first name!\n";
		}
		if (lastNameField.getText() == null || lastNameField.getText().length() == 0) {
			errorMessage += "No valid last name!\n";
		}
		if (weightField.getText() == null || weightField.getText().length() == 0) {
			errorMessage += "No valid weight!\n";
		} else {
			try {
				Integer.parseInt(weightField.getText());
			} catch (NumberFormatException e) {
				errorMessage += "No valid weight (must be an integer)!\n";
			}
		}
		if (errorMessage.length() == 0) {
			return true;
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(personEditDialogStage);
			alert.setTitle("Invalid Fields");
			alert.setHeaderText("Please correct invalid fields");
			alert.setContentText(errorMessage);
			alert.showAndWait();
			return false;
		}
	}
}