package fr.adresses.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import fr.adresses.MainApp;
import fr.adresses.classes.Alcool;

public class EditQuantityDialogController {

	@FXML
	private Textfield quantityField;

	public EditQuantityDialogController() {
	}
	
	private MainApp mainApp;
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	private boolean isInputValid() {
		String errorMessage = "";
		
		if (quantityField.getText() == null || quantityField.getText().length() == 0) {
			errorMessage += "No valid quantity!\n";
		} else {
			try {
				Integer.parseInt(quantityField.getText());
			} catch (NumberFormatException e) {
				errorMessage += "No valid quantity (must be an integer)!\n";
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