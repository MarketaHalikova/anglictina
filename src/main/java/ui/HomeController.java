package ui;

import logic.Hra;
import logic.Slovo;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;


/**
 * Kontroler, který zprostøedkovává komunikaci mezi grafikou
 * a logikou adventury
 * 
 * @author Markéta Halíkova
 *
 */
public class HomeController extends BorderPane implements Observer{
	
	private Hra hra;
	private Slovo hadaneSlovo;
	@FXML private Label spravne;
	@FXML private Label spatne;
	@FXML private Label hadejLabel;
	@FXML private Button hadejButton;
	@FXML private Button obrazek1;
	@FXML private Button obrazek2;
	@FXML private Button obrazek3;
	@FXML private Button obrazek4;
	@FXML private Button obrazek5;
	@FXML private Button obrazek6;
	
	/**
	 * Metoda slouží pro pøedání objektu se spuštìnou hrou
	 * kontroleru a nastaví buttony jako neklikatelné.
	 * @param objekt spuštìné hry
	 */
	public void inicializuj(Hra hra) {
		this.hra = hra;
		this.hra.addObserver(this);
		obrazek1.setDisable(true);
		obrazek2.setDisable(true);
		obrazek3.setDisable(true);
		obrazek4.setDisable(true);
		obrazek5.setDisable(true);
		obrazek6.setDisable(true);	
	}
	

	/**
	 * Metoda generovaná obseverem
	 * reaguje na zmìnu stavu v metodì, kde je zmìna nastavena
	 * pote porvede svùj obsah
	 * @param Observable
	 * @param Object
	 */
	@Override
	public void update(Observable arg0, Object arg1) {	
		spravne.setText(hra.getSpravneToString());
		spatne.setText(hra.getSpatneneToString());
		if(hra.jeUzKonec()){
			hadejButton.setDisable(true);
			Alert alert = new Alert(AlertType.INFORMATION, hra.epilog());
			alert.show();
		}
	}
	
	
	/**
	 * Metoda pøipraví hru na hádání, který obrázek odpovídá anglickému výrazu
	 * Vybere náhodných 6 slov ze seznam slov a zavolá metodu displayObrazky()
	 * Náhodnì z tìchto šesti vybere hádané slovo a zobrazí jej
	 */
	public void hadej(){
		ArrayList<Slovo> listSesti = new ArrayList<>();
		listSesti = hra.getSeznamSlov().nahodnychSest();
		displayObrazky(listSesti);
		this.hadaneSlovo = hra.vybratHadaneSlovo(listSesti);
		hadejLabel.setText(hadaneSlovo.getAnglicky());
		hadejButton.setDisable(true);
		obrazek1.setDisable(false);
		obrazek2.setDisable(false);
		obrazek3.setDisable(false);
		obrazek4.setDisable(false);
		obrazek5.setDisable(false);
		obrazek6.setDisable(false);		
		obrazek1.setTooltip(new Tooltip(obrazek1.getAccessibleText()));
		obrazek2.setTooltip(new Tooltip(obrazek2.getAccessibleText()));
		obrazek3.setTooltip(new Tooltip(obrazek3.getAccessibleText()));
		obrazek4.setTooltip(new Tooltip(obrazek4.getAccessibleText()));
		obrazek5.setTooltip(new Tooltip(obrazek5.getAccessibleText()));
		obrazek6.setTooltip(new Tooltip(obrazek6.getAccessibleText()));
	}
	
	/**
	 * Metoda zobrazí obrázky na buttonech pro slova z Arraylistu
	 * @param ArrayList<Slovo> nahodnychSest
	 */
	private void displayObrazky(ArrayList<Slovo> nahodnychSest) {		
		String obr1 = nahodnychSest.get(0).getCesky();
		obrazek1.setStyle("-fx-background-image: url('/"+obr1+".jpg')");
		obrazek1.setAccessibleText(obr1);
		String obr2 = nahodnychSest.get(1).getCesky();
		obrazek2.setStyle("-fx-background-image: url('/"+obr2+".jpg')");
		obrazek2.setAccessibleText(obr2);
		String obr3 = nahodnychSest.get(2).getCesky();
		obrazek3.setStyle("-fx-background-image: url('/"+obr3+".jpg')");
		obrazek3.setAccessibleText(obr3);
		String obr4 = nahodnychSest.get(3).getCesky();
		obrazek4.setStyle("-fx-background-image: url('/"+obr4+".jpg')");
		obrazek4.setAccessibleText(obr4);
		String obr5 = nahodnychSest.get(4).getCesky();
		obrazek5.setStyle("-fx-background-image: url('/"+obr5+".jpg')");
		obrazek5.setAccessibleText(obr5);
		String obr6 = nahodnychSest.get(5).getCesky();
		obrazek6.setStyle("-fx-background-image: url('/"+obr6+".jpg')");
		obrazek6.setAccessibleText(obr6);
	}
	
	/**
	 * Metoda zkontroluje, zda èeský výraz pro kliknutý button s obrázkem odpovídá hádanému slovu
	 * a pøiète dobrý nebo špatný pokus
	 * @param ActionEvent
	 */
	public void zkontroluj(final ActionEvent event){
		String clicked = event.getSource().toString().substring(10, 18);

		if ((clicked.equals("obrazek1") && obrazek1.getAccessibleText().equals(hadaneSlovo.getCesky()))||
			(clicked.equals("obrazek2") && obrazek2.getAccessibleText().equals(hadaneSlovo.getCesky()))||
			(clicked.equals("obrazek3") && obrazek3.getAccessibleText().equals(hadaneSlovo.getCesky()))||
			(clicked.equals("obrazek4") && obrazek4.getAccessibleText().equals(hadaneSlovo.getCesky()))||
			(clicked.equals("obrazek5") && obrazek5.getAccessibleText().equals(hadaneSlovo.getCesky()))||
			(clicked.equals("obrazek6") && obrazek6.getAccessibleText().equals(hadaneSlovo.getCesky()))){
			
			hadejButton.setDisable(false);
			hra.jeSpravne(true);
			if(!hra.jeUzKonec()){
				Alert alert = new Alert(AlertType.INFORMATION, "SPRÁVNÌ\n\nZkus další :)");
				alert.show();}
			obrazek1.setDisable(true);
			obrazek2.setDisable(true);
			obrazek3.setDisable(true);
			obrazek4.setDisable(true);
			obrazek5.setDisable(true);
			obrazek6.setDisable(true);
			hadejLabel.setText("");
			
		} else {
			Alert alert = new Alert(AlertType.INFORMATION, "ŠPATNÌ\n\nZkus to znovu :)");
			alert.show();
			hra.jeSpravne(false);
		}
	}
	
	/**
	 * Metoda spustí novou hru
	 * vynuluje poèítadla správných a špatných pokusù
	 * @param ActionEvent
	 */
	public void novaHra(){
		hadejButton.setDisable(false);
		hadejLabel.setText("");
		hra.setSpravneTipy(-1);
		hra.setSpatneTipy(0);
		hra.jeSpravne(true);
		inicializuj(hra);	
	}
	
}

