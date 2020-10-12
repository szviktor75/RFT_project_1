
package rft_procejt_1;

/**
 *
 * @author szollosiviktor
 */
public class Negyzet implements Terulet_kerulet {
    
    private double oldal;
    
    public Negyzet(double oldal){
        this.oldal = oldal;
    }

    public double getOldal() {
        return oldal;
    }

    public void setOldal(double oldal) {
        this.oldal = oldal;
    }

    @Override
    public double kerulet(double oldal) {
        return oldal * 4;
    }

    @Override
    public double terulet(double oldal) {
        return oldal*oldal;
    }
    
   public double getTerulet(){
       return terulet(oldal);
   }
    
    public double getKerulet(){
        return  kerulet(oldal);
    }
}
