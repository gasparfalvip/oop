package x;

public class teglalap {
	private int a;
	private int b;

	public teglalap(int aIn, int bIn) {
		a = aIn;
		b = bIn;
	}

	public teglalap(int sideIn) {
		a = sideIn;
		b = sideIn;
	}

	public int getTerulet() {
		return a * b;
	}

	public String getAdatok() {
		return "Az a oldal:" + a + ", b oldal:" + b + ", terület:"
				+ getTerulet();
	}

	public void setOldalak(int aIn, int bIn) {
		a = aIn;
		b = bIn;
	}

	public void setOldalak(int sideIn) {
		a = sideIn;
		b = sideIn;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public boolean getTeruletMasik(teglalap other) {
		if (getTerulet() > other.getTerulet())
			return true;
		return false;
	}

	public boolean getOldalakegyezneke(teglalap other) {
		if (a == other.a && b == other.b)
			return true;
		return false;
	}
}
