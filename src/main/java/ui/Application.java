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
		Hra hra = new Hra();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "Home.fxml"));
          Parent root = (Parent) loader.load();
          HomeController ctrl = loader.getController();
          ctrl.inicializuj(hra);;

          primaryStage.setTitle("Angliètina");
          primaryStage.setScene(new Scene(root));
          primaryStage.show();
          
	}
		
	

}
