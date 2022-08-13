package ThisAndSuper;

public class ClassTwo  extends ClassOne{
	
	int age = 50;
	
	
	public void mySatus() {
		int age = 40;
		
		
		System.out.println("my age is =="+ age );
		
		System.out.println("my age is =="+ this.age );
		
		System.out.println("my age is =="+ super.age );
		
		
	}
	
	

	public static void main(String[] args) {

		
		ClassTwo obj = new ClassTwo();
		obj.mySatus();
		
		ClassOne abc = new ClassOne();
	
		

	  
	}

}
