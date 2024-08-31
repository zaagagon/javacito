//package programita;

/**
 * La clase Profesor representa a un profesor con un nombre y un identificador único.
 */
public class Profesor {
    // Atributos privados de la clase Profesor
    private String nombre;      // Nombre del profesor
    private String idProfesor;  // Identificador único del profesor
    private String materia;  // Identificador único del profesor

    /**
     * Constructor de la clase Profesor.
     *
     * @param nombre     Nombre del profesor.
     * @param idProfesor Identificador único del profesor.
     */
    public Profesor(String nombre, String idProfesor,String materia, String referencia) {
        this.nombre = nombre;
        this.idProfesor = idProfesor;
        this.materia=materia;
        System.out.println("objeto creado : " + referencia+ this.nombre);
        //Podemos llamar el metodo desde el constructor especial
        mostrarInfo();
        mostrar();
    }
    
    // Aquí podría agregar más métodos personalizados, si lo desea.

    // Método para mostrar la información del profesor
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (ID: " + idProfesor + ") " + materia);
    }

    public void mostrar() {
        System.out.println(String.format("Profesor: %s\nID: %s\nmateria: %s", nombre, idProfesor, materia));
    }
}

