package fr.adresses;


import fr.adresses.classes.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
	private ObservableList<Person> personData = FXCollections.observableArrayList();
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AlcoolApp");
	}


	/*
	 * ???TODO RootLayout FXML
	 * ???TODO RootLayoutController
	 * ???TODO Save in RootLayout as a XML file
	 * 
	 * TODO MainOverview FXML
	 * TODO MainOverviewController
	 * 
	 * TODO PersonEditDialog FXML
	 * TODO PersonEditDialogController
	 * 
	 * TODO AlcoolEditDialog FXML
	 * TODO AlcoolEditDialogController
	 * 
	 * TODO GraphicOverview FXML
	 * TODO GraphicOverviewController
	 * 
	 *
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		launch(args);
	}
}
