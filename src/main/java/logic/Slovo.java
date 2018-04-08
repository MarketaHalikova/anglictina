package logic;

/**
 * T��da Slovo p�edstavuje jednotliv� slova
 * kter� je mo�n� si ve h�e procvi�ovat
 * 
 * U slova je uveden jeho �esk� a anglick� v�raz
 *
 * @author     Mark�ta Hal�kov�
 * @version    LS 2017/2018
 */

public class Slovo {

	   private String cesky;
	   private String anglicky;
	    
	    /**
	     * Vytvo�� nov� slovo se zadan�m �esk�m a anglick�m v�znamem.
	     * 
	     * @param    String
	     * @param    String
	     */
	    public Slovo(String cesky, String anglicky)
	    {
	        this.cesky = cesky;
	        this.anglicky = anglicky;
	    }
	
	
	    /**
	     * Vr�t� �esk� v�znam slova
	     * 
	     * @returns   String
	     */
	    public String getCesky()
	    {
	        return cesky;
	    }
	    
	    /**
	     * Vr�t� anglick� v�znam slova
	     * 
	     * @returns    String
	     */
	    public String getAnglicky()
	    {
	        return anglicky;
	    }
	    
	    /**
	     * Nastav� nov� �esk� v�znam slova
	     * 
	     * @param    String
	     */
	    public void setCesky(String cesky)
	    {
	        this.cesky = cesky;
	    }
	
	    /**
	     * Nastav� nov� anglick� v�znam slova
	     * 
	     * @param    String
	     */
	    public void setAnglicky(String anglicky)
	    {
	        this.anglicky = anglicky;
	    }
}
