package fr.adresses.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import fr.adresses.MainApp;
import fr.adresses.classes.Alcool;

public class EditQuantityDialogController {

	@FXML
	private TableView<Alcool> alcoolSelectTable;
	@FXML
	private TableColumn<Alcool, String> alcoolSelectColumn;
	@FXML
	private TableColumn<Alcool, String> quantityColumn;

	@FXML
	private Label alcoolSelectLabel;
	@FXML
	private Label quantityLabel;


	// Reference to the main application.
	private MainApp mainApp;

	public EditQuantityDialogController() {
	}

	@FXML
	private void initializeAlcoolSelect() {
		// Initialize the alcool table with the two columns.
		alcoolSelectColumn.setCellValueFactory(cellData -> cellData.getValue().alcoolSelectProperty());
		quantityColumn.setCellValueFactory(cellData -> cellData.getValue().quantityProperty());
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

		// Add observable list data to the table
		alcoolSelectTable.setItems(mainApp.getalcoolSelectData());
	}
}