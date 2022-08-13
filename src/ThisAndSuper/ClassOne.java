package ThisAndSuper;

public class ClassOne {
	
	int age = 20;
	
	public void myInfo() {
		int age = 23;
		System.out.println("my age is ="+ age);
		
		System.out.println("my age is ="+ this.age);
		
		
	}

	public static void main(String[] args) {
		
		ClassOne abc = new ClassOne();
		abc.myInfo();

	}

}
