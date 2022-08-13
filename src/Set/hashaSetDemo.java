package Set;

import java.util.HashSet;

public class hashaSetDemo {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
	
		System.out.println(h.add(10000)); //true
		System.err.println(h.add(10000)); //false
		
		h.add("String");
		h.add('F');
		h.add(100);
		h.add(12.12);
		h.add(null);
		
		System.out.println("adding null value again"+h.add(null));
	
		System.out.println(h);
	

	}

}
