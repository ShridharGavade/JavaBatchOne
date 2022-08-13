package CursorsDemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class listIteratorDemo {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		for(int i = 0; i <=10; i++) {
			ls.add(i);
		}
		ListIterator ltr = ls.listIterator();
		while(ltr.hasNext()) {
			Integer I = (Integer)ltr.next();
			if(I%3==0) {
				ltr.set(100);
				ltr.add("abc");
				System.out.println(ltr.nextIndex());
			}

		}
				System.out.println(ls);
	}

}
