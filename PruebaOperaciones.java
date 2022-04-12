//import //java.lang.ref.Cleaner;

import java.util.*;
public class PruebaOperaciones {

   
   
public static void main(String a[] ) {
    //objeto de la clase Printer
    Printer k = new Printer(null);
    String name ="yolis";
    //invocamos metodo printer
    //problema no recibiendo dos parametros
    //creamos otro metodo para que reciba un solo parametro
    //sobrecarga de parametros
    //revisar ...
    //invocamos el metodo ClearConsole de la clase limpiar
    limpiar.ClearConsole();
    //declaramos la variable clase 
   // String teclado;
    //instancia de la clase Scanner
    Scanner teclado = new Scanner(System.in);
    //sobrecarga de metodos en la clase printer
    k.printer("Digite su nombre : ");
    String nombre = teclado.nextLine();

    limpiar.ClearConsole();
    //
    k.printer("Bienvenido : ", nombre);
    k.printer("Probando operaciones con metodo de la clase Printer un parametro");
    System.out.println("Aprendiendo clases invocacion de metodos");

    Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
       
       while(!salir){
           
           System.out.println("1. Imprimr con el metodo printer");
           System.out.println("2. Opcion 2");
           System.out.println("3. Opcion 3");
           System.out.println("4. Salir");
           
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
           
           switch(opcion){
               case 1:
                    //invocar metodo printer
                  // System.out.println("Has seleccionado la opcion 1");
                  k.printer("Metodo printer de la clase Printer"); 
                  break;
               case 2:
                    //invocar metodo limpiar pantalla
                   System.out.println("Has seleccionado la opcion 2");
                   break;
                case 3:
                //invocar metodo suma
                   System.out.println("Has seleccionado la opcion 3");
                   break;
                case 4:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
           
       }
       
    }
    
}

    

