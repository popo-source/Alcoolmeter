package fr.adresses.views;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import fr.adresses.MainApp;
import fr.adresses.classes.Person;
import fr.adresses.classes.Alcool;

public class PersonOverviewController {
	@FXML
	private TableView<Person> personTable;
	@FXML
	private TableColumn<Person, String> firstNameColumn;
	@FXML
	private TableColumn<Person, String> lastNameColumn;

	@FXML
	private Label firstNameLabel;
	@FXML
	private Label lastNameLabel;
	@FXML
	private Label sexLabel;
	@FXML
	private Label weightLabel;
	@FXML
	private Label alcoolNameLabel;
	@FXML
	private Label doseLabel;
	@FXML
	private Label eatLabel;

	
	private MainApp main;

	public void setMain(MainApp main) {
		this.main = main;
		personTable.setItems(main.getPersonData());
	}

	public PersonOverviewController() {
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
			eatLabel.setText("");
			sexLabel.setText("");
		}
	}
	private void showPersonConsommation(Alcool alcool) {
		if (alcool != null) {
			alcoolNameLabel.setText(alcool.getAlcoolName());
			doseLabel.setText(Integer.toString(alcool.getDose()));

		} else {
			firstNameLabel.setText("");
			lastNameLabel.setText("");
		}
	}

	
	
	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	/*
	@FXML
	private void initialize() {
		// Initialize the person table with the two columns.
		firstNameColumn.setCellValueFactory(
				cellData -> cellData.getValue().firstNameProperty());
		lastNameColumn.setCellValueFactory(
				cellData -> cellData.getValue().lastNameProperty());

		// Clear person details.
		showPersonDetails(null);
		showPersonConsommation(null);
		

		// Listen for selection changes and show the person details when changed.
		personTable.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> showPersonDetails(newValue));
	}
	@FXML
	private void handleDeletePerson() {
		int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
		if (selectedIndex >= 0) {
			personTable.getItems().remove(selectedIndex);
		} else {
			// Nothing selected.
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(main.getPrimaryStage());
			alert.setTitle("No Selection");
			alert.setHeaderText("No Person Selected");
			alert.setContentText("Please select a person in the table.");

			alert.showAndWait();
		}
	}

	*/
	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @param main
	 */
	
}