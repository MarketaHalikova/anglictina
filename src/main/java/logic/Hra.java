package logic;

import java.util.ArrayList;
import java.util.Random;
import java.util.Observable;


public class Hra extends Observable{

	private SeznamSlov seznamSlov;
	private int spravneTipy;
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
    
    
    public Slovo vybratHadaneSlovo(ArrayList<Slovo> listSesti){
    	
    	final Random randomGenerator = new Random();
    	
    	int index = randomGenerator.nextInt(seznamSlov.nahodnychSest().size());
        Slovo hadaneSlovo = listSesti.get(index);
        
        return hadaneSlovo;
    }
    
    
    public void jeSpravne(Boolean spravne){
    	
        
    	if(spravne){
    		this.spravneTipy ++;
    	} else {
    		this.spatneTipy ++;
    	}
    	
    	setChanged();
        notifyObservers();
    }
    
    public Boolean jeUzKonec(){
    	
    	if(spravneTipy == 2){
    		return true;		
    	} else {
    		return false;
    	}
    }
    
    public String getSpravneToString(){
    	return Integer.toString(spravneTipy);
    }
    
    public String getSpatneneToString(){
    	return Integer.toString(spatneTipy);
    }
    
    public SeznamSlov getSeznamSlov(){
    	return seznamSlov;
    }
    
    public String epilog(){
    	return "Dokonèil jsi zkoušení. Tvé skóre je:\n\n" +
    			"správné tipy: " + spravneTipy  +
    			"\nku\n" +
    			"špatnéné tipy: " + spatneTipy  +
    			"\n\nPokud chceš zaèít nové zkoušení, zvol v menu Nová Hra"	
    			;
    }

    
    }
	
