package Inheritance;

public class Child extends Parent{
	
	public void m2() {
		System.out.println("this is m2 method of child class");
	}
	

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.m1();
		obj.addition();
		obj.m2();
		
		

	}

}
