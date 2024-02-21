import java.util.Scanner;

public class Arearectangulo {
    public static void main(String[] args) {
        Arearectangulo calculo = new Arearectangulo();
        //crear objeto datos
        Scanner datos = new Scanner(System.in);
        
        System.out.println("digite el ancho: ");
        double ancho = datos.nextDouble();
        System.out.println("digite la longitu: ");
        double longitud = datos.nextDouble();

        System.out.println((ancho*longitud));
        //llamando el metodo estatico sin crear objeto
        double resultado= calculo.area(10,7);
        System.out.println((resultado));
        
        //cerramos el objeto
        datos.close();
        
    }
    //metodo no estatico requiere crear objeto
public double area(double ancho, double longitud){
    return ancho*longitud;
}
}
