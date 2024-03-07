

public class Index {

    

    public static void main(String[] args) {
        System.out.println("Hola");

        Persona persona= new Persona();

        persona.Apellido="Londoño";
        persona.setNombre("marcos");

        //mostrar atributo publico 
        System.out.println(persona.Apellido);
        System.out.println(persona.getNombre());
    }
    
}
