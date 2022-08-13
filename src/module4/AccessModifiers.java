package module4;

public class AccessModifiers extends abc {
	
	public static int rollNumber  = 10;
	
	private static int  salary = 10000;
	
	
	static String CompanyName = "AllState";
	
	
	protected static String jobtitile = "Tester";
	
	

	public static void main(String[] args) {

		AccessModifiers obj = new AccessModifiers();
       abc bbb = new abc();
    int c =   bbb.a;
    System.out.println(c);
		
		
	}

}
