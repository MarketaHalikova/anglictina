package logic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * T��da SeznamSlov eviduje seznam vlo�en�ch slov pro procvi�ov�n�.
 * M� metody pro p�id�n� slov a generov�n� n�hodn�ch neopakuj�c�ch se �esti slov
 *
 * @author     Mark�ta Hal�kov�
 * @version    LS 2017/2018
 */
public class SeznamSlov {

	private  ArrayList<Slovo> seznamSlov;
	
	/**
	 * Vytvo�� nov� seznamSlov
	 *
	 */
	public SeznamSlov() {
		seznamSlov = new ArrayList<>();
    }
	
	
	/**
	 * Metoda p�id�v� slovo z parametru do seznamu slov
	 *@param Slovo
	 */
	public void pridejSlovo(Slovo slovo) {
		seznamSlov.add(slovo);		
    }
	
	/**
	 * Metoda vytv��� a vrac� seznam n�hodn� vybran�ch neoopakuj�c�ch se �esti slov
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
