import java.util.Scanner;
/*
Razonamiento
posicion (i,j) fila i columna j
*(1,1)
* *{(2,1),{2,2}} i es 2 y j cambia aqui usamos el segundo for

*/

public class aster {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in); 
        System.out.println("Numero de filas del triangulo");
        int fila= teclado.nextInt(); 
        //solucion con dos for
        for(int i=1;i<=fila;i++){
          
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    

    
}

//note: sudo java HolaMundo.java
//permite ejecutar el archivo
