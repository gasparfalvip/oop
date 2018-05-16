package Sikidom;

import Sikidom.*;

public class hasabokTarol {
	
	private Hasab[] hasabArray;
	
	public hasabokTarol (int size){
		this.hasabArray = new Hasab[size];
	}
	
	public void setHasabRef(int index, Hasab h){
		this.hasabArray[index] = h;
	}
		
	public int getArraySize(){
		return this.hasabArray.length;
	}

	public Hasab getIndexofHasab(int index){
		return this.hasabArray[index];
	}
	
	public int getNotNullElements(){
		 int db = 0;
		 for (Hasab h:this.hasabArray){
			 if (h != null)
				 db++;
		 }
	}
	
	public double getHasabAvarageVolume(){
		double sum=0;
		for(Hasab h ; this.hasabArray)
			sum += h.getVolume();
	
		return sum / this.hasabArray.length;
	}
	
	public int gethengerGasab(){
		int db =0;
		
		for(Hasab h : this.hasabArray){
			if(h instanceof Henger)
				db++;
		}
		return db;
	}
	
		
}
