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
public class Publicacion {
    private String title;
    private String autor;
    private double price;
    private int no_pages;
    
    public Publicacion( String title, String autor, double price, int no_pages ){
        this.title = title;
        this.autor = autor;
        this.price = price;
        this.no_pages = no_pages;
    }
    
    public String getTitle(){
        return this.title;
    }
    public void setTitle( String title ){
        this.title = title;
    }
    
    public String getAutor(){
        return this.autor;
    }
    public void setAutor( String title ){
        this.title = autor;
    }
    
    public double getPrice(){
        return this.price;
    }
    public void setPrice( double price ){
        this.price = price;
    }
    
    public int getNo_pages(){
        return this.no_pages;
    }
    public void setNo_pages( int no_pages ){
        this.no_pages = no_pages;
    }
}
