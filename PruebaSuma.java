import java.util.Scanner;
public class PruebaSuma {
    public static void main(String a[])

    {   //String nombre;
        //creamos dos instancias de dos clases
        Printer b= new Printer(null);
        Printer p= new Printer(null);
        Suma s=new Suma(4,2);

        Operaciones r = new Operaciones(25,32);
    //dos metodos
    r.sumar();
   s.sumar(); 
   Scanner teclado = new Scanner(System.in);
        System.out.println("digite su nombre :");
        String nombre = teclado.nextLine();
      p.printer("bienvenido " , nombre);
       
        String name = "alejo";
       // b.printer(nombre);
   b.printer("hola : ",name);
   System.out.println(s);
    
    }
    }
    
    
