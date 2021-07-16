package Proyecto_final.clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author franciscobecerra
 */
//NAME | LASTNAME | PHONE | EMAIL
public class ReadFilesContacts {

    static private final String CONTACTS_FILE_NAME = "contacts.m2101";
    static ArrayList<Contacts> CONTACTS = new ArrayList<Contacts>();
    static private ReadFiles READ = new ReadFiles();

    public ReadFilesContacts() {
        read();
    }

    public static void add( String name, String lastname, String number, String email ){
        CONTACTS.add(new Contacts(name, lastname, number, email));
        write();
    }
    
    public static void read() {
        ArrayList<String> AUX = READ.read( CONTACTS_FILE_NAME, new ArrayList<String>() );
        String[] contact;

        for (String aux : AUX) {
            contact = aux.split(",");
            CONTACTS.add(new Contacts(contact[0], contact[1], contact[2], contact[3]));
        }
    }
    
    public static void update( String fullname, String name, String lastname, String number, String email ){
        int indexContact = findIndex( fullname );
        Contacts contact = new Contacts(name, lastname, number, email);
        
        CONTACTS.set( indexContact, contact );
        write();
    }
    
    public static void delete( String fullName ){
        Contacts aux = find( fullName );
        CONTACTS.remove(aux);
        write();
    }
    
    public static ArrayList<Contacts> get() {
        return CONTACTS;
    }

    public static Contacts find( String fullName ){
        Contacts aux = null;
        try{
            for (Contacts contact : CONTACTS) {
                if( fullName.equals( contact.getName() +" "+ contact.getLastname() ) ){
                    aux = contact;
                }
            }
        }catch( Exception e ){
            
        }
        return aux;
    }
    
    public static int findIndex( String fullName ){
        int aux = -1;
        
        for (int x = 0; x < CONTACTS.size(); x++) {
            if( fullName.equals( CONTACTS.get(x).getName() +" "+ CONTACTS.get(x).getLastname() ) ){
                aux = x;
            }
        }
        return aux;
    }
        
    public static void print() {
        for (Contacts contact : CONTACTS) {
            contact.print();
        }
    }
    
    public static String[] contactToString(  ){
        ArrayList<String> aux = new ArrayList<String>();
        
        for (Contacts contact : CONTACTS) {
            aux.add( contact.getValueInString() );
        }
        
        String[] res = new String[ aux.size() ];
        for (int i = 0; i < aux.size(); i++)
            res[i] = aux.get(i);

        return res;
    }
    
    public static void write(){
        READ.write( CONTACTS_FILE_NAME, contactToString() );
    }
}
