import javax.swing.BorderFactory; //a
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
 
class hellograf2 {    //b  
 
    public static void main(String[] args) {                     //c
        JFrame frame = new JFrame("Hola Mundo en Swing");        //d
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //e
 
        JLabel label = new JLabel("Hola Mundo", JLabel.CENTER);                //f
        Border empty = BorderFactory.createEmptyBorder(100, 100, 100, 100);    //g
        label.setBorder(empty);                                                //h
 
        frame.getContentPane().add(label);    //i
 
        frame.pack();                         //j
        frame.setLocationRelativeTo(null);    //k
        frame.setVisible(true);               //l
    }
}
