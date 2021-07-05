/*
    Proyecto de Publicaciones
    tiene que:

    - Recibir los datos del usuario
    - Realizar un arreglo de Publicacion u objeto
    - Preguntar que tipo de Publiacion quiere guardar

    -------------------------------------------------
    | Libro | Revista | Libro | Periodico | etc ... |
    -------------------------------------------------

 */
package problema_publicacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author franciscobecerra
 */
public class main {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Publicacion> array = new ArrayList<Publicacion>();
    static String user;

    static void publish_book() {
        System.out.println("\nPUBLICANDO : LIBRO\n");

        System.out.print("TITULO: ");
        in.nextLine(); String title = in.nextLine();

        System.out.print("AUTOR: ");
        String autor = in.nextLine();

        System.out.print("PRECIO ( ejemplo: 9.99 ): ");
        double price = in.nextDouble();

        System.out.print("NUMERO DE PAGINAS ( ejemplo: 45 ): ");
        int no_pages = in.nextInt();

        System.out.print("ISBN ( ejemplo: 999-8-77-999): ");
        in.nextLine(); String isbn = in.nextLine();

        System.out.print("EDICION ( ejemplo: 8a ): ");
        String edicion = in.nextLine();

        array.add(new Libro(title, autor, price, no_pages, isbn, edicion));
    }

    static void publish_magazine() {
        System.out.println("\nPUBLICANDO : REVISTA\n");

        System.out.print("TITULO: ");
        in.nextLine(); String title = in.nextLine();

        System.out.print("AUTOR: ");
        String autor = in.nextLine();

        System.out.print("PRECIO ( ejemplo: 9.99 ): ");
        double price = in.nextDouble();

        System.out.print("NUMERO DE PAGINAS ( ejemplo: 45 ): ");
        int no_pages = in.nextInt();

        System.out.print("PERIODICIDAD ( en dias, ejemplo: 15 ): ");
        int periodicidad = in.nextInt();

        System.out.print("ISSN ( ejemplo: 999-8-77-999): ");
        in.nextLine(); String issn = in.nextLine();

        System.out.print("NUMERO ( numero enteros ): ");
        int numero = in.nextInt();

        array.add(new Revista(title, autor, price, no_pages, periodicidad, issn, numero));
    }

    static void publish_newspaper() {
        System.out.println("\nPUBLICANDO : PERIODICO\n");

        System.out.print("TITULO: ");
        in.nextLine();String title = in.nextLine();

        System.out.print("AUTOR: ");
        String autor = in.nextLine();

        System.out.print("PRECIO ( ejemplo: 9.99 ): ");
        double price = in.nextDouble();

        System.out.print("NUMERO DE PAGINAS ( ejemplo: 45 ): ");
        int no_pages = in.nextInt();

        System.out.print("PERIODICIDAD ( en dias, ejemplo: 15 ): ");
        int periodicidad = in.nextInt();

        Date date = null; in.nextLine();
        
        while (date == null) {
            try {
                System.out.println("FECHA DE PUBLIACION ( DD/MM/YYYY, ejemplo: 01/12/2021): ");
                String aux = in.nextLine();
                date = new SimpleDateFormat("dd/MM/yyyy").parse(aux);

            } catch (ParseException ex) {
                System.out.println("---------------------------------------------------------");
                System.out.println("  FECHA INCORRECTA, POR FAVOR INGRESAR UNA FECHA VALIDA  ");
                System.out.println("---------------------------------------------------------\n");
                date = null;
            }
        }

        array.add(new Periodico(title, autor, price, no_pages, periodicidad, date));
    }

    static void print_publishes() {
        System.out.println("\nPUBLIACIONES REALIZADAS");
        
        Iterator<Publicacion> i = array.iterator();

        System.out.println();
        while (i.hasNext()) {
            Publicacion elemento = i.next();
            
            if( elemento instanceof Libro ){
                Libro aux = (Libro) elemento;
                aux.getAllInformation();
            }
            
            if( elemento instanceof Revista ){
                Revista aux = (Revista) elemento;
                aux.getAllInformation();
            }
            
            if( elemento instanceof Periodico ){
                Periodico aux = (Periodico) elemento;
                aux.getAllInformation();
            }
        }
        
        if( array.size() == 0 ){
            System.out.println("NO EXISTE NINGUN REGISTO :(");
        }
        
        System.out.println("\npreciona cualquier tecla para continuar ...");
        in.nextLine();in.nextLine();
    }

    public static void main(String args[]) {
        System.out.println("\nBienvenido a la editorial del ITCG");
        System.out.println("Dentro de este portal podras publicar tus Revistas, Libros o Periodicos\n");
        
        System.out.println("Pero primero ay que darce de alta");
        System.out.println("Ingresa tu nombre completo");
        user = in.nextLine();

        System.out.println("\nBIENVENIDO " + user + "\n");
        System.out.println("+ Reglas: ");
        System.out.println("  Al momento de llenar los campos, valia que esten correctos");
        System.out.println("  ya que si no lo estan, el sistema te sacar ... :O\n");

        while (true) {
            System.out.println("##############################");
            System.out.println("#       EDITORIAL ITCG       #");
            System.out.println("##############################\n");

            System.out.println("escoge una opcion de publiacion ...\n");

            System.out.println("[1] LIBRO");
            System.out.println("[2] REVISTA");
            System.out.println("[3] PERIODICO");
            System.out.println("[4] VER TODAS MIS PUBLIACIONES");
            System.out.println("[*] preciona cualquier otra tecla para salir");

            try {
                int answer = in.nextInt();

                switch (answer) {
                    case 1: {
                        publish_book();
                        break;
                    }
                    case 2: {
                        publish_magazine();
                        break;
                    }
                    case 3: {
                        publish_newspaper();
                        break;
                    }
                    case 4: {
                        print_publishes();
                        break;
                    }
                    default: {
                        System.exit(0);
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("\nEL PROGRAMA A TERMINADO CORRECTAMENTE");
                System.out.println(e);
                break;
            }
        }
    }
}
