import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class HolaMundoSwing {

    public static void main(String[] args) {
        // Crear un nuevo marco (ventana)
        JFrame frame = new JFrame("Hola Mundo Swing");

        // Configurar el cierre del programa cuando se cierra la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear una etiqueta con el texto "Hola Mundo"
        JLabel label = new JLabel("Hola Mundo");

        // Establecer el diseño de la cuadrícula para el marco
        frame.setLayout(new GridLayout(1, 1));

        // Agregar la etiqueta al marco
        frame.add(label);

        // Ajustar automáticamente el tamaño de la ventana para adaptarse al contenido
        frame.pack();

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}

