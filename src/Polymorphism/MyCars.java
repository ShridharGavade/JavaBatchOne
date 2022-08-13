package Polymorphism;


public class MyCars {

	public void aboutMyCar() {
		String brand = "Hyndai";
		double price = 220000;
		
		System.out.println("my car company is - "+brand);
		System.out.println("my cars price is -"+ price);
	}
	public void aboutMyCar(String Company) {
		String brand = Company;
		double price = 220000;
		
		System.out.println("my car company is - "+brand);
		System.out.println("my cars price is -"+ price);
	}
	public void aboutMyCar(String Company, Double Kimmat) {
		String brand = Company;
		double price = Kimmat;
		
		System.out.println("my car company is - "+brand);
		System.out.println("my cars price is -"+ price);
	}
	
	
	
	public static void main(String[] args) {
		
		
		MyCars abc = new MyCars();
				abc.aboutMyCar("Audi");

		
		
	}

}
