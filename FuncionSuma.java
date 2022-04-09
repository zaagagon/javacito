//importamos el paquete util

import java.util.Scanner;

//import Printer;

public class FuncionSuma {
    public static void main(String[] args) {

        //ingreso de datos
        Scanner entrada= new Scanner(System.in);

       System.out.println("Digite primer numero");
       //FuncionSuma.Printer("Digite primer numero");
        //tomamos los datos ingresados por teclado
        int a= entrada.nextInt();
        System.out.println("Digite segundo numero");
        int b= entrada.nextInt();
        //llamado del metodo o funcion suma
        suma(a, b);
    }
    //funcion suma
    public static void suma(int a,int b) {
       // int a,b,c;
        int c= a+b;
        //imprimir el valor de la operacion
        //para quitar el % de la salida es posible con el salto de linea
        System.out.print("El resultado de la operacion es : " + c +"\n");
    
    }
}
//cmd +shift+p para activar menu alterno o consola