/*
 * 
    1. Elaborar un programa que calcule el salario de un empleado:
    Utilizando un método para darlo de alta, los datos a solicitar 
    son:

    - No. Empleado, 
    - Nombre, 
    - Dirección, 
    - salario por hora 

    y otro método para calcular su salario, recibiendo como parámetro el 
    número de horas trabajadas y retornando el cálculo del salario.
 */
package actividades;
import java.util.*;  
/**
 *
 * @author franciscobecerra
 */
public class Actividad1 {
    
    public static int no_emp = 0;
    public static String name = "";
    public static String address = "";
    public static int salary = 0;
    
    public static void autor( int num, String name ){
        System.out.println("\nActividad #"+num+": "+name+"\n");
        
        System.out.println("programa elaborado por francisco becerra para la materia");
        System.out.println("de Programacion en los cursos propedeuticos de posgrado ");
        System.out.println("en ciencias computacionales\n");
    }
            
    public static void Register(){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("\nPOR FAVOR INGRESA LOS SIGUIENTES DATOS");
        
        System.out.println("Numero de empleado:");
        no_emp = Integer.parseInt( sc.nextLine() );
        
        System.out.println("Nombre:");
        name = sc.nextLine();
        
        System.out.println("Direccion:");
        address = sc.nextLine();
        
        System.out.println("Salario por hora:");
        salary = Integer.parseInt( sc.nextLine() );
        
        System.out.println("\nUSUARIO REGISTRADO CON EXITO\n"); 
        System.out.println("preciona alguna tecla para continuar.....");
        sc.nextLine();
    }
    
    public static void Calculate(){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("\nIngresa las horas completas trabajadas:");
        int res = Integer.parseInt( sc.nextLine() );
        
        System.out.println( "\nA " + name + " le corresponden \n$" + res * salary +" MXN\n" ); 
        System.out.println("preciona alguna tecla para continuar.....");
        sc.nextLine();
    }
    
    public static void Menu(){
        Scanner sc= new Scanner(System.in);
        
        autor(1, "Elaborar un programa que calcule el salario de un empleado");
        
        while(true){
            System.out.println("#############################");
            System.out.println("#           MENU            #");
            System.out.println("#############################\n");
            
            System.out.println("selecciona una opcion..\n");
            
            System.out.println("[1] Registras un empleado");
            System.out.println("[2] Calcular su salario");
            
            try{
                int answer =  sc.nextInt();
                
                switch( answer ){
                    case 1: {
                        Register();
                        break;
                    }
                    case 2: {
                        Calculate();
                        break;
                    }
                    default: { 
                        System.exit(0);
                        break;
                    }
                }
            }catch( Exception e ){
                System.out.println("\nEL PROGRAMA A TERMINADO CORRECTAMENTE");
                break;
            }
        }
    }
      
    public static void main( String args[] ){
        Menu();
    }
}
