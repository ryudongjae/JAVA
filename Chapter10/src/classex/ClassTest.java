package classex;

import java.lang.reflect.*;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, 
	IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Person person = new Person("james");
		System.out.println(person);
		
		Class c1 = Class.forName("classex.Person");
		
		Person person1 = (Person)c1.newInstance();
		
		System.out.println(person1);
		
		
		Class[]paramterTypes = {String.class};
		Constructor cons = c1.getConstructor(paramterTypes);
		
		
		Object[] initargs = {"tomas"};
		Person personT =(Person)cons.newInstance(initargs);
		System.out.println(personT);
	}

}