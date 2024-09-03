package deadpool3;

public class Main {

    public static void main(String[] args) {

        //creamos el objeto

        Personaje personaje1= new Personaje("wolverine", "regen");

        //llamamos el metodo

        personaje1.mostrarInfo();
        
    }

    
}
class Personaje {

    private String nombre;
    private String poder;

    public Personaje(String nombre,String poder){

        this.nombre=nombre;
        this.poder=poder;

    }

    public void mostrarInfo(){
        System.out.println(nombre);
    }


}
