package fr.adresses.views;

import fr.adresses.MainApp;
import fr.adresses.classes.Alcool;
import fr.adresses.classes.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainOverviewController {

	private MainApp mainApp;
	
	@FXML
	private TableView<Person> personTable;
	@FXML
	private TableColumn<Person, String> firstNameColumn;
	@FXML
	private TableColumn<Person, String> lastNameColumn;

	@FXML
	private TableView<Alcool> alcoolTable;
	@FXML
	private TableColumn<Alcool, String> alcoolNameColumn;
	@FXML
	private TableColumn<Alcool, Double> degreeColumn;

	@FXML
	private TableView<Alcool> selectedAlcoolTable;
	@FXML
	private TableColumn<Alcool, String> selectedAlcoolColumn;
	@FXML
	private TableColumn<Alcool, Double> quantityColumn;

	
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		personTable.setItems(mainApp.getPersonData());
		alcoolTable.setItems(mainApp.getAlcoolData());
		selectedAlcoolTable.setItems(mainApp.getSelectedAlcoolData());
	}
	
	
	@FXML
	private void initializePerson() {
		firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
		lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
	}
	
	@FXML
	private void initializeAlcool() {
		alcoolNameColumn.setCellValueFactory(cellData -> cellData.getValue().alcoolNameProperty());
		degreeColumn.setCellValueFactory(cellData -> cellData.getValue().degreeProperty());
	}
	
	@FXML
	private void initializeSelectedAlcool() {
		alcoolNameColumn.setCellValueFactory(cellData -> cellData.getValue().alcoolNameProperty());
		quantityColumn.setCellValueFactory(cellData -> cellData.getValue().quantityProperty());
	}
	
	/*
	@FXML
	private Label firstNameLabel;
	private Label lastNameLabel;
	private Label weightLabel;
	private Label alcoolNameLabel;
	private Label degreeLabel;
	private Label selectedAlcoolLabel;
	private Label quantityLabel;

	

	

	@FXML
	private void initializeAlcool() {
		// Initialize the person table with the two columns.
		alcoolNameColumn.setCellValueFactory(cellData -> cellData.getValue().alcoolNameProperty());
		degreeColumn.setCellValueFactory(cellData -> cellData.getValue().degreeProperty());

		// Clear alcool details.
		showAlcoolDetails(null);

		alcoolTable.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> showAlcoolDetails(newValue));
	}

	@FXML
	private void initializeSelectedAlcool() {
		// Initialize the person table with the two columns.
		selectedAlcoolColumn.setCellValueFactory(cellData -> cellData.getValue().selectedAlcoolProperty());
		quantityColumn.setCellValueFactory(cellData -> cellData.getValue().quantityProperty());

		// Clear alcool selected details.
		showSelectedAlcoolDetails(null);

		selectedAlcoolTable.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> showSelectedAlcoolDetails(newValue));
	}

	private void showPersonDetails(Person person) {
		if (person != null) {
			firstNameLabel.setText(person.getFirstName());
			lastNameLabel.setText(person.getLastName());
			weightLabel.setText(Double.toString(person.getWeight()));

		} else {
			firstNameLabel.setText("");
			lastNameLabel.setText("");
			weightLabel.setText("");
		}
	}

	private void showAlcoolDetails(Alcool alcool) {
		if (alcool != null) {
			alcoolNameLabel.setText(alcool.getAlcoolName());
			degreeLabel.setText(Double.toString(alcool.getDegree()));

		} else {
			alcoolNameLabel.setText("");
			degreeLabel.setText("");
		}
	}

	private void showSelectedAlcoolDetails(Alcool alcool) {
		if (alcool!= null) {
			selectedAlcoolLabel.setText(alcool.getSelectedAlcool());
			quantityLabel.setText(alcool.getQuantity());
		} else {
			selectedAlcoolLabel.setText("");
			quantityLabel.setText("");
		}
	}
	
*/

}
