package fr.adresses.views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import fr.adresses.MainApp;
import fr.adresses.classes.Alcool;

public class EditAlcoolDialogController {

    @FXML
    private TableView<Alcool> alcoolTable;
    @FXML
    private TableColumn<Alcool, String> alcoolNameColumn;
    @FXML
    private TableColumn<Alcool, String> degreeColumn;

    @FXML
    private Label alcoolNameLabel;
    @FXML
    private Label degreeLabel;

   
    // Reference to the main application.
    private MainApp mainApp;

    public EditAlcoolDialogController() {
    }

    @FXML
    private void initializeAlcoolName() {
        // Initialize the alcool table with the two columns.
        alcoolNameColumn.setCellValueFactory(cellData -> cellData.getValue().alcoolNameProperty());
        degreeColumn.setCellValueFactory(cellData -> cellData.getValue().degreeProperty());
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Add observable list data to the table
       alcoolTable.setItems(mainApp.getAlcoolData());
    }
}