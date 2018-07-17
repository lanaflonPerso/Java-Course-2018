package sixst;

import java.io.*;

public class ObjectWrite {

	public static void main(String[] args) {
		try {
			ObjectOutputStream out=
					new ObjectOutputStream(new FileOutputStream("Test.java"));
			out.writeInt(99);
			out.writeDouble(Math.PI);
			out.writeObject("Hello");
			out.writeObject(new MyData(4,"Ivan"));
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
