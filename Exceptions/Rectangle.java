

public class Rectangle {
	
	Point [] bounds;
	
	public Rectangle(Point leftTop, Point rightTop, Point leftBot, Point rightBot) throws ZeroPointException {
		if(leftTop.getX() == 0 || leftTop.getY() == 0) {
			throw new ZeroPointException("Left Top");
		}
		if(rightTop.getX() == 0 || rightTop.getY() == 0) {
			throw new ZeroPointException("Right Top");
		}
		if(leftBot.getX() == 0 || leftBot.getY() == 0) {
			throw new ZeroPointException("Left Bot");
		}
		if(rightBot.getX() == 0 || rightBot.getY() == 0) {
			throw new ZeroPointException("Right Bot");
		}
		bounds = new Point[4];
		bounds[0] = leftTop;
		bounds[1] = rightTop;
		bounds[2] = leftBot;
		bounds[3] = rightBot;
	}
	public double getArea() {
		return getWidth()*getHeight();
	}
	
	public double getPerimeter() {
		return 2*getHeight() + 2*getWidth();
	}
	
	public double getWidth() {
		return calcDistance(bounds[0],bounds[1]);
	}
	
	public double getHeight() {
		return calcDistance(bounds[0],bounds[2]);
	}
	
	private double calcDistance(Point a, Point b) {
		
		return Math.sqrt(Math.pow(b.getX() - a.getX(),2) + Math.pow(b.getY() - a.getY(),2));
		
	}
	
}