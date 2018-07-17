package sixst;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectRead {

	public static void main(String[] args) {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("Test.java"));
			int k=in.readInt();
			double pi=in.readDouble();
			String w=(String) in.readObject();
			System.out.println(k+", "+pi+", "+w);
			System.out.println((MyData)in.readObject());
			in.close();
				
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
	} catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
}

}
