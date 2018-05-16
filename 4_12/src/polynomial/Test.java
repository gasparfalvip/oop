package polynomial;

import java.util.Scanner;

import math.IPolynomial;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearPolynomial[] lpArray = new LinearPolynomial[5];
		
		for (int i=0; i<5; i++) {
			System.out.println("Kéream az "+ i + ". polinom a eggyüthaját:");
			double a = sc.nextDouble();
			System.out.println("Kéream az "+ i + ". polinom a eggyüthaját:");
			double b = sc.nextDouble();
			
			lpArray[i] = new LinearPolynomial(a, b);
		}
		sc.close();
		
		for(LinearPolynomial lp: lpArray)
				System.out.println(lp.toString());
		
		getLookupTable(lpArray[4]);
		
	}
	

	public static void LookupTable(IPolynomial polyref) {
		for(double i=1;i<=1; i= i + 0.1) {
			System.out.println(i + " : " + polyref.getY(i));
		}
	}
	
}
