import java.util.Scanner;

//nombre de la clase
public class holita { //archivo y clase deben tener el mismo nombre

    //definir o crear el metodo principal
    public static void main(String[] args) {
        //instruccion 
        //imprimir en pantalla hola
        Scanner nombre = new Scanner(System.in);
            
        System.out.println("Hola, Digite su nombre por favor : ");
        String name =nombre.nextLine();
        for(int i=1;i<=3;i++){
          
          System.out.println(name + " Bievenido ");
        }
        
        
    }
    
}
