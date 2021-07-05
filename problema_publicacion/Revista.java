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
public class Revista extends Periodicidad{
    private String issn;
    private int numero;
    
    public Revista( String title, String autor, double price, int no_pages, int periodicidad, String issn, int numero ){
        super( title, autor, price, no_pages, periodicidad );
        this.issn = issn;
        this.numero = numero;
    }
    
    public String getIssn(){
        return this.issn;
    }
    public void setIssn( String issn ){
        this.issn = issn;
    }
    
    public int getNumero(){
        return this.numero;
    }
    public void setNumero( int numero ){
        this.numero = numero;
    }
    
    public void getAllInformation(){
        String title = this.getTitle(); 
        String autor = this.getAutor(); 
        double price = this.getPrice(); 
        int no_pages = this.getNo_pages();
        
        int periodicidad = this.getPeriodicidad();
//      issn
//      numero        
        
        System.out.println("\n ----------------------------------- ");
        System.out.println(" |              REVISTA              |");
        System.out.println(" ------------------------------------- ");
        System.out.println("  * TITULO: "+ title +", NUMERO: "+this.numero );
        System.out.println("  * AUTOR: "+ autor);
        System.out.println("  * PAGINAS: "+no_pages+", PERIODICIDAD: cada "+ periodicidad +" dias" );
        System.out.println("  * PRECIO: "+ price);
        System.out.println("  * ISSN: "+this.issn);
        System.out.println(" ----------------------------------- ");
        
    }
}
