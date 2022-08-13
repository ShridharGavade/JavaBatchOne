package Set;

import java.util.LinkedHashSet;

public class linkedHashSetDemo {

	public static void main(String[] args) {


		LinkedHashSet abc = new LinkedHashSet(100);
		
		abc.add("String ");
		abc.add(100);
		abc.add('D');
		abc.add(100);
		abc.add(null);
		abc.add(12.12);
		abc.add(null);
		
		
		System.out.println(abc); //

	}

}
