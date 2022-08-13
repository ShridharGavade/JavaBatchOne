package Exception;

public class demo3 {

	public static void main(String[] args) {


      try {
//  		int a = 30;
//  		int b = 0;
//  		
//  		int c = a/b;
//    	  System.out.println(c);
    	  
    	  String s = null;
    	  char  ch = s.charAt(0);
    	  System.out.println(ch);

  		
      }
      
      catch(Exception e ) {
    	  e.printStackTrace();
    	  
    	  System.out.println("this block will handle all exceptions ");
      }
      
//      catch(ArithmeticException e) {
//    	  System.out.println("this block handles Arithmatic Exception Only ");
//      }
      
      finally {
    	  
    	  System.out.println(" this is finally bock --- It will always  execute --- It is used perform the operations which are very Imp and must run ");
      }

		System.out.println("code after exception");
		
	}

}
