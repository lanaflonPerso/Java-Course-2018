package sixst;

import java.io.*;

public class ProbaInputs {

	public static void main(String[] args) {
		BufferedReader in=
				new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Input: ");
		String str="";
		try {
			while(!(str=in.readLine()).equals("stop")) {
				System.out.println(str);
			}
			in.close();
		}catch (IOException e) {
			e.printStackTrace();}
	
	}

}
