package pizzaapp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;
public class OrderActionListener implements ActionListener, ChangeListener {
	JButton controlButton;
	public OrderActionListener(JButton controlButton){
		this.controlButton = controlButton;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		controlButton.doClick();
		
	}
	@Override
	public void stateChanged(ChangeEvent arg0) {
		controlButton.doClick();
		
	}

}
