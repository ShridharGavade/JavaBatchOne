package List;

import java.util.Vector;

public class vectorDemo {

	public static void main(String[] args) {

		Vector v = new Vector();
		
		v.addElement("Selenium");
		v.addElement(1000);
		v.addElement("Testing");
		v.addElement(null);
		v.addElement("Selenium");
		v.addElement('c');
		v.addElement(null);
		v.addElement("Selenium");
		v.addElement(1000);
		v.addElement("Testing");
		v.addElement(null);
		v.addElement("Selenium");
		v.addElement('c');
		v.addElement(null);
		
		
		System.out.println(v.toString()); // "[Selenoum, 1000, Testing , null, selenium , c , null]"
		
		v.remove(3);
		System.out.println(v.toString()); // "[Selenoum, 1000, Testing , null, selenium , c , null]"
		
		 System.out.println(v.capacity());
		 
		 v.trimToSize();
		 
		 System.out.println(v.capacity());
		 
		 v.insertElementAt("Sgar", 10);
		 
		 System.out.println(v.toString());
		 
		 
		 v.setSize(100);
		 
		 System.out.println(v.capacity());
		 
		 
		
		
		
	}

}
