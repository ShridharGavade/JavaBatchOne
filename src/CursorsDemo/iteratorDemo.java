package CursorsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorDemo {

	public static void main(String[] args) {
		
		
		ArrayList ab = new ArrayList();
		
		ab.add(12);
		ab.add(474);
		ab.add(14);
		ab.add(22);
		ab.add(15);
		ab.add(22);
		
		
		Iterator itr = ab.iterator();
		
		while(itr.hasNext()) {
			
			Integer N = (Integer)itr.next();
			
			if(N%2==0) {
				System.out.println(N);
			}
			else{
				itr.remove();
			}
			
	
		}
		
		System.out.println(ab);


	}

}
