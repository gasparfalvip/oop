package myproducts;

public class bread extends pruductjava{
	
	private double amount;
	public bread (String name, int price, int percentage){
		super (name, netPrice, percentage);
		this.amount = amount;
	}

	public String toString(){
		
		return super.toString() + " egységár:" + this.getGrossPrice() / this.amount;
	}
	
	public double getAmount(){
		return this.amount;
	}
	
	public static boolean breadPriceCompare(bread b1, bread b2){
		if(b1.getbreadPrice()> b2.getbreadPrice())
			return true;
		
		return false;
	}
}
