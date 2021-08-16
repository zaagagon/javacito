//para usar la clase Scanner es necesario importar la biblioteca

import java.util.*;

class HolaMundo{

public static void main(String[] args){

//instrucción que mestra en pantalla 
//mensaje y da salto de linea
System.out.println("Hola mundo");
  
  //cambios realizados remotos freek
  System.out.println("Digite su nombre por favor : ");
  
  String inputkeyboard="";//Creamos y asignamos la variable de entrada de teclado
  
  //creamos un objeto de Scanner
  //invocamos el metodo nextLine() sobre el objeto inputo keyboard
  
  
  Scanner inputscanner = new Scanner(System.in);
  inputkeyboard=inputscanner.nextLine();

  
  
  System.out.println("Bienvenido"+ inputkeyboard);

}


}
