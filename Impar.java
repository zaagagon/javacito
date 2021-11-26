import java.util.Scanner;


//programa para definir si un numero es impar
public class Impar {
   public static void main(String[] args) {
       //Debemos importar el paquete util.*
       Scanner teclado =new Scanner(System.in);
       
       System.out.println("Digite un numero para saber si es impar");
    int n =teclado.nextInt();
    if(n%2!=0){
        System.out.print(n+" Es un numero impar"+"\n");
      
    } else
    System.out.print("No es impar");


   }
        
    }

