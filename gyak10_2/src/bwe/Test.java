package bwe;

import java.awt.print.Book;
import java.util.Scanner;

import bwe.BookWithEnum.style;

public class Test {

	public static void main(String[] args) {
		BookWithEnum[] bweArray;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kérem az adatok számát: ");
		int length = sc.nextInt();
		
		bweArray = new BookWithEnum[length];
		
		System.out.println("Kéremk a címet: ");
		String title = sc.next();
		
		System.out.println("Kéremk a szerzőt: ");
		String author = sc.next();
		
		System.out.println("Kéremk a kiadás évét: ");
		int dateOfissue = sc.next();
		
		System.out.println("Kéremk az árát: ");
		int price = sc.next();
		
		System.out.println("Kéremk a stílust: ");
		String styleString = sc.next();
		style bookStyle;
		
		
		if(styleString.contains("romance"))
			bookStyle = style.ROMANCE;
		
		if(styleString.contains("cook"))
			bookStyle = style.COOK;
		
		if(styleString.contains("scifi"))
			bookStyle = style.SCIFI;
		
		if(styleString.contains("other"))
			bookStyle = style.OTHER;
		
		
		
		

	}
	
	bookDataWrite(bweArray);
	
	
	
	
	
	

	public static void bookDataWrite(Book[] bookArray){
		System.out.println("");
		for(Book b : bookArray)
				System.out.println(b.toString());
	}
	public static BookWithEnum[] getBWE(BookWithEnum[] bweArray, style bookStyle){
		BookWithEnum[] bweTemp = new BookWithEnum[bweArray.length];
		
		for(int i = 0; i< bweArray.length; i++){
			if(bweArray[i].getBookStyle() == bookStyle){
				 bweTemp[i] = bweArray[i];
			}
		}
		return bweTemp;
	}
}
