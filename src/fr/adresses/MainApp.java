package fr.adresses;


import java.io.IOException;

import fr.adresses.classes.LineChartsValues;
import fr.adresses.classes.Person;
import fr.adresses.views.graphicOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
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
	
	
	public boolean showGraphic(Person person) {
		try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/GraphicOverview.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle(person.getFirstName());
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            LineChartsValues values = new LineChartsValues(person);
            
            graphicOverviewController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setPerson(person);
            controller.setChart(values.getChart());

            dialogStage.showAndWait();
            return controller.isOkClicked();
            
	       } catch (IOException e) {
	           e.printStackTrace();
	           return false;
	       }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
