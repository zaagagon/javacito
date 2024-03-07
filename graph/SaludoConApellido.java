import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaludoConApellido extends JFrame {

    private JTextField apellidoField;
    private JLabel saludoLabel;

    public SaludoConApellido() {
        // Configurar el marco
        super("Saludo con Apellido");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes
        JLabel apellidoLabel = new JLabel("Ingrese su apellido:");
        apellidoField = new JTextField();
        JButton saludarButton = new JButton("Saludar");
        saludoLabel = new JLabel("");

        // Configurar el diseño de la cuadrícula
        setLayout(new GridLayout(4, 1));

        // Agregar componentes al marco
        add(apellidoLabel);
        add(apellidoField);
        add(saludarButton);
        add(saludoLabel);

        // Configurar el evento del botón
        saludarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saludar();
            }
        });
    }

    private void saludar() {
        String apellido = apellidoField.getText();
        String saludo = "Hola, " + ((apellido.isEmpty()) ? "Mundo" : apellido) + "!";
        saludoLabel.setText(saludo);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase SaludoConApellido
        SaludoConApellido app = new SaludoConApellido();

        // Configurar el tamaño de la ventana
        app.setSize(400, 200);

        // Hacer visible la ventana
        app.setVisible(true);
    }
}

