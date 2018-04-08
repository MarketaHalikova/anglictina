package logic;

/**
 * Tøída Slovo pøedstavuje jednotlivá slova
 * která je možné si ve høe procvièovat
 * 
 * U slova je uveden jeho èeský a anglický výraz
 *
 * @author     Markéta Halíková
 * @version    LS 2017/2018
 */

public class Slovo {

	   private String cesky;
	   private String anglicky;
	    
	    /**
	     * Vytvoøí nové slovo se zadaným èeským a anglickým významem.
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
	     * Vrátí èeský význam slova
	     * 
	     * @returns   String
	     */
	    public String getCesky()
	    {
	        return cesky;
	    }
	    
	    /**
	     * Vrátí anglický význam slova
	     * 
	     * @returns    String
	     */
	    public String getAnglicky()
	    {
	        return anglicky;
	    }
	    
	    /**
	     * Nastaví nový èeský význam slova
	     * 
	     * @param    String
	     */
	    public void setCesky(String cesky)
	    {
	        this.cesky = cesky;
	    }
	
	    /**
	     * Nastaví nový anglický význam slova
	     * 
	     * @param    String
	     */
	    public void setAnglicky(String anglicky)
	    {
	        this.anglicky = anglicky;
	    }
}
