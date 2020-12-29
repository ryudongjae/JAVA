package stream;

import java.util.*;
import java.util.function.*;

class CompareString implements BinaryOperator<String>{
	
		

		@Override
		public String apply(String s1, String s2) {
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;
			
		}
	}

public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"Hello","Hi","Goodmorning","helloworld"};
		
		
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->
		{if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else return s2;
		}));
		
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
	}

}
