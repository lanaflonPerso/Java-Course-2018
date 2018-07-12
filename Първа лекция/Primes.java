package first;

public class Primes {

	public static void main(String[] aa) {
		int count=1;
		System.out.println("2 is prime");
		for(int i=3;count<30; i++)
			if(prime(i)) { 
				System.out.println(i+ " Prime number");
				count++;
			}
			
	}
	
	public static boolean prime(int N) {
		int i;
		for(i=2; i<N; i++) {
			if (N % i == 0) break;
		}
		return (i==N);
	}

}
