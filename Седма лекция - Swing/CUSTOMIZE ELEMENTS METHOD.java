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
		addBorders();
	}