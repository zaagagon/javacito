//programa que usa Scanner para recibir datos

import java.util.Scanner;

public class fullname {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite su nombre completo : ");
        //usamos en esta ocasion nextline para recibir
        // los espacios en blanco ingresados por teclado
        String completo=teclado.nextLine();
        System.out.println("Bienvenido " + completo);
    }
}
