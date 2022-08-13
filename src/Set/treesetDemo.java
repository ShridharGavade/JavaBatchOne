package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class treesetDemo {

	public static void main(String[] args) {


		TreeSet t = new TreeSet();
		
		t.add(100);
		t.add(90);
		t.add(50);
		t.add(70);
//		t.add(null);
		
//		Iterator itr = t.descendingIterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		System.out.println(t.ceiling(90));
		
//		System.out.println(t.first());
//		System.out.println(t.headSet(90));
//		System.out.println(t.tailSet(90));
//		System.out.println(t.subSet(50, 100));

	}

}
