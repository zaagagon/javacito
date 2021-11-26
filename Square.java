import java.util.Scanner;

//razonamiento de cuadrado de asteriscos
/* 
* *
* *
llenamos por filas o por columnas

*/

public class Square {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite el numero de astericos :");
        int fila = entrada.nextInt();
        System.out.println();
        for(int i=1;i<=fila;i++){
         
            for(int j=1;j<=fila;j++){
                System.out.print(" *  ");
               
            }
            System.out.println("\n");
        }

    }
    
}
