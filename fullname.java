//programa que usa Scanner para recibir datos

//Java proporciona en el paquete java. util una clase que se denomina Scanner 

import java.util.Scanner;

public class fullname {
    //funcion principal

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite su nombre completo : ");
        //usamos en esta ocasion nextline para recibir
        // los espacios en blanco ingresados por teclado
        String completo=teclado.nextLine();

        //imprime en pantalla
        System.out.println("Bienvenido " + completo);
    }
}
