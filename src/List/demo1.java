package List;

import java.util.ArrayList;

public class demo1 {

	public static void main(String[] args) {

		
		ArrayList a = new ArrayList();
		
		a.add(20);
		a.add("Name");
		a.add('c');
		
		a.add(3, 100);
		
		a.add(4, "Name");
		a.add(1, "Sagar");
		
		
//		a.clear();
		
		
		ArrayList names = new ArrayList();
		
		names.add("Raj");
		names.add("Kappor");
		names.add(45);
		
		a.addAll(names);
		names.add(null);
		names.add(null);
		names.add(null);
		names.add(null);
		
	    Object student = names.clone();
	    System.out.println(student.toString());
	    
	    
	    
	    System.out.println(names.contains("Sagar"));
	    System.out.println(names.contains("Raj"));
	    
	   
		
//		System.out.println(a.get(1));
		System.out.println(a.size());

		
		
		
		
				
				
	}

}
