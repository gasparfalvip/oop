package Sikidom;

import Sikidom.*;

public class SikidomFut {
	public static void man(String[] args){
		Henger h1 = new Henger(5, 10);
	
		System.out.println(h1.toString());
		System.out.println("A h1 térfogate:" + h1.getVolume());
		
		System.out.println("");
		
		Teglatest t1 = new Teglatest(5, 10, 5);
		System.out.println(t1.toString());
		System.out.println("A t1 térfogate:" + t1.getVolume());
		
		
	}
	

}
