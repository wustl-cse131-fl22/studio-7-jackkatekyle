package studio7;

public class Complex {
	private double real;
	private double fake;
	public static String complex = "i";
	
	public Complex(double initA, double initB) {
		this.real = initA;
		this.fake = initB;
	}
	
	public static String getProduct(Complex a, Complex b) {
		return "("+ ((a.real*b.real)-(a.fake*b.fake)) + ")+("+ ((a.real*b.fake)+(b.real*a.fake))+")"+complex;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex x = new Complex(3,4);
		Complex y = new Complex(5,6);
		
		System.out.println(getProduct(x,y));
	}

}
