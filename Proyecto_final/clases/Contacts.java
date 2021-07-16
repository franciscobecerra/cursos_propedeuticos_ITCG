package Proyecto_final.clases;

/**
 * @author franciscobecerra
 */
public class Contacts {
    private String name;
    private String lastname;
    private String number;
    private String email;
    
    public Contacts( String name, String lastname, String number, String email ){        
        this.name = name;
        this.lastname = lastname;
        this.number = number;
        this.email = email;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLastname(){
        return this.lastname;
    }
    
    public String getNumber(){
        return this.number;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    
    public void setNumber(String number){
        this.number = number;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    

    public void print(){
        System.out.println("------------------------------------------------------");
        System.out.println( "Name: " + this.name + "; LastName: "+this.lastname );
        System.out.println( "Phone number: " + this.number + "; Email: "+this.email );
        System.out.println("------------------------------------------------------\n");
    }
    
    public String getValueInString(){
        return this.name +"," + this.lastname +"," + this.number +"," + this.email +"\n";
    }
}
