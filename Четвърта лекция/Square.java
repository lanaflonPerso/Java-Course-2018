package fourth;

public class Square implements Figura, Comparable{
	int a;
	
	public Square() {}
	public Square(int a) {
		this.a=a;
	}
	
	public String toString() {
		return "["+a+"]";
	}
	@Override
	public double area() {
		return a*a;
	}
	@Override
	public int perimeter() {
		return 4*a;
	}
	@Override
	public int compareTo(Object ob) {
		if (! (ob instanceof Figura)) 
			throw  new MyException("Nesravnimi obekti");
		Figura p=(Figura) ob;
		return (int)(area() - p.area());
	}

}
