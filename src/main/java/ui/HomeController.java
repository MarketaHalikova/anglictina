package ui;

import logic.Hra;


import java.util.Observable;
import java.util.Observer;

import javafx.scene.layout.BorderPane;


/**
 *
 * 
 * @author Marketa Halikova
 *
 */
public class HomeController extends BorderPane implements Observer{
	


	private Hra hra;
	

	public void inicializuj(Hra hra) {

		
	}
	

	@Override
	public void update(Observable arg0, Object arg1) {
	
	}
	
	
}

