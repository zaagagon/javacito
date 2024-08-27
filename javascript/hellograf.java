//revisar
package com.popularfan.ejemplo1;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class hellograf {

  public static void main(String[] args) {

    JFrame ventana = new JFrame("Ventana Principal");
    JPanel panel = new JPanel();
    JLabel etiqueta = new JLabel("¡ Hola Mundo !");

    panel.add(etiqueta);
    ventana.setContentPane(panel);
    ventana.setSize(320,200);
    ventana.setVisible(true);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}