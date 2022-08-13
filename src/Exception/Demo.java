package Exception;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("we are in main method");

       try {
    	   int []abc = new int [3];
    	   abc[0]=30;
    	   abc[1]=30;
    	   abc[2]=30;
   		   abc[3]=30;
    	   
       }
       
       catch(Exception e) {
    	   e.printStackTrace();
       }
       
       
       finally {
    	   
    	   sc.close();

    	   System.out.println("we are in finally block");
       }
       
 
		
		System.out.println("this is code after exception");
		
	
	}

}
