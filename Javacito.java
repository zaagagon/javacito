/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package javacito;

/**
 *
 * @author ticsero
 */
public class Javacito {
    
    
     // Definiendo un constructor explícito
    public Javacito() {
        System.out.println("Constructor definido por el usuario.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Javacito javacito = new Javacito();
         Javacito javacito2 = new Javacito();
        // Salida: Constructor definido por el usuario.
        //public
        // TODO code application logic here
        //creacion variable
        String nombre = "Iron man";
        System.out.println("hola soy yo");
        System.out.println("hola ..." + nombre);
        if (args.length > 0) {
            System.out.println("Argumento recibido: " + args[0]);
        }
        
        // Crear una instancia de la clase Saludo
        Javacito saludo = new Javacito();

        // Llamar al método mostrarSaludo para mostrar el mensaje
        saludo.mostrarSaludo();
       
        
        
    }
    
    // Método para mostrar un mensaje de saludo
    public void mostrarSaludo() {
        System.out.println("¡Hola! Bienvenido a la programación IV en Java.");
    }
    
}

