import javax.swing.*;
import java.awt.*;

public class main {

	public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(820,820);
        frame.setVisible(true);
        
        frame.setTitle("Calculator Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setResizable(false);
        
        frame.getContentPane().setBackground(Color.BLACK);
    }
}
