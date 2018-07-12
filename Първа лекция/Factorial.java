package first;

public class Factorial {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++)
			System.out.println(i+"!="+fact2(i));
	}
	
	public static long fact2(int N) {
		if(N==0) return 1;
		else return N * fact2(N-1);
	}
	
	public static long fact1(int N) {
		long F=1;
		if(N==0) return F;
		else{
			for(int i=1; i<=N; i++)
				F=F*i;
			return F;
		}
	}

}
