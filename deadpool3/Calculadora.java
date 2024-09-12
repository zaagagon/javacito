package deadpool3;

import java.util.Scanner;

public class Calculadora {

    //definición metodo sumar

    public int sumar(int a, int b){

        return a + b;
    }

    //metodo principal

    public static void main(String[] args) {
        
        //creamos objeto de la clase calculadora

        Calculadora calculadora = new Calculadora();

        //crear objeto de la clase scanner - leer entrada del usuario

        Scanner usuario = new Scanner(System.in);
        //pedir numeros la usuario

        System.out.println("ingrese primer numero : ");
        int num1 = usuario.nextInt();

        System.out.println("ingrese segundo numero : ");
        int num2 = usuario.nextInt();

        int resultado = calculadora.sumar(num1, num2);

        System.out.println("el resultado de la operación es : " + resultado );
    }
    
}
