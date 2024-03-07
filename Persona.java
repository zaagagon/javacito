/**
 * Persona
 */
public class Persona {
    private String nombre;
    private String codigo;

    public Persona(){
        System.out.println("soy el constructor");
    }



    public static void main(String[] args) {
       Persona persona1  = new Persona();
       persona1.nombre="Carlos";
       persona1.codigo="123";
        
        System.out.println("hola");
        System.out.println(persona1.nombre);
        System.out.println(persona1.codigo);
    }
}

