package Module1;

public class methods {
	
//	2. Static method non-Return Type and with Argument/Arguments.
	
	public static void getYourName(String name) {
		System.out.println("your name is "+name);
	}
	
	public static void getYourFullName(String fname, String lname) {
		
		System.out.println("your full name is " +fname+" "+lname);
	}
	
	public static void yourInfo(String Name, int age) {
		
		System.out.println("happy birthday "+ Name);
		System.out.println("you are now " +age +" years old");
	}
	
	public static void main(String[] args) {
		System.out.println("you are in main method");
		
//		call the method
//		getYourName("Shridhar");
//		getYourFullName("Raj", "Patil");
		yourInfo("Yash", 19);
		
		
		
//		calling by class name 
//		methods.getYourFullName("Sham", "Kappor");
		methods.yourInfo("Avi", 25);
		
		
//		by using object
		
		
//		classname   objectName = new classname();
		
        methods   abc = new methods();
//        abc.getYourFullName("Shami", "Kapoor");
        abc.yourInfo("Ravi", 30);
		
		
		
		
		
		
	}
	 
	 

}
