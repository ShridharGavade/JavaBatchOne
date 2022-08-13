package Polymorphism;

public class LastStop extends Station {
	
	
public void mystop(String name ) {
			System.out.println("this is method from sub class ");
		System.out.println("my stop is "+ name );
	
}
	

	public static void main(String[] args) {
		
	
		
		LastStop abc = new LastStop();
//		abc.mystop("Akurdi");
		
		Station obj = new LastStop();
		
//		obj.mystop("ShivajiNanar");
		
		Station www = new Station();
		www.mystop("PuneStation");
	
	}
	
	

}
