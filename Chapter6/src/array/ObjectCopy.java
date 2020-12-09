package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5];
		
		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("�¹���2", "������");
		library[2] = new Book("�¹���3", "������");
		library[3] = new Book("�¹���4", "������");
		library[4] = new Book("�¹���5", "������");
		
		System.arraycopy(library, 0, copyLibaray, 0, 5);
		
		/*for( Book book : copyLibaray ) {
			book.showBookInfo();
		}*/
		
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		for( Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("===============");
		
		for( Book book : copyLibaray) {
			book.showBookInfo();
		}
		
		
		
		
	}

}
