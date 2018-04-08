package logic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Tøída SeznamSlov eviduje seznam vložených slov pro procvièování.
 * Má metody pro pøidání slov a generování náhodných neopakujících se šesti slov
 *
 * @author     Markéta Halíková
 * @version    LS 2017/2018
 */
public class SeznamSlov {

	private  ArrayList<Slovo> seznamSlov;
	
	/**
	 * Vytvoøí nový seznamSlov
	 *
	 */
	public SeznamSlov() {
		seznamSlov = new ArrayList<>();
    }
	
	
	/**
	 * Metoda pøidává slovo z parametru do seznamu slov
	 *@param Slovo
	 */
	public void pridejSlovo(Slovo slovo) {
		seznamSlov.add(slovo);		
    }
	
	/**
	 * Metoda vytváøí a vrací seznam náhodnì vybraných neoopakujících se šesti slov
	 *@return ArrayList<Slovo>
	 */
	public ArrayList<Slovo> nahodnychSest() {		
		final int TOTAL_NUMBERS_I_WANT = 6;
		
		Set<Slovo> setSesti = new HashSet<Slovo>();
        while (setSesti.size() < TOTAL_NUMBERS_I_WANT) {
        	int index = (new Random()).nextInt(seznamSlov.size());
            Slovo nahodny = seznamSlov.get(index);     	
            setSesti.add(nahodny);
        }
        ArrayList<Slovo> listSesti = new ArrayList<>(setSesti);     
        return(listSesti);
    }	
	
}
