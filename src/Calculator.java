import javax.swing.*;
import java.awt.*;

public class Calculator {
		JFrame frame;
		
	public Calculator(){
		JFrame frame;
		
	}
	
	public void setupAndShowMainFrame(){
		frame = new JFrame("Calculator");
        frame.setSize(350,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        
	}
	
	public void createAndShowButtons(){
		
		//--------------------------------------
		// TextFiled
		
		JTextField textField = new JTextField();
		textField.setBounds(30,40,280,45);
		frame.add(textField);
		
		//--------------------------------------
		// 1 - 2 - 3 - +
		
		JButton buttonNumber1 = new JButton("1");
		JButton buttonNumber2 = new JButton("2");
		JButton buttonNumber3 = new JButton("3");
		JButton buttonAdd = new JButton("+");

		buttonNumber1.setBounds(40,100,50,40);
		buttonNumber2.setBounds(110,100,50,40);
		buttonNumber3.setBounds(180,100,50,40);
		buttonAdd.setBounds(250,100,50,40);
		
		frame.add(buttonNumber1);
		frame.add(buttonNumber2);
		frame.add(buttonNumber3);
		frame.add(buttonAdd);
		
		//--------------------------------------
		// 4 - 5 - 6 - *
		
		JButton buttonNumber4 = new JButton("4");
		JButton buttonNumber5 = new JButton("5");
		JButton buttonNumber6 = new JButton("6");
		JButton buttonMulti = new JButton("*");
		
		buttonNumber4.setBounds(40,170,50,40);
		buttonNumber5.setBounds(110,170,50,40);
		buttonNumber6.setBounds(180,170,50,40);
		buttonMulti.setBounds(250,170,50,40);
		
		frame.add(buttonNumber4);
		frame.add(buttonNumber5);
		frame.add(buttonNumber6);
		frame.add(buttonMulti);
		
		//--------------------------------------
		// 7 - 8 - 9 - /
		
		JButton buttonNumber7 = new JButton("7");
		JButton buttonNumber8 = new JButton("8");
		JButton buttonNumber9 = new JButton("9");
		JButton buttonDiv = new JButton("/");
		
		buttonNumber7.setBounds(40,240,50,40);
		buttonNumber8.setBounds(110,240,50,40);
		buttonNumber9.setBounds(180,240,50,40);
		buttonDiv.setBounds(250,240,50,40);
		
		frame.add(buttonNumber7);
		frame.add(buttonNumber8);
		frame.add(buttonNumber9);
		frame.add(buttonDiv);		
		
		//--------------------------------------
		// . - 0 - = - -
		
		JButton buttonDecimal = new JButton(".");
		JButton buttonZero = new JButton("0");
		JButton buttonEqual = new JButton("=");
		JButton buttonMines = new JButton("-");
		
		buttonDecimal.setBounds(40,310,50,40);
		buttonZero.setBounds(110,310,50,40);
		buttonEqual.setBounds(180,310,50,40);
		buttonMines.setBounds(250,310,50,40);
		
		frame.add(buttonDecimal);
		frame.add(buttonZero);
		frame.add(buttonEqual);
		frame.add(buttonMines);
		
		//--------------------------------------
		// clear - delete
		
		JButton buttonDelete = new JButton("Delete");
		JButton buttonClear = new JButton("Clear");
		
		buttonDelete.setBounds(60,380,100,40);
		buttonClear.setBounds(180,380,100,40);

		frame.add(buttonDelete);
		frame.add(buttonClear);
		
		
	}
}
