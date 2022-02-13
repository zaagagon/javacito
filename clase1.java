import java.util.*;

public class clase1 {

    public static void main(String[] args) {
        System.out.println("prueba");
        //int a = 4;
        int b =6;
   

        System.out.println(" **Programa que suma dos numeros *");
       //objeto instancia teclado tipo Scanner
       Scanner teclado = new Scanner(System.in);
       System.out.println("cual es su nombre :");
       String nombre = teclado.nextLine();
       System.out.println("Digite dos numeros : ");
       //llamamos la instancia teclado
       int X=teclado.nextInt();
       int Y=teclado.nextInt();

       int Z = X+Y;


        System.out.println(nombre + " el Resultado de la suma : " + Z);
         
        

    }
    
}
