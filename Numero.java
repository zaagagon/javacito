//programa con exception para entrada de un entero con metodo printer
import java.util.InputMismatchException;
import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
       boolean follow;
        do {

            try {
               follow = false;
                Scanner entrada = new Scanner(System.in);
                System.out.println("Digite un numero :");
                int numero = entrada.nextInt();
                //llamamos el metodo printer que imprimi solo numeros
                //que ocurre si ingresan una letra el usuario?
                //Si ello ocurre vamos a recibir la exception
                //InputMismatchException
                //y el programa se interrumpe
                //Para ello vamos a usar la opcion try/catch
                Printer.printer(numero);
            
                    
                } catch (InputMismatchException ex) {
                   follow=true;
                    //TODO: handle exception
                    System.out.println(" * Error - Debe digitar un numero *");
                    //En esta ocasion sale el error pero interrumpe el programa
        
                }
            
        } while (follow);
      
       //finally{ main(args);}

    }
    
}
