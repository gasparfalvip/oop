package gyak4;

public class AlkFut {
	public static void main(String[] args){
		Alkalmazott[] alkok = new Alkalmazott[5];
		
		alkok[0] = new Alkalmazott();
		alkok[0].setName("Tomi1");
		alkok[0].setPayment(10);
		
		alkok[1] = new Alkalmazott();
		alkok[1].setName("Tomi2");
		alkok[1].setPayment(17);
		
		alkok[2] = new Alkalmazott();
		alkok[2].setName("Tomi3");
		alkok[2].setPayment(1);
		
		alkok[3] = new Alkalmazott();
		alkok[3].setName("Tomi4");
		alkok[3].setPayment(12);
		
		alkok[4] = new Alkalmazott();
		alkok[4].setName("Tomi5");
		alkok[4].setPayment(66);
		
		Alkalmazott alkalmazott1 = new Alkalmazott();
		alkalmazott1.setName("Tomi");
		alkalmazott1.setPayment(8);
		
		//for(Alkalmazott a : alkok)
			//System.out.println(a.szovegVissza());
		int keresett = 0;
		int max= alkok[0].getPayment();
		for(int i=0;i<alkok.length;i++){
			if (alkok[i].getPayment() > max)
				max=alkok[i].getPayment();
				keresett=i;
		}
		
		int db=0;
		for(int i=0; i<alkok.length;i++) {
			if(alkok[i].fizHatar(20, 50))
				db++;
		}
		
		
		System.out.println("A legnagyobb fizetésű alkalmazott: "+ alkok[keresett].getName());
		
		System.out.println(alkalmazott1.szovegVissza());
		
		alkalmazott1.fizNov(16);
		
		boolean isTrue = alkalmazott1.fizHatar(10, 20);
		if(isTrue)
			System.out.println("A megadott határok közé esik a fizetés.");
		else
			System.out.println("A megadott határok közé esik a fizetés.");
		
		System.out.println("Az adó értéke:" + alkalmazott1.getAdo());
		
		Alkalmazott alkalmazott2 = new Alkalmazott();
		alkalmazott2.setName("Tomi");
		alkalmazott2.setPayment(80);
		
		if(alkalmazott1.nagyobbE(alkalmazott2)){
			System.out.println("Az alk1 fizetése nagyobb.");
		}else{
				System.out.println("alk2 fizetése nagyobb.");
		}
	}
	
}
