package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Scene scene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent FXMLMain = FXMLLoader.load(getClass().getResource("/gui_class/Main.fxml"));
			scene = new Scene(FXMLMain);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Crescimento Populacional");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
