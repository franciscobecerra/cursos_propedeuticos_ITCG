/*
    8.	
    Investigar el método random de la clase Math de Java para poderlo aplicar. 
    El programa estará dividido en dos opciones:  
    
    a)	Contra la computadora: 
    el programa debe obtener un número al azar entre 0 y 100. 
    Una vez que lo tenga el usuario debe de “adivinar” este 
    número por lo que el usuario dará un número (validar que sea número) 
    y el programa le dirá si es mayor o menor, ejemplo: 

    Adivine el número. 
    Intento 1: 32 
    Es mayor que 32 Intento 2: 80 
    Es menor que 80 Intento 3: 70 
    Es mayor que 70 
    Intento 4: 72 
    Correcto. Adivinaste en 4 intentos. 

    b)	El programa adivina: 
    en este caso, el usuario pensará un número, y sin hacer trampa, 
    el programa adivinará el número. Cada vez que el programa haga 
    un intento, el usuario debe ingresar <, > o =, dependiendo si el 
    intento es menor, mayor o correcto. 

    La estrategia que debe seguir el programa es recordar siempre cuáles 
    son el menor y el mayor valor posibles, y siempre probar con el valor 
    que está en la mitad. 

    Por ejemplo, si usted piensa el número 82, y no hace trampa al jugar, 
    la ejecución del programa se verá así: 

    Intento 1: 50 
    > 
    Intento 2: 75 
    > 
    Intento 3: 88 
    < 
    Intento 4: 81 
    > 
    Intento 5: 84 
    < 
    Intento 6: 82 
    = 
    Adiviné en 6 intentos B-) 
 */
package actividades;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author franciscobecerra
 */
public class Actividad8 {
    public static void autor( int num, String name ){
        System.out.println("\nActividad #"+num+": "+name+"\n");
        
        System.out.println("programa elaborado por francisco becerra para la materia");
        System.out.println("de Programacion en los cursos propedeuticos de posgrado ");
        System.out.println("en ciencias computacionales\n");
    }
      
    static void vs_computer(){
        Scanner sc= new Scanner(System.in);
        Random r = new Random();
        
        int answer;
        int con = 1;
        int num = +r.nextInt(101);
        
        System.out.println("\nAdivine el número");
        System.out.print("Intento "+ con +": ");
        answer = Integer.parseInt( sc.nextLine() );
        
        while( answer != num ){
            con++;
            
            if( num > answer ){
                System.out.print("Es mayor que " + answer + " Intento " + con + ": ");
            }
            if( num < answer ){
                System.out.print("Es menor que " + answer + " Intento " + con + ": ");
            }
            answer = Integer.parseInt( sc.nextLine() );
        }
        System.out.println("\nCorrecto! Adivinaste a los  " + con + " Intentos, la respuesta es  " + answer + "! :D ");
        System.out.println("preciona cualquier tecla para continual ...");
        sc.nextLine();
    }
    
    static void guess(){
        Scanner sc= new Scanner(System.in);
        int guess = new Random().nextInt(101), top = 101, bot = 0, con = 0;
        String answer = "";
        
        System.out.println("\n[2] Adivinando el numero");
        
        while( !answer.equals("=") ){
            con++;
            
            System.out.println( "Intento " + con +": "+guess );
            answer = sc.nextLine();
            
            if( answer.equals(">") ){ bot = guess; }
            if( answer.equals("<") ){ top = guess; }
            
            guess = (int) ( top + bot ) / 2;            
        }
        
        System.out.println( "\nAdiviné en "+ con +" intentos :D!!");
        System.out.println("preciona cualquier tecla para continual ...");
        sc.nextLine();
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        boolean ban = true;
        
        autor(8, "Adivine el número & El programa adivina");
        
        while(ban){
            System.out.println("\n#############################");
            System.out.println("#           JUEGO           #");
            System.out.println("#############################\n");
            
            System.out.println("seleciona el tipo de juego..\n");
            
            System.out.println("[1] Contra la computadora:");
            System.out.println("[2] El programa adivina:");
            
            try{
                int answer = Integer.parseInt( sc.nextLine() );
                
                switch( answer ){
                    case 1: {
                        vs_computer();
                        break;
                    }
                    case 2: {
                        guess();
                        break;
                    }
                    default: {
                        System.out.println("\nEL PROGRAMA A TERMINADO CORRECTAMENTE");
                        ban = false;
                        break;
                    }
                }
                
            }catch( Exception e ){
                System.out.println("ERROR EN LA EJECUCION, RESPUESTA ERRONEA");
                break;
            }
        }
    }
}
