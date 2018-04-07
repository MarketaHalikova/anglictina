package ui;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.Hra;

/**

 * 
 * @author Marketa Halikova
 *
 */
public class Application extends javafx.application.Application {



	@Override
	public void start(Stage primaryStage) throws Exception {		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass()
		          .getResource("Home.fxml"));
		Parent root = loader.load();

		HomeController controller = loader.getController();
		//controller.inicializuj(new  Hra());
		
        primaryStage.setTitle("Angliètina");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
		
	}

}
