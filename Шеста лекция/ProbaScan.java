package sixst;

import java.util.Scanner;

public class ProbaScan {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str;
	System.out.println("Input:");
	while((str=scan.nextLine()).length()>0) {
		System.out.println(str);
	}
   }
}
