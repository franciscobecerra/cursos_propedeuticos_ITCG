/*
    9.
    Escribir un programa que encuentre dos cadenas introducidas 
    por teclado que sean anagramas. Se considera que dos cadenas 
    son anagramas si contienen exactamente los mismos caracteres, 
    ya sea en el mismo o en diferente orden; 
    
    ignorar los blancos y considerar que mayúsculas y minúsculas son iguales. 
    
    Por ejemplo: “esponja” y “japones” poseen las mismas letras 
    pero en diferente orden.  

 */
package actividades;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author franciscobecerra
 */
public class Actividad9 {
    
    public static void autor( int num, String name ){
        System.out.println("\nActividad #"+num+": "+name+"\n");
        
        System.out.println("programa elaborado por francisco becerra para la materia");
        System.out.println("de Programacion en los cursos propedeuticos de posgrado ");
        System.out.println("en ciencias computacionales\n");
    }
      
    static String setUpCad( String cad ){
        cad = cad.replace(" ", "");
        return cad.toUpperCase();
    }
    
    static boolean checkCad( String cad1, String cad2 ){        
        int aux = 0;
        
        if( cad1.length() != cad2.length() ){ return false; }
        
        for( char c1 : cad1.toCharArray() ){
            for( char c2 : cad2.toCharArray() ){
                if ( c2 == c1 ){
                    aux = cad2.indexOf(c1);
                    cad2 = cad2.substring(0,aux) + cad2.substring( aux+1, cad2.length() );
                    break;
                }
            }
        } 
        
        return cad2.length() == 0;
    }
    
    public static void main( String args[] ){
        Scanner in = new Scanner(System.in);
        
        autor(9, "Encontrar cadenas anagramas");
        
        System.out.println("Programa 9");
        System.out.println("Encontrar cadenas anagramas\n");
        
        System.out.println("Ingresa la primera cadena");
        String cad1 = in.nextLine();
        
        System.out.println("Ingresa la segunda");
        String cad2 = in.nextLine();
        
        if( checkCad( setUpCad(cad1), setUpCad(cad2) ) ){
            System.out.println( "\nSON ANAGRAMAS" );
        }else{
            System.out.println( "\nLO SIENTO, NO SON ANAGRAMAS "+cad1+" y "+cad2 );
        }
        
    }
}
//System.out.println("");