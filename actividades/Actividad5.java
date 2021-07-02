/*
    5. 
    Utilizando dos clases, escribir un programa que capture en 
    un arreglo de 10 elementos enteros, luego recorra el arreglo 
    e indique si el elemento es un número primo o no, imprimiendo 
    también la casilla en la que se encuentra ese número primo. 

    Recordando que un número entero es primo si es divisible sólo 
    por la unidad y por sí mismo.
 */
package actividades;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author franciscobecerra
 */
public class Actividad5 {
    public static void autor( int num, String name ){
        System.out.println("\nActividad #"+num+": "+name+"\n");
        
        System.out.println("programa elaborado por francisco becerra para la materia");
        System.out.println("de Programacion en los cursos propedeuticos de posgrado ");
        System.out.println("en ciencias computacionales\n");
    }
      
    public static void main(String args[]){
        Numbers nums = new Numbers();
        Check check = new Check();
        
        autor(5,"Números primos o no");
        
        nums.fill_array();
        int[] array = nums.getNumbers();
        
        check.is_prime( array );
    }
}

class Numbers{
    public static int[] num;
    Numbers(){
        num = new int[10];
    }
    static void fill_array(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresa 10 numero enteros");
        for( int x = 0; x < num.length; x++ ){
            try{
                System.out.print("Ingresa el valor #"+(x+1)+": ");
                num[x] = Integer.parseInt( in.nextLine() );
            }catch(Exception e){
                System.out.println("HAS INGRESADO VALORES DIFEERENTES A NUMEROS ENTEROS");
            }
        }
    }
    static int[] getNumbers(){
        return num;
    }
}

class Check{
    static void is_prime( int[] nums ){
        System.out.println();
        for( int x = 0; x < nums.length; x++ ){
            System.out.println( "["+ x +"]  " + nums[x] + "  |  " + ( x%2 == 0 ) );
        }
        System.out.println();
    }
}

