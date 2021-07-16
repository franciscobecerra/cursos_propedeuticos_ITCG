package Proyecto_final.clases;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author franciscobecerra
 */
public class ReadFilesUsers {
    static private final String USER_FILE_NAME = "users.m2101";
    static ArrayList<Users> USERS;
    static ReadFiles READ = new ReadFiles();
     
    public ReadFilesUsers(){
        USERS = new ArrayList<Users>();
        read();
    }
    
    public static void add( String user, String password ){
        USERS.add( new Users( user, password ));
        write();
    }

    public static void read(){
        ArrayList<String> AUX = READ.read( USER_FILE_NAME, new ArrayList<String>() );
        String[] user;
        
        try{
            for (String aux : AUX) {
                user = aux.split(",");
                USERS.add( new Users( user[0], user[1] ) );
            }
        }catch( Exception e ){}
    }
    
     public static void update( String user, String password  ){
        int index = findIndex( user );
        Users newUser = new Users(user, password);
        
        USERS.set( index, newUser );
        write();
    }
    
    
    public static void delete( String user ){
        Users aux = find( user );
        USERS.remove(aux);
        write();
    }
    
    public static Users find( String userName ){
        Users aux = null;
        try{
            for (Users user : USERS) {
                if( userName.equals( user.getUser() )){
                    aux = user;
                }
            }
        }catch( Exception e ){
            
        }
        return aux;
    }
    
    public static int findIndex( String user ){
        int aux = -1;
        
        for (int x = 0; x < USERS.size(); x++) {
            if( user.equals( USERS.get(x).getUser() )){
                aux = x;
            }
        }
        return aux;
    }
    
    public static void print(){
        int con = 0;
        for( int x = 0; x < USERS.size(); x++ ){
            System.out.print( con+" "+USERS.get(x).getValueInString() );
            con ++;
        }
    }
    
    public static boolean login( String user, String password ){
        boolean auth = false;            
        
        for( Users i : USERS ){
            if( i.getUser().equals(user) && i.getPassword().equals(password) ){
                auth = true;
            }
        }

        return auth;
    } 
    
    public static String[] contactToString(  ){
        ArrayList<String> aux = new ArrayList<String>();
        
        for (Users user : USERS) {
            aux.add( user.getValueInString() );
        }
        
        String[] res = new String[ aux.size() ];
        for (int i = 0; i < aux.size(); i++)
            res[i] = aux.get(i);

        return res;
    }
    
    public static void write(){
        READ.write( USER_FILE_NAME, contactToString() );
    }
}
