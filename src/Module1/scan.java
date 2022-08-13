package Module1;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("what is the value of a ==");
//		int a = sc.nextInt();
//		
//		System.out.println("what is the value of b == ");
//		
//		int b = sc.nextInt();
//		
//		int c = a+b;
//		System.out.println("addition of a and b is == "+ c);
//		System.out.println("addition of "+ a+"  And " +b+ " is ==  " +c);
//		
//		
////		take name of person
//		
//		System.out.println(" what is your name ==");
//		String name = sc.next();
//		
//		System.out.println("good Morning  "+ name);
//		
//		sc.nextInt();
//		sc.next();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("what is your first name = ");
//		String fname= sc.next();
		String fname =sc.nextLine();
		
		System.out.println("what is your last name = ");
		String lname = sc.nextLine();
		
		String fullname = fname +" "+ lname;
		
		System.out.println("yoyr full name is " + fullname);
		
		
		
	}

}
