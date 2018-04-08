package logic;

import java.util.ArrayList;
import java.util.Random;
import java.util.Observable;


public class Hra extends Observable{

	private boolean konecHry = false;
	private SeznamSlov seznamSlov;
	private Slovo hadaneSlovo;
	private int spraveTipy;
	private int spatneTipy;
	

	public Hra() {
        
		this.seznamSlov = new SeznamSlov();
		
        vlozSlova();
	}
	
    public void vlozSlova(){
        	
        Slovo pes = new Slovo("pes", "DOG");
        Slovo kocka = new Slovo("koèka", "CAT");
        Slovo lev = new Slovo("lev", "LION");
        Slovo zirafa = new Slovo("žirafa", "GIRAFFE");
        Slovo zelva = new Slovo("želva", "TURTLE");
        Slovo hroch = new Slovo("hroch", "HIPPO");
        Slovo mys = new Slovo("myš", "MOUSE");
        Slovo delfin = new Slovo("delfín", "DOLPHIN");
        Slovo kun = new Slovo("kùò", "HORSE");
        Slovo krava = new Slovo("kráva", "COW");
        
        seznamSlov.pridejSlovo(pes);
        seznamSlov.pridejSlovo(kocka);
        seznamSlov.pridejSlovo(lev);
        seznamSlov.pridejSlovo(zirafa);
        seznamSlov.pridejSlovo(zelva);
        seznamSlov.pridejSlovo(hroch);
        seznamSlov.pridejSlovo(mys);
        seznamSlov.pridejSlovo(delfin);
        seznamSlov.pridejSlovo(kun);
        seznamSlov.pridejSlovo(krava);

        }
    
    
    public Slovo vybratHadaneSlovo(){
    	
    	final Random randomGenerator = new Random();
    	ArrayList<Slovo> listSesti = new ArrayList<>();
    	listSesti = seznamSlov.nahodnychSest();
    	
    	int index = randomGenerator.nextInt(seznamSlov.nahodnychSest().size());
        Slovo hadaneSlovo = listSesti.get(index);
        
        return hadaneSlovo;
    }
    
    
    public Boolean jeSpravne(Slovo tip){
    	
    	setChanged();
        notifyObservers();
        
    	if(tip == hadaneSlovo){
    		this.spraveTipy ++;
    		return true;
    	} else {
    		this.spatneTipy ++;
    		return false;
    	}
    }
    
    public Boolean jeUzKonec(){
    	
    	if(spraveTipy == 10){
    		return true;		
    	} else {
    		return false;
    	}
    }
    
    public String getSpravneToString(){
    	return Integer.toString(spraveTipy);
    }
    
    public String getSpatneneToString(){
    	return Integer.toString(spatneTipy);
    }
    
    public SeznamSlov getSeznamSlov(){
    	return seznamSlov;
    }
    
    }
	
