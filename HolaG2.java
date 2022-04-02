import javax.swing.JOptionPane;

public class HolaG2{
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Type your name please");
		JOptionPane.showMessageDialog(null, "Hello " + name);
	}
}
