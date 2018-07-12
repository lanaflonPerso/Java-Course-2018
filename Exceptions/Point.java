public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		try {
		if(x>0 && y>0) {
			this.x = x;
			this.y = y;
		} else {
			throw new NegativePointException();
		}
		} catch(NegativePointException exc) {
			System.out.println("Cought " + exc);
			this.x = 0;
			this.y = 0;
		}
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	
}