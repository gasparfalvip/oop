package x;

import java.util.Scanner;

public class teglalapFut2 {
	public static void main(String[] args) {
		teglalap rectangles[] = new teglalap[10];
		
		for(int i=0;i<rectangles.length;i++){
			rectangles[i] = new teglalap((int)(Math.random()*8)+1,(int)(Math.random()*8)+1);
			System.out.println(rectangles[i].getAdatok());
		}
		
		int mini = 0;
		for(int i = 0;i < rectangles.length;i++ ){
			if(rectangles[i].getTerulet()< rectangles[mini].getTerulet())
				mini=i;
			
		}
		System.out.println("A legkisebb teruletu teglalap: "+ mini);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kérem a téglalap A oldalal: ");
		int newA =sc.nextInt();
		System.out.println("Kérem a téglalap B oldalal: ");
		int newB =sc.nextInt();
		
		//int db=0;
		//for(teglalap t : rectangles){
			//if (t.getTerulet()< newRectangle.getTerulet())
				//db++;
		//}
		
		System.out.println("");
		boolean isTrue = flase;
		int index = 0;
		for(int i=0,i<rectangles[i].getOlda())
		
	}
}
