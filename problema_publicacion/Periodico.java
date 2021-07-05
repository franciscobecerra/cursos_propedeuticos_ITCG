/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_publicacion;
import java.util.Date;
/**
 *
 * @author franciscobecerra
 */
public class Periodico extends Periodicidad{
    private Date date;
    
    public Periodico( String title, String autor, double price, int no_pages, int periodicidad, Date date ){
        super( title, autor, price, no_pages, periodicidad );
        this.date = date;
    }
       
    public Date getDate(){
        return this.date;
    }
    public void setDate( Date date ){
        this.date = date;
    }    
    
    public void getAllInformation(){
        String title = this.getTitle(); 
        String autor = this.getAutor(); 
        double price = this.getPrice(); 
        int no_pages = this.getNo_pages();
        
        int periodicidad = this.getPeriodicidad();
//       date 
        
        System.out.println("\n --------------------------------- ");
        System.out.println(" |            PERIODICO            |");
        System.out.println(" ----------------------------------- ");
        System.out.println("  * TITULO: "+ title );
        System.out.println("  * AUTOR: "+ autor);
        System.out.println("  * PAGINAS: "+no_pages+", PERIODICIDAD:  cada "+ periodicidad+" dias" );
        System.out.println("  * PRECIO: "+ price);
        System.out.println("  * FECHA: "+this.date);
        System.out.println(" ----------------------------------- ");
        
    }
}
