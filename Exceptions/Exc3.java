class Exc3 {
	static void subroutine() {
		int d = 0;
		int a = 10 / d;
	}
	public static void main(String args[]) {
		try{
			subroutine();
			System.out.println("Tozi red nqma da se izpylni");
		} catch(ArithmeticException exc) {
			System.out.println("Delenie na nula");
		} finally {
			System.out.println("Tozi red shte se izpylni vinagi");
		}
	}
}