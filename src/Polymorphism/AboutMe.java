package Polymorphism;

public class AboutMe {

	public void myInfo() {
		String name = "Ram";
		int age = 20;
		
		
		System.out.println("my name is "+name);
		System.out.println("my age is "+age);
	}
	
	public void myInfo(String fname) {
		String name = fname;
		int age = 20;
		
		
		System.out.println("my name is "+name);
		System.out.println("my age is "+age);
	}
	
	
	public void myInfo(String fname, int myage) {
		String name = fname;
		int age = myage;
		
		
		System.out.println("my name is "+name);
		System.out.println("my age is "+age);
	}
	
	public static void main(String[] args) {
		
		AboutMe abc = new AboutMe();
//		abc.myInfo();
		
//		abc.myInfo("Rameshwar");
		
		abc.myInfo("SaiPrasad",20);
		

	}

}
