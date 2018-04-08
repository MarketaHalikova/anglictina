package logic;

import java.util.ArrayList;
import java.util.Random;
import java.util.Observable;

/**
 * T��da Hra - t��da p�edstavuj�c� logiku hry Angli�tina.
 * 
 * Toto je hlavn� t��da logiky aplikace. T��da vytv��� seznam slov pro zkou�en�,
 * metody, pot�ebn� pro pr�ci se seznamem,
 * po��t� spr�vn� a �patn� tipy a vrac� epilog
 *
 * @author     Mark�ta Hal�kov�
 * @version    LS 2017/2018
 */
public class Hra extends Observable{

	private SeznamSlov seznamSlov;
	private int spravneTipy;
	private int spatneTipy;
	
	/**
	 * konstruktor vytv��� nov� seznam slov
	 * a vol� metodu vlozSlova(), kte� jej napln�
	 */
	public Hra() {    
		this.seznamSlov = new SeznamSlov();	
        vlozSlova();
	}
	
	/**
	 * Metoda inicializuje nov� slova pro hru
	 * a pln� jimi seznam
	 */
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
        Slovo had = new Slovo("had", "SNAKE");
        Slovo velbloud = new Slovo("velbloud", "CAMEL");
        Slovo slon = new Slovo("slon", "ELEPHANT");
        Slovo ovce = new Slovo("ovce", "SHEEP");
        Slovo orel = new Slovo("orel", "EAGLE");
        Slovo opice = new Slovo("opice", "MONKEY");
        Slovo myval = new Slovo("m�val", "RACOON");
        Slovo kralik = new Slovo("kr�l�k", "RABBIT");
        Slovo koza = new Slovo("koza", "GOAT");
        Slovo jezek = new Slovo("je�ek", "HEDGEHOG");
        
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
	 * Metoda z ArrayListu vyb�r� n�hodn� slovo a vrac� jej
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
	 * Metoda dle hodnoty parametru p�i��t� spr�vn� nebo �patn� tipy
	 * upozor�uje observer p�i sv� zm�n�
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
	 * Metoda vyhodnocuje, zda u� je konec hra
	 * - pokud je spr�vn�ch tip� 10
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
	 * Metoda vrac� po�et spr�vn�ch tip� jako String
	 * @return String
	 */
    public String getSpravneToString(){
    	return Integer.toString(spravneTipy);
    }
    
    /**
	 * Metoda vrac� po�et �patn�ch tip� jako String
	 * @return String
	 */
    public String getSpatneneToString(){
    	return Integer.toString(spatneTipy);
    }
    
    /**
	 * Metoda vrac� seznam slov
	 * @return SeznamSlov
	 */
    public SeznamSlov getSeznamSlov(){
    	return seznamSlov;
    }
    
    /**
	 * Metoda vrac� epilog hry
	 * @return String
	 */
    public String epilog(){
    	return "Dokon�il jsi zkou�en�. Tv� sk�re je:\n\n" +
    			"spr�vn� tipy: " + spravneTipy  +
    			"\nku\n" +
    			"�patn� tipy: " + spatneTipy  +
    			"\n\nPokud chce� za��t nov� zkou�en�, zvol v menu Nov� Hra"	;
    }
    
    /**
	 * Metoda p�i�azuje hodnotu spr�vn�ch tip�
	 * @param int
	 */
    public void setSpravneTipy(int i){
    	spravneTipy = i;
    }
    
    /**
	 * Metoda p�i�azuje hodnotu �patn�ch tip�
	 * @param int
	 */
    public void setSpatneTipy(int i){
    	spatneTipy = i;
    }
    
    }
	
