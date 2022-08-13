package casting;

public class Son extends Father {
	
	String investment ="Crypto";
	
	public void Car() {
		System.out.println("son has a car");
	}
	
	public void flat() {
		System.out.println("son has a Flat");
	}

	public static void main(String[] args) {

		Father obj = new Son();
		
	     Father abc = (Son)obj;
	     
	     
	      ((Son) abc).flat();
	      
				

	}

}
