package pizzaapp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class PizzaApp extends JFrame  {
	private JTextArea orderSummary = new JTextArea(10,20);
	private JSlider pizzaSize; // Ще създадем обект при натстройването
	private JComboBox<String> pizzaType = new JComboBox<>();
	private JPanel leftPanel = new JPanel(),
			rightPanel = new JPanel(),
			toppingPanel = new JPanel();
	private JCheckBox addCheese = new JCheckBox("Add cheese?");
	private JCheckBox addOlives = new JCheckBox("Add olives?");
	private JCheckBox addPeppers = new JCheckBox("Add peppers?");
	private JCheckBox addPepperoni = new JCheckBox("Add pepperoni?");
	private JTextField comment = new JTextField();
	private JButton submitOrder = new JButton("Submit Order");
	private OrderActionListener orderListener = new OrderActionListener(submitOrder);
	public PizzaApp(String title) {
		super(title);
		setLayouts();
		customizeElements();
		addElementsToInterface();
		addBorders();
	}
	
	private void setLayouts(){
		setLayout(new FlowLayout());
		toppingPanel.setLayout(new BoxLayout(toppingPanel,BoxLayout.X_AXIS));
		leftPanel.setLayout(new BoxLayout(leftPanel,BoxLayout.Y_AXIS));
		rightPanel.setLayout(new BoxLayout(rightPanel,BoxLayout.Y_AXIS));
	}
	private void addElementsToInterface(){
		
		leftPanel.add(new JLabel("Pizza type:"));
		leftPanel.add(pizzaType);
		leftPanel.add(new JLabel("Pizza Size:"));
		leftPanel.add(pizzaSize);
		leftPanel.add(new JLabel("Extra toppings:"));
		toppingPanel.add(addCheese);
		toppingPanel.add(addOlives);
		toppingPanel.add(addPeppers);
		toppingPanel.add(addPepperoni);
		leftPanel.add(toppingPanel);
		leftPanel.add(new JLabel("Comment:"));
		leftPanel.add(comment);
		leftPanel.add(submitOrder);
		/* Bounce fix
		JPanel panel = new JPanel();
		panel.add(new JLabel("Order Summary:"));
		rightPanel.add(panel);
		*/
		rightPanel.add(new JLabel("Order Summary:"));
		rightPanel.add(orderSummary);
		add(leftPanel);
		add(rightPanel);
		
	}
	private void customizeElements(){
		customizePizzaType();
		customizePizzaSize();
		submitOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String order = "Pizza type: " + (String)pizzaType.getSelectedItem() + "\n" +
						"Pizza size: " + pizzaSize.getValue() + " inch\n" + 
						"Extra toppings: ";
				if(addCheese.isSelected()){
					order += "\n + extra cheese";
				}
				if(addOlives.isSelected()){
					order += "\n + extra olives";
				}
				if(addPeppers.isSelected()){
					order += "\n + extra peppers";
				}
				if(addPepperoni.isSelected()){
					order += "\n + extra pepperoni";
				}
				order += "\nComment: " + comment.getText() + "\n";
				order += "Bill: " + calculateBill();
				
				orderSummary.setText(order);
			}
			
			private double calculateBill(){
				double bill = 0;
				switch((String)pizzaType.getSelectedItem()) {
				case "Margherita":
					switch(pizzaSize.getValue()){
					case 10:
						bill += 10;
						break;
					case 15:
						bill += 13.5;
						break;
					case 20:
						bill += 15;
						break;
					}
					break;
				case "Capricciosa":
					switch(pizzaSize.getValue()){
					case 10:
						bill += 13.5;
						break;
					case 15:
						bill += 15;
						break;
					case 20:
						bill += 17.5;
						break;
					}
					break;
				case "Pepperoni":
					switch(pizzaSize.getValue()){
					case 10:
						bill += 14;
						break;
					case 15:
						bill += 16.5;
						break;
					case 20:
						bill += 18;
						break;
					};
					break;
				case "Quattro Formaggi":
					switch(pizzaSize.getValue()){
					case 10:
						bill += 15;
						break;
					case 15:
						bill += 17;
						break;
					case 20:
						bill += 19;
						break;
					}
					break;
				}
				if(addCheese.isSelected()){
					bill += 1.25;
				}
				if(addOlives.isSelected()){
					bill += 1;
				}
				if(addPeppers.isSelected()){
					bill += 1.5;
				}
				if(addPepperoni.isSelected()){
					bill += 2;
				}
				return bill;
			}
		
		});

	}
	
	private void addBorders(){
		leftPanel.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10),BorderFactory.createCompoundBorder( new EtchedBorder(),new EmptyBorder(10, 10, 10, 10))));
		rightPanel.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10),BorderFactory.createCompoundBorder( new EtchedBorder(),new EmptyBorder(10, 10, 10, 10))));
	}
	private void customizePizzaSize(){
		int minSize = 10;
		int maxSize = 20;
		int startSize = 15;
		pizzaSize = new JSlider(minSize,maxSize,startSize);
		pizzaSize.setMajorTickSpacing(5);
		pizzaSize.setPaintTicks(true);
		pizzaSize.setPaintLabels(true);
		pizzaSize.setSnapToTicks(true);
		pizzaSize.addChangeListener(orderListener);
		
	}
	private void customizePizzaType(){
		pizzaType.addItem("Margherita");
		pizzaType.addItem("Capricciosa");
		pizzaType.addItem("Pepperoni");
		pizzaType.addItem("Quattro Formaggi");
		pizzaType.addActionListener(orderListener);
	}

	public static void main(String [] args) {
		
		JFrame frame = new PizzaApp("Pizza Order Form");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(800,300);
		frame.setVisible(true);
	}
	
	
}
