

import javax.swing.JOptionPane;

public class HolaG{
 
 public static void main(String args[]){
  
  String nombre;
  nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?");

  String saludo = "Hola " + nombre; 

  JOptionPane.showMessageDialog(null, saludo);
  
  System.out.println("Hola "+nombre);
 }
}
