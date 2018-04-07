package ui;

import logic.Hra;


import java.util.Observable;
import java.util.Observer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;




/**
 *
 * 
 * @author Marketa Halikova
 *
 */
public class HomeController extends BorderPane implements Observer{
	


	private Hra hra;
	@FXML private Label spravne;
	@FXML private Label spatne;
	@FXML private Button hadej;
	

	public void inicializuj(Hra hra) {

		this.hra = hra;
		
	}
	

	@Override
	public void update(Observable arg0, Object arg1) {
	
		spravne.setText(hra.getSpravneToString());
		spatne.setText(hra.getSpatneneToString());
		if(hra.jeUzKonec()){
			hadej.setVisible(false);
		}
	}
	
	//button.setStyle("-fx-background-image: url('/testing/background.jpg')");
	
	
}

