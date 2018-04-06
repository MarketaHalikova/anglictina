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
	     * @param    cesky          èeský význam slova
	     * @param    anglicky          anglický význam slova
	     */
	    public Slovo(String cesky, String anglicky)
	    {
	        this.cesky = cesky;
	        this.anglicky = anglicky;
	    }
	
	
	    /**
	     * Vrátí èeský význam slova
	     * 
	     * @returns    cesky (èeský význam)
	     */
	    public String getCesky()
	    {
	        return cesky;
	    }
	    
	    /**
	     * Vrátí anglický význam slova
	     * 
	     * @returns    anglicky (anglický význam)
	     */
	    public String getAnglicky()
	    {
	        return anglicky;
	    }
	    
	    /**
	     * Nastaví nový èeský význam slova
	     * 
	     * @param    cesky (nový èeský význam)
	     */
	    public void setCesky(String cesky)
	    {
	        this.cesky = cesky;
	    }
	
	    /**
	     * Nastaví nový anglický význam slova
	     * 
	     * @param    panglicky (nový anglický význam)
	     */
	    public void setAnglicky(String anglicky)
	    {
	        this.anglicky = anglicky;
	    }
}
