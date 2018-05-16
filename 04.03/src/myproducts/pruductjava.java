package myproducts;

public class pruductjava {
	private String name;
	private int netPrice;
	private int percentage;
	
	public pruductjava(String name, int netPrice, int percentage) {
		this.name = name;
		this.netPrice = netPrice;
		this.percentage = percentage;
		
	}
	
	public int getGrossPrice() {
		return this.netPrice + (netPrice * (this.percentage/100));
	}
	public String toString(){
		return "Név: " + this.name + "Bruttóár: " + getGrossPrice();
	}
	public void netPriceIncrease(int percentageIn){
		this.netPrice = this.netPrice +(this.netPrice*(percentageIn/100));
	}
	public int productCompare(pruductjava other){
		if(this.getGrossPrice()>other.getGrossPrice())
			return 1;
		else if(this.getGrossPrice()<other.getGrossPrice())
			return -1;
		else {
			return 0;
		}
	}
	
	
	
	
	
	
	
	}


