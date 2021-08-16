//importamos la libreria java.io para la clase BufferedReader
import java.io.*;

class LecturaDatos
{
    public static void  main(String args[]) throws IOException
    {
        float number;
        System.out.println("Ingrese un numero por favor: ");
        try
        {	//Creamos el objeto in para luego usarlo en la instancia br
            InputStreamReader in = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader(in);
	//Podemos tambien crear el objeto de la siguiente manera:
	// BufferedReader br = new BufferedReader(InputStreamReaders(System.in));
            String a = br.readLine();
	//Es necesario hacer un casting para convertir el dato string a valor float
            number = Float.valueOf(a);
            int x = (int)number;

            System.out.println("Your input=" + number);
            System.out.println("Your input in integer terms is = " + x);
        }
        catch(Exception e){
        }
    }
}
