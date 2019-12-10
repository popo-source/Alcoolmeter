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
    private TableView<Alcool> alcoolTable;
    @FXML
    private TableColumn<Alcool, String> alcoolNameColumn;
    @FXML
    private TableColumn<Alcool, String> degreeColumn;

    @FXML
    private Label alcoolNameLabel;
    @FXML
    private Label degreeLabel;

   
    // Reference to the main application.
    private MainApp mainApp;

    public EditAlcoolDialogController() {
    }

    @FXML
    private void initializeAlcoolName() {
        // Initialize the alcool table with the two columns.
        alcoolNameColumn.setCellValueFactory(cellData -> cellData.getValue().alcoolNameProperty());
        degreeColumn.setCellValueFactory(cellData -> cellData.getValue().degreeProperty());
     
        // Clear alcool details.
	    showAlcoolDetails(null);

	    alcoolTable.getSelectionModel().selectedItemProperty().addListener(
	            (observable, oldValue, newValue) -> showPersonDetails(newValue));
    }
    
	private void showAlcoolDetails(Alcool alcool) {
		if (alcool != null) {
			alcoolNameLabel.setText(alcool.getAlcoolName());
			degreeLabel.setText(Integer.toString(alcool.getDegree()));

		} else {
			alcoolNameLabel.setText("");
			degreeLabel.setText("");
		}
	}
	
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Add observable list data to the table
       alcoolTable.setItems(mainApp.getAlcoolData());
    }
}