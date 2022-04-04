//cmd + b para ventana completa codigo
public class retorno {

    public static void main(String[] args) {
        //instancias objeto de la clase rectangulo

        rectangulo r = new rectangulo(2.0,5,0);
        System.out.println("area"+ r.calcular());
        
    }

    //creamos la clase rectangulo
    class rectangulo {
        private double base, altura;
        //metodo medidas
        public medidas(double b, double h)
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
    
}
