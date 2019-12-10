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
    private Label alcoolNameLabel;
    @FXML
    private Label degreeLabel;

   
    // Reference to the main application.
    private MainApp mainApp;

    public EditAlcoolDialogController() {
    }

}