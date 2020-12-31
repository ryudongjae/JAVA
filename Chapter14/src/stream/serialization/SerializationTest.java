package stream.serialization;

import java.io.*;

class Person implements Serializable{
	String name;
	String job; //transient는 직렬화를 하지말라는 말이다. 출력하면 nulll값이 나온다.socket은 직렬화가 불가능하다.
	public Person(String name,String job) {
		this.name= name;
		this.job = job;
	}
	
	public String toString() {
		return name +","+ job;
	}
}

public class SerializationTest {

	public static void main(String[] args) throws IOException {
		
		Person personLee = new Person("Leeyun", "Pc developer");
		Person personKim = new Person("KimHun", "Docter");
		Person personPark = new Person("Park", "Police");
		Person personRim = new Person("Rim", "Teacher");
		Person personHa = new Person("HA", "CEO");
	
	try(FileOutputStream fos = new FileOutputStream("serial.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
		oos.writeObject(personLee);
		oos.writeObject(personKim);
		oos.writeObject(personPark);
		oos.writeObject(personRim);
		oos.writeObject(personHa);
	}catch(IOException e ) {
		System.out.println(e);
	}
	try(FileInputStream fis = new FileInputStream("serial.dat");
			ObjectInputStream ois = new ObjectInputStream(fis)){
		
		Person p1 = (Person)ois.readObject();
		Person p2 = (Person)ois.readObject();
		Person p3 = (Person)ois.readObject();
		Person p4 = (Person)ois.readObject();
		Person p5 = (Person)ois.readObject();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}catch(IOException e) {
		System.out.println(e);
	}catch (ClassNotFoundException e) {
		System.out.println(e);
	}
	}

}
