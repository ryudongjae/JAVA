package object;

class Book{
	String title;
	String auther;
	
	public Book(String title,String auther) {
		this.title = title;
		this.auther = auther;
	}

	@Override
	public String toString() {
		
		return auther +"," + title;
	}
}


public class ToStringTest {

	public static void main(String[] args) {
		
		Book book = new Book("토지","박경리") ;
		
		System.out.println(book);
		
		String str = new String("토지");
		System.out.println(str.toString());
		
		
		
	}

}
