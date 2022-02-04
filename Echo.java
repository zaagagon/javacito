 import java.io.*;
public class Echo {
    //error corregido con throws IOException
public static void main (String[] args) throws IOException {
    //creamos un instancia
BufferedReader entradaEstandar = new BufferedReader (new InputStreamReader(System.in));
String mensaje;
System.out.println ("Introducir una linea de texto:");
 mensaje = entradaEstandar.readLine();
 //Salida en pantalla
 System.out.println ("Introducido: \"" + mensaje + "\"");
} }
