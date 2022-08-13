package Exception;

public class demo2 {

	public static void main(String[] args) {

		
		try {
			String Name = null;
			
			System.out.println(Name.length());
		}
		
//		catch(Exception e) {
//			e.printStackTrace();
//			
//		}
		
		catch(ArithmeticException e) {
			System.out.println(" we are facing Arithmatic Exception");
			
		}
		
		catch(NullPointerException e) {
			System.out.println("we are getting null poin Exception");
			
		}
		
		
		
		System.out.println(" this is code after try block");
		
		
		
	}

}
