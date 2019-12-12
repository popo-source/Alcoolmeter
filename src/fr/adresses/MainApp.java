package fr.adresses;

import java.io.IOException;

import fr.adresses.classes.Alcool;
import fr.adresses.classes.Person;
import fr.adresses.utilitary.LineChartsValues;
import fr.adresses.views.DeleteOverviewController;
import fr.adresses.views.EditAlcoolDialogController;
import fr.adresses.views.EditPersonDialogController;
import fr.adresses.views.EditQuantityDialogController;
import fr.adresses.views.MainOverviewController;
import fr.adresses.views.RootLayoutController;
import fr.adresses.views.graphicOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	
	private ObservableList<Person> personData = FXCollections.observableArrayList();
	private ObservableList<Alcool> alcoolData = FXCollections.observableArrayList();
	private ObservableList<Alcool> selectedAlcoolData = FXCollections.observableArrayList();
	
	@Override
	public void start(Stage primaryStage) {

		personData.add(new Person("Paul", "Hauser", "männlich", 80.0));
        personData.add(new Person("Lucas", "Gigondan", "männlich", 66.0));
        
        alcoolData.add(new Alcool("Jägermeister", 35.0));
        alcoolData.add(new Alcool("Heineken", 5.0));
		
		
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AlcoolApp");
        
        
		
        
        
        initRootLayout();
        showMainOverview();
        
        this.primaryStage.show();
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
	
	public void showGraphicOverview(Person person) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("views/GraphicOverview.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

            Stage graphicStage = new Stage();
            graphicStage.setTitle(person.getFirstName());
            graphicStage.initModality(Modality.WINDOW_MODAL);
            graphicStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            graphicStage.setScene(scene);

            LineChartsValues values = new LineChartsValues(person);
            
            graphicOverviewController controller = loader.getController();
            controller.setDialogStage(graphicStage);
            controller.setChart(values.getChart());
            graphicStage.showAndWait();
            
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public boolean showPersonEditDialogOverview(Person person) {
	    try {
	        FXMLLoader loaderPerson = new FXMLLoader();
	        loaderPerson.setLocation(MainApp.class.getResource("views/EditPersonDialog.fxml"));
	        AnchorPane personOverview = (AnchorPane) loaderPerson.load();

	        Stage dialogStage = new Stage();
            dialogStage.setTitle("Person");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(personOverview);
            dialogStage.setScene(scene);
	        
	        EditPersonDialogController controllerPerson = loaderPerson.getController();
	        controllerPerson.setMainApp(this);
	        controllerPerson.setDialogStage(dialogStage);
	        dialogStage.showAndWait();
            return controllerPerson.isOkClicked();
	    } catch (IOException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	
	public boolean showAlcoolEditDialogOverview(Alcool alcool) {
	    try {
	        FXMLLoader loaderAlcool = new FXMLLoader();
	        loaderAlcool.setLocation(MainApp.class.getResource("views/EditAlcoolDialog.fxml"));
	        AnchorPane alcoolOverview = (AnchorPane) loaderAlcool.load();
	        
	        Stage dialogStage = new Stage();
            dialogStage.setTitle("Alcool");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(alcoolOverview);
            dialogStage.setScene(scene);

	        
	        EditAlcoolDialogController controllerAlcool = loaderAlcool.getController();
	        controllerAlcool.setMainApp(this);
	        controllerAlcool.setAlcool(alcool);
	        controllerAlcool.setDialogStage(dialogStage);
	        dialogStage.showAndWait();
            return controllerAlcool.isOkClicked();
	    } catch (IOException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	public boolean showQuantityEditQuantityOverview(Alcool alcool) {
	    try {
	        FXMLLoader loaderQuantity = new FXMLLoader();
	        loaderQuantity.setLocation(MainApp.class.getResource("views/EditQuantityDialog.fxml"));
	        AnchorPane quantityOverview = (AnchorPane) loaderQuantity.load();

	        Stage dialogStage = new Stage();
            dialogStage.setTitle("Quantity");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(quantityOverview);
            dialogStage.setScene(scene);
	        
	        EditQuantityDialogController controllerQuantity = loaderQuantity.getController();
	        controllerQuantity.setMainApp(this);
	        controllerQuantity.setAlcool(alcool);
	        controllerQuantity.setDialogStage(dialogStage);
	        dialogStage.showAndWait();
	        return controllerQuantity.isOkClicked();
	    } catch (IOException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	
	public boolean showDeleteOverview(String name) {
	    try {
	        FXMLLoader loaderQuantity = new FXMLLoader();
	        loaderQuantity.setLocation(MainApp.class.getResource("views/DeleteDialog.fxml"));
	        AnchorPane quantityOverview = (AnchorPane) loaderQuantity.load();

	        Stage dialogStage = new Stage();
            dialogStage.setTitle("Delete "+name+" ?");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(quantityOverview);
            dialogStage.setScene(scene);
	        
	        DeleteOverviewController controllerDelete = loaderQuantity.getController();
	        controllerDelete.setDialogStage(dialogStage);
	        dialogStage.showAndWait();
	        return controllerDelete.isOkClicked();
	    } catch (IOException e) {
	        e.printStackTrace();
	        return false;
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
	
	public Stage getPrimaryStage() {
        return primaryStage;
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
