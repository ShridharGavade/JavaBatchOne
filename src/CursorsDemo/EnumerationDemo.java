package CursorsDemo;


import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {


		Vector v = new Vector();
		
		v.addElement("Sai");
		v.addElement("Nivrutti");
		v.addElement('C');
		v.addElement(12.22);
		v.addElement(null);
		v.addElement('C');
		
	    Enumeration abc= v.elements();
	    
	    
		while(abc.hasMoreElements()) {
			System.out.println(abc.nextElement());
		}
		
		
	}

}
