/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String menu = "";
        do {
            System.out.println("Elija una de las siguientes opciones:" + "\n" + "\n"
                    + "a) Lista el nombre de todos los productos que hay en la tabla producto." + "\n"
                    + "b) Lista los nombres y los precios de todos los productos de la tabla producto." + "\n"
                    + "c) Listar aquellos productos que su precio esté entre 120 y 202." + "\n"
                    + "d) Buscar y listar todos los Portátiles de la tabla producto." + "\n"
                    + "e) Listar el nombre y el precio del producto más barato." + "\n"
                    + "f) Ingresar un producto a la base de datos." + "\n"
                    + "g) Ingresar un fabricante a la base de datos" + "\n"
                    + "h) Editar un producto con datos a elección." + "\n"
                    + "i) Salir del sistema.");
          
            System.out.println("\n" + "****************************************************");
            System.out.print(">");
            menu = leer.next();
            System.out.println("****************************************************");
            switch (menu.toLowerCase()) {
                case "a":
                    System.out.println("exito");
                    System.out.println( "****************************************************" );
                    break;
                    case "b":
                        System.out.println("exito");
                         System.out.println( "****************************************************");
                    break;
                    case "c":
                    System.out.println("exito");
                     System.out.println( "****************************************************" );
                    break;
                    case "d":
                    System.out.println("exito");
                     System.out.println( "****************************************************");
                    break;
                    case "e":
                    System.out.println("exito");
                     System.out.println( "****************************************************");
                    break;
                    case "f":
                    System.out.println("exito");
                     System.out.println( "****************************************************" );
                    break;
                    case "g":
                    System.out.println("exito");
                     System.out.println( "****************************************************" );
                    break;
                    case "h":
                    System.out.println("exito");
                     System.out.println( "****************************************************" );
                    break;
                    case "i":
                    System.out.println("Decidió salir del sistema, nos vemos pronto.");
                     System.out.println( "****************************************************" + "\n");
                    break;
                    
                default:
                   System.out.println("\n" + "****************************************************" + "\n");
                    System.out.println("Usted ha ingresado un valor no valido!" + "/n");
                    menu = "";
            }
        } while (!menu.equalsIgnoreCase("i"));

    }

}
