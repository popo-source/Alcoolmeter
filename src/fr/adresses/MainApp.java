package fr.adresses;




import java.io.IOException;

import fr.adresses.classes.Alcool;
import fr.adresses.classes.Person;
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
	}

	/*
	 * ???TODO RootLayout FXML --> TODO to complete
	 * ???TODO RootLayoutController --> TODO to complete
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
	 * TODO AlcoolQuantityEditDialog FXML
	 * TODO AlcoolQuantityEditDialogController
	 * 
	 * TODO GraphicOverview FXML
	 * TODO GraphicOverviewController
	 * 
	 * TODO DeleteView FXML
	 * TODO DeleteViewController
	 * 
	 * 
	 */
	
	public void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("views/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			Scene scene = new Scene(rootLayout);
	        primaryStage.setScene(scene);
	        
	        RootLayoutController controller = loader.getController();
	        controller.setMainApp(this);
	        
	        primaryStage.show();
	        
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
