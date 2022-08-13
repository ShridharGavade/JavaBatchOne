package List;

import java.util.Stack;

public class stackDemo {

	public static void main(String[] args) {

		
		Stack s = new Stack();
		
		s.push("Selenium");
		s.push(1000);
		s.push(12.12);
		s.push('A');
		
		System.out.println(s.size());
		
		System.out.println(s.toString());
		
		
		System.out.println(s.pop().toString());
		System.out.println(s.size());
        
		
		System.out.println(s.toString());
		
		System.out.println(s.peek().toString());
		System.out.println(s.size());
		
		System.out.println("aaa");
		System.out.println(s.search("Selenium"));	
		
		System.out.println(s.search("Testing"));
		
		
	
		
	}

}
