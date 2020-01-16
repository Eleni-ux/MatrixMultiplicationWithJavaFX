package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
public class Main extends Application {
	 private Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
		 this.primaryStage.setTitle("Matrix Multiplication");
		 
		 checkManager();

		
	}
	
	 public void checkManager() {
	        try {
	        	FXMLLoader loader = new FXMLLoader(getClass().getResource("MatrixMultiplicationFXML.fxml"));
				
				AnchorPane mainPane = loader.load();
	            
	 
				Scene scene = new Scene(mainPane,400,400);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				
	         
	        } catch(Exception e) {
				e.printStackTrace();
			}
	    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
