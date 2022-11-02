package studio7;

public class Die {
	private int n;
	public static int roll;
	
	public Die(int initN) {
		this.n = initN;
	}
	
	public int getRoll() {
		roll = (int)(Math.random()*n + 1);
		return roll;
	}

	
	public static void main(String[] args) {
		Die kateDice = new Die(7);
		System.out.println(kateDice.getRoll());
	}
}
