import java.util.Scanner;

public class Suma2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite el numero1 : ");

        int n1 = teclado.nextInt();
        //la funcion printer recibe enteros
        Printer.printer(n1);
        //declaramos e inicializamos n2
        int n2=6;
        //se llama el metodo suma
        suma(n1, n2);
    }

    public static void suma(int n1,int n2) {
        //Declaramos e inicializamos la variable C
        int c = n1+n2;
        //usamos return
    Printer.printer(c);
        
    }
    
}
