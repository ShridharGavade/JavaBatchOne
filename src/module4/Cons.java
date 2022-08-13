package module4;

public class Cons {
	
	String name;
	int birthYear;
	String lastName;
	Cons(String fname,int year){
		name =fname;
		birthYear=year;
	}
    Cons(String fname,String lname){
		name =fname;
		lastName=lname;
	}

	public static void main(String[] args) {
		
//		Cons obj = new Cons("Viraj", 1995);
//		
//		System.out.println("my name is "+ obj.name);
//		System.out.println("my birth year is "+ obj.birthYear);
		
		
		Cons abc = new Cons("Sai", "Jadhav");
		
		System.out.println(abc.name);
		System.out.println(abc.lastName);
	
	}

}
