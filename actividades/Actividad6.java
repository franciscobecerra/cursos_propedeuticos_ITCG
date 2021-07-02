/*
    6. Elaborar un programa que lea una cadena de hasta 
    10 caracteres que represente un número romano e imprima 
    el formato de ese número y su equivalente en numeración 
    arábiga; los caracteres romanos y sus equivalentes son:

    |    I   |     1  |
    |    V   |     5  |
    |    X   |    10  |
    |    L   |    50  |
    |    C   |   100  |
    |    D   |   500  |
    |    M   |  1000  |
    Ejemplo LXXXVI(86)
*/
package actividades;
import java.util.Scanner;
/**
 *
 * @author franciscobecerra
 */
public class Actividad6 {
    public static void autor( int num, String name ){
        System.out.println("\nActividad #"+num+": "+name+"\n");
        
        System.out.println("programa elaborado por francisco becerra para la materia");
        System.out.println("de Programacion en los cursos propedeuticos de posgrado ");
        System.out.println("en ciencias computacionales\n");
    }
      
    static int get_value(int letter){
        switch(letter){
            case 73: return 1;     //I
            case 86: return 5;     //V
            case 88: return 10;    //X
            case 76: return 50;    //L
            case 67: return 100;   //C
            case 68: return 500;   //D
            case 77: return 1000;  //M
            default: { 
                System.out.println("\nLOS VALORES INGRESADOS NO SON VALIDOS");
                System.exit(0); 
                return 0;
            }
        }
    }   
    
    static void check_value(String num){
        int sum = 0;
        for( int x : num.toCharArray() ){
            sum += get_value(x);
        }
        System.out.print(num + " (" + sum + ")");
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner( System.in );
        
        autor(6, "Números romanos y arábicos");
        
        System.out.println("Ingresa los numeros romanos");
        String num = in.nextLine();
        
        if( num.length() > 10 ){
            num = num.substring(0,10);
        }
        
        check_value( num );
    }
}
