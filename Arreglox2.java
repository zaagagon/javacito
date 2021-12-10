public class Arreglox2 {

 public static void main(String args[])
    {
        // declararamos  e inicializamos el arreglo bidimensional
        int arreglo[][] = { {1,3,7},{2,4,6},{5,8,9} };
 
        // Accedemos al arreglo bidimensional con dos para recorrer el arreglo
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arreglo[i][j] + " ");
 
            System.out.println("\n");
        }
    }
}