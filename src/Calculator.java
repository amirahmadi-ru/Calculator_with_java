import javax.swing.*;
import java.awt.*;

public class Calculator {
		JFrame frame;
		
	public Calculator(){
		JFrame frame;
		
	}
	
	public void setupAndShowMainFrame(){
		frame = new JFrame("Calculator");
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        
	}
	
	public void createAndShowButtons(){

		JButton buttonNumber1 = new JButton("1");
		JButton buttonNumber2 = new JButton("2");
		JButton buttonNumber3 = new JButton("3");
		JButton buttonAdd = new JButton("+");

		buttonNumber1.setBounds(40,240,50,40);
		buttonNumber2.setBounds(110,240,50,40);
		buttonNumber3.setBounds(180,240,50,40);
		buttonAdd.setBounds(250,240,50,40);
		
		frame.add(buttonNumber1);
		frame.add(buttonNumber2);
		frame.add(buttonNumber3);
		frame.add(buttonAdd);
		
	}
}