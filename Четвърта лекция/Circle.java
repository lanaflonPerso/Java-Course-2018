package fourth;

import third.Point;

public class Circle implements Figura, Comparable{
	int r;
	Point p=new Point();
	
	public Circle() {}
	public Circle(int r, Point p) {
		this.r=r;
		this.p=p;
	}
	
	public String toString() {
		return "("+r+","+p+")";
	}
	@Override
	public double area() {
		return Math.PI*r*r;
	}
	@Override
	public int perimeter() {
		return (int) (2*Math.PI*r);
	}
	public int compareTo(Object ob) {
		Figura p=(Figura) ob;
		return (int)(area() - p.area());
	}
}
