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
        	
        Slovo pes = new Slovo("pes", "dog");
        Slovo kocka = new Slovo("koèka", "cat");
        Slovo lev = new Slovo("lev", "lion");
        Slovo zirafa = new Slovo("žirafa", "giraffe");
        Slovo zelva = new Slovo("želva", "turtle");
        Slovo hroch = new Slovo("hroch", "hippo");
        Slovo mys = new Slovo("myš", "mouse");
        Slovo delfin = new Slovo("delfín", "dolphin");
        Slovo chobotnice = new Slovo("chobotnice", "octopus");
        Slovo velryba = new Slovo("velryba", "whale");
        
        seznamSlov.pridejSlovo(pes);
        seznamSlov.pridejSlovo(kocka);
        seznamSlov.pridejSlovo(lev);
        seznamSlov.pridejSlovo(zirafa);
        seznamSlov.pridejSlovo(zelva);
        seznamSlov.pridejSlovo(hroch);
        seznamSlov.pridejSlovo(mys);
        seznamSlov.pridejSlovo(delfin);
        seznamSlov.pridejSlovo(chobotnice);
        seznamSlov.pridejSlovo(velryba);

        }
    
    
    public void vybratHadaneSlovo(){
    	
    	final Random randomGenerator = new Random();
    	ArrayList<Slovo> listSesti = new ArrayList<>();
    	listSesti = seznamSlov.nahodnychSest();
    	
    	int index = randomGenerator.nextInt(seznamSlov.nahodnychSest().size());
        Slovo hadaneSlovo = listSesti.get(index);
        
        this.hadaneSlovo = hadaneSlovo;
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
    
    }
	
