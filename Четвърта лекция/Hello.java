package fourth;

public class Hello {

	public static void main(String[] args) {
		try {
			System.out.println("Hello "+ args[0]);
		}catch(Exception e) {
			System.out.println("Hello ...");
		}finally {
			System.out.println("Welcome!");
		}
	}

}
