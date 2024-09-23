import javax.swing.JOptionPane;

public class HolaG2{
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Digite su nombre","datos");
		JOptionPane.showMessageDialog(null, "Hello " + name);

        // Con JCombobox
Object seleccion = JOptionPane.showInputDialog(
    unComponentePadre,
    "Seleccione opcion",
    "Selector de opciones",
    JOptionPane.QUESTION_MESSAGE,
    unIcono,  // null para icono defecto
    new Object[] { "opcion 1", "opcion 2", "opcion 3" }, 
    "opcion 1");
 
 System.out.println("El usuario ha elegido "+seleccion);
	}
}
