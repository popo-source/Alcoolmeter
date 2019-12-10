package fr.adresses.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import fr.adresses.MainApp;
import fr.adresses.classes.Alcool;

public class EditQuantityDialogController {

	@FXML
	private TableView<Alcool> selectedAlcoolTable;
	@FXML
	private TableColumn<Alcool, String> selectedAlcoolColumn;
	@FXML
	private TableColumn<Alcool, String> quantityColumn;

	@FXML
	private Label selectedAlcoolLabel;
	@FXML
	private Label quantityLabel;


	// Reference to the main application.
	private MainApp mainApp;

	public EditQuantityDialogController() {
	}

	@FXML
	private void initializeSelectedAlcool() {
		// Initialize the alcool table with the two columns.
		selectedAlcoolColumn.setCellValueFactory(cellData -> cellData.getValue().alcoolSelectProperty());
		quantityColumn.setCellValueFactory(cellData -> cellData.getValue().quantityProperty());
		
		// Clear person details.
	    showSelectedAlcoolDetails(null);

	    selectedAlcoolTable.getSelectionModel().selectedItemProperty().addListener(
	            (observable, oldValue, newValue) -> showPersonDetails(newValue));
	}

	private void showSelectedAlcoolDetails(Alcool selectedAlcool) {
		if (selectedAlcool != null) {
			selectedAlcoolLabel.setText(selectedAlcool.getSelectedAlcool());
			quantityLabel.setText(Integer.toString(selectedAlcool.getQuantity()));

		} else {
			selectedAlcoolLabel.setText("");
			quantityLabel.setText("");
		}
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

		// Add observable list data to the table
		selectedAlcoolTable.setItems(mainApp.getSelectedAlcoolData());
	}
}