package kivetel;

import java.io.BufferedReader;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[] array = new int[5];
		readNextIn(array);
		writeElements(array);
		readNextLine(array);
		
	}

	
	public static void writeElements(int[] arrayIn){
		for(int i=0; i<arrayIn.length;i++)
			System.out.println("A tömb "+ i + ".eleme: "+ arrayIn[i]);	
	}
	
	public static void readNextIn(int[] arrayIn){
			Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arrayIn.length; i++ ){
			System.out.println("Kérem a tömb "+ i +". elemét: ");
			arrayIn[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public static void readNextLine(int[] arrayIn){
			Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arrayIn.length; i++ ){
			System.out.println("Kérem a tömb "+ i +". elemét: ");
			String line=sc.nextLine();
			arrayIn[i]= Integer.parseInt(line);
		}
		sc.close();
	}
	
	//public static void readBRintValue(int[] arrayIn){
		//Scanner sc = new Scanner (System.in);
		//BufferedReader br = new BufferedReader(new InputstreamReader(System.in));
		
		
		
		
		
		
		
	}
	
	
}
