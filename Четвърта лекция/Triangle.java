package fourth;

public class Triangle implements Figura, Comparable {
	int a;
	int b;
	int c;
	
	public Triangle() {}
	
	public Triangle(int a, int b, int c) {
		if( (a+b>c) && (a+c>b) && (b+c>a)) {
			this.a=a;
			this.b=b;
			this.c=c;
		}
	}
	public String toString() {
		return "<"+a+","+b+","+c+">";
	}

	@Override
	public double area() {
		double p= perimeter()/2.0;
		return Math.sqrt( (p*(p-a)*(p-b)*(p-c)));
	}

	@Override
	public int perimeter() {
		return a+b+c;
	}
	public int compareTo(Object ob) {
		Figura p=(Figura) ob;
		return (int)(area() - p.area());
	}
}
