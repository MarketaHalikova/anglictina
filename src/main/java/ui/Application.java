package ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import logic.Hra;

/**
 * T��da slou�� ke spu�t�n� hry Angli�tina
 * @author Mark�ta Hal�kova
 *
 */
public class Application extends javafx.application.Application {

	/**
	 * Metoda, ve kter� se konstruuje okno, kontroler a hra,
	 * kter� se p�ed�v� kontroleru
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {	
		Hra hra = new Hra();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "Home.fxml"));
          Parent root = (Parent) loader.load();
          HomeController ctrl = loader.getController();
          ctrl.inicializuj(hra);;

          primaryStage.setTitle("Angli�tina");
          primaryStage.setScene(new Scene(root));
          primaryStage.show();      
	}
}
