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
        Slovo kocka = new Slovo("ko�ka", "CAT");
        Slovo lev = new Slovo("lev", "LION");
        Slovo zirafa = new Slovo("�irafa", "GIRAFFE");
        Slovo zelva = new Slovo("�elva", "TURTLE");
        Slovo hroch = new Slovo("hroch", "HIPPO");
        Slovo mys = new Slovo("my�", "MOUSE");
        Slovo delfin = new Slovo("delf�n", "DOLPHIN");
        Slovo kun = new Slovo("k��", "HORSE");
        Slovo krava = new Slovo("kr�va", "COW");
        
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
    	return "Dokon�il jsi zkou�en�. Tv� sk�re je:\n\n" +
    			"spr�vn� tipy: " + spravneTipy  +
    			"\nku\n" +
    			"�patn�n� tipy: " + spatneTipy  +
    			"\n\nPokud chce� za��t nov� zkou�en�, zvol v menu Nov� Hra"	
    			;
    }

    
    }
	
