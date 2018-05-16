package proba;
import myproducts.bread;
import myproducts.pruductjava;
public class ProductRun {

	public static void main(String[] args) {
		pruductjava p1 = new pruductjava("Product1", 100, 27);
		//bread b1 = new bread("Bread1", 200, 27, 2);
		
		System.out.println("A p1 adatai"+ p1.toString());
		
		int priceCompare = p1.productCompare(b1);
		
		System.out.println("");
		
		
	}

}
