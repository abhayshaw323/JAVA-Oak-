import javax.swing.*;
import java.awt.*;

class MyLabel{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        frame.setTitle("My frame");

        Container c = frame.getContentPane();
        c.setBackground(Color.BLUE);

        c.setLayout(null);
        JLabel label = new JLabel("Username");
        label.setBounds(100,50,100,30);
        label.setText("Password");
        c.add(label);
            
    }
}