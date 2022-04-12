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
    System.out.println("Aprend");
    
    
}

    
}
