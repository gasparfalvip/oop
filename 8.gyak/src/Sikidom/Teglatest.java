package Sikidom;

public class Teglatest extends Hasab {

	private double a;
	private double b;
	
	public Teglatest(double a, double b, int height) {
		super(height);
		this.a = a;
		this.b = b;
	}

	
	public double baseArea(){
		return a*b;
	}
	
	public String toString(){
		return "A réglatest adatai: [a oldal " + this.a + "a b oldal: " + this.b + "magasság: " + super.getHeight() + "]";
		
		
	}
}
