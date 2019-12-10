package fr.adresses;

import java.io.IOException;

import fr.adresses.classes.Alcool;
import fr.adresses.classes.Person;
import fr.adresses.views.MainOverviewController;
import fr.adresses.views.RootLayoutController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	
	private ObservableList<Person> personData = FXCollections.observableArrayList();
	private ObservableList<Alcool> alcoolData = FXCollections.observableArrayList();
	private ObservableList<Alcool> selectedAlcoolData = FXCollections.observableArrayList();
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AlcoolApp");
        
        initRootLayout();
        showMainOverview();
        
        primaryStage.show();
	}
	
	public void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("views/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			Scene scene = new Scene(rootLayout);
	        primaryStage.setScene(scene);
	        
	        RootLayoutController controller = loader.getController();
	        controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showMainOverview() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("views/MainOverview.fxml"));
			AnchorPane mainOverview = (AnchorPane) loader.load();
			
			rootLayout.setCenter(mainOverview);
			
			MainOverviewController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showPersonOverview() {
	    try {
	        // Load person overview.
	        FXMLLoader loaderPerson = new FXMLLoader();
	        loaderPerson.setLocation(MainApp.class.getResource("views/EditPersonDialog.fxml"));
	        AnchorPane personOverview = (AnchorPane) loaderPerson.load();

	        // Set person overview into the center of root layout.
	        rootLayout.setCenter(personOverview);

	        // Give the controller access to the main app.
	        EditPersonDialogController controllerPerson = loaderPerson.getController();
	        controllerPerson.setMainApp(this);

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public void showAlcoolOverview() {
	    try {
	        // Load alcool overview.
	        FXMLLoader loaderAlcool = new FXMLLoader();
	        loaderAlcool.setLocation(MainApp.class.getResource("views/EditAlcoolDialog.fxml"));
	        AnchorPane alcoolOverview = (AnchorPane) loaderAlcool.load();

	        // Set alcool overview into the center of root layout.
	        rootLayout.setCenter(alcoolOverview);

	        // Give the controller access to the main app.
	        EditAlcoolDialogController controllerAlcool = loaderAlcool.getController();
	        controllerAlcool.setMainApp(this);

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public void showQuantityOverview() {
	    try {
	        // Load quantity overview.
	        FXMLLoader loaderQuantity = new FXMLLoader();
	        loaderQuantity.setLocation(MainApp.class.getResource("views/EditQuantityDialog.fxml"));
	        AnchorPane quantityOverview = (AnchorPane) loaderQuantity.load();

	        // Set quantity overview into the center of root layout.
	        rootLayout.setCenter(quantityOverview);

	        // Give the controller access to the main app.
	        EditQuantityDialogController controllerQuantity = loaderQuantity.getController();
	        controllerQuantity.setMainApp(this);

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	
	public ObservableList<Person> getPersonData() {
        return personData;
    }
	
	public ObservableList<Alcool>getAlcoolData(){
		return alcoolData;
	}
	
	public ObservableList<Alcool>getSelectedAlcoolData(){
		return selectedAlcoolData;
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
