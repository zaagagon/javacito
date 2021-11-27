import java.util.Scanner;
/*
Razonamiento
posicion (i,j) fila i columna j
* * *(1,1) (1,2) (1,3)
* *{(2,1),{2,2}} i es 2 y j cambia aqui usamos el segundo for
* (3,1)
se logra evidenciar que la columna la serie es 3 2 1 es decir fila -1
3 -2
2-1
1
*/

public class aster2{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in); 
        System.out.println("Numero de filas del triangulo");
        int fila= teclado.nextInt(); 
        //solucion con dos for
        for(int i=1;i<=fila;i++){
            //fila--;
         // System.out.println(fila);
         //Solucion del triangulo inverso fila -i
         //
            for(int j=1;j<=fila-i;j++){
                
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    

    
}


