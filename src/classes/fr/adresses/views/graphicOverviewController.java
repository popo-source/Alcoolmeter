package classes.fr.adresses.views;


import javafx.fxml.FXML;
import javafx.scene.chart.*;
import javafx.stage.Stage;


public class graphicOverviewController{
	
	
	private Stage dialogStage;
	
	@FXML
	private LineChart<Number, Number> chart;
	
	@FXML
	private NumberAxis xAxis;
	
	@FXML
	private NumberAxis yAxis;
	
	@FXML
	private void handleOk() {
		dialogStage.close();
	}
	
	public void initGraph(XYChart.Series<Number, Number> serie){
		final NumberAxis xAxis= new NumberAxis(0, 8, 1);
		final NumberAxis yAxis = new NumberAxis(0, 16, 1);
		
		this.xAxis = xAxis;
		//this.xAxis.setAutoRanging(false);
		
		this.yAxis = yAxis;
		//this.yAxis.setAutoRanging(false);
		
		
		this.chart.getData().add(serie);
		
	}
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
}
