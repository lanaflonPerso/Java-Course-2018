package sixst;

import javax.swing.JOptionPane;

public class ProbaText {
	public static void main(String[] args) {
		String str;
		
		while((str=JOptionPane.showInputDialog("Input:")).length()>0) {
			System.out.println(str);
		}
	   }
}
