package object;


class Student {
	int studentNum;
	String studnetName;
	
	public Student(int studentNum,String studentName) {
		this.studentNum = studentNum;
		this.studnetName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std =(Student)obj;
			
			//return (this.studentNum == std.studentNum);
		if(this.studentNum == std.studentNum)
			return true;
		else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}
	
	
}
public class EqualsTest {

	public static void main(String[] args) {
		
		
		/*	Student M = new Student(100,"Mike");
		
		Student M2 = M;
		
		Student Mike = new Student (100,"Mike");
		
		System.out.println(M == M2);
		System.out.println(M == Mike);
		System.out.println(M.equals(Mike));
		
		System.out.println(M.hashCode());
		System.out.println(M2.hashCode());
		*/
		Integer i1 = new Integer (100);
		Integer i2 = new Integer (100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
	}

}
