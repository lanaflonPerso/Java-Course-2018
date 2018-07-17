package zeroexample;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import firstexample.ButtonApp;

public class MyApp extends JFrame  {
	JLabel label = new JLabel("Label!!!");
	JButton button = new JButton("Button!!");
	public MyApp(String title) {
		super(title);
		
		add(label,BorderLayout.LINE_START);
		add(button,BorderLayout.LINE_END);
	}
	
	public static void main(String [] args) {
		
		JFrame frame = new MyApp("MyApp");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400,100);
		frame.setVisible(true);
	}
	
	
}
