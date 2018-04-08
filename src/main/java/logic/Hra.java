package logic;

import java.util.ArrayList;
import java.util.Random;
import java.util.Observable;

/**
 * Tøída Hra - tøída pøedstavující logiku hry Angliètina.
 * 
 * Toto je hlavní tøída logiky aplikace. Tøída vytváøí seznam slov pro zkoušení,
 * metody, potøebné pro práci se seznamem,
 * poèítá správné a špatné tipy a vrací epilog
 *
 * @author     Markéta Halíková
 * @version    LS 2017/2018
 */
public class Hra extends Observable{

	private SeznamSlov seznamSlov;
	private int spravneTipy;
	private int spatneTipy;
	
	/**
	 * konstruktor vytváøí nový seznam slov
	 * a volá metodu vlozSlova(), kteá jej naplní
	 */
	public Hra() {    
		this.seznamSlov = new SeznamSlov();	
        vlozSlova();
	}
	
	/**
	 * Metoda inicializuje nová slova pro hru
	 * a plní jimi seznam
	 */
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
        Slovo had = new Slovo("had", "SNAKE");
        Slovo velbloud = new Slovo("velbloud", "CAMEL");
        Slovo slon = new Slovo("slon", "ELEPHANT");
        Slovo ovce = new Slovo("ovce", "SHEEP");
        Slovo orel = new Slovo("orel", "EAGLE");
        Slovo opice = new Slovo("opice", "MONKEY");
        Slovo myval = new Slovo("mýval", "RACOON");
        Slovo kralik = new Slovo("králík", "RABBIT");
        Slovo koza = new Slovo("koza", "GOAT");
        Slovo jezek = new Slovo("ježek", "HEDGEHOG");
        
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
        seznamSlov.pridejSlovo(jezek);
        seznamSlov.pridejSlovo(koza);
        seznamSlov.pridejSlovo(kralik);
        seznamSlov.pridejSlovo(myval);
        seznamSlov.pridejSlovo(opice);
        seznamSlov.pridejSlovo(orel);
        seznamSlov.pridejSlovo(ovce);
        seznamSlov.pridejSlovo(slon);
        seznamSlov.pridejSlovo(velbloud);
        seznamSlov.pridejSlovo(had);
        }
    
    /**
	 * Metoda z ArrayListu vybírá náhodné slovo a vrací jej
	 * @param ArrayList<Slovo>
	 * @return Slovo
	 */
    public Slovo vybratHadaneSlovo(ArrayList<Slovo> listSesti){
    	
    	final Random randomGenerator = new Random();
    	
    	int index = randomGenerator.nextInt(seznamSlov.nahodnychSest().size());
        Slovo hadaneSlovo = listSesti.get(index);
        
        return hadaneSlovo;
    }
    
    /**
	 * Metoda dle hodnoty parametru pøièítá správné nebo špatné tipy
	 * upozoròuje observer pøi své zmìnì
	 * @param Boolean
	 */
    public void jeSpravne(Boolean spravne){  	
        
    	if(spravne){
    		this.spravneTipy ++;
    	} else {
    		this.spatneTipy ++;
    	}  	
    	setChanged();
        notifyObservers();
    }
    
    /**
	 * Metoda vyhodnocuje, zda už je konec hra
	 * - pokud je správných tipù 10
	 * @return Boolean
	 */
    public Boolean jeUzKonec(){
    	
    	if(spravneTipy == 10){
    		return true;		
    	} else {
    		return false;
    	}
    }
    
    /**
	 * Metoda vrací poèet správných tipù jako String
	 * @return String
	 */
    public String getSpravneToString(){
    	return Integer.toString(spravneTipy);
    }
    
    /**
	 * Metoda vrací poèet špatných tipù jako String
	 * @return String
	 */
    public String getSpatneneToString(){
    	return Integer.toString(spatneTipy);
    }
    
    /**
	 * Metoda vrací seznam slov
	 * @return SeznamSlov
	 */
    public SeznamSlov getSeznamSlov(){
    	return seznamSlov;
    }
    
    /**
	 * Metoda vrací epilog hry
	 * @return String
	 */
    public String epilog(){
    	return "Dokonèil jsi zkoušení. Tvé skóre je:\n\n" +
    			"správné tipy: " + spravneTipy  +
    			"\nku\n" +
    			"špatné tipy: " + spatneTipy  +
    			"\n\nPokud chceš zaèít nové zkoušení, zvol v menu Nová Hra"	;
    }
    
    /**
	 * Metoda pøiøazuje hodnotu správných tipù
	 * @param int
	 */
    public void setSpravneTipy(int i){
    	spravneTipy = i;
    }
    
    /**
	 * Metoda pøiøazuje hodnotu špatných tipù
	 * @param int
	 */
    public void setSpatneTipy(int i){
    	spatneTipy = i;
    }
    
    }
	
