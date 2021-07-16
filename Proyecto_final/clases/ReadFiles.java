/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_final.clases;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franciscobecerra
 */
public class ReadFiles {

    public static ArrayList<String> read(String FILE_NAME, ArrayList<String> DATA) {
        
        File file = new File( "./src/proyecto_final/data/" + FILE_NAME );
        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(ReadFiles.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                DATA.add(st);
            }
            br.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFiles.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(ReadFiles.class.getName()).log(Level.SEVERE, null, ex);
        }

        return DATA;
    }

    public static void write( String FILE_NAME, String[] DATA ) {     
        try {
            FileWriter file = new FileWriter( "./src/proyecto_final/data/" + FILE_NAME );

            for( String data : DATA ){
                file.write( data );
            }
            System.out.println( "Successfully wrote to the file: "+FILE_NAME );
            file.close();
            
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void print(ArrayList<String> DATA) {
        for (String x : DATA) {
            System.out.println(x);
        }
    }

//    public static void main(String[] args) {
//        ArrayList<String> DATA = new ArrayList<String>();
//        
//        read( "users.m2101", DATA );
//        read( "contacts.m2101", DATA );
//        
//        print( DATA );
//    }
}
