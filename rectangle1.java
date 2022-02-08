//programa que imprime cuadro de asteriscos

import java.util.Scanner;

//razonamiento de Rectangulo

//El área del rectángulo se define como: Área = Largo · Ancho.
/* 
* *
* *

llenamos por filas o por columnas
cuadrado = lado x lado

fila = lado

*/

//clase y nombre de archivo deben ser iguales
public class rectangle1 {
    public static void main(String[] args) {
        //definicion de variable
        int base=6;
        //instancia entrada
        Scanner entrada= new Scanner(System.in);
        System.out.println("Programa que dibuja un RECTANGULO");
        System.out.println(" ** Digite cualquier caracter para dibujar el cuadro **");
        System.out.println("Digite la altura del Rectangulo: ");
        //solucion con dos for
       //fila tamaño del lado del cuadrado
       //variable altura
        int altura = entrada.nextInt();
        Scanner dato= new Scanner(System.in);
        System.out.println("digite el caracter para llenar el rectangulo ");
        //creamos la variable caracter
        String caracter =dato.nextLine();
        System.out.println();
         //usamos dos banderas
         //ejemplo fila = 6
         //cuadrado es 6x6
        for(int i=1;i<=altura;i++){
            //podemos dibujar un rectangulo 
            //si solicitamos dos lados
        
            for(int j=1;j<=base;j++){
                //podemos recibir el caracter que deseamos llenar el cuadrado
                //variable que llena el rectangulo
                //variable

                System.out.print(" "+caracter+" ");
               
            }
            System.out.println("\n");
        }
        //area del rectangulo
        //valor constante

        int area = 6*altura;

        System.out.println("Base del rectangulo: "+ 6);
        System.out.println("Altura del Rectangulo:" + altura);
        //Color al texto en java
        System.out.println("El Area del Rectangulo es : "+ area);

    }
    
}

