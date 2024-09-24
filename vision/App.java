

public class App {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Suma
        Calculadora calc = new Suma();
        double resultado = calc.operar(4, 5);

        // Imprimimos el resultado
        System.out.println("El resultado es: " + resultado);
    }
}

