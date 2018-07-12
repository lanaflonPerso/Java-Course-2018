package first;

public class ReverseIt {

	public static void main(String[] args) {
		String src="Today is a very good day!";
		System.out.println(rev(src));
	}
	
	public static String rev(String s) {
		int len=s.length();
		StringBuilder dest=new StringBuilder(len);
		for(int i=len; --i>=0; ) {
			char ch=s.charAt(i);
			dest.append(ch);
		}
		return dest.toString();
	}

}
