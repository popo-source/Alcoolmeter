package fr.adresses.views;

import fr.adresses.MainApp;
import fr.adresses.classes.Alcool;
import fr.adresses.classes.Person;
import fr.adresses.views.EditPersonDialogController;
import fr.adresses.views.DeleteOverviewController;
import fr.adresses.views.EditAlcoolDialogController;
import fr.adresses.views.EditQuantityDialogController;
import fr.adresses.views.graphicOverviewController;

public class MainOverviewController {
	
	@FXML
	private TableView<Person> personTable;
	@FXML
	private TableColumn<Person, String> firstNameColumn;
	@FXML
	private TableColumn<Person, String> lastNameColumn;
	@FXML
	private TableColumn<Person, String> weightColumn;
	
    @FXML
    private TableView<Alcool> alcoolTable;
    @FXML
    private TableColumn<Alcool, String> alcoolNameColumn;
    @FXML
    private TableColumn<Alcool, String> degreeColumn;
    
    @FXML
	private TableView<Alcool> selectedAlcoolTable;
	@FXML
	private TableColumn<Alcool, String> selectedAlcoolColumn;
	@FXML
	private TableColumn<Alcool, String> quantityColumn;

	@FXML
	private Label selectedAlcoolLabel;
	
	private MainApp mainApp;
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	
}
