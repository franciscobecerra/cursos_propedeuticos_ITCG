/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_final.clases;

/**
 *
 * @author franciscobecerra
 */
public class Users {
    private String user;
    private String password;
    
    public Users( String user, String password ){        
        this.user = user;
        this.password = password;
    }
    
    public String getUser(){
        return this.user;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setUser(String user){
        this.user = user;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void print(){
        System.out.println( "user: " + this.user + "; password: "+this.password );
    }
    
    public String getValueInString(){
        return this.user +","+ this.password +"\n";
    }
}
