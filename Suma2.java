//PROGRAMA QUE SUMA DOS NUMEROS EN JAVA
//JAVA Suma2.java

import java.util.Scanner;
//cuantos bloques {} tienes nuestro programa ?


//Clase suma2

public class Suma2 {
    public static void main(String[] args) {
        //usa la clase Scanner y el metodo 
        //creamos el objeto teclado y lo instanciamos
        Scanner teclado = new Scanner(System.in);  //teclado es un objeto del tipo Scanner
        //System.out.print("Digite el numero1 : ");
//otra opcion es 
System.out.println("Programa que suma dos numeros");
System.out.println("Introduzca dos numeros :");
//ahora los leemos los dos numeros
        int n1 = teclado.nextInt();//utilizamos el metodo nextInt de la clase Scanner
        int n2 =teclado.nextInt();
        //la funcion printer recibe enteros
       // Printer.printer(n1);
        //declaramos e inicializamos n2
        //int n2=6;
        //se llama el metodo suma 
        //Este metodo pertenece a la misma clase
        suma(n1, n2);
    }


    //funcion SUMA
    public static void suma(int n1,int n2) {
        //Declaramos e inicializamos la variable C
        int c = n1+n2;
        //usamos return
        System.out.println("El resultado de la suma de los dos numero es :");
    Printer.printer(c);//el metodo printer pertenece a la clase Printer
        
    }
    
}
