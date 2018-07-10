class RectangleTest {
	
	public static void main(String [] args) {
		Point leftTop = new Point(200,100);
		Point rightTop = new Point(500,100);
		Point leftBot = new Point(200,300);
		Point rightBot = new Point(500,300);
		
		Rectangle rectangle = new Rectangle(leftTop,rightTop,leftBot,rightBot);
		
		System.out.println("Shirochinata e: " + rectangle.getWidth());
		System.out.println("Visochinata e: " + rectangle.getHeight());
		System.out.println("Perimetara e: " + rectangle.getPerimeter());
		System.out.println("Liceto e: " + rectangle.getArea());
		
	}
	
}