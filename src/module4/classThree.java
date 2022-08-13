package module4;

import module3.classOne;
import module3.classTwo;

public class classThree {

	public static void main(String[] args) {

//		int b =classOne.addition(300, 400);
//		System.out.println(b);
		System.out.println(" we are in class three");
		
//		classOne.m1();
//		classTwo.m2();
		
		classTwo abc = new classTwo();
		
		String nation = abc.country();
		
		System.out.println(nation);
		

		
	}
	
	public int division(int a , int b ) {
		int c = a/b;
		
		return c;
		
	}
	
	
	

}
