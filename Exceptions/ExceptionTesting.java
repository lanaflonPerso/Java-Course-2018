class ExceptionTesting {
	
	public static void main(String [] args) {
		correctRectangle();
		negativePoint();
		leftTopIsIncorrect();
		rightTopIsIncorrect();
		leftBotIsIncorrect();
		rightBotIsIncorrect();
		
	}
	
	public static void correctRectangle(){
		Point leftTop = new Point(200,100);
		Point rightTop = new Point(500,100);
		Point leftBot = new Point(200,300);
		Point rightBot = new Point(500,300);
		try {
		Rectangle rectangle = new Rectangle(leftTop,rightTop,leftBot,rightBot);
		printRectProperties(rectangle);
		} catch(ZeroPointException exc) {
			System.out.println("Caught " + exc);
		}
	}
	public static void negativePoint(){
		Point negativePoint = new Point(-1,299);
		System.out.println("(-1,299): " + "X:" + negativePoint.getX() + " Y:" + negativePoint.getY());
		
		negativePoint = new Point(299,-1);
		System.out.println("(299,-1): " + "X:" + negativePoint.getX() + " Y:" + negativePoint.getY());
		
		negativePoint = new Point(-1,-100);
		System.out.println("(-1,-100): " + "X:" + negativePoint.getX() + " Y:" + negativePoint.getY());
	}
	
	public static void leftTopIsIncorrect(){
		Point leftTop = new Point(-1,100);
		Point rightTop = new Point(500,100);
		Point leftBot = new Point(200,300);
		Point rightBot = new Point(500,300);
		try {
			Rectangle rectangle = new Rectangle(leftTop,rightTop,leftBot,rightBot);
			printRectProperties(rectangle);
		}catch(ZeroPointException exc) {
			System.out.println("Caught " + exc); 
		}
	}
		public static void rightTopIsIncorrect(){
		Point leftTop = new Point(200,100);
		Point rightTop = new Point(-1,10);
		Point leftBot = new Point(200,300);
		Point rightBot = new Point(500,300);
		try {
			Rectangle rectangle = new Rectangle(leftTop,rightTop,leftBot,rightBot);
			printRectProperties(rectangle);
		}catch(ZeroPointException exc) {
			System.out.println("Caught " + exc); 
		}
	}
		public static void leftBotIsIncorrect(){
		Point leftTop = new Point(200,100);
		Point rightTop = new Point(500,100);
		Point leftBot = new Point(-1,50);
		Point rightBot = new Point(500,300);
		try {
			Rectangle rectangle = new Rectangle(leftTop,rightTop,leftBot,rightBot);
			printRectProperties(rectangle);
		}catch(ZeroPointException exc) {
			System.out.println("Caught " + exc); 
		}
	}
		public static void rightBotIsIncorrect(){
		Point leftTop = new Point(200,100);
		Point rightTop = new Point(500,100);
		Point leftBot = new Point(200,300);
		Point rightBot = new Point(-1,35);
		try {
			Rectangle rectangle = new Rectangle(leftTop,rightTop,leftBot,rightBot);
			printRectProperties(rectangle);
		}catch(ZeroPointException exc) {
			System.out.println("Caught " + exc); 
		}
		
		
	}
	
		public static void printRectProperties(Rectangle rectangle) {
			System.out.println("Shirochinata e: " + rectangle.getWidth());
			System.out.println("Visochinata e: " + rectangle.getHeight());
			System.out.println("Perimetara e: " + rectangle.getPerimeter());
			System.out.println("Liceto e: " + rectangle.getArea());
		}
}