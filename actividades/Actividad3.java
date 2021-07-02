/*
    3. 
    Un número es perfecto si “la suma de sus divisores excepto 
    el mismo es igual al propio número”. Realice un programa 
    que solicite un número N y diga si es perfecto o no. 
    
    Ejemplo: 
    6, sus divisores son: 3, 2, 1; si sumamos 1 + 2 + 3 = 6, 
    entonces es un número perfecto. 
    
    Utilizar un método para indicar si es perfecto o no, 
    recibiendo el número a evaluar. % 8 = 1 + 2 + 4
 */
package actividades;

import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author franciscobecerra
 */
public class Actividad3 {
    public static Stack<String>s = new Stack<String>();
    
    public static void autor( int num, String name ){
        System.out.println("\nActividad #"+num+": "+name+"\n");
        
        System.out.println("programa elaborado por francisco becerra para la materia");
        System.out.println("de Programacion en los cursos propedeuticos de posgrado ");
        System.out.println("en ciencias computacionales\n");
    }
      
    
    public static void print( String out ){
        System.out.println( out );
    }
    
    public static boolean isInteger(double number) {
        return number % 1 == 0;
    }
    
    public static void isPerfect( int num ){
        int sum = 0;
        
        // divisibles en s        
        for ( int x = num - 1; x > 0; x-- ){
            if( isInteger( (double) num / x ) )
                s.push(Integer.toString(x));
        }
        System.out.println("\nNumero divisibles: "+s);
        
        // sum los divisibles
        for( String x : s )
            sum += Integer.parseInt(x);
        System.out.println("La suma de los divisibles = "+sum);
        
        System.out.println( "El resultado es: " + (sum == num) +"\n" );
    }
    
    public static void main(String a[]){
        Scanner in = new Scanner(System.in);
        
        autor(3, "Encontrar el número perfecto");
        print( "Ingresa el numero 8 para saber si es un numero perfecto:" );
        
        try{
            int num = Integer.parseInt( in.nextLine() );
            isPerfect(num);
        }catch( Exception e ){
            print( "SOLO SE ACEPTAN VALORES NUMERICOS ENTEROS ENTEROS( 1, 2,435, 6342, ...)" );
        }
    }
}
