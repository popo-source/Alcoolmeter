package fr.adresses.views;

import fr.adresses.MainApp;
import fr.adresses.classes.Alcool;
import fr.adresses.classes.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainOverviewController {

	
	
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

	
	private MainApp mainApp;
	
	
	public MainOverviewController() {
    }
	
	@FXML
	private void initializePerson() {
		firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
		lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
	}
	
	
	@FXML
	private void initializeAlcool() {
		alcoolNameColumn.setCellValueFactory(cellData -> cellData.getValue().alcoolNameProperty());
		degreeColumn.setCellValueFactory(cellData -> cellData.getValue().degreeProperty().asObject());
	}
	
	
	@FXML
	private void initializeSelectedAlcool() {
		selectedAlcoolColumn.setCellValueFactory(cellData -> cellData.getValue().alcoolNameProperty());
		quantityColumn.setCellValueFactory(cellData -> cellData.getValue().quantityProperty().asObject());
	}
	
	
	@FXML
	private void handleNew() {
		/*
		 * --> à compléter:
		 * 	???? créer une nouvelle fenêtre de choix????:
		 * 								- Person?
		 * 								- Alcool?
		 * 
		 */
		//Person tempPerson = new Person();
		//Alcool tempAlcool = new Alcool();
		
		
		if(tempPerson!=null && tempAlcool==null) {
			if (mainApp.showPersonEditDialogOverview(tempPerson)) {
				mainApp.getPersonData().add(tempPerson);
			}
		} else {
			if(tempPerson==null && tempAlcool!=null) {
				if (mainApp.showAlcoolEditDialogOverview(tempAlcool)) {
					mainApp.getAlcoolData().add(tempAlcool);
				}
			}
		}
	}
	
	
	@FXML
	private void handleEdit() {
		Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
		Alcool selectedAlcool = alcoolTable.getSelectionModel().getSelectedItem();
        if (selectedPerson != null && selectedAlcool==null) {
            mainApp.showPersonEditDialogOverview(selectedPerson);
        } else {
        	if(selectedPerson == null && selectedAlcool != null) {
        		mainApp.showAlcoolEditDialogOverview(selectedAlcool);
        	} else {
        		Alert alert = new Alert(AlertType.WARNING);
        		alert.initOwner(mainApp.getPrimaryStage());
        		alert.setTitle("No Selection");
        		alert.setHeaderText("No Item Selected");
        		alert.setContentText("Please select an item in the person and the alcool tables.");
        		alert.showAndWait();
        	}
        }
	}
	
	
	@FXML
	private void handleDelete() {
		Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
		Alcool selectedAlcool = alcoolTable.getSelectionModel().getSelectedItem();
		Alcool selectedSelectedAlcool = selectedAlcoolTable.getSelectionModel().getSelectedItem();
		
		if (selectedPerson != null && selectedAlcool==null && selectedSelectedAlcool == null) {
			if(mainApp.showDeleteOverview(selectedPerson.getFirstName())) {
				personTable.getItems().remove(selectedPerson);
			}
        } else {
        	if(selectedPerson == null && selectedAlcool != null && selectedSelectedAlcool == null) {
        		if(mainApp.showDeleteOverview(selectedAlcool.getAlcoolName())) {
        			alcoolTable.getItems().remove(selectedAlcool);
        		}
        	} else {
        		if(selectedPerson == null && selectedAlcool == null && selectedSelectedAlcool != null) {
        			if(mainApp.showDeleteOverview(selectedSelectedAlcool.getAlcoolName())) {
        				selectedAlcoolTable.getItems().remove(selectedSelectedAlcool);
        			}
        		} else {
        			Alert alert = new Alert(AlertType.WARNING);
        			alert.initOwner(mainApp.getPrimaryStage());
        			alert.setTitle("No Selection");
        			alert.setHeaderText("No Item Selected");
        			alert.setContentText("Please select an item in the tables.");
        			alert.showAndWait();
        		}
        	}
        }
	}
	
	
	@FXML
	private void handleAdd() {
		Alcool selectedAlcool = alcoolTable.getSelectionModel().getSelectedItem();
		if (selectedAlcool != null) {
			if(mainApp.showQuantityEditQuantityOverview(selectedAlcool)) {
				mainApp.getSelectedAlcoolData().add(selectedAlcool);
			}
		} else {
			Alert alert = new Alert(AlertType.WARNING);
    		alert.initOwner(mainApp.getPrimaryStage());
    		alert.setTitle("No Selection");
    		alert.setHeaderText("No Alcool Selected");
    		alert.setContentText("Please select an alcool in the table.");
    		alert.showAndWait();
    	}
	}
	
	
	@FXML
	private void handleGraphic() {
		Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
		if(selectedPerson != null && selectedAlcoolTable != null) {
    		mainApp.showGraphicOverview(selectedPerson);
    	} else {
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.initOwner(mainApp.getPrimaryStage());
    		alert.setTitle("No Selection");
    		if(selectedAlcoolTable != null) {
    			alert.setHeaderText("No Person Selected");
    			alert.setContentText("Please select a person in the table.");
    			alert.showAndWait();
    		} else {
    			alert.setHeaderText("No Alcool Selected");
    			alert.setContentText("Please select an alcool in the table.");
    			alert.showAndWait();
    		}
    	}
	}
	
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		personTable.setItems(mainApp.getPersonData());
		alcoolTable.setItems(mainApp.getAlcoolData());
		selectedAlcoolTable.setItems(mainApp.getSelectedAlcoolData());
	}


}
