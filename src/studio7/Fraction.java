package studio7;

public class Fraction {
	private double numerator = 0;
	private double denominator = 0;
	public static double fraction = 0;
	public static double sum = 0;
	public static double product = 0;
	public static double reciprocal = 0;
	
	public Fraction(int initNumerator, int initDenominator) {
		this.numerator = initNumerator;
		this.denominator = initDenominator;
	}
	
	public double getFraction() {
		fraction = this.numerator/this.denominator ;
		return fraction;
	}
	
	public static double getSum(Fraction a, Fraction b) {
		sum = (a.numerator/a.denominator)+(b.numerator/b.denominator);
		return sum;
	}
	public static double getProduct(Fraction a, Fraction b) {
		product = (a.numerator/a.denominator)*(b.numerator/b.denominator) ;
		return product;
	}
	public double getReciprocal() {
		reciprocal = this.denominator/this.numerator ;
		return reciprocal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction kateFraction = new Fraction(2,9);
		Fraction jackFraction = new Fraction(3,7);
		System.out.println("Fraction: "+ kateFraction.getFraction()+ ". Sum: "+ getSum(kateFraction,jackFraction)+ ". Product: "+ getProduct(kateFraction,jackFraction)+ ". Reciprocal: "+ kateFraction.getReciprocal());
	}

}
