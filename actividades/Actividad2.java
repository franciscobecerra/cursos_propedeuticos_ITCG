/*
    2. 
    Elaborar un programa que convierta un número decimal a binario, 
    octal y hexadecimal. Utilizando métodos y variables locales.
 */
package actividades;
import java.util.Scanner;
/**
 *
 * @author franciscobecerra
 */
public class Actividad2 {

    public static void autor( int num, String name ){
        System.out.println("\nActividad #"+num+": "+name+"\n");
        
        System.out.println("programa elaborado por francisco becerra para la materia");
        System.out.println("de Programacion en los cursos propedeuticos de posgrado ");
        System.out.println("en ciencias computacionales\n");
    }
      
    
    public static void print(String out) {
        System.out.println(out);
    }

    public static void Binary(int number) {
        int num = number, res, bin = 0, exp = 0;
        
        while( num != 0 ){
            res = num % 2;
            bin += res * Math.pow(10, exp);
            exp++;
            num/=2;
        }
        print("BASE 02: " + number + "\t => \t " + bin);
    }

    public static void Octal(int number) {
        int num = number, res, oct = 0, exp = 0;
        
        while( num != 0 ){
            res = num % 8;
            oct += res * Math.pow(10, exp);
            exp++;
            num/=8;
        }
        print("BASE 08: " + number + "\t => \t " + oct);
    }

    public static void Hex(int number) {
        int num = number, res, exp = 0;
        String hex = "";
        
        while( num != 0 ){
            res = num % 16;
            hex = numberToLetter(res) + hex;
            num/=16;            
        }
        print("BASE 16: " + number + "\t => \t " + hex);
    }
    
    static String numberToLetter( int num ){
        switch( num ){
            case 10: return "A";
            case 11: return "B";
            case 12: return "C";
            case 13: return "D";
            case 14: return "E";
            case 15: return "F";
            default: return Integer.toString(num);
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        autor(2, "Convier números de decimal a binario, octal y hexadecimal");
        
        try {
            print("Ingresa un numero");
            int num = Integer.parseInt(in.nextLine());
            
            Binary(num);
            Octal(num);
            Hex(num);

        } catch (Exception e) {
            print("SOLO SE ACEPTAN VALORES NUMERICOS ENTEROS ENTEROS( 1, 2,435, 6342, ...)");
        }
    }
}
