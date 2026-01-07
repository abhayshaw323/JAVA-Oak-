import javax.swing.*;
import java.awt.*;

class MyFrameDemo{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        frame.setTitle("My frame");

        //ImageIcon icon = new ImageIcon("small_image.png");
        //frame.setIconImage(icon.getImage());

        Container c = frame.getContentPane();
        c.setBackground(Color.BLUE);

        
    }
}