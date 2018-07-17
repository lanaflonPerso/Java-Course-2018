package sixst;

import java.io.*;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class DirFile {

	public static void main(String[] args) {
		File ff=new File("Test.java");
		DecimalFormat form=new DecimalFormat("##,##.##");
		try {
			PrintStream out=new PrintStream (new FileOutputStream(ff));
		for(int F=0; F<=400; F+=10) {
			double C= 5*(F-32)/9.0;
			out.println(F+" F-->"+form.format(C)+" C");
			System.out.println(F+" F-->"+form.format(C)+" C");
//			System.out.println( String.format("%d F--> %.2f C",F,C) );
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
