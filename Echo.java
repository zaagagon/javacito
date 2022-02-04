 import java.io.*;
public class Echo {
public static void main (String[] args) throws IOException {
BufferedReader entradaEstandar = new BufferedReader (new InputStreamReader(System.in));
String mensaje;
System.out.println ("Introducir una linea de texto:");
 mensaje = entradaEstandar.readLine();
 System.out.println ("Introducido: \"" + mensaje + "\"");
} }
