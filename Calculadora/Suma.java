package Calculadora;

/**
 * Suma
 */
public class Suma extends Calculadora{
    @Override
    public double operar(double num1, double num2){
        return num1 + num2; //sobreescritura del metodo para sumar
    }

    
}