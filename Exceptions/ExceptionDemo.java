class MyException extends Exception {
	private int detail;
	MyException(int a) {
		detail = a;
	}
	public String toString() {
		return "MyException[" + detail + "]";
	}
	}
class ExceptionDemo {
	static void compute(int a) throws MyException { // обявяваме, че този метод може да хвърли грешка от тип MyException
		System.out.println("Called compute(" + a + ")");
		if(a > 10) {
			throw new MyException(a);//хвърляме грешка и подаваме аргумент
		}
		System.out.println("Normal exit");
	}
	public static void main(String args[]) {
	try {
		compute(1);
		compute(20);
	} catch (MyException e) {
		System.out.println("Caught " + e);
	}
	}
}