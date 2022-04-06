//cmd + b para ventana completa codigo

//conceptos
//clase
//objeto o instancia
//constructor
//metodo
//funcion

public class retorno2 {

    //llamado a la funcion principal
    public static void main(String arg[]) {
        //instancias objeto de la clase rectangulo
    
    Rectangulo r = new Rectangulo(5.0,7.0);
        System.out.println( r.calcular());
        
    }
    
    //creamos la clase rectangulo
    }

//clase rectangulo
class Rectangulo {
    private double base, altura;
    //
    /*
    la principal característica de este 
    tipo de métodos es que llevan el mismo nombre de la clase, */
    //Constructor rectangulo
    public Rectangulo(double b, double h)
    {
        //creamos las variables
        base=b;
        altura=h;
    }
    //metodo calcular
    public double calcular()
    {
        return base*altura;
    }
}



