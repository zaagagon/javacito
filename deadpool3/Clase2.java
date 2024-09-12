package deadpool3;

import java.util.Scanner;

public class Clase2 {

    public static void main(String[] args) {
        //creando objeto datos de scanner
        //palabra reservada es new

        Scanner datos = new Scanner(System.in);
        System.out.println("Digite su nombre : " );
        //Capturar la informacion del usuario
        String nombre = datos.nextLine();
        //concatenar con +
        System.out.println("Hola bienvenido a java : " + nombre);
    }
    
}
