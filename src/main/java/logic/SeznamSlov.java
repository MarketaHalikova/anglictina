package logic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SeznamSlov {

	private  ArrayList<Slovo> seznamSlov;
	
	public SeznamSlov() {
		seznamSlov = new ArrayList<>();
    }
	
	

	public void pridejSlovo(Slovo slovo) {
		seznamSlov.add(slovo);
		
    }
	
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
