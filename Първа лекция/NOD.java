package first;

public class NOD {

	public static void main(String[] args) {
		int A=96, B=88;
		while(A!=B) {
			if(A>B) A=A-B;
			if(B>A) B=B-A;
		}
		System.out.println("NOD="+A);
	}

}
