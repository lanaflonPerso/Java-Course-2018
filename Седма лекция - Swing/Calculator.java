import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Calculator extends JFrame{
	 JButton sum= new JButton("+");
	 JButton sub= new JButton("-");
	 JButton mult= new JButton("*");
	 JButton div= new JButton("/");
	 
	 JTextField arg1= new JTextField(10);
	 JTextField arg2= new JTextField(10);
	 JTextField res= new JTextField(10);
	 
	 JPanel pan1= new JPanel();
	 JPanel pan2= new JPanel();
	 JPanel pan3= new JPanel();
	 
	 Border b1= BorderFactory.createLineBorder(Color.blue,2);
	 Border b2= BorderFactory.createLineBorder(Color.red,1);
	 Border be1= BorderFactory.createEmptyBorder(3,3,3,3);
	 Border b3= BorderFactory.createCompoundBorder(b1, be1);
	 Border b4= BorderFactory.createCompoundBorder(b3, b2);
	public Calculator(){
		this("");
	}
	
	public Calculator(String name){
		super(name);
		Container cont= this.getContentPane();
		cont.setLayout(new FlowLayout());
		
		cont.add(pan1);
		pan1.add(pan2);
		pan1.add(pan3);
		pan1.setBorder(b4);
		
		pan2.setLayout(new GridLayout(3,1));
		pan2.setBorder(b1);
		
		pan3.setLayout(new GridLayout(4,1));
		pan3.setBorder(b2);
		
		pan3.add(sum);
		pan3.add(sub);
		pan3.add(mult);
		pan3.add(div);
		
		pan2.add(arg1);
		pan2.add(arg2);
		pan2.add(res);
		
	AL al= new AL(this);
		
		sum.addActionListener(al);
		sub.addActionListener(al);
		mult.addActionListener(al);
		div.addActionListener(al);
		
		KL kl= new KL();
		arg1.addKeyListener(kl);
		arg2.addKeyListener(kl);
		
		res.addFocusListener(new FL());
		

	 			
	}
	
	public static void main(String[] args){
		Calculator calc= new Calculator("Super Calculator");
		
		calc.pack();
		calc.setResizable(true);
		calc.show();
	}	
	
	class FL implements FocusListener{
		public void focusGained(FocusEvent e){
			arg1.requestFocus();
		}
		
		public void focusLost(FocusEvent e){}
	}
	
	class KL implements KeyListener{
		public void keyPressed(KeyEvent e){}
		public void keyReleased(KeyEvent e){}
		public void keyTyped(KeyEvent e){
			String s= ((JTextField)e.getSource()).getText();
			char c= e.getKeyChar();	
			System.out.println(c);
			if( "0123456789.+-".indexOf(c) == -1){
				e.consume();	
			}
			if(c == '.'){
				if(s.indexOf('.')>=0)
					e.consume();	
			}
		}	
	}
}

class AL implements ActionListener{
	Calculator c;
	public AL(){}
	public AL(Calculator c){
		this.c= c;
	}
	public void actionPerformed(ActionEvent e){
		Object eo= e.getSource();
		JButton ej= (JButton) eo;
		String t= ej.getText();
		
		String a1= c.arg1.getText();
		if(a1.equals("")){
			a1= "0";
			c.arg1.setText("0");	
		}
		String a2= c.arg2.getText();
		if(a2.equals("")){
			a2= "0";
			c.arg2.setText("0");	
		}
		
		double d1= Double.parseDouble(a1);
		double d2= Double.parseDouble(a2);
		
		double r;
		if(t.equals("+"))
			r= d1 + d2;
		else if(t.equals("-"))
			r= d1 - d2;
		else if(t.equals("*"))
			r= d1 * d2;
		else 
			r= d1 / d2;
			
		c.res.setText(""+r);
	}
}

