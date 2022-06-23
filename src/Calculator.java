import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{
	
		JFrame frame;
		JButton buttonNumber1;
		JButton buttonNumber2;
		JButton buttonNumber3;
		JButton buttonAdd;
		JButton buttonNumber4;
		JButton buttonNumber5;
		JButton buttonNumber6;
		JButton buttonMulti;
		JButton buttonNumber7;
		JButton buttonNumber8;
		JButton buttonNumber9;
		JButton buttonDiv;
		JButton buttonDecimal;
		JButton buttonZero;
		JButton buttonEqual;
		JButton buttonMines;
		JButton buttonDelete;
		JButton buttonClear;
		JTextField textField;
		
	public Calculator(){
		
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
		
		textField = new JTextField();
		textField.setBounds(30,40,280,45);
		frame.add(textField);
		
		//--------------------------------------
		// 1 - 2 - 3 - +
		
		buttonNumber1 = new JButton("1");
		buttonNumber2 = new JButton("2");
		buttonNumber3 = new JButton("3");
		buttonAdd = new JButton("+");
		
		buttonNumber1.addActionListener(this);
		buttonNumber2.addActionListener(this);
		buttonNumber3.addActionListener(this);
		buttonAdd.addActionListener(this);
		

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
		
		buttonNumber4 = new JButton("4");
		buttonNumber5 = new JButton("5");
		buttonNumber6 = new JButton("6");
		buttonMulti = new JButton("*");
		
		buttonNumber4.addActionListener(this);
		buttonNumber5.addActionListener(this);
		buttonNumber6.addActionListener(this);
		buttonMulti.addActionListener(this);
		
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
		
		buttonNumber7 = new JButton("7");
		buttonNumber8 = new JButton("8");
		buttonNumber9 = new JButton("9");
		buttonDiv = new JButton("/");
		
		buttonNumber7.addActionListener(this);
		buttonNumber8.addActionListener(this);
		buttonNumber9.addActionListener(this);
		buttonDiv.addActionListener(this);
		
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
		
		buttonDecimal = new JButton(".");
		buttonZero = new JButton("0");
		buttonEqual = new JButton("=");
		buttonMines = new JButton("-");
		
		buttonDecimal.addActionListener(this);
		buttonZero.addActionListener(this);
		buttonEqual.addActionListener(this);
		buttonMines.addActionListener(this);
		
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
		
		buttonDelete = new JButton("Delete");
		buttonClear = new JButton("Clear");
		
		buttonDelete.addActionListener(this);
		buttonClear.addActionListener(this);
		
		buttonDelete.setBounds(60,380,100,40);
		buttonClear.setBounds(180,380,100,40);

		frame.add(buttonDelete);
		frame.add(buttonClear);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == buttonNumber1){
			textField.setText(textField.getText().concat("1"));
		}
		if(e.getSource() == buttonNumber2){
			textField.setText(textField.getText().concat("2"));
		}
		if(e.getSource() == buttonNumber3){
			textField.setText(textField.getText().concat("3"));
		}
		if(e.getSource() == buttonAdd){
			System.out.println("buttonadd");
		}
		
		//--------------------------------------
		
		if(e.getSource() == buttonNumber4){
			textField.setText(textField.getText().concat("4"));
		}
		if(e.getSource() == buttonNumber5){
			textField.setText(textField.getText().concat("5"));
		}
		if(e.getSource() == buttonNumber6){
			textField.setText(textField.getText().concat("6"));
		}
		if(e.getSource() == buttonMulti){
			System.out.println("buttonmulti");
		}	
		
		//--------------------------------------
		
		if(e.getSource() == buttonNumber7){
			textField.setText(textField.getText().concat("7"));
		}
		if(e.getSource() == buttonNumber8){
			textField.setText(textField.getText().concat("8"));
		}
		if(e.getSource() == buttonNumber9){
			textField.setText(textField.getText().concat("9"));
		}
		if(e.getSource() == buttonDiv){
			System.out.println("buttondiv");
		}
		
		//--------------------------------------
		
		if(e.getSource() == buttonDecimal){
			textField.setText(textField.getText().concat("."));
		}
		if(e.getSource() == buttonZero){
			textField.setText(textField.getText().concat("0"));
		}
		if(e.getSource() == buttonEqual){
			System.out.println("buttonequal");
		}
		if(e.getSource() ==  buttonMines){
			System.out.println("buttonmines");
		}
		
		//--------------------------------------
		
		if(e.getSource() == buttonDelete){
			System.out.println("buttondelete");
		}
		if(e.getSource() == buttonClear){
			System.out.println("buttonclear");
		}
		
		
	}
}