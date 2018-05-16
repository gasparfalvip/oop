package x;

public class teglalapFut {
	public static void main(String[] args){
		teglalap a = new teglalap(2, 5);
		teglalap b = new teglalap(3, 7);
		teglalap c = a;
		
		System.out.println(a.getAdatok());
		System.out.println(b.getAdatok());
		System.out.println(c.getAdatok());
		
		System.out.println("");
		
		a.setOldalak(4, 10);
		System.out.println(a.getAdatok());
		System.out.println(b.getAdatok());
		System.out.println(c.getAdatok());
		
		System.out.println("");
		a.setOldalak(3, 7);
		System.out.println("Az a ==b:" + (a==b));
		System.out.println("Az a ==c:" + (a==c));
		System.out.println("");
		
		System.out.println("Az a ==b:" + a.getOldalakegyezneke(b));
		System.out.println("");
		
		
	}

}
