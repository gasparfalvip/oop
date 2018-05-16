package polynomial;

import math.IPolynomial;

public class LinearPolynomial implements IPolynomial{

	private double a;
	private double b;
	
	public LinearPolynomial(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getY(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getGrade() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		if(this.b>0)
			return "y=" + this.a + "x+" + this.b;
		else if(this.b<0)
			return "y=" + this.a + "x" + this.b;
		else if(this.b == 0)
			return "y=" + this.a + "x" + this.b;
		
		return "";
	}
	
	

	
}
