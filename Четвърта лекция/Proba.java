package fourth;

import java.util.Arrays;

import third.Point;

public class Proba {

	public static void main(String[] args) {
		Square s1=new Square(4);
		Square s2=new Square();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Lice s1="+s1.area());
		Triangle t1=new Triangle(2,3,4);
		System.out.println("t1="+t1);
		System.out.println(t1.area());
		Circle c1=new Circle(4,new Point());
		System.out.println("c1="+c1);
		System.out.println(c1.area());
		Figura [] Arr= {s1, s2, t1, c1, new Square(5), new Circle(2, new Point(2,3))};
		for( Figura element : Arr)
			System.out.print(element+" ");
		System.out.println();
		Arrays.sort(Arr);
		System.out.println("After sorting...");
		for( Figura element : Arr)
			System.out.print(element+" ");
		System.out.println();
		try {
			int k=s1.compareTo("aaa");
			System.out.println(k);
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
