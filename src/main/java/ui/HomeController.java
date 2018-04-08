package ui;

import logic.Hra;
import logic.Slovo;

import java.util.ArrayList;
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
	private Slovo hadaneSlovo;
	@FXML private Label spravne;
	@FXML private Label spatne;
	@FXML private Label hadejLabel;
	@FXML private Button hadej;
	@FXML private Button obrazek1;
	@FXML private Button obrazek2;
	@FXML private Button obrazek3;
	@FXML private Button obrazek4;
	@FXML private Button obrazek5;
	@FXML private Button obrazek6;
	

	public void inicializuj(Hra hra) {

		this.hra = hra;
		this.hra.addObserver(this);
		displayObrazky(hra.getSeznamSlov().nahodnychSest());
		hadaneSlovo = hra.vybratHadaneSlovo();
		hadejLabel.setText(hadaneSlovo.getAnglicky());
		
	}
	

	


	@Override
	public void update(Observable arg0, Object arg1) {
	
		spravne.setText(hra.getSpravneToString());
		spatne.setText(hra.getSpatneneToString());
		if(hra.jeUzKonec()){
			hadej.setVisible(false);
		}
	}
	
	
	private void displayObrazky(ArrayList<Slovo> nahodnychSest) {
		
		String obr1 = nahodnychSest.get(0).getCesky();
		obrazek1.setStyle("-fx-background-image: url('/"+obr1+".jpg')");
		obrazek1.setAccessibleText("obr1");
		String obr2 = nahodnychSest.get(1).getCesky();
		obrazek2.setStyle("-fx-background-image: url('/"+obr2+".jpg')");
		obrazek1.setAccessibleText("obr2");
		String obr3 = nahodnychSest.get(2).getCesky();
		obrazek3.setStyle("-fx-background-image: url('/"+obr3+".jpg')");
		obrazek1.setAccessibleText("obr3");
		String obr4 = nahodnychSest.get(3).getCesky();
		obrazek4.setStyle("-fx-background-image: url('/"+obr4+".jpg')");
		obrazek1.setAccessibleText("obr4");
		String obr5 = nahodnychSest.get(4).getCesky();
		obrazek5.setStyle("-fx-background-image: url('/"+obr5+".jpg')");
		obrazek1.setAccessibleText("obr5");
		String obr6 = nahodnychSest.get(5).getCesky();
		obrazek6.setStyle("-fx-background-image: url('/"+obr6+".jpg')");
		obrazek1.setAccessibleText("obr6");

		
	}
	
	
}

