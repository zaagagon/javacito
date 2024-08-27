//package programita;

/**
 * La clase Profesor representa a un profesor con un nombre y un identificador único.
 */
public class Profesor {
    // Atributos privados de la clase Profesor
    private String nombre;      // Nombre del profesor
    private String idProfesor;  // Identificador único del profesor

    /**
     * Constructor de la clase Profesor.
     *
     * @param nombre     Nombre del profesor.
     * @param idProfesor Identificador único del profesor.
     */
    public Profesor(String nombre, String idProfesor) {
        this.nombre = nombre;
        this.idProfesor = idProfesor;
    }
    
    // Aquí podría agregar más métodos personalizados, si lo desea.

    // Método para mostrar la información del profesor
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (ID: " + idProfesor + ")");
    }
}

