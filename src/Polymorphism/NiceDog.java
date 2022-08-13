package Polymorphism;

public class NiceDog extends dog {
	
//	public void aboutMyDog() {
//		String Breed = "PitBull";
//		int weigth = 30;
//		
//		
//		System.out.println("Breed of my dog is "+ Breed);
//		System.out.println("Weight of my dog is "+ weigth);
//	}
	
	public void aboutMyDog() {
		String Breed = "GSD";
		int weigth = 30;
		
		
		System.out.println("Breed of my dog is "+ Breed);
		System.out.println("Weight of my dog is "+ weigth);
	}
	
	public static void MyDog() {
		String Breed = "PitBull";
		int weigth = 30;
		
		
		System.out.println("Breed of my dog is "+ Breed);
		System.out.println("Weight of my dog is "+ weigth);
	}
	

	public static void main(String[] args) {

		NiceDog abc = new NiceDog();
//		abc.aboutMyDog();
//		
//		dog xyz = new dog();
//		xyz.aboutMyDog();
		
		abc.MyDog();
		
		
	}

}
