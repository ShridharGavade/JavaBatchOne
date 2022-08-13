package Module1;

public class veriables2 {
	public int a = 100;
	
//	static Veriable/Class Veriable
	static int c= 200;
	static String name="software"; 
	static char model = 'D';
	
	
//	instance veriables 
	String surname = "Gavade";
	int salary=10000;
	
	public static void main(String[] args) {
//		Local Veriable
		int b = 30;
		
		
//		how to call static veriables ? - by using class name
		int d=veriables2.c;
		System.out.println(d);
		
		System.out.println(veriables2.name);
		
		System.out.println("current model is " + veriables2.model );
		
				
//		Object of class
	
		veriables2 obj =new veriables2();
		veriables2 obj2 = new veriables2();
		
		String mysurname =obj.surname;
		
		int mysalary =obj2.salary;
		
		System.out.println(mysurname);
		
		System.out.println(mysalary);
		
	}

}
