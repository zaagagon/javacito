import java.util.Scanner;

public class FuncionSuma {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("Digite primer numero");
        int a= entrada.nextInt();
        System.out.println("Digite segundo numero");
        int b= entrada.nextInt();
        suma(a, b);
    }
    //funcion suma
    public static void suma(int a,int b) {
       // int a,b,c;
        int c= a+b;
        //imprimir el valor de la operacion
        System.out.print(c);
    
    }
}
