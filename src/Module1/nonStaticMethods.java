package Module1;

import java.util.Scanner;

public class nonStaticMethods {

//	4. non static method with return type and with args
	
	public int getSumOfNumbers(int a, int b) {
		int d = 0;
		for(int c =a; c<=b;c++) {
		   d = d+c;
		}
		return d;
	
	}
	
	public String getFullname(String fname , String lname) {
		String Fullname = fname+" "+lname;
		
		return Fullname;
	}
	
	
	
	
	public static void main(String[] args) {
		
		nonStaticMethods obj = new nonStaticMethods();
//		int sum = obj.getSumOfNumbers(1200, 10404);
//		System.out.println(sum);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("what is ur fname ?");
//		String fname = sc.next();
//		System.out.println("what is ur lname ?");
//		String lname = sc.next();
//		
//		
//		System.out.println(obj.getFullname(fname, lname));
		
		String s1= "Java";
		String S2= "Java";
		System.out.println(s1.compareTo(S2));
		
	}

	
}
