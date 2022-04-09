

import java.text.NumberFormat.Style;



import java.util.Scanner;
public class ejemplito {
    public static void main(String[] args) {
        System.out.println("Hola aprendiendo estructurada");

        Scanner teclado = new Scanner(System.in);
        System.out.println("digite su nombre");
        String nombre = teclado.nextLine();

        System.out.println("hola " + nombre);

        //llamamos el metodo mostrar

        mostrar("hola Enrique desde el metodo  mostrar");

    }
    //metodo mostrar
    public static void mostrar(String string){

        System.out.println(string);
    }
    
}
