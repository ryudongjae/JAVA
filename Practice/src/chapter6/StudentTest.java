package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addBook("�¹���1", "������");
		studentLee.addBook("�¹���2", "������");
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addBook("����1", "�ڰ渮");
		studentKim.addBook("����2", "�ڰ渮");
		studentKim.addBook("����3", "�ڰ渮");
		
		Student studentCho = new Student(1003, "Cho");
		
		studentCho.addBook("�ظ�����1", "���� �Ѹ�");
		studentCho.addBook("�ظ�����2", "���� �Ѹ�");
		studentCho.addBook("�ظ�����3", "���� �Ѹ�");
		studentCho.addBook("�ظ�����4", "���� �Ѹ�");
		studentCho.addBook("�ظ�����5", "���� �Ѹ�");
		studentCho.addBook("�ظ�����6", "���� �Ѹ�");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
	}
}
