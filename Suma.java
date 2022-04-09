public class Suma {
    //Atributos de la clase
    int num1, num2, total;
    
    //Constructor de la clase
    Suma(int x, int y)
    {
    num1=x;
    num2=y;
    }
    
    //Método de la clase
    public void sumar()
    {
    total=num1+num2;
    System.out.println("Suma = "+total);
    }
    }
