package fr.adresses.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import fr.adresses.MainApp;
import fr.adresses.classes.Person;

public class EditPersonDialogController {
	@FXML
	private TableView<Person> personTable;
	@FXML
	private TableColumn<Person, String> firstNameColumn;
	@FXML
	private TableColumn<Person, String> lastNameColumn;
	@FXML
	private TableColumn<Person, String> weightColumn;

	@FXML
	private Label firstNameLabel;
	@FXML
	private Label lastNameLabel;
	@FXML
	private Label weightLabel;
	@FXML
	private Label sexLabel;

	// Reference to the main application.
	private MainApp mainApp;

	public EditPersonDialogController() {
	}

	@FXML
	private void initializePerson() {
		// Initialize the person table with the two columns.
		firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
		lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
		weightColumn.setCellValueFactory(cellData -> cellData.getValue().weightProperty());

	    // Clear person details.
	    showPersonDetails(null);

	    personTable.getSelectionModel().selectedItemProperty().addListener(
	            (observable, oldValue, newValue) -> showPersonDetails(newValue));
	}

	private void showPersonDetails(Person person) {
		if (person != null) {
			firstNameLabel.setText(person.getFirstName());
			lastNameLabel.setText(person.getLastName());
			weightLabel.setText(Double.toString(person.getWeight()));
			sexLabel.setText(person.getSex());

		} else {
			firstNameLabel.setText("");
			lastNameLabel.setText("");
			weightLabel.setText("");
			sexLabel.setText("");
		}
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

		// Add observable list data to the table
		personTable.setItems(mainApp.getPersonData());
	}
}