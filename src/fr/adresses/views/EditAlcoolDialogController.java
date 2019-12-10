package fr.adresses.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import fr.adresses.MainApp;
import fr.adresses.classes.Alcool;
import fr.adresses.classes.Person;

public class EditAlcoolDialogController {


    @FXML
    private Textfield alcoolNameField;
    @FXML
    private Textfield degreeLabelField;

public EditAlcoolDialogController() {
    }   

private MainApp mainApp;
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
}