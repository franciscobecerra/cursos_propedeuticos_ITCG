/*
    7. Se desea conocer de un texto capturado por teclado, 
    cuántas vocales, consonantes y dígitos se tienen. 
    
    Realizar el programa correspondiente.
 */
package actividades;
import java.util.Scanner;
/**
 *
 * @author franciscobecerra
 */
public class Actividad7 {
    static int[] vowels_array = new int[]{65, 69, 73, 79, 85, 97, 101, 105, 111, 117};
    
    public static void autor( int num, String name ){
        System.out.println("\nActividad #"+num+": "+name+"\n");
        
        System.out.println("programa elaborado por francisco becerra para la materia");
        System.out.println("de Programacion en los cursos propedeuticos de posgrado ");
        System.out.println("en ciencias computacionales\n");
    }
      
    static boolean check_vowels_array( int value ){
        boolean ban = false;
        for( int x : vowels_array )
            if( value == x )
                ban = true;
        return ban;
    }
    
    static void check_letter(String something){
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        
        for( int x : something.toCharArray() ){
            if( check_vowels_array(x) ){
                vowels++;
            }else if( x >= 65 && x <= 90 || x >= 97 && x <= 122 ){
                consonants++;
            }else if( x >= 48 && x <= 57 ){
                digits++;
            }
        }
        System.out.println( something + " tiene:" );
        System.out.println( vowels + " Vacales");
        System.out.println( consonants + " Consonantes");
        System.out.println( digits + " Dígitos");
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner( System.in );
        
        autor(7, "Numero de vocales, consonantes y dígitos");
        
        System.out.println("Escribe algo");
        String something = in.nextLine();
        
        check_letter( something );
    }
}
