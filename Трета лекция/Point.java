package third;

public class Point implements Comparable{
	int x, y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Point(int x) {
		this.x=x;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	public boolean equals(Object obj) {
		if(! (obj instanceof Point)) return false;
		Point p=(Point) obj;
		return (x==p.x && y==p.y);
	}
	
	public double dist1(Point p) {
		return Math.sqrt( (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y) );
	}
	public static double dist2(Point p1, Point p2) {
		return Math.sqrt(Math.pow((p1.x-p2.x),2) + Math.pow((p1.y-p2.y),2) );
	}
	public boolean kvadr(Point p) {
		return ( (x>=0 && p.x>=0 && y>=0 && p.y>=0) ||
		    (x<=0 && p.x<=0 && y>=0 && p.y>=0) ||
		    (x<=0 && p.x<=0 && y<=0 && p.y<=0) ||
		    (x>=0 && p.x>=0 && y<=0 && p.y<=0)); 
		
	}
	public boolean sameQuadrant(Point p) {
		if(diffSigns(x,p.x)) return false;
		if(diffSigns(y,p.y)) return false;
		return true;
	}
	private boolean diffSigns(int a,int b) {
		return (a>0 && b<0)||(a<0 && b>0);
	}
	/*public boolean kvadrant (Point p) { 
		if(x>=0 && p.x<=0) {
			if(y>=0 && p.y>=0) {
				return true;
			}
			else {
				return true;
			}
		}
		else {
			if(y>=0 && p.y>=0) {
				return true;
			}
			else {
				return true;
			}
			
		}
		//return false;
		 * }
		*/

	@Override
	public int compareTo(Object ob) {
		Point p=(Point) ob;
		return (x*x+y*y) - (p.x*p.x+p.y*p.y);
	}
}
