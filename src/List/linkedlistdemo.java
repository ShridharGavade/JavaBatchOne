package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlistdemo {

	public static void main(String[] args) {
	
		LinkedList ls = new LinkedList();
		
		ls.add("Kiran");
		ls.add(200);
		ls.add('C');
//		ls.add(3,100);
		
//		System.out.println(ls.toString());
//		
//		ls.addFirst("Selenium");
//		
//		ls.addLast(10000);
		
//		System.out.println(ls.toString());
//		
//		System.out.println(ls.getFirst());
//		System.out.println(ls.getLast());

//		
//		ls.removeFirst();
//		ls.removeLast();
//		
		
//		System.out.println(ls.toString());
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(1000);
		ar.add("Name");
		ar.add('C');
		
		ls.addAll(ar);
		
//		Iterator s = ar.iterator();
		
		ListIterator s = ar.listIterator();
		
		while(s.hasNext()) {
			System.out.println(s.next());
			
			if(s.hasPrevious()) {
				System.out.println("abc");
			}
			
			
		}
		
		
//		System.out.println(ls.toString());
		
		
		ls.retainAll(ar);
		
		

//		System.out.println(ls.toString());

		
		
		
	}

	

}
