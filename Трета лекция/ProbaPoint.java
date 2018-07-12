package third;

import java.util.Arrays;

public class ProbaPoint extends Object{

	public static void main(String[] args) {
		Point p1=new Point(2,3);
		Point p2=new Point();
		Point p3=new Point(2,3);
		Point p4=new Point(4);
		System.out.println("p1="+p1);
		System.out.println("p2="+p2);
		System.out.println("p3="+p3);
		System.out.println("p4="+p4);
		System.out.println(p1.equals(p3));
		System.out.println(Point.dist2(p1,p2));
		//System.out.println(p2.kvadrant(new Point(-4,-4)) );
		Point[] P = {p1, p2, p3, p4, new Point(-3,-4), new Point(-1,0)};
		for( Point p: P) {
			System.out.print(p +" ");
		}
		System.out.println();
		Arrays.sort(P);
		System.out.println("After sorting:");
		for( Point p: P) {
			System.out.print(p +" ");
		}
		System.out.println();

	}

}
