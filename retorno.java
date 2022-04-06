//cmd + b para ventana completa codigo

//clase rectangulo
    class Rectangulo {
        private double base, altura;
        //metodo medidas
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
    


public class retorno {
    public static void main(String arg[]) {
        //instancias objeto de la clase rectangulo

    Rectangulo r = new Rectangulo(5.0,7.0);
        System.out.println( r.calcular());
        
    }

    //creamos la clase rectangulo
}