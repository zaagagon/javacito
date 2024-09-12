package deadpool3;

public class SuperPersonaje {

    //atributos o variables
    String nombre;
    String nickname;
    String poder;

    //constructor de la clase
    public SuperPersonaje(String nombre, String nickname,String poder){

        this.nombre=nombre;
        this.nickname=nickname;
        this.poder=poder;
    }

    //metodo mostrar

    public void mostrarInfo(){

        System.out.println("Nombre : " + nombre);
        System.out.println("Nickname : " + nickname);
        System.out.println("Poder : " + poder);

    }

    public static void main(String[] args) {
        SuperPersonaje personaje1= new SuperPersonaje("Wade","Deadpool" ,"3000");
        personaje1.mostrarInfo();
}
}