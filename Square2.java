//programa que imprime cuadro de asteriscos

import java.util.Scanner;

//razonamiento de cuadrado de asteriscos
/* 
* *
* *

llenamos por filas o por columnas
cuadrado = lado x lado

fila = lado

*/

public class Square2 {
    public static void main(String[] args) {
        //instancia entrada
        Scanner entrada= new Scanner(System.in);
        System.out.println("programa que dibuha cuadro de asteriscos");
        System.out.print("Digite cualquier caracter para dibujar el cuadro");
        System.out.println("Digite el numero de Astericos :");
        //solucion con dos for
       //fila tamaño del lado del cuadrado
        int fila = entrada.nextInt();
        System.out.println();
         //usamos dos banderas
         //ejemplo fila = 6
         //cuadrado es 6x6
        for(int i=1;i<=fila;i++){
            //
         
            for(int j=1;j<=fila;j++){
                //podemos recibir el caracter que deseamos llenar el cuadrado

                System.out.print(" @  ");
               
            }
            System.out.println("\n");
        }

    }
    
}
