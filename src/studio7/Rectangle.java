package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	public static double area = 0;
	
	public Rectangle(double initLength, double initWidth) {
		this.length = initLength;
		this.width = initWidth;
		
	}
	
	public double getArea() {
		area = this.length*this.width;
		return area;
	}
	
	public static boolean isLarger(Rectangle a, Rectangle b) {
		if (a.getArea() > b.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a = new Rectangle(2,2);
		Rectangle b = new Rectangle(4,4);
		System.out.println(isLarger(a,b));
		System.out.println(b.getArea());
	}

}
