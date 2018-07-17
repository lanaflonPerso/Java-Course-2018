package firstexample;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonListener implements ActionListener {
	
	private JTextField controlledField;
	
	public ButtonListener(JTextField controlledField) {
	this.controlledField = controlledField;	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name =  ((JButton)e.getSource()).getText();
  		controlledField.setText(name);
	}
	
}
