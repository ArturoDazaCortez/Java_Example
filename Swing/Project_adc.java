/*
 * Author:  Lunix
 * Created: 
*/
import javax.swing.*;
public class Project_adc
{
  public static void main(String[] args)
  {
    JFrame f = new JFrame("Titulo de ventana");
    //f.setSize(600, 397);
    f.setExtendedState(JFrame.MAXIMIZED_BOTH);
    f.setContentPane(new JLabel(new ImageIcon("imagenes/Img1.jpg")));
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    f.setVisible(true);
  }
}
