package module3;

import module4.classThree;

public class classTwo {
	
	public static void m2() {
		System.out.println(" we are in m2 method of class two");
	}

	public static void main(String[] args) {
	
//		int a = classOne.addition(200, 300);
//		System.out.println(a);
		
		
//		classOne obj = new classOne();
//		String name = obj.getYourFullName();
//		System.out.println(name);
//		
		
		classThree abc = new classThree();
		int c =  abc.division(50, 5);
		System.out.println(c);
		
		
		
		

	}
	
	public String country() {
		String c = "My country is ";
		String i = "india ";
		String j = c +i;
		return j;
	}
	
	

}
