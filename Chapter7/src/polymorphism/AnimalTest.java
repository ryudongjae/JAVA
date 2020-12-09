package polymorphism;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
	public void eating() {
		
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}


class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�");
	}
}



public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		/*AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		*/
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		
		
		
	/*	for(Animal animal : animalList) {
			animal.move();
		}
		*/	
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		
		for(int i =0; i<list.size(); i++) {
			Animal animal = list.get(i);
		
			if ( animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			}
			else if( animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if( animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("error");
			}
		
		}
	}
	
	
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
	
	
	

}
