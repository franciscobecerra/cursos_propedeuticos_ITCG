/*
    4. 
    Elaborar un programa que calcule la tabla de multiplicar 
    de un número entero N, solicitar N y el rango que se desea 
    obtener, realizar el cálculo de la multiplicación y las 
    impresiones en diferentes métodos.
 */
package actividades;
import java.util.Scanner;
/**
 *
 * @author franciscobecerra
 */
public class Actividad4 {
    public static void autor( int num, String name ){
        System.out.println("\nActividad #"+num+": "+name+"\n");
        
        System.out.println("programa elaborado por francisco becerra para la materia");
        System.out.println("de Programacion en los cursos propedeuticos de posgrado ");
        System.out.println("en ciencias computacionales\n");
    } 
    static void print( String out ){ System.out.println( out ); }
    static void make_table(int n, int start, int end){
        System.out.println("_________________________________");
        for( int x = start; x <= end; x++ ){
            System.out.printf("|  %d  |  x  |  %d  |  =  |  %2d  |\n", x, n, ( x*n ) );
        }
        System.out.println("_________________________________");
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner( System.in );
        autor(4, "Calcular tabla de multiplicar");
        try{
            print("\nIngresa el valor de N");
            int n = Integer.parseInt( in.nextLine() );
            
            print("\nDesde: ");
            int start = Integer.parseInt( in.nextLine() );
            
            print("Hasta:");
            int end = Integer.parseInt( in.nextLine() );
            
            make_table( n, start, end );
            
        }catch(Exception e){
            print("HA OCURRIDO UN ERROR EN EL PROGRAMA");
        }
    }
}
