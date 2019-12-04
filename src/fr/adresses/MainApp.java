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
	
	//Yeaaaaaah
	//JAAAMAAAAAAAAAM

	public static void main(String[] args) {
		launch(args);
	}
}
