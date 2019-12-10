package fr.adresses.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import fr.adresses.MainApp;
import fr.adresses.classes.Person;

public class EditPersonDialogController {


	@FXML
	private Textfield firstNameField;
	@FXML
	private Textfield lastNameField;
	@FXML
	private Texfield weightField;
	@FXML
	private Checkbox sexCheckbox;

	public EditPersonDialogController() {
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
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
			// try to parse the postal code into an int.
			try {
				Integer.parseInt(weightField.getText());
			} catch (NumberFormatException e) {
				errorMessage += "No valid weight (must be an integer)!\n";
			}
		}

		if (errorMessage.length() == 0) {
			return true;
		} else {
			// Show the error message.
			Alert alert = new Alert(AlertType.ERROR);
			alert.initOwner(dialogStage);
			alert.setTitle("Invalid Fields");
			alert.setHeaderText("Please correct invalid fields");
			alert.setContentText(errorMessage);

			alert.showAndWait();

			return false;
		}
	}
}