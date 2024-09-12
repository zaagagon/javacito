package deadpool3;

public class Heroe {
    //atributos
    private String nombre;

    //constructor de la clase
    public Heroe(String nombre){
        this.nombre=nombre;
    }

    //getter nombre
    public String getNombre(){
        return nombre;
    }//metodo mostrar

    public void mostrarInfo(){
        System.out.println("Nombre :" + nombre);
    }


}
