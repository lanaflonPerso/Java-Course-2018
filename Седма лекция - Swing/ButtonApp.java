package firstexample;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonApp extends JFrame {
	private JButton helloButton = new JButton("Hello"),
    		howdyButton = new JButton("Howdy");
    private JTextField textField = new JTextField(15);
	private ActionListener buttonListener = new ButtonListener(textField);
	
	public ButtonApp(String name) {
		super(name);
		helloButton.addActionListener(buttonListener);
		howdyButton.addActionListener(buttonListener);
		setLayout(new FlowLayout());
		add(helloButton);
		add(howdyButton);
		add(textField);
	}
	
	public static void main(String[] args) {
	JFrame frame = new ButtonApp("ButtonApp");
	frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	frame.setSize(400,100);
	frame.setVisible(true);
	}  

}
