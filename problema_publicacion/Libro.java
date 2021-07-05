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
public class Libro extends Publicacion{
    private String isbn;
    private String edicion;
    
    public Libro( String title, String autor, double price, int no_pages, String isbn, String edicion ){
        super(title, autor, price, no_pages);
        this.isbn = isbn;
        this.edicion = edicion;
    }
    
    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn( String isbn ){
        this.isbn = isbn;
    }
    
    public String getEdicion(){
        return this.edicion;
    }
    public void setEdicion( String edicion ){
        this.edicion = edicion;
    }
    
    public void getAllInformation(){
        String title = this.getTitle(); 
        String autor = this.getAutor(); 
        double price = this.getPrice(); 
        int no_pages = this.getNo_pages();
//      isbn
//      edition
        
        System.out.println(" \n----------------------------------- ");
        System.out.println(" |              LIBRO              |");
        System.out.println(" ----------------------------------- ");
        System.out.println("  * TITULO: "+ title );
        System.out.println("  * AUTOR: "+ autor);
        System.out.println("  * PAGINAS: "+no_pages+", EDICION: "+this.edicion );
        System.out.println("  * PRECIO: "+ price);
        System.out.println("  * ISBN: "+ this.isbn );
        System.out.println(" ----------------------------------- ");
        
    }
}
