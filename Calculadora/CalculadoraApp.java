package Operaciones;

public class CalculadoraApp {
    
    public static void main(String[] args) {
        //creamos un objeto de la clase suma
        Calculadora calc = new Suma();
        double resultado=calc.operar(4, 5);

        System.out.println(resultado);
    }
}
