package Module1;

public class newVeriable {
//	global
    public static int c = 2000;
    
//    Static/Class Veriable
    
    static String city ="Pune";
	
//	Instance Veriable
    
    String Class = "Java for selenium";
    
	public static void main(String[] args) {
//		local veriable 
		int a = 100;
		String name = "Sai  is my name , I am from pune";
		
       String mycity = newVeriable.city;
       
       
       System.out.println(mycity);
       
       
		
//		use of Instance Veriable
       
       
//       classNeme objectname = new classname();
       
       newVeriable obj = new newVeriable();
       String cname = obj.Class;
       
       
       
       
       
       
       
		
		
		a = 200;
		 
//		int a = 2000;
		
		System.out.println(a);
		System.out.println(name);
		
		
//		delcaration 
		
		int b;
		
//		initialization 
		
		b=20;
		
//		use
		
		int c = 300+b;
		
		System.out.println(c);
	}
	
	

}
