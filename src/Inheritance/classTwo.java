package Inheritance;


public class classTwo extends ClassOne {
	
	public void m1() {
		System.out.println(" we are in m1 method");
	}

	public static void main(String[] args) {
		
		classTwo abc = new classTwo();
		abc.additon();
		System.out.println(abc.a);
		System.out.println(abc.b);
		
		

	}

}
