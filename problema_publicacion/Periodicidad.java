/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_publicacion;

/**
 *
 * @author franciscobecerra
 */
public class Periodicidad extends Publicacion{
    private int periodicidad;
    
    public Periodicidad( String title, String autor, double price, int no_pages, int periodicidad ){
        super( title, autor, price, no_pages );
        this.periodicidad = periodicidad;
    }
    
    public int getPeriodicidad(){
        return this.periodicidad;
    }
    public void setPeriodicidad( int periodicidad ){
        this.periodicidad = periodicidad;
    }
}
