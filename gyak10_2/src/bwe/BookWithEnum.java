package bwe;

public class BookWithEnum extends Konyv{

	public enum style {SCIFI, COOK, ROMANCE, OTHER};
	
	
	private style bookStyle;


	public BookWithEnum(String title, String author, int dateOfissue,
			int price, style bookSytle) {
		super(title, author, dateOfissue, price);
		this.bookStyle = bookSytle;
	}
	
	public String toString() {
		return super.toString() + " style " + this.bookStyle;
	}
	
	public style getBookStyle(){
		return bookStyle;
	}
	
	public void setBookStyle(style bookstyle){
		this.bookStyle = bookStyle;
	}

}
